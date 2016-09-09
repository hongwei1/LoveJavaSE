package ThinkingInJava4.strings;

//: strings/Concatenation.java

public class Concatenation
{
	public static void main(String[] args)
	{
		String mango = "mango";
		String s = "abc" + mango + "def" + 47;
		System.out.println(s);
	}
} /*
	 * Output: abcmangodef47
	 */// :~

/**
 * <pre>
// Compiled from Concatenation.java (version 1.8 : 52.0, super bit)
public class ThinkingInJava4.strings.Concatenation {

  // Method descriptor #6 ()V
  // Stack: 1, Locals: 1
  public Concatenation();
    0  aload_0 [this]
    1  invokespecial java.lang.Object() [8]
    4  return
      Line numbers:
        [pc: 0, line: 5]
      Local variable table:
        [pc: 0, pc: 5] local: this index: 0 type: ThinkingInJava4.strings.Concatenation

  // Method descriptor #15 ([Ljava/lang/String;)V
  // Stack: 3, Locals: 3
  public static void main(java.lang.String[] args);
     0  ldc <String "mango"> [16]
     2  astore_1 [mango]
     3  new java.lang.StringBuilder [18]
     6  dup
     7  ldc <String "abc"> [20]
     9  invokespecial java.lang.StringBuilder(java.lang.String) [22]
    12  aload_1 [mango]
    13  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [25]
    16  ldc <String "def"> [29]
    18  invokevirtual java.lang.StringBuilder.append(java.lang.String) : java.lang.StringBuilder [25]
    21  bipush 47
    23  invokevirtual java.lang.StringBuilder.append(int) : java.lang.StringBuilder [31]
    26  invokevirtual java.lang.StringBuilder.toString() : java.lang.String [34]
    29  astore_2 [s]
    30  getstatic java.lang.System.out : java.io.PrintStream [38]
    33  aload_2 [s]
    34  invokevirtual java.io.PrintStream.println(java.lang.String) : void [44]
    37  return
      Line numbers:
        [pc: 0, line: 9]
        [pc: 3, line: 10]
        [pc: 30, line: 11]
        [pc: 37, line: 12]
      Local variable table:
        [pc: 0, pc: 38] local: args index: 0 type: java.lang.String[]
        [pc: 3, pc: 38] local: mango index: 1 type: java.lang.String
        [pc: 30, pc: 38] local: s index: 2 type: java.lang.String
}
 * 
 * </pre>
 */