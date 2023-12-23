package array;

import java.util.Scanner;

public class AddMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:");
        int len=sc.nextInt();
        System.out.println("Enter the 1st array:");
        int[][]arr1=new int[len][len];
        for(int i=0;i<len;i++) {
        	for(int j=0;j<len;j++) {
        	arr1[i][j]=sc.nextInt();
        }
        }
        System.out.println("Enter the 2nd array:");
        int[][]arr2=new int[len][len];
        for(int i=0;i<len;i++) {
        	for(int j=0;j<len;j++) {
        		arr2[i][j]=sc.nextInt();
        	}
        }
    
        	
        }
	}
