// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class emovespecialletter {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       System.out.println("Enter the sentence:");
       String sc=scan.nextLine();
       String res=" ";
       char ch[]={'@','#','$'};
       for(int i=0;i<sc.length();i++)
       {
            boolean s=true;
           char c=sc.charAt(i);
           for(int j=0;j<ch.length;j++)
           {
               if(c==ch[j])
               {
                   s=false;
                   break;
               }
           }
           if(s)
            res+=c;
           }
       System.out.println(res);
    }
}
