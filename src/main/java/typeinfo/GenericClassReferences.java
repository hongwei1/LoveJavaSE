package typeinfo;//: typeinfo/GenericClassReferences.java

public class GenericClassReferences {
  public static void main(String[] args) {
    Class<Integer> intClass = int.class;
    Class<Integer> genericIntClass = int.class;
    genericIntClass = Integer.class; // Same thing
    genericIntClass = intClass; // Same thing
    intClass = Integer.class;
//    using generic syntax ==> enforce extra type checking.
//     genericIntClass = double.class; // Illegal
  }
} ///:~
