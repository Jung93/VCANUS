package vcanusTest1;

import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import org.json.simple.JSONArray;
import org.json.simple.parser.JSONParser;

public class Baker implements Bread{
	
	@Override
	public List<Object> makeBread() throws Exception {
		JSONParser jsonParser = new JSONParser();
		JSONArray jsonArray =  (JSONArray)jsonParser.parse(new FileReader("C:\\Java\\bread.json"));
		
		List<Object> breadList = new ArrayList<Object>();
		
		for (int i = 0; i < jsonArray.size(); i++) {
			breadList.add(jsonArray.get(i));
		}
		return breadList;
	}
}
