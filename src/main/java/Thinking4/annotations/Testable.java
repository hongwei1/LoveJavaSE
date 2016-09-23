//: annotations/Testable.java
package Thinking4.annotations;
import net.mindview.atunit.*;

public class Testable {
  public void execute() {
    System.out.println("Executing..");
  }
  @MyTest void testExecute() { execute(); }
} ///:~
