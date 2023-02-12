import java.util.*;
class AreaTriangle2 
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sides of Triangle");
        System.out.println("Enter the side 1 of Triangle:");
        float a=sc.nextFloat();
        System.out.println("Enter the side 2 of Triangle:");
        float b=sc.nextFloat();
        System.out.println("Enter the side 3 of Triangle:");
        float c=sc.nextFloat();

        float s = (a+b+c)/2;
        double area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("The area of Triangle is " + area);






    }
}
