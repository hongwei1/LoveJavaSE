//: typeinfo/pets/ForNameCreator.java
package typeinfo.pets;
import java.util.*;

public class ForNameCreator extends PetCreator {
  private static List<Class<? extends Pet>> types =
    new ArrayList<Class<? extends Pet>>();
  // Types that you want to be randomly created:
  private static String[] typeNames = {
    "typeinfo.pets.Mutt",
    "typeinfo.pets.Pug",
    "typeinfo.pets.EgyptianMau",
    "typeinfo.pets.Manx",
    "typeinfo.pets.Cymric",
    "typeinfo.pets.Rat",
    "typeinfo.pets.Mouse",
    "typeinfo.pets.Hamster"
  };	
  @SuppressWarnings("unchecked")
  private static void loader() {
    try {
      for(String name : typeNames)
        types.add((Class<? extends Pet>)Class.forName(name));
    } catch(ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
  static { loader(); }
  public List<Class<? extends Pet>> types() {return types;}

  public static void main(String[] args) {
    System.out.println(types);
    System.out.println(types.toArray().length);
  }
} ///:~[class typeinfo.pets.Mutt, class typeinfo.pets.Pug,
// class typeinfo.pets.EgyptianMau, class typeinfo.pets.Manx,
// class typeinfo.pets.Cymric, class typeinfo.pets.Rat,
// class typeinfo.pets.Mouse, class typeinfo.pets.Hamster]
