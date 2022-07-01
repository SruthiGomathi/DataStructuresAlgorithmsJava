package DataStructureProblems;

import java.util.Scanner;

public class StringInsertionSorting {
	static String[] insertionSort(String[] sortedArray) {
		for(int i=1;i<sortedArray.length;i++) {
			for(int j=0;j<i;j++) {
				if(sortedArray[j].compareTo(sortedArray[i])>0) {
					String temp = sortedArray[i];
					for(int k=i;k>j;k--) {
						sortedArray[k] = sortedArray[k-1];
					}
					sortedArray[j] = temp;
				}
			}
				
			for(int k=0;k<sortedArray.length;k++) {
	 			System.out.print(sortedArray[k] + " ");
	 		}
			System.out.println();
		}
			
		return sortedArray;
	}
	public static void main(String args[]) {
		Scanner sc = null;
		try {
			sc = new Scanner(System.in);
			System.out.println("Enter the number of elements in an array...");
			int n = sc.nextInt();
			String unsortedArray[] = new String[n];
 			for(int i=0;i<n;i++) {
				unsortedArray[i] = sc.next();
			}
 			insertionSort(unsortedArray);
 			System.out.println("Sorted array is... \n");
 			for(int i=0;i<n;i++) {
 				System.out.print(unsortedArray[i] + " ");
 			}
		}
		catch(Exception e) {
			System.out.println("Exception " + e);
		}
		finally {
			sc.close();
		}
	}
}
