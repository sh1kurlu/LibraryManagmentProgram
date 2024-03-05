package week07;

public class Factorial{
  public static void main(String[] args) {
    try{
    System.out.println(factorial(6));
    }

    catch(IllegalArgumentException e){
      System.out.println(e.getMessage());
    }
  }



public static int factorial(int n){

  if(n < 0){
    throw new IllegalArgumentException("Negative value detected!");
  }

  if(n == 0 || n == 1){
    return 1;
  }

  return factorial(n-1) * n;
}
}

