package ThinkingInJava4.typeinfo;

import static ThinkingInJava4.net.mindview.util.Print.print;
import static ThinkingInJava4.net.mindview.util.Print.printnb;

import ThinkingInJava4.net.mindview.util.TypeCounter;
//: typeinfo/PetCount4.java
import ThinkingInJava4.typeinfo.pets.Pet;
import ThinkingInJava4.typeinfo.pets.Pets;

public class PetCount4
{
	public static void main(String[] args)
	{
		TypeCounter counter = new TypeCounter(Pet.class);
		for (Pet pet : Pets.createArray(20))
		{
			printnb(pet.getClass().getSimpleName() + " ");
			counter.count(pet);
		}
		print();
		print(counter);
	}
} /*
	 * Output: (Sample) Rat Manx Cymric Mutt Pug Cymric Pug Manx Cymric Rat EgyptianMau Hamster EgyptianMau Mutt Mutt Cymric Mouse Pug Mouse Cymric {Mouse=2,
	 * Dog=6, Manx=7, EgyptianMau=2, Rodent=5, Pug=3, Mutt=3, Cymric=5, Cat=9, Hamster=1, Pet=20, Rat=2}
	 */// :~
