package test.maven.base.guava;

import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import javax.annotation.PostConstruct;

import org.apache.commons.collections.CollectionUtils;

import test.maven.base.model.Foo;

import com.google.common.collect.ComparisonChain;
import com.google.common.collect.Lists;
import com.google.common.collect.Ordering;

public class ComparatorTest {
	
	private static List<Foo> list = Lists.newArrayList();
	
	public static void main(String[] args) {
		
		if(CollectionUtils.isEmpty(list)) {
			System.out.println("not auto loading data");
			Foo a = new Foo("bc", 17, 1);
			Foo b = new Foo("a", 12, 1);
			Foo c = new Foo("ccb", 18, 1);
			Foo d = new Foo("ac", 18, 1);
			list.add(a);
			list.add(b);
			list.add(c);
			list.add(d);
		}
		
		for(Foo f : list){
			System.out.println(f.toString());
		}
		compareV2(list);
		System.out.println("***********************");
		for(Foo f : list){
			System.out.println(f.toString());
		}
	}
	
	@PostConstruct
	public void init(){
		Foo a = new Foo("bc", 17, 1);
		Foo b = new Foo("a", 12, 1);
		Foo c = new Foo("ccb", 18, 1);
		list.add(a);
		list.add(b);
		list.add(c);
	}
	
	
	public static void compareV1(List<Foo> list){
		Collections.sort(list, new Comparator<Foo>() {
			@Override
			public int compare(Foo o1, Foo o2) {
				return ComparisonChain.start()
						.compare(o1.getName(), o2.getName())
						.compare(o1.getAge(), o2.getAge()).result();
			}
		});
	}
	
	public static void compareV2(List<Foo> list){
		final Comparator<String> lengthComparator = new Comparator<String>(){  
		    @Override  
		    public int compare(String o1, String o2) {  
		        return o2.length() - o1.length();  
		}}; 
		
		Collections.sort(list, new Comparator<Foo>() {
			@Override
			public int compare(Foo o1, Foo o2) {
				return ComparisonChain.start()
						.compare(o1.getName(), o2.getName(),Ordering.from(lengthComparator))
						.compare(o1.getAge(), o2.getAge()).result();
			}
		});
	}

	public List<Foo> getList() {
		return list;
	}

	public void setList(List<Foo> list) {
		this.list = list;
	}
}
