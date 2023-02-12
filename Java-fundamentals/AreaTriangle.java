import java.util.Scanner;

class AreaTriangle
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of Triangle:");
        float a=sc.nextFloat();
        System.out.println("Enter the height of Triangle:");
        float b=sc.nextFloat();
        float c=(a*b)/2;
        System.out.println(c);
        
    }
}