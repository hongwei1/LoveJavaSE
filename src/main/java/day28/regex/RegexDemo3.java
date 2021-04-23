package day28.regex;
import org.apache.commons.io.IOUtils;
//https://regex101.com/r/I5Nu3V/1
//https://www.bilibili.com/video/BV12b41147y5?p=7&spm_id_from=pageDriver
//Learn the regular expression : now here is the example for google page all the tile.
//https://www.notion.so/35a29586cfdc48c2b195b2abc9f881e7

// import java.io.FileInputStream;


import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class RegexDemo3 {
	public static void main(String[] args) throws IOException {
		final String regex = "<div\\sclass=\\\"g\\\">(?:<div\\sclass=\\\"tF2Cxc\\\"|<h2.*?<\\/h2>).*?<h3\\sclass=\\\"LC.*?>(?<GoogleSearchTitle>.*?)<\\/h3>";

		FileInputStream fis = new FileInputStream("src/main/java/day28/regex/1.html");
		String string = IOUtils.toString(fis, "UTF-8");
		final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
		final Matcher matcher = pattern.matcher(string);

		while (matcher.find()) {
			System.out.println("Full match: " + matcher.group(0));

			for (int i = 1; i <= matcher.groupCount(); i++) {
				System.out.println("Group " + i + ": " + matcher.group(i));
			}
		}
	}
}