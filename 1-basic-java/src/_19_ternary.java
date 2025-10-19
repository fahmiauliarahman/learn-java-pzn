public class _19_ternary {

    public static void main(String[] args) {
        /*
            ternary operator: a shorthand way to write if else statement.
            it has the following syntax:
            variable = (condition) ? value1 : value2;
            if the condition is true, the variable will be assigned with value1.
            if the condition is false, the variable will be assigned with value2.
        */

        var score = 45;
        String text;

        text = score >= 70 ? "Congrats" : "Nice try";
        /* it is equivalent to the following if else statement:
            if (score >= 70) {
                text = "Congrats";
            } else {
                text = "Nice try";
            }
        */

        System.out.println(text); // Nice try
    }
}
