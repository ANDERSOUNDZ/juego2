package template.jumping.excercice.java;
import java.util.*;
import java.io.*;

public class App {

    public static void main(String[] args) {
        String arrayObstacles = args[0];

        static int minimumJump(int arr[], int l, int h)
    {
        // Base case: source
        // and destination
        if (h == l)
            return 0;
 
        // When nothing is reachable
        // from the given source
        if (arr[l] == 0)
            return Integer.MAX_VALUE;
 
        // Recursively
        // get the minimum number of jumps
        // needed to reach arr[h] from these
        // reachable points.
        int min = Integer.MAX_VALUE;
        for (int i = l + 1; i <= h
                            && i <= l + arr[l];
             i++) {
            int jumps = minJumps(arr, i, h);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }

// jumps[n-1] will hold the
        int jumps[] = new int[n];
        // result
        int i, j;
 
        // if first element is 0,
        if (n == 0 || arr[0] == 0)
            return Integer.MAX_VALUE;
        // end cannot be reached
 
        jumps[0] = 0;
 
        // Find the minimum number of jumps to reach arr[i]
        // from arr[0], and assign this value to jumps[i]
        for (i = 1; i < n; i++) {
            jumps[i] = Integer.MAX_VALUE;
            for (j = 0; j < i; j++) {
                if (i <= j + arr[j]
                    && jumps[j]
                           != Integer.MAX_VALUE) {
                    jumps[i] = Math.min(jumps[i], jumps[j] + 1);
                    break;
                }
            }
        }
        return jumps[n - 1];
    }
 
    // driver program to test above function
    public static void main(String[] args)
    {
        int arr[] = { 1, 3, 6, 1, 0, 9 };
 
        System.out.println("Minimum number of jumps to reach end is : "
                           + minJumps(arr, arr.length));
    }
      
    public static void main(String args[])
    {
        int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        int n = arr.length;
        System.out.print("Minimum jumps to reach end is "
                         + minJumps(arr, 0, n - 1));
    }
        
        System.out.println("The minimum jump to avoid all obstacles is: " + minimumJump);
    }
}
