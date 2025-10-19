public class _6_number {
    public static void main(String[] args) {

        // Integer Number
        // byte is from -128 to 127 (1 byte), default = 0
        byte byteNum = 127;
        // short is from -32768 to 32767 (2 bytes), default = 0
        short shortNum = 32767;
        // int is from -2_147_483_648 to 2_147_483_647 (4 bytes), default = 0
        int intNum = 2_147_483_647;
        // long is from -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807 (8 bytes), default = 0
        long longNum = 9_223_372_036_854_775_807L; // adds L to the end of number to mark as long
        System.out.println("byteNum = " + byteNum);
        System.out.println("shortNum = " + shortNum);
        System.out.println("intNum = " + intNum);
        System.out.println("longNum = " + longNum);


        // floating point number
        // float is from 3.4e-038 to 3.4e+038 (4 bytes), default = 0.0
        float floatNum = 1.23F;
        // double is from 1.7e-308 to 1.7e+308 (8 bytes), default = 0.0
        double doubleNum = 1.23D;

        System.out.println("floatNum = " + floatNum);
        System.out.println("doubleNum = " + doubleNum);
    }
}
