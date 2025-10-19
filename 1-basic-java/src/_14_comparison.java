public class _14_comparison {
    public static void main(String[] args) {
        /*
            there are some comparison operator.
            > : greater than
            < : less than
            >= : greater than or equal to
            <= : less than or equal to
            == : equal to
            != : not equal to
         */

        int a = 100;
        int b = 10;
        int c = 100;
        float d = 10.3f;

        System.out.println(a > b); // true
        System.out.println(a < b); // false
        System.out.println(a >= b); // true
        System.out.println(a <= b); // false
        System.out.println(a == b); // false
        System.out.println(a != b); // true

        System.out.println("=========");

        System.out.println(a > c); // false
        System.out.println(a < c); // false
        System.out.println(a >= c); // true
        System.out.println(a <= c); // true
        System.out.println(a == c); // true
        System.out.println(a != c); // false

        System.out.println("=========");

        // comparing different data types
        // In all these comparisons, the int 'b' (10) is first
        // "promoted" to a float (10.0f) before the check happens.

        // Is 10.0f > 10.3f?
        System.out.println(b > d);   // false

        // Is 10.0f < 10.3f?
        System.out.println(b < d);   // true

        // Is 10.0f >= 10.3f?
        System.out.println(b >= d);  // false

        // Is 10.0f <= 10.3f?
        System.out.println(b <= d);  // true

        // Is 10.0f == 10.3f?
        System.out.println(b == d);  // false

        // Is 10.0f != 10.3f?
        System.out.println(b != d);  // true
    }
}
