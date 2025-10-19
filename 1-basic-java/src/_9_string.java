public class _9_string {

    public static void main(String[] args) {
        // The String class represents character strings. All string literals in Java programs, such as "abc", are implemented as instances of this class.
        String firstName = "Fahmi";
        String lastName = "Aulia Rahman";

        // we can concat the string use (+) operator
        String fullName = firstName + " " + lastName;

        System.out.printf("My full name is %s %s\n", firstName, lastName);
        System.out.println("My full name when concat-ing is " + fullName);
    }
}
