/*Sorting Algorithms - Selection Sort

Selection sort is a simple sorting algorithm. 
This sorting algorithm is an in-place comparison-based algorithm in which the list is divided into two parts, the sorted part at the left end and the unsorted part at the right end. 
Initially, the sorted part is empty and the unsorted part is the entire list. */

package DataStructureProblems;

import java.util.Scanner;

public class SelectionSort {
	static int[] selectionSort(int[] sortedArray) {
		for(int i=0;i<sortedArray.length-1;i++) {
			int minimum = sortedArray[i];
			int position = i;
			for(int j=i+1; j<sortedArray.length;j++) {
				if(sortedArray[j] < minimum) {
					minimum = sortedArray[j];
					position = j;
				}
			}
			if(position!=i) {
				sortedArray[position] = sortedArray[i];
				sortedArray[i] = minimum;
			}
			for(int j=0;j<sortedArray.length;j++) {
 				System.out.print(sortedArray[j] + " ");
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
			int unsortedArray[] = new int[n];
 			for(int i=0;i<n;i++) {
				unsortedArray[i] = sc.nextInt();
			}
 			selectionSort(unsortedArray);
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
