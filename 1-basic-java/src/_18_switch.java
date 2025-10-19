public class _18_switch {
    public static void main(String[] args) {
        /*
            switch: a keyword that executes a block of code based on the value of a variable.
            it is similar to if else if but more concise and easier to read.

            each case is a constant expression that is compared with the value of the variable.
            if the value of the variable matches the constant expression, the block of code inside the case is executed.
            the break statement is used to exit the switch block. if you omit the break statement, the execution will continue to the next case.
            the default case is executed if none of the cases match the value of the variable.
        */

        int day = 1;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            default:
                System.out.println("Unknown day");
        }

        // it will print "Monday" because day is 1
    }
}
