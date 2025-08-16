
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(toggle(n));
    }
    public static int toggle(int n){
        int c = 0;
        for(int i=1;i<=n;i++)if(i*i<=n)c++;
        return c;
        
        
    }
}
