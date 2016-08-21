package itcastday11;

/*
Object:所有类的根类。
	Object是不断抽取而来，具备着所有对象都具备的共性内容。
*/
class Person {
	private int age;

	Person(int age) {
		this.age = age;
	}

	// 一般都会覆盖此方法，根据对象的特有内容，建立判断对象是否相同的依据。
	@Override
	public boolean equals(Object obj) { 
		
        if(!(obj instanceof Person))// 健壮性判断
        	throw new ClassCastException("Wrong data type!!!");
        
		Person p = (Person)obj;  // 向下转型
		return (this.age == p.age);
    }

	public int hashCode() {
		return age;
	}

	public String toString() {
		return "Person :" + age;
	}
}

class ObjectDemo {
	public static void main(String[] args) {
		//1 equals can accept different kinds of objects
		Person p1 = new Person(20);
		Person p2 = new Person(20);
		Person p3 = p1;
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));  
		
		//2 equals can accept different kinds of objects
		String a = "a";
		class Demo {
		}
		Demo d = new Demo();
		System.out.println(a.equals(d));
		//3 equals :test the keyword: instanceof
		System.out.println("Hello" instanceof String);
		System.out.println(d instanceof Demo);

		//4 hasCode 
		System.out.println(p1);
		System.out.println(p1.hashCode());
		
		//5getClass()
		 Class clazz1 = p1.getClass();
		 Class clazz2 = p2.getClass();
		 System.out.println(clazz1==clazz2);
		 System.out.println(clazz1.getName());
		 
		 //6toString()
		 System.out.println(p1.toString());//Person@61de33
		 System.out.println(p1.getClass().getName()+"$"+p1.hashCode());//Person@61de33

	}
}
