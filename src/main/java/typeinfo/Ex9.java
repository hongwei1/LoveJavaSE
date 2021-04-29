package typeinfo;//: typeinfo/SweetShop.java
// Examination of the way the class loader works.

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static net.mindview.util.Print.print;
import static net.mindview.util.Print.printnb;

public class Ex9 {
  public static void main(String[] args) {
    String string = new String();
    Class obejct = string.getClass();
    for(Field field: obejct.getDeclaredFields()){
      print(field.getName());
      print(field.getAnnotatedType());
    }
    print("");
    print("xxxxxxxxxxxxx");
    print("");
    for(Method method: obejct.getMethods()){
//      public boolean equals(Object anObject)


      print(method.getModifiers()+" "+method.getReturnType()+" "+ method.getName()+"("
      +method.getParameters().length+")");
      print(method.toString());
      print("");
    }
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
