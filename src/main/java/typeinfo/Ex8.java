package typeinfo;//: typeinfo/SweetShop.java
// Examination of the way the class loader works.

import static net.mindview.util.Print.print;

public class Ex8 {
  public static void main(String[] args) {
    Ex8 candy = new Ex8();
    Class obejct = candy.getClass();
    do {
      print(obejct.getCanonicalName());
      obejct= obejct.getSuperclass();
    } while (obejct != null);
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
