public class TypeCasting {
    public static void main(String[] args) {
        float x = 9.78f; 
        //   int y =  x; // compilation error: incompatible types: possible lossy conversion from float to int
        /**
         * -> reason: possible loss of information
         * -> when converting from a larger data type to a smaller data type
         * -> in this Case : float(4 byte) > int(4 byte)
         * -> solution: explicit casting
         */
        int y = (int) x; // explicit casting from float to int

        System.out.println("x : " + x);
        System.out.println("y : " + y);
    }    
}
