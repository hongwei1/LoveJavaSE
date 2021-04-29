//: typeinfo/toys/GenericToyTest.java
// Testing class Class.
package typeinfo.toys;

public class GenericToyTest {
  public static void main(String[] args) throws Exception {
    Class<FancyToy> ftClass = FancyToy.class;
    // Produces exact type:
    FancyToy fancyToy = ftClass.newInstance();

//  you can only get some class that is a superclass of FancyToy"
    Class<? super FancyToy> up = ftClass.getSuperclass();
    Class<? super FancyToy> superclass = ftClass.getSuperclass();

    // This won't compile:
    // Class<Toy> up2 = ftClass.getSuperclass();
    // Only produces Object:
    Object object = up.newInstance();


    Class<? extends Toy> down = ftClass.asSubclass(FancyToy.class);
    Toy fancyToy1 = down.newInstance();
    //Can not compile
//    FancyToy fancyToy2 = down.newInstance();
  }
} ///:~
