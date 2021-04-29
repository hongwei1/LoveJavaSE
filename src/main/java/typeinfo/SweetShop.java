package typeinfo;//: typeinfo/SweetShop.java
// Examination of the way the class loader works.
import static net.mindview.util.Print.*;

class Candy {

  static { print("Loading Class Candy"); }//this is belong to the Class, only load once.

}

class Gum {
  static { print("Loading Gum"); }
}

class Cookie {
  static { print("Loading Cookie"); }
}

public class SweetShop {
  public static void main(String[] args) {	
    print("inside main");
    new Candy();
    new Candy();
    new Candy();
    new Candy();
    print("After creating Candy");

    try {
      Class<?> gum = Class.forName("typeinfo.Gum");
      Class<?> gum2 = Class.forName("typeinfo.Gum");//only load class unpon the first tie.
      Class<?> gum3 = Class.forName("Gum");
    } catch(ClassNotFoundException e) {
      print("Couldn't find Gum");
    }
    print("After Class.forName(\"Gum\")");
    Cookie cookie = new Cookie();
    Class<? extends Cookie> aClass = cookie.getClass();
    print("After creating Cookie");
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
