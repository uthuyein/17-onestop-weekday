package com.jdc.mkt.exe;

public class Main {
	private static final String LOGINID = "admin";
	private static final String PASSWORD = "123";
	
	public static void main(String[] args) {
		login("admin", "123");
	}
	
	static void login(String loginId,String password) {
		try {
			if(null == loginId || loginId.isBlank()) {
				throw new MyLoginException("LoginId can't be empty !");
			}
			
			if(null == password || password.isBlank()) {
				throw new MyLoginException("password can't be empty !");
			}
			
			if(!loginId.equals(LOGINID)) {
				throw new MyLoginException("Invalid LoginId!");
			}
			
			if(!password.equals(PASSWORD)) {
				throw new MyLoginException("Try your password again !");
			}
			
			System.out.println("Go To Home Page.");
			
		}catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}

@SuppressWarnings("serial")
class MyLoginException extends RuntimeException{
	
	MyLoginException(String message){
		super(message);
	}
}
