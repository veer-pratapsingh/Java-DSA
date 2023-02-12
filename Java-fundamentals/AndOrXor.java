class AndOrXor
{
    public static void main(String args[])
    {
        int y=6,z;
        int x=10;
       // z=x&y;  AND operation
       // z=x|y;  OR operation
       // z=x^y;  XOR operation
      //  z=x>>1;  Bit-wise right shift
      //  z=x<<1;  Bit-wise left shift
    z=~x;
        System.out.println(z);
        System.out.println(String.format("%s",Integer.toBinaryString(x)));
        System.out.println(String.format("%s",Integer.toBinaryString(z)));

    }
}