public class _11_non_primitive_data_type {
    public static void main(String[] args) {
        /*
            basically, from file 6 to 8 is a primitive datatype.
            primitive data type is a data type that is built into the Java language.
            it has a fixed size and a fixed range of values.
            it is used to store simple data types like integers, floating-point numbers, characters, and booleans.
            
            non-primitive data type (we called it "object") is a data type that is not built into the Java language.
            this object data type is having it's own methods/functions and properties.
            default value of this object is null

            usually, primitive data type is having it's own object data type.
            for example, integer has it's own object data type, which is Integer.

            primitive: int, object: Integer
            primitive: double, object: Double
            primitive: char, object: Character
            primitive: boolean, object: Boolean
            etc.
         */

        // Integer Number
        // Byte is from -128 to 127
        Byte byteNum = 127;
        // Short is from -32768 to 32767
        Short shortNum = 32767;
        // Integer is from -2_147_483_648 to 2_147_483_647
        Integer intNum = 2_147_483_647;
        // Long is from -9_223_372_036_854_775_808 to 9_223_372_036_854_775_807
        Long longNum = 9_223_372_036_854_775_807L; // adds L to the end of number to mark as long

        System.out.println(byteNum);
        System.out.println(shortNum);
        System.out.println(intNum);
        System.out.println(longNum);

        // sample null value
        Integer newInt = null;
        System.out.println(newInt);

        // we are now having methods when using objects. e.g. we want to convert from Integer to String (using .toString() method)
        String stringInt = intNum.toString();
        System.out.printf("the stringInt variable value is %s, the data type is %s", stringInt, stringInt.getClass());
    }
}
