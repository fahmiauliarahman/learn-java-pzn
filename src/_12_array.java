public class _12_array {
    public static void main(String[] args) {
        // array is just a list of same type data
        String[] names;
        names = new String[3];

        names[0] = "Fahmi";
        names[1] = "Aulia";
        names[2] = "Rahman";
        // names[3] = "index out of bound, since the index is set to 3 (means 0, 1, 2)";

        // another way to create array
        Integer[] numbers = new Integer[]{
                10, 20, 30
        };

        // another way again to create array
        String[] books = {"Harry Potter"};
        System.out.println(books[0]); // Harry Potter

        // change value of array
        books[0] = "Java for Dummies";
        System.out.println(books[0]); // Java for Dummies

        // check length of arrays
        System.out.println("Array length is: " + books.length); // Array length is 1


        // nested arrays? why not

        // btw its called jagged array, where each inner array (row) can have a different length.
        String[][] users = {
                {"Fahmi", "Aulia", "Rahman"},
                {"Eko", "Kurniawan"},
        };

        System.out.println(users[0][0]); // Fahmi
        System.out.println(users[1][1]); // Kurniawan
        // System.out.println(users[1][2]); // [2] is index out of bound. be careful

        // create a 3x3 array, whereas all the values is initialized to null
        String[][] rubiks = new String[3][3];
        rubiks[0][0] = "White";
        rubiks[0][1] = "Orange";
        rubiks[0][2] = "Yellow";

        rubiks[1][0] = "Red";
        rubiks[1][1] = "Green";
        rubiks[1][2] = "White";

        System.out.println(rubiks[0][0]); // White
        System.out.println(rubiks[2][0]); // null, because index 2 is not given the value.

        rubiks[2][0] = "White";
        rubiks[2][1] = "Red";
        rubiks[2][2] = "Blue";
        
        System.out.println(rubiks[2][0]); // White, not null again because it was having value


    }
}
