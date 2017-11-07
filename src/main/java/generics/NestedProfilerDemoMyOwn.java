package generics; /**
 * Copyright (c) 2004-2011 QOS.ch
 * All rights reserved.
 *
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated  documentation files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute,  sublicense, and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 *
 * The  above  copyright  notice  and  this permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 *
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY,    FITNESS    FOR    A   PARTICULAR    PURPOSE    AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE,  ARISING FROM, OUT OF OR IN CONNECTION
 * WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

import ch.qos.logback.classic.LoggerContext;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.profiler.Profiler;
import org.slf4j.profiler.ProfilerRegistry;

/**
 *
 * This demo illustrates usage of SLF4J profilers. It is almost identical to
 * the first NestProfilerDemo, except that it uses a logger instead of
 * printing its output on the console.
 *

 * @author Ceki Gulcu
 */
public class NestedProfilerDemoMyOwn
{

  public static void main(String[] args) {
    Logger logger = LoggerFactory.getLogger(NestedProfilerDemoMyOwn.class);

    // create a profiler called "BASIC"
    Profiler profiler = new Profiler("BASIC");
    
    profiler.start("A");
//    logger.info("Hello World");
    doA();

    profiler.start("B");
    doA();
//    logger.info("Hello World");
    profiler.start("C");
    doA();
    profiler.stop().print();
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
