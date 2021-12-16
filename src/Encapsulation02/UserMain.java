package Encapsulation02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserMain {

	public static void main(String[] args) {
	
		
	List<User> kayitlar=new ArrayList<>();	
		
	ekleme();
		
		
		
	}

	public static void ekleme() {
		User obj=new User();
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen User bilgisi olarak Id giriniz ");
		String id1=scan.next();
		System.out.println("Lutfen User bilgisi olarak UserName giriniz ");
		String userName1=scan.next();
		System.out.println("Lutfen User bilgisi olarak Password giriniz ");
		String password1=scan.next();
		obj.setPassword(password1);
		
		
		User kayit=new User(id1,userName1,password1, false, false);
		
		
		System.out.println();
	}

}
