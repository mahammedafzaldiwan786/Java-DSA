public class TypeConversion {
    public static void main(String[] args) {
        int a = 10;
        long b = a; // conversion successful

        long c = 10;
        // int d = c; // compilation error
        /* 
        -> reason: possible loss of information
        -> when converting from a larger data type to a smaller data type
        -> in this Case : long(8 byte) > int(4 byte)
        -> solution: explicit casting
        */ 


        System.out.println("b : "+b);
        // System.out.println("d : "+d);
    }
}
