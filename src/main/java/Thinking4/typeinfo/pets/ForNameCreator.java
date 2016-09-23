//: typeinfo/pets/ForNameCreator.java
package Thinking4.typeinfo.pets;

import java.util.ArrayList;
import java.util.List;

public class ForNameCreator extends PetCreator
{
	private static List<Class<? extends Pet>> types = new ArrayList<Class<? extends Pet>>();
	// Types that you want to be randomly created:
	private static String[] typeNames = { "ThinkingInJava4.typeinfo.pets.Mutt", //
			"ThinkingInJava4.typeinfo.pets.Pug", //
			"ThinkingInJava4.typeinfo.pets.EgyptianMau", //
			"ThinkingInJava4.typeinfo.pets.Manx", //
			"ThinkingInJava4.typeinfo.pets.Cymric", //
			"ThinkingInJava4.typeinfo.pets.Rat", //
			"ThinkingInJava4.typeinfo.pets.Mouse", //
			"ThinkingInJava4.typeinfo.pets.Hamster" }; //

	@SuppressWarnings("unchecked")
	private static void loader()
	{
		try
		{
			for (String name : typeNames)
			{
				types.add((Class<? extends Pet>) Class.forName(name));
			}
		}
		catch (ClassNotFoundException e)
		{
			throw new RuntimeException(e);
		}
	}

	static
	{
		loader();
	}

	@Override
	public List<Class<? extends Pet>> types()
	{
		return types;
	}
} /// :~
