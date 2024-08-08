
public class revercepirmid
{
    public static void main(String args[])
    {
        pirmid(1,5);
    }
    static void pirmid(int i,int n)
    {
        if(n>0)
        {
       space(i);
       star(n);
       System.out.println();
    }
    else
    return;
       pirmid(i+1,n-1);
    }
    static void star(int n)
    {
        if(n>0)
        {
                    System.out.print("* ");    
        }
        else
        return;
        star(n-1);
    }
    static void space(int i)
    {
        if(i>0)
        {
          System.out.print(" ");  
        }
        else
        return;
        space(i-1);
    }
}

   