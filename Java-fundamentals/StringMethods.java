public class StringMethods {
    public static void main(String args[])
    {
       /*  String str="Java";
        int l = str.length();
        String str1 = str.toLowerCase();
        String str2 = str.toUpperCase();
        System.out.println(l);
        System.out.println(str1);
        System.out.println(str2);

        String str3 = "      Hello      ";
         str3= str3.trim();
         //str3= str3.substring(2);
         //str3 = str3.substring(0,2);
         str3= str3.replace('H','o');
        System.out.println(str3);
        */
        String str ="www.abcd.com";
        System.out.println(str.startsWith("www"));
        System.out.println(str.endsWith(".com"));
        System.out.println(str.charAt(1));
        System.out.println(str.indexOf('.'));
        System.out.println(str.lastIndexOf('.'));


    }
    
}
