package day28.regex;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
//https://www.bilibili.com/s/video/BV1py4y1Y7iQ
// ���ͱ�����һ�ű���ʱ�ڵļ���,ר�Ÿ�"������"ʹ�õ�.
//Java���䣺
// ���Ͳ���:
// classloader ������ʱ,JVM��Ѹ����еķ��Ͳ���(����֮����� Object����)
// ���Ͳ���:
//   ��ȡĪ��Ԫ��ʱ, JVM�����Ԫ�ص�"ʵ������" ������ǩ������ת��.
// a)�����Ͳ��� ������ JVM ����ɵ�,�������ֶ�ȥ��!
// b)�����Ͳ��� ����������ʱ����ɵ�,�����ڱ���ʱ��!
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