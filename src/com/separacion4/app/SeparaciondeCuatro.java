package com.separacion4.app;

import java.util.Scanner;
public class SeparaciondeCuatro {

	public static void main(String[] args) 
	{
		int num=0,aux=0;
		Scanner input=new Scanner(System.in);
		
		
		
		do {
			
			System.out.println("Input a number lower than 100: ");
			num=input.nextInt();	
			
		}while(num>100);
		
		for(int i=num;i<=100;i+=4)
		{
			System.out.println("The number is: "+i);
			aux+=(i*i);
		}
		
		System.out.println("The add of square are: "+aux);
		
	}

}
