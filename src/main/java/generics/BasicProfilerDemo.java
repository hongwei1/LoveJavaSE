//https://www.slf4j.org/extensions.html
package generics;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.core.util.StatusPrinter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.profiler.Profiler;

public class BasicProfilerDemo
{
  public static void main(String[] args)
  {
    Logger logger = LoggerFactory.getLogger(BasicProfilerDemo.class);
    logger.info("Hello World");
    logger.debug("Hello World");

    // create a profiler called "BASIC"
    Profiler profiler = new Profiler("BASIC");
    profiler.start("A");
    doA();

    profiler.start("B");
    doB();

    profiler.start("OTHER");
    doOther();
    profiler.stop().print();

    // print internal state
    LoggerContext lc = (LoggerContext) LoggerFactory.getILoggerFactory();
    StatusPrinter.print(lc);
  }


  static private void doA()
  {
    delay(20);
  }

  static private void doB()
  {
    delay(25);
  }

  static private void doOther()
  {

    delay(33);
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