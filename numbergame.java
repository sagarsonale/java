import java.lang.Math; 
import java.util.*;
class numbergame
{
    public static void main(String[] args)
    {
     Scanner sc = new Scanner(System.in);
        int a=0;
        int min=0,max=10;
        a=(int)(Math.random()*(max-min+1)+min);
        System.out.println("enter your predicted number ");
        int b=sc.nextInt();
        if(a==b)
        {
            System.out.println("good job u guessed right"+a);
        }
        else if (b>a)
        {
            System.out.println("oops went far try again"+a);

        }
        else 
        {
            System.out.println("ohh no yout go it worng try again "+a);

        }
    }
}