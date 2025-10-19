public class _15_boolean {

    public static void main(String[] args) {
        /*
            boolean having it's own operations as follows
            && (AND), if all variables are true, it will return true, else will false
            || (OR), if one of the variables are true, it will return true, if all of the variables are false, it will return false
            ! (NOT), its simply the opposite of the variable, if the variable is true, will return false, etc
         */

        boolean f = false;
        boolean b = true;

        System.out.println(b && f); // false,
        System.out.println(b && b == f); // false (true == false)
        System.out.println(b && b == b); // true (true == true)
        System.out.println(b && (b || f)); // true, anything inside the () will be first. so (true && (true || false)) -> (true || false) -> true
        System.out.println(b && f || b); // when not having (), it will compares from the left to the right, so ((true && false) || true) -> false || true -> true

    }
}
