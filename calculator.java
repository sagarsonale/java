import java.util.*;
class calculator
{
    public static void main(String[] args)
    {
        int result=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("select the  operation to be done from the list ");
        System.out.println("the operation list");
        System.out.println("1.Addition");
        System.out.println("2.subtraction");
        System.out.println("3.multiplication");
        System.out.println("4.division");
        System.out.println("5.average");
        int op=sc.nextInt();
        System.out.println("enter the first number");
        int a=sc.nextInt();
        System.out.println("enter the second number");
        int b=sc.nextInt();
        switch(op)
        {
            case 1:
            {
                result=a+b;
                System.out.println("the sum of given numbers is = "+result);                
                break;
            }
            case 2:
            {
                result=a-b;
                System.out.println("the diff of the given number is = "+result);
                break;
            }
            case 3:
            {
                result=a*b;
                System.out.println("the multiplication of givrn number is = "+result);
                break;
            }
            case 4:
            {
                result = a/b;
                System.out.println("the divisior of the given number is = "+result);
                break;
            }
            case 5:
            {
                result=(a+b)/2;
                System.out.println("the average of the given number is = "+result);
                break;
            }
            default:
            {
                System.out.println("enter the option present above!!");
            }
        }

    }
}