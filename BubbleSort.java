/*Sorting Algorithms - Bubble Sort

Bubble Sort is the simplest sorting algorithm that works by repeatedly swapping the adjacent elements if they are in the wrong order. 
This algorithm is not suitable for large data sets as its average and worst case time complexity is quite high. */

package DataStructureProblems;

import java.util.Scanner;

public class BubbleSort {
	static int[] bubbleSort(int[] sortedArray) {
		for(int i=0;i<sortedArray.length;i++) {
			for(int j=0;j<sortedArray.length - i-1;j++) {
				 if(sortedArray[j]>sortedArray[j+1]) {
					 int temp = sortedArray[j];
					 sortedArray[j] = sortedArray[j+1];
					 sortedArray[j+1] = temp;
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
			int unsortedArray[] = new int[n];
 			for(int i=0;i<n;i++) {
				unsortedArray[i] = sc.nextInt();
			}
 			bubbleSort(unsortedArray);
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
