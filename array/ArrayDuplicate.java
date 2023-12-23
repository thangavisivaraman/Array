package array;

import java.util.Scanner;

public class ArrayDuplicate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the length:");
		int length=sc.nextInt();
		
		System.out.println("Enter the value:");
		int[]arr=new int[length];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		for(int j=0;j<arr.length;j++) {
			for(int k=j+1;k<arr.length;k++) {
				if(arr[j]==arr[k]) {
					System.out.println("duplicate element is :" + arr[k]);
				}
			}
		}
		

	}

}
