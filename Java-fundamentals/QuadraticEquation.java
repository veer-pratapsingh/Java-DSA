import java.util.*;
class QuadraticEquation
{
    public static void main(String args[])
    {
        System.out.println("Enter the value of a,b,c:");
        Scanner sc=new Scanner(System.in);
        int a,b,c;
        double r1,r2;
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();
        r1 = (-b+Math.sqrt((b*b)-(4*a*c)/2*a));
        r2 = (-b-Math.sqrt((b*b)-(4*a*c)/2*a));
        System.out.println("The root R1 is: " + r1);
        System.out.println("The root R2 is:" + r2);


    }
}