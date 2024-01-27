package week01;
// Package declaration indicating that this class belongs to the 'week01' package


// This Main class named as "main"
public class main {
    public static void main(String[] args) {
        /*
        Main method:

        public - method can be accessed from anywhere
        static - allows the method to be called without creating an instance of the class
        void - return type of 'main' which indicates that the method does not 'return' a value 
        main - a name that is given as a starting method of the program
        String[] args - an array of strings that can be used to pass command-line arguments to the program if the user wants.

        */
        
        //Used to print a welcome message using the first command line argument
        System.out.println("Dear" + args[0] +", nice to meet with you");
        
        // Used to print a message introducing the program's user using second command line argument
        System.out.println("My name is" + args[0]);




    }
}
