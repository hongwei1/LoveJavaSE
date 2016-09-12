package ThinkingInJava4.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
//: io/DirList.java
// Display a directory listing using regular expressions.
// {Args: "D.*\.java"}
import java.util.regex.Pattern;

public class DirList
{
	public static void main(String[] args)
	{
		File path = new File(".");
		String[] array;
		if (args.length == 0)
		{
			array = path.list();
		}
		else
		{
			array = path.list(new DirFilter(args[0]));
		}
		Arrays.sort(array, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : array)
		{
			System.out.println(dirItem);
		}
	}
}

class DirFilter implements FilenameFilter
{
	private Pattern pattern;

	public DirFilter(String regex)
	{
		pattern = Pattern.compile(regex);
	}

	@Override
	public boolean accept(File dir, String name)
	{
		return pattern.matcher(name).matches();// 换list里面的方法
	}
} /*
	 * Output: DirectoryDemo.java DirList.java DirList2.java DirList3.java
	 */// :~
