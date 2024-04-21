package week12;

@FunctionalInterface
interface AFuncInt{

    void apply(String input);
    
    static void print(String input){
        System.out.println("The Input: " + input);
    }

    default void print(String input1, String input2){
        System.out.println("Input 1: " + input1 + " " + "Input 2: " + input2);    
    }

}

public class Task1 {
    public static void main(String[] args) {

        AFuncInt anonymousInstance = new AFuncInt() {
            @Override
            public void apply(String input) {
                System.out.println("Anonymous apply: " + input);
            }
        };

        anonymousInstance.apply("Test");
        AFuncInt.print("Test");
        anonymousInstance.print("Test1", "Test2");

        AFuncInt lambdaInstance = (input) -> System.out.println("Lambda apply: " + input);

        lambdaInstance.apply("Test");
        AFuncInt.print("Test");
        lambdaInstance.print("Test1", "Test2");
    }
}
