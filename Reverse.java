package org.Exercise;
import java.util.Scanner;

public class Reverse {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println("Enter the value");
		int a = s.nextInt();
		int b=a;
		 int c=0;
		 int d=0;
		 while (b>0) {
			 d=b%10;
			 c=(c*10)+d;
			 b=b/10;
		 }
		System.out.println(c); 
		  
	}

}
