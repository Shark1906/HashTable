package bridgeit.hashtable;

import java.util.LinkedHashMap;

public class HashTable {

	public static void main(String[] args) {

		String str = "Paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String [] words = str.split(" ");
		LinkedHashMap<String, Integer> hashMap = new LinkedHashMap<>();
		for (int i = 0; i < words.length; i++) {
			String word = words[i];
			Integer value = hashMap.get(word);
			if(value == null) {
				value = 1;
			}else {
				value+=1;
			}
			hashMap.put(word, value);
		}
		
		System.out.println(hashMap);
	}

}
