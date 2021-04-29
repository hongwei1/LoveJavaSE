//: typeinfo/toys/ToyTest.java
// Testing class Class.
package typeinfo.toys;
import static net.mindview.util.Print.*;

interface HasBatteries {}
interface Waterproof {}
interface Shoots {}
interface Shoots2 {}

class Toy {
  // Comment out the following default constructor
  // to see NoSuchMethodError from (*1*)
  Toy() {} //--> obj = up.newInstance(); will throw InstantiationException;
  Toy(int i) {}
}


class FancyToy extends Toy
implements HasBatteries, Waterproof, Shoots,Shoots2{
  FancyToy() { super(1); }
}
class HappyFancyToy extends FancyToy{}

public class ToyTest {
  static void printTypeInfo(Class classObject) {
    print("Class name: " + classObject.getName() +
      " is interface? [" + classObject.isInterface() + "]");
    print("Simple name: " + classObject.getSimpleName());
    print("Canonical name : " + classObject.getCanonicalName());
  }
  public static void main(String[] args) {
    Class c = null;
    try {
      c = Class.forName("typeinfo.toys.FancyToy");
    } catch(ClassNotFoundException e) {
      print("Can't find FancyToy");
      System.exit(1);
    }
    printTypeInfo(c); // print the FancyToy it self


    for(Class face : c.getInterfaces())
      printTypeInfo(face);//print the 3 interfaces: HasBatteries , Waterproof {} and  Shoots {}



    Class up = c.getSuperclass();//no further type info know at compile time until you create new instance,
    Object obj = null;
    try {
      // Requires default constructor:
      obj = up.newInstance();
    } catch(InstantiationException e) {
      print("Cannot instantiate");
      System.exit(1);
    } catch(IllegalAccessException e) {
      print("Cannot access");
      System.exit(1);
    }
    printTypeInfo(obj.getClass());// --> print the super class: Toy
  }
} /* Output:
Class name: typeinfo.toys.FancyToy is interface? [false]
Simple name: FancyToy
Canonical name : typeinfo.toys.FancyToy
Class name: typeinfo.toys.HasBatteries is interface? [true]
Simple name: HasBatteries
Canonical name : typeinfo.toys.HasBatteries
Class name: typeinfo.toys.Waterproof is interface? [true]
Simple name: Waterproof
Canonical name : typeinfo.toys.Waterproof
Class name: typeinfo.toys.Shoots is interface? [true]
Simple name: Shoots
Canonical name : typeinfo.toys.Shoots
Class name: typeinfo.toys.Toy is interface? [false]
Simple name: Toy
Canonical name : typeinfo.toys.Toy
*///:~
