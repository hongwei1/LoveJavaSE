package generics;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.profiler.Profiler;

public class BasicProfilerDemo
{
  public static void main(String[] args)
  {
    Logger logger = LoggerFactory.getLogger(BasicProfilerDemo.class);
    logger.info("Hello World");

    // create a profiler called "BASIC"
    Profiler profiler = new Profiler("BASIC");
    profiler.start("A");
    doA();

    profiler.start("B");
    doB();

    profiler.start("OTHER");
    doOther();
    profiler.stop().print();
  }


  static private void doA()
  {
    delay(200);
  }

  static private void doB()
  {
    delay(2500);
  }

  static private void doOther()
  {

    delay(3300);
  }

  static private void delay(int millis)
  {
    try
    {
      Thread.sleep(millis);
    } catch (InterruptedException e)
    {
    }
  }

}  