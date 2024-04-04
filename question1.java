/*Q1: Merge two arrays by satisfying given constraints
Given two sorted arrays X[] and Y[] of size m and n each where m >= n and X[] has exactly n vacant cells,
 merge elements of Y[] in their correct position in array X[], i.e., merge (X, Y) by keeping the sorted order.

For example,

Input: X[] = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }
Y[] = { 1, 8, 9, 10, 15 } The vacant cells in X[] is represented by 0 
Output: X[] = { 1, 2, 3, 5, 6, 8, 9, 10, 15 }*/
  

public class MergeArrays {
    public static void mergeArrays(int[] X, int[] Y) {
        int m = X.length;
        int n = Y.length;
        
        // Move non-zero elements of X to the end
        int k = m - 1;
        for (int i = m - 1; i >= 0; i--) {
            if (X[i] != 0) {
                X[k] = X[i];
                k--;
            }
        }
        
        // Merge X and Y using two pointers technique
        int i = k + 1; // Start of non-zero elements in X
        int j = 0; // Start of Y
        int p = 0; // Current position in X
        
        while (i < m && j < n) {
            if (X[i] < Y[j]) {
                X[p] = X[i];
                i++;
            } else {
                X[p] = Y[j];
                j++;
            }
            p++;
        }
        
        // Copy remaining elements of Y, if any
        while (j < n) {
            X[p] = Y[j];
            j++;
            p++;
        }
    }
    
    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 };
        int[] Y = { 1, 8, 9, 10, 15 };
        
        mergeArrays(X, Y);
        
        // Print the merged array X
        for (int num : X) {
            System.out.print(num + " ");
        }
    }
}
