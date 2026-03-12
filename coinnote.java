import java.util.*;
interface Executable
{
    int getValue();
}
class Coin implements Executable
{
    int val;
    public void setValue(int val)
    {
        this.val=val;
    }
    public int getValue()
    {
        return this.val;
    }
}
class Note implements Executable
{
    int val;
    public void setValue(int val)
    {
        this.val=val;
    }
    public int getValue()
    {
        return this.val;
    }   
}
class Bag<T extends Executable>
{
    ArrayList<T> al=new ArrayList<T>();
    public void add(T obj)
    {
        al.add(obj);
    }
    public void display()
    {
        for(T obj : al)
        {
            System.out.println(obj.getValue());
        }
    }
}
class coinnote
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n,val=0;
        String str="";       
        n=sc.nextInt();
        Bag<Coin> bagOfCoins=new Bag<Coin>();
        Bag<Note> bagOfNotes=new Bag<Note>();
        for(int i=0;i<n;i++)
        {
            str=sc.next();
            val=sc.nextInt();
            switch(str)
            {
                case  "Coin":
                    Coin coin=new Coin();
                    coin.setValue(val);
                    bagOfCoins.add(coin);
                    break;
                case  "Note":
                    Note note=new Note();
                    note.setValue(val);
                    bagOfNotes.add(note);
                    break;
            }
        }
        System.out.println("Coins :");
        bagOfCoins.display();
        System.out.println("Notes :");
        bagOfNotes.display();
    }
}
