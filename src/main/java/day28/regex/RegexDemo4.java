package day28.regex;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
//https://www.bilibili.com/s/video/BV1py4y1Y7iQ
// 泛型本质是一门编译时期的技术,专门给"编译器"使用的.
//Java反射：
// 泛型擦除:
// classloader 记载类时,JVM会把该类中的泛型擦除(擦除之后就是 Object类型)
// 泛型补偿:
//   获取莫个元素时, JVM会根据元素的"实际类型" 来进行签字类型转换.
// a)擦除和补偿 都是有 JVM 来完成的,不用人手动去管!
// b)擦除和补偿 都是在运行时期完成的,不是在编译时期!
//

public class RegexDemo4 {
    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, IllegalAccessException {
        List<String> list = new ArrayList<String>();
        list.add("1");
        list.add("2");
        list.add("3");

    // java: no suitable method found for add(int), you can not add it in the compiler.
    // Java compiler will complain about it .
//        list.add(1);


        //But it is still possible to call it during the Runtime, using reflection.
        Class<? extends List> listClass = list.getClass();

        Method addMethod = listClass.getMethod("add", Object.class);

        //here we can insert the integer into the String List.
        addMethod.invoke(list,1);

        System.out.println(list);

        //here, is a Object, not a String.
        Object s = list.get(3);
        System.out.println(s);
    }
}