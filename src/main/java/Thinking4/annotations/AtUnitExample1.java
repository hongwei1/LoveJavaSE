//: annotations/AtUnitExample1.java
package Thinking4.annotations;
import net.mindview.atunit.*;
import net.mindview.util.*;

public class AtUnitExample1 {
  public String methodOne() {
    return "This is methodOne";
  }
  public int methodTwo() {
    System.out.println("This is methodTwo");
    return 2;
  }
  @MyTest boolean methodOneTest() {
    return methodOne().equals("This is methodOne");
  }
  @MyTest boolean m2() { return methodTwo() == 2; }
  @MyTest private boolean m3() { return true; }
  // Shows output for failure:
  @MyTest boolean failureTest() { return false; }
  @MyTest boolean anotherDisappointment() { return false; }
  public static void main(String[] args) throws Exception {
    OSExecute.command(
      "java net.mindview.atunit.AtUnit AtUnitExample1");
  }
} /* Output:
annotations.AtUnitExample1
  . methodOneTest
  . m2 This is methodTwo

  . m3
  . failureTest (failed)
  . anotherDisappointment (failed)
(5 tests)

>>> 2 FAILURES <<<
  annotations.AtUnitExample1: failureTest
  annotations.AtUnitExample1: anotherDisappointment
*///:~
