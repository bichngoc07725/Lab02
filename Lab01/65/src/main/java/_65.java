/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
import java.util.Arrays;
import java.util.Scanner;

public class _65 {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input the size of the array
        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        
        // Initialize the array
        int[] array = new int[n];
        
        // Input the elements of the array
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }
        
        // Sort the array
        Arrays.sort(array);
        
        // Calculate the sum and average
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        double average = (double) sum / n;
        
        // Output the sorted array, sum, and average
        System.out.println("Sorted array: " + Arrays.toString(array));
        System.out.println("Sum of array elements: " + sum);
        System.out.println("Average value of array elements: " + average);
        
        scanner.close();
    }
}