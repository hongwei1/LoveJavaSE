package typeinfo;//: typeinfo/BoundedClassReferences.java

public class BoundedClassReferences {
  public static void main(String[] args) {
//    generic syntax --> only to provide `compile-time` type checking
//    help you find some error a bit sooner!!!
    Class<? extends Number> bounded = int.class;

    Class<?> bounded2 = int.class;
    Class bounded3 = int.class;

    bounded = double.class;
    bounded = Number.class;

//    bounded = String.class; // this will cause the comping error!!!
    bounded2 = String.class;
    bounded3 = String.class;
    // Or anything else derived from Number.
  }
} ///:~
