import java.io.FileWriter;
import java.io.IOException;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonToFile{
	public static void main(String args[]){
		JSONObject obj = new JSONObject();
		obj.put("name","appsquadz.com");
		obj.put("age",new Integer(10));

		JSONArray list = new JSONArray();

		list.add("msg1");
		list.add("msg2");
		list.add("msg3");

		obj.put("messages",list);

		try{
			FileWriter file = new FileWriter("appsquadz.json");
			file.write(obj.toJSONString());
			file.flush();
			file.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
		System.out.println(obj);
	}
}
