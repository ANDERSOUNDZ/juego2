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
 
    // Driver code
    public static void main(String args[])
    {
        int arr[] = { 1, 3, 6, 3, 2, 3, 6, 8, 9, 5 };
        int n = arr.length;
        System.out.print("Minimum jumps to reach end is "
                         + minJumps(arr, 0, n - 1));
    }
        
        System.out.println("The minimum jump to avoid all obstacles is: " + minimumJump);
    }

    public String getGreeting() {
        return "Hello World!";
    }
}
