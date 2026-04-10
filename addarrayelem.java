import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class addarrayelem {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan=new Scanner(System.in);
       
        int n=scan.nextInt();
        long arr[]=new long[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=scan.nextLong();
            
        }
         long sum=0;
        
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
            
        }
        System.out.println(sum);
        
    }
}
