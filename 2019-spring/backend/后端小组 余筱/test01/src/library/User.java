package library;

import java.util.Scanner;

public class User {
	Scanner scanner= new Scanner(System.in);
	private String userName="admin";
	private String key="12345";
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public boolean login(){
	System.out.println("请输入用户名：");
	String name=scanner.next();
	System.out.println("请输入密码：");
	String key=scanner.next();
	if (name.equals("admin")&&key.equals("12345")) {
		return true;
		
	} else {
		return false;

	}
	
	}

}
