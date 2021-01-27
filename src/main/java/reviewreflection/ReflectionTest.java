package reviewreflection;
//https://mp.weixin.qq.com/s?__biz=MzI1NDU0MTE1NA==&mid=2247483785&idx=1&sn=f696c8c49cb7ecce9818247683482a1c&chksm=e9c2ed84deb564925172b2dd78d307d4dc345fa313d3e44f01e84fa22ac5561b37aec5cbd5b4&scene=0#rd
//反射(Reflection) 是 Java 在运行时（Run time）可以访问、检测和修改它本身状态或行为的一种能力，它允许运行中的 Java 程序获取自身的信息，
// 并且可以操作类或对象的内部属性。
//
//Class 类介绍：Java虚拟机为每个类型管理一个Class对象，包含了与类有关的信息，当通过 javac 编译Java类文件时，生成的同名 .class 文件保存
// 着该类的 Class 对象，JVM 加载一个类即是加载该 .class 文件。
//
//Class 和 java.lang.reflect 一起对反射提供了支持，java.lang.reflect 包中最常用的几个类的关系如下：
//src/main/java/reviewreflection/Reflect.jpg


import java.lang.reflect.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

class Person {
    public String name;     // 姓名 公有
    protected String age;   // 年龄 保护
    private String hobby;   // 爱好   私有

    public Person(String name, String age, String hobby) {
        this.name = name;
        this.age = age;
        this.hobby = hobby;
    }
    public String getHobby() {
        return hobby;
    }
}

class Employee extends Person {
    public static Integer totalNum = 0; // 员工数
    public int empNo;   // 员工编号 公有
    protected String position;  // 职位 保护
    private int salary; // 工资   私有

    public void sayHello() {
        System.out.println(String.format("Hello, 我是 %s, 今年 %s 岁, 爱好是%s, 我目前的工作是%s, 月入%s元\n", name, age, getHobby(), position, salary));
    }
    private void work() {
        System.out.println(String.format("My name is %s, 工作中勿扰.", name));
    }
    public Employee(String name, String age, String hobby, int empNo, String position, int salary) {
        super(name, age, hobby);
        this.empNo = empNo;
        this.position = position;
        this.salary = salary;
        Employee.totalNum++;
    }
}

class ClassTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        Class c1 = Class.forName("reviewreflection.Employee");   // 第1种，forName 方式获取Class对象
        Class c2 = Employee.class;                               // 第2种，直接通过类获取Class对象
        Employee employee = new Employee("小明", "18", "写代码", 1, "Java攻城狮", 100000);
        Class c3 = employee.getClass();                          // 第3种，通过调用对象的getClass()方法获取Class对象

        if (c1 == c2 && c1 == c3) {     // 可以通过 == 比较Class对象是否为同一个对象
            System.out.println("c1、c2、c3 为同一个对象");
            System.out.println(c1);     // class reflect.Employee
        }


        //通过反射来创建实例:2种方式.
        Class c = Date.class;
        Date date1 = (Date) c.newInstance();    // 第1种方式：使用Class对象的newInstance()方法来创建Class对象对应类的实例
        System.out.println(date1.getTime());              // Wed Dec 19 22:57:16 CST 2018

//        long timestamp =date1.getTime();
        //Constructor is from the java.lang.reflect package.
        java.lang.reflect.Constructor constructor = c.getConstructor(long.class); //you can have the arguments or not.
        Date date2 = (Date)constructor.newInstance(1);  // 第2种方式：先通过Class对象获取指定的Constructor对象，再调用Constructor对象的newInstance()方法来创建实例
        
        Date date3 =  new Date(1); //这是标准的构造函数, 
        System.out.println(date2.getTime());                              // Wed Dec 19 22:57:16 CST 2018
        System.out.println(date3.getTime());                              // Wed Dec 19 22:57:16 CST 2018
        
        
        
        
        //获取类的全部信息
//        上面我们定义了两个类，现在有个需求：获取Employee的类名，构造器签名，所有的方法，所有的域（属性）和值，然后打印出来。该通过什么方式来实现呢？

        //--> 知道JVM虚拟机为每个类型管理一个Class对象，
         System.out.println(c1.getName());
         System.out.println(c1.getConstructors());
         System.out.println(c1.getDeclaredConstructors());
         System.out.println(c1.getMethods());
         System.out.println(c1.getFields());
         System.out.println(c1.getModifiers()); //返回一个用于描述Field、Method和Constructor的修饰符的整形数值，该数值代表的含义可通过Modifier这个类分析
//        Modifier 类 它提供了有关Field、Method和Constructor等的访问修饰符的信息，主要的方法有：toString(int modifiers)返回整形数
//        值modifiers代表的修饰符的字符串；isAbstract是否被abstract修饰；isVolatile是否被volatile修饰；isPrivate是否为private；
//        isProtected是否为protected；isPublic是否为public；isStatic是否为static修饰；等等，见名知义
         System.out.println(c1.getCanonicalName());
    }
}

//打印类信息程序
public class ReflectionTest {
    public static void main(String[] args) throws ClassNotFoundException {
        String name;
        if (args.length > 0) {
            name = args[0];
        } else {
            Scanner in = new Scanner(System.in);
            System.out.println("输入一个类名（e.g. java.util.Date）："); // reflect.Employee
            name = in.next();
        }
        try {
            Class cl = Class.forName(name);
            Class superCl = cl.getSuperclass();
            String modifiers = Modifier.toString(cl.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print("class " + name);
            if (superCl != null && superCl != Object.class) {
                System.out.print(" extends " + superCl.getName());
            }
            System.out.println("\n{");

            printConstructors(cl); // 打印构造方法
            System.out.println();
            printMethods(cl);   // 打印方法
            System.out.println();
            printFields(cl);    // 打印属性
            System.out.println("}");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.exit(0);
    }

    /**
     * 打印Class对象的所有构造方法
     */
    public static void printConstructors(Class cl) {
        Constructor[] constructors = cl.getDeclaredConstructors();

        for (Constructor c : constructors) {
            // 打印构造函数的名字:
            String name = c.getName();
            System.out.print("  ");
            String modifiers = Modifier.toString(c.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(name + "(");
            // 打印构造参数:
            Class[] paramTypes = c.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 打印Class的所有方法
     */
    public static void printMethods(Class cl) {
        Method[] methods = cl.getDeclaredMethods();
        //Method[] methods = cl.getMethods();
        for (Method m : methods) {
            Class retType = m.getReturnType();  // 返回类型
            System.out.print("  ");
            String modifiers = Modifier.toString(m.getModifiers());
            if (modifiers.length() > 0) {
                System.out.print(modifiers + " ");
            }
            System.out.print(retType.getName() + " " + m.getName() + "(");
            Class[] paramTypes = m.getParameterTypes();
            for (int i = 0; i < paramTypes.length; i++) {
                if (i > 0) {
                    System.out.print(", ");
                }
                System.out.print(paramTypes[i].getName());
            }
            System.out.println(");");
        }
    }

    /**
     * 打印Class的所有属性
     */
    public static void printFields(Class cl) {
        Field[] fields = cl.getDeclaredFields();
        for (Field f: fields) {
            Class type = f.getType();
            System.out.print("  ");
            String modifiers = Modifier.toString(f.getModifiers());
            if (modifiers.length()> 0) {
                System.out.print(modifiers + " ");
            }
            System.out.println(type.getName() + " " + f.getName() + ";");
        }
    }
}

class ObjectAnalyzer {
    private ArrayList<Object> visited = new ArrayList<>();

    public String toString(Object obj) {
        if (obj == null) {
            return "null";
        }
        if (visited.contains(obj)) {    // 如果该对象已经处理过，则不再处理
            return "...";
        }
        visited.add(obj);

        Class cl = obj.getClass(); // 获取Class对象
        if (cl == String.class) {   // 如果是String类型则直接转为String
            return (String) obj;
        }
        if (cl.isArray()) {        // 如果是数组
            String r = cl.getComponentType() + "[]{\n";     // 数组的元素的类型
            for (int i = 0; i < Array.getLength(obj); i++) {
                if (i > 0) {   // 不是数组的第一个元素加逗号和换行，显示更加美观
                    r += ",\n";
                }
                r += "\t";
                Object val = Array.get(obj, i);
                if (cl.getComponentType().isPrimitive()) { // Class为8种基本类型的时候为 true，直接输出
                    r += val;
                } else {
                    r += toString(val); // 不是8中基本类型时，说明是类，递归调用toString
                }
            }
            return r + "\n}";
        }
        // 既不是String，也不是数组时，输出该对象的类型和属性值
        String r = cl.getName();
        do {
            r += "[";
            Field[] fields = cl.getDeclaredFields();    // 获取该类自己定义的所有域，包括私有的，不包括父类的
            AccessibleObject.setAccessible(fields, true); // 访问私有的属性，需要打开这个设置，否则会报非法访问异常
            for (Field field : fields) {
                if (!Modifier.isStatic(field.getModifiers())) { // 通过 Modifier 可获取该域的修饰符，这里判断是否为 static
                    if (!r.endsWith("[")) {
                        r += ",";
                    }
                    r += field.getName() + "=";     // 域名称
                    try {
                        Class t = field.getType();     // 域（属性）的类型
                        Object val = field.get(obj);   // 获取obj对象上该域的实际值
                        if (t.isPrimitive()) {         // 如果类型为8种基本类型，则直接输出
                            r += val;
                        } else {
                            r += toString(val);        // 不是8种基本类型，递归调用toString
                        }
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
            r += "]";
            cl = cl.getSuperclass(); // 继续打印超类的类信息, 这是一个do 的循环, 只要cl不为null,就一直循环.
        } while (cl != null);
        return r;
    }
}

class ObjectAnalyzerTest {
    public static void main(String[] args) {
        int size = 4;
        ArrayList<Integer> squares = new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            squares.add(i * i);
        }
        ObjectAnalyzer objectAnalyzer = new ObjectAnalyzer(); // 创建一个上面定义的分析类ObjectAnalyzer的对象
        System.out.println(objectAnalyzer.toString(squares)); // 分析ArrayList<Integer>对象的实际值

        Employee employee = new Employee("小明", "18", "爱好写代码", 1, "Java攻城狮", 100); // 分析自定义类Employee的对象的实际值
        System.out.println(objectAnalyzer.toString(employee));
    }
}

//调用任意方法
class MethodTableTest {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        Employee employee = new Employee("小明", "18", "写代码", 1, "Java攻城狮", 100000);
        Method sayHello = employee.getClass().getMethod("sayHello");
        System.out.println(sayHello);   // 打印 sayHello 的方法信息
        sayHello.invoke(employee);      // 让 employee 执行 sayHello 方法

        double x = 3.0;
        Method square = MethodTableTest.class.getMethod("square", double.class);  // 获取 MethodTableTest 的square方法
        double y1 = (double) square.invoke(null, x);    // 调用类方法 square 求平方，方法参数 x 
        System.out.printf("square    %-10.4f -> %10.4f%n", x, y1);

        Method sqrt = Math.class.getMethod("sqrt", double.class);   // 获取 Math 的 sqrt 方法
        double y2 = (double) sqrt.invoke(null, x);  // 调用类方法 sqrt 求根，方法参数 x 
        System.out.printf("sqrt      %-10.4f -> %10.4f%n", x, y2);
    }

    // static静态方法 计算乘方
    public static double square(double x) {
        return x * x;
    }
}