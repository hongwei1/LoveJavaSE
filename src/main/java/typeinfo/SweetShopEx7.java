package typeinfo;//: typeinfo/SweetShop.java
// Examination of the way the class loader works.

import static net.mindview.util.Print.print;

public class SweetShopEx7 {
  public static void main(String[] args) {	
    try {
      String sweet = args[0];
      //Here is so powerful, you can load the class by String!!!! so cool!!
      Class<?> classobject = Class.forName("typeinfo."+sweet);
    } catch(ClassNotFoundException e) {
      print("Couldn't find args[0]");
    } catch (Throwable e){
      print("Throwable:"+ e.getCause());
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
