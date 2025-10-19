public class _13_math {
    public static void main(String[] args) {
        // add: +
        // subtract: -
        // times: *
        // divide: /
        // modulo: %

        int a = 100;
        int b = 10;

        System.out.println(a + b); // 110
        System.out.println(a - b); // 90
        System.out.println(a * b); // 1_000
        System.out.println(a / b); // 10
        System.out.println(a % b); // 0

        // augmented assignment
        // augmented assignment is a shortcut way to assign a value to a variable
        // it is a combination of an operator and an assignment operator
        // for example, a += b is equivalent to a = a + b
        // a -= b is equivalent to a = a - b
        // a *= b is equivalent to a = a * b
        // a /= b is equivalent to a = a / b
        // a %= b is equivalent to a = a % b

        a += b;
        System.out.println(a); // 110

        a -= b;
        System.out.println(a); // 100

        a *= b;
        System.out.println(a); // 1_000

        a /= b;
        System.out.println(a); // 100

        a %= b;
        System.out.println(a); // 0

        a += 10;
        System.out.println(a); // 110

        // unary operator
        // unary operator is an operator that works on a single operand
        // for example, ++a is equivalent to a = a + 1
        // --a is equivalent to a = a - 1
        // a++ is equivalent to a = a + 1
        // a-- is equivalent to a = a - 1

        int x = 100;

        x++;
        System.out.println(x); // 101

        x--;
        System.out.println(x); // 100

        ++x;
        System.out.println(x); // 101

        --x;
        System.out.println(x); // 100
    }
}
