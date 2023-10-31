package week2.day2.assignment;

import java.util.Arrays;

public class FindMissingElement {
	
	public static void main(String[] args) {
		
		int num[]= {1,4,5,2,8,6,7};
		int j=1;
		System.out.println("Missing element in the array is ");
		
		Arrays.sort(num);
		for (int i =0; i<num.length; i++) {			
			    
				if(num[i]==j) {
					j++;					
				}
				
				}
				System.out.println(j);
		}	
		
	}


