public class SpecialCharacter 
{
    public static void main(String args[])
    {
        String str = "ab!A#&90076!$";
        System.out.println(str.replaceAll("[^a-zA-Z0-9]", ""));
        String str1 = "ab     cd     ef     gh  ij    kl         ml";
        System.out.println(str1.replaceAll("\\s+", ""));

    }
    
}
