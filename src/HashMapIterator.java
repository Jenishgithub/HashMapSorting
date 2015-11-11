import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapIterator {
	public static Map<Integer, String> maptest = new HashMap<Integer, String>();

	public static void main(String[] args) {

		maptest.put(0, "Jenish");
		maptest.put(1, "Shrigesh");
		maptest.put(2, "Kamna");
		maptest.put(3, "Krytan");
		maptest.put(4, "Freak");
		maptest.put(5, "Ryback");
		maptest.put(6, "Cessaro");
		maptest.put(7, "Big Show Man");

		displayHashMapUsingIterator();

		System.out.println();

		displayHashMapWithoutUsingIterator();

	}

	private static void displayHashMapWithoutUsingIterator() {
		// TODO Auto-generated method stub

		for (Entry<Integer, String> eachEntry : maptest.entrySet()) {
			System.out.print(eachEntry.getKey() + " :" + "  ");
			System.out.println(eachEntry.getValue());
		}

	}

	private static void displayHashMapUsingIterator() {
		// TODO Auto-generated method stub
		// entrySet() returns all of the entries in the hashmap, not the single
		// entry, so you have to store result of entrySet() in Set which is like
		// List
		// Just like in list, you have to specify the data type of items inside
		// list which is Entry<Integer, String> in this case
		Set<Entry<Integer, String>> setmaptest = maptest.entrySet();

		// just like in List, you have to mention the type of items inside list
		// to Iterator type
		Iterator<Entry<Integer, String>> it = setmaptest.iterator();
		while (it.hasNext()) {
			Entry<Integer, String> eachEntry = it.next();
			Integer tempInt = eachEntry.getKey();
			String tempString = eachEntry.getValue();
			System.out.print(tempInt + " :" + "  ");
			System.out.println(tempString);
		}
	}
}
