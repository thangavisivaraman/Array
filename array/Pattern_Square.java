package array;

import java.util.Scanner;

public class Pattern_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++) {
        	for(int k=1;k<=n-i;k++) {
        		System.out.print(1);
        	}
        	for(int j=1;j<=i;j++) {
        		System.out.print(i);
        	}
        	System.out.println();
        }
	}

}
