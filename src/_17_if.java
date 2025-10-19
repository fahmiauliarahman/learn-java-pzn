public class _17_if {
    public static void main(String[] args) {
        /*
            if: a keyword that executes a block of code if a condition is true.
            else if: a keyword that executes a block of code if the previous condition is false and the current condition is true.
            else: a keyword that executes a block of code if all the previous conditions are false.

            if is having else block which is executed if the condition is false. or you can use else if to check multiple conditions.
            both else and else if are optional. you can use only if or if else.
        */

        int a = 10;
        if (a > 0) {
            System.out.println("a is positive"); // a is positive
        } else {
            System.out.println("a is negative");
        }

        // it will print "a is positive" because a is 10 which is greater than 0

        // example else if
        if (a < 0) {
            System.out.println("a is negative");
        } else if (a == 0) {
            System.out.println("a is zero");
        } else {
            System.out.println("a is positive"); // a is positive
        }

        // it will print "a is positive" because a is 10 which is greater than 0
    }
}
