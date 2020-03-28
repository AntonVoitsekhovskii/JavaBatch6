package com.syntax.class02;

//import java.util.Scanner;

public class replIt {
	int method(int[] arr) {
		 int sum = 0;
		 for(int i = 0; i < arr.length; i ++) {
			 sum += arr[i];
		 }
		 return sum;
	    }
	    public static void main(String[] args) {
	    	int[] array = {1, 3, 7, 10};
	    	replIt obj = new replIt();
	    	System.out.println(obj.method(array));
	    }
	  }