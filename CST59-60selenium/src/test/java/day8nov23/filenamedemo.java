package day8nov23;

import java.util.Date;

public class filenamedemo {
	public static void main(String[] args) {
		Date dt = new Date();
		System.out.println(dt);
		String destfile = dt.toString().replaceAll(" ", "_").replaceAll(":", "_")+".jpg";
		System.out.println(destfile);
		
		
		
	}

}
