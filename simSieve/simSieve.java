import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if(n<2)return;
        boolean[] lul = new boolean[n+1];
        
        for(int i=2;i*i<=n;i++)if(!lul[i])for(int j=i*i;j<=n;j+=i)lul[j]=true;
        for(int i=2;i<=n;i++)if(!lul[i])System.out.printf("%d ", i);
    }
}
