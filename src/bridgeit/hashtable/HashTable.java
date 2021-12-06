package bridgeit.hashtable;

import java.util.LinkedHashMap;

public class HashTable {

	public static void main(String[] args) {

		String str = "To be or not to be to";
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
