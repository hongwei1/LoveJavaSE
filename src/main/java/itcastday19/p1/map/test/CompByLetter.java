package itcastday19.p1.map.test;

import java.util.Comparator;

public class CompByLetter implements Comparator< String> {

	@Override
	public int compare(String o1, String o2) {
		return o1.compareTo(o2);
	}

}
