package array;

import java.util.Scanner;

public class ArrayPrint {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length: ");
		int length=sc.nextInt();
		
		System.out.println("Enter the number: ");
		int [] a=new int[length];
		
		for(int i=0;i<a.length;i++) {
			a[i]=sc.nextInt();
			}
		for(int j=0;j<a.length;j++) {
			System.out.println("Array is: " +a[j]);
		}

	}

}
