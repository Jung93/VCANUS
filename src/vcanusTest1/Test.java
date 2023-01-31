package vcanusTest1;

import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class Test {
	public static void main(String[] args) {
		//업캐스팅
		BreadFactory breadFactory = new Bakery();
		//Bread 객체화
		Bread bread = breadFactory.newInstance();
		try {
			bread.makeBread().stream().map(jsonObject -> jsonObject.toString()).forEach(System.out::println);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
