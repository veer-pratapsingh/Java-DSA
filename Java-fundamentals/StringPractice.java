public class StringPractice
{
    public static void main(String args[])
    {
        String str1 ="Java Program";
        String str2 =new String("JAVA");
        char c[]={'H','e','l','l','o'};
        String str3 =new String(c);
        byte b[]={65,66,67,68,69,70,71,72};
        String str4 = new String(b,1,4);


        System.out.println(str4);
    }
}
