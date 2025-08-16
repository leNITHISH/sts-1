
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();             // number of divisors
        int[] num = new int[k];           // divisors
        int[] rem = new int[k];           // remainders

        for (int i = 0; i < k; i++) {
            num[i] = sc.nextInt();
        }

        for (int i = 0; i < k; i++) {
            rem[i] = sc.nextInt();
        }

        int x = findCRT(num, rem);
        System.out.println(x);
    }

    static int findCRT(int[] num, int[] rem) {
        int x = 1;
        while (true) {
            int i;
            for (i = 0; i < num.length; i++) {
                if (x % num[i] != rem[i])
                    break;
            }
            if (i == num.length)
                return x;  // all congruences satisfied
            x++;
        }
    }
}
