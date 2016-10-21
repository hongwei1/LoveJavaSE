package day24.p2.objectstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import day18.p2.bean.GrandFa;

public class ObjectStreamDemo
{

	/**
	 * @param args
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public static void main(String[] args) throws IOException, ClassNotFoundException
	{

		// writeObj();
		readObj();
	}

	public static void readObj() throws IOException, ClassNotFoundException
	{

		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
		// 对象的反序列化。
		GrandFa p = (GrandFa) ois.readObject();

		System.out.println(p.getName() + ":" + p.getAge());

		ois.close();

	}

	public static void writeObj() throws IOException, IOException
	{

		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
		// 对象序列化。 被序列化的对象必须实现Serializable接口。
		oos.writeObject(new GrandFa("小强", 30));

		oos.close();

	}

}
