public class _25_26_27_28_29_30_31_methods {
    /*
        Method: a method is a block of code that performs a specific task.
        it is similar to a function in other programming languages.
        it has the following syntax:

        accessModifier returnType methodName(parameterList) {
            // method body
        }

        accessModifier: the access modifier specifies the visibility of the method.
        it can be public, private, protected, or default.

        public: the method is visible to all classes.
        private: the method is visible only within the class.
        protected: the method is visible within the class and its subclasses.
        default: the method is visible within the package.

        returnType: the return type specifies the type of value that the method will return.
        if the method does not return any value, the return type is void.

        methodName: the method name is the identifier that is used to call the method.

        parameterList: the parameter list is a comma-separated list of variables that are passed to the method.
        each parameter has a type and a name.
    */


    // example of method
    public static void sayHello() {
        System.out.println("Hello World!");
    }

    // example of method overloading, it is okay if the args is different.
    public static void sayHello(String name) {
        System.out.println("Hello " + name + "!");
    }

    // example of method with parameter and return value
    public static int sum(int a, int b) {
        return a + b;
    }

    // method variable arguments
    public static void sayCongrats(String name, int[] scores) {
        int total = 0;
        for (int score : scores) {
            total += score;
        }

        if ((total / scores.length) > 70) {
            System.out.println("Congrats " + name + "!");
        } else {
            System.out.println("Nice try " + name + "!");
        }
    }

    public static void main(String[] args) {
        sayHello();
        sayHello("Fahmi");

        int c = sum(1, 2);
        System.out.println(c);

        sayCongrats("Fahmi", new int[]{90, 90, 85});
    }
}
