package test.maven.base.java;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

public class JsonTest {

    public static void main(String[] args) {
    	List<Map<String, Object>> skuBeanList = Lists.newArrayList();
		Map<String, Object> a = Maps.newHashMap();
		a.put("a", "a");
		skuBeanList.add(a);
		Map<String, Object> b = Maps.newHashMap();
		Map<String, Object> c = Maps.newHashMap();
		c.put("c", "c");
		b.put("b", c);
		skuBeanList.add(b);
		try {
//			String prettyJson = JSONUtil.toPrettyJson(skuBeanList);
//			System.out.println(prettyJson);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    
    public static void testString(){
    	//String s = '{"skuInfos":[{"kid":"208479","n":1,"pt":"9","scoreId":""},{"kid":"208480","n":1,"pt":"9","scoreId":""},{"kid":"208926","n":1,"pt":"9","scoreId":""}]}';
    }
    
	
	
}
