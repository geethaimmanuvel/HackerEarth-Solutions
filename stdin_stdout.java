import java.util.Scanner;
class stdin_stdout{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        if(sc.hasNextInt())
        {
            int num=sc.nextInt();
            sc.nextLine();
            if(sc.hasNextLine())
            {
                String s=sc.nextLine();
                System.out.println(num*2);
                System.out.println(s);
            }
        }
    }
}
