package test.maven.base.java;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//testInitWithCapacity();
		//testArrayList();
		testRemove();
	}
	
	public static void testRemove(){
		List<String> list = new ArrayList<String>();
		list.add("1");
		list.add("2");
		list.add("3");
		for(String s : list){
			if("2".equals(s)){
				list.remove(s);
			}
		}
		
		for(String s : list){
			System.out.println(s);
		}
		
	}
	
	public static void testArrayList(){
		String[] arr = new String[]{"1","2","3"};
		List<String> list = Arrays.asList(arr);
		list.add("4");
		System.out.println(list.size());
	}
	
	public static void testInitWithCapacity(){
		ArrayList<Object> list = Lists.newArrayListWithExpectedSize(2);
		System.out.println(list.size());
		ArrayList<Object> list1 = Lists.newArrayListWithCapacity(3);
		System.out.println(list1.size());
		list.add("a");
		list.add("b");
		list.add("c");
		list.add("d");
		for(Object o : list){
			System.out.println(o.toString());
		}
	}

}
