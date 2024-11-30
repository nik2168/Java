
public class SignedUnsignedRIghtShift {
    public static void main(String[] args) {
        // >>> unsigned -> only positive 
        // >> signed -> negative and positive both 
        int a = -12;
        int b = 3;
        System.out.println(Integer.toBinaryString(a)+ " : " + a );
        System.out.println(Integer.toBinaryString(a >>> b) + " : " + (a >>> b));
        System.out.println(Integer.toBinaryString(a >> b) + " : " + (a >> b));

//         int a = 2, b = 5, c = 4;
// a = 6; b >>= 1; c <<= 1;
// System.out.println(a+" "+ b+" " + c);

    
}
}
