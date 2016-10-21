package day28.regex;

public class RegexDemo
{
	public static void main(String[] args)
	{

		String qq = "123k4567";
		checkQQ(qq);
		checkQQReg(qq);

	}

	/**
	 * ���󣺶���һ�����ܶ�QQ�Ž���У�顣 Ҫ�󣺳���5~15. ֻ�������֣� 0���ܿ�ͷ
	 *
	 * @param qq
	 */
	static void checkQQReg(String qq)
	{
		String regex = "[1-9][0-9]{4,14}";// �������ʽ��
		boolean b = qq.matches(regex);
		System.out.println(qq + ":" + b);
	}

	/**
	 * ���󣺶���һ�����ܶ�QQ�Ž���У�顣 Ҫ�󣺳���5~15. ֻ�������֣� 0���ܿ�ͷ
	 *
	 * @param qq
	 */
	public static void checkQQ(String qq)
	{

		int len = qq.length();

		if (len >= 5 && len <= 15)
		{

			if (!qq.startsWith("0"))
			{
				try
				{
					long l = Long.parseLong(qq);

					System.out.println(l + ":��ȷ");
				}
				catch (NumberFormatException e)
				{
					System.out.println(qq + ":���зǷ��ַ�");
				}

			}
			else
			{
				System.out.println(qq + ":����0��ͷ");
			}
		}
		else
		{
			System.out.println(qq + ":���ȴ���");
		}

	}

}