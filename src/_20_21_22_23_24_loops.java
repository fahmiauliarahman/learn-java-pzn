public class _20_21_22_23_24_loops {
    public static void main(String[] args) {
        // for
        for (int i = 0; i < 5; i++) {
            System.out.println("For: " + i);
        }

        // while
        int i = 5;
        while (i < 10) {
            System.out.println("While: " + i);
            i++;
        }

        // do-while
        do {
            System.out.println("DoWhile: " + i);
            i++;
        } while (i < 15);


        // for each
        String[] names = {"Fahmi", "Aulia", "Rahman"};

        for (String name : names) {
            System.out.println(name);
        }

        // break and continue
        i = 0;
        while (true) {
            System.out.println("i is " + i);
            i++;

            // when the i is 10, automatically exit the loops
            if (i >= 10) {
                break;
            }
        }
        /*
            fun fact its as same as do-while like this
            do {
                System.out.println("i is " + i);
                i++;
            } while (i < 10); // when the i is 10, automatically exit the loops
        */

        for (i = 0; i < 10; i++) {
            // continue will skip to next iteration
            if (i % 2 == 0) {
                continue;
            }

            System.out.println(i); // will print out 1,3,5,7,9
        }
    }
}
