import java.util.Date;

public class _16_expression_statement_block {

    public static void main(String[] args) {
        /*
            Expression: an expression is a combination of variables, constants, and operators that evaluates to a single value.
        */

        // Example of expression
        int a = 10;
        Integer b = 20;
        int c = a + b;
        System.out.println(b == c); // false (b==c) is an expression that evaluates to false

        /*
            Statement: a statement is a unit of code that performs an action.
            basically, a statement is a line of code that does something and ends with a semicolon. (;)
        */
        // Example of statement
        System.out.println(c); // it is called method invocation statement
        int d = 10 + 30; // it is called assignment statement
        d++; // it is called increment statement
        var date = new Date(); // it is called object creation statement

        /*
            Block: a block is a group of statements that are enclosed in curly braces. ({})
        */
        // Example of block
        {
            int e = 100;
            System.out.println(e);

            // you can even have a block inside a block
            {
                int f = 200;
                System.out.println(f);
            }
        }
    }
}
