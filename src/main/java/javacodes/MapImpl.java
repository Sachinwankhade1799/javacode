package javacodes;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MapImpl {

	public static void main(String[] args) {
		Map<Long, String> map = new HashMap<Long, String>(); 
	
	map.put(344352378967L, "sachin");
	map.put(987634521785L, "virat");
	map.put(998428761982L, "rohit");
	map.put(765792489072L, "hardik");
 
	map.put(344352378967L, "rahul");
	map.put(276528569736L, "virat");
	
	Set<Entry<Long, String>> set  = map.entrySet();
	
	Iterator<Entry<Long, String>>it=set.iterator();
	
	while (it.hasNext()) {
		
		Entry<Long, String>ee=it.next();
		System.out.println (ee );
		// System.out.println(ee.getKey()+" : "+ee.getValue());
	} 
		
	} 
	}

