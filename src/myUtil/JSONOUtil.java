package myUtil;

import java.lang.reflect.Type;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

class User {
	private String username;
	private int userId;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(byte userId) {
		this.userId = userId;
	}
	@Override
	public String toString() {
		return "User [username=" + username + ", userId=" + userId + "]";
	}
}

public class JSONOUtil {
	
	public <T> T getJSON(String jsonData) {
		Gson gson = new Gson();
		Type typeOfT = new TypeToken<T>(){}.getType();
		T t = gson.fromJson(jsonData, typeOfT);
		return t;
	}
	
	public static void main(String[] args) {
		String jsonData = "[{\"username\":\"arthinking\",\"userId\":001},{\"username\":\"Jason\",\"userId\":002}]";  
		jsonData = "{" + 
				"		    \"code\":200," + 
				"		    \"message\":\"success\"," + 
				"		    \"data\":\"{\"username\":\"arthinking\",\"userId\":001}\"" + 
				"	}";
		jsonData = "{\"username\":\"rachel\",\"userId\":123456}";
		
		Gson gson = new Gson();
		Type typeOfT = new TypeToken<User>(){}.getType();
		User users = gson.fromJson(jsonData, typeOfT);
		
		System.out.println("½âÎöJSONÊý¾Ý");
//		for (Iterator<User> iterator = users.iterator(); iterator.hasNext();) {
//			User user = iterator.next();
//			System.out.print(user.getUsername() + " | ");
//			System.out.println(user.getUserId());
//		}
		System.out.println(users);
	}
}







