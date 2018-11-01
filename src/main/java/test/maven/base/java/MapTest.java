package test.maven.base.java;

import java.util.HashMap;
import java.util.Map;

import com.google.common.collect.Maps;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		testInitExpectedSize();
	}
	
	private static void testInitExpectedSize(){
		HashMap<Object, Object> map = Maps.newHashMapWithExpectedSize(1);
		if(map.size() >= 3){
			System.out.println("size ****:"+map.size());
		}
		System.out.println("size before:"+map.size());
		map.put("4", 4);
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		System.out.println("size after: "+map.size());
		for(Map.Entry<Object, Object> entry : map.entrySet()){
			System.out.println(entry.getKey() +"****"+entry.getValue());
		}
		
	}

}
