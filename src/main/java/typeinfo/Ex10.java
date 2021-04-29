package typeinfo;//: typeinfo/SweetShop.java
// Examination of the way the class loader works.

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static net.mindview.util.Print.print;

public class Ex10 {
  public static void main(String[] args) {
    char[] array = "123".toCharArray();
    array.getClass().getSuperclass();
    Class<Boolean> type = Boolean.TYPE;
    boolean a = true;
    Boolean b = true;
    print();
  }
} /* Output:
inside main
Loading Candy
After creating Candy
Loading Gum
After Class.forName("Gum")
Loading Cookie
After creating Cookie
*///:~
