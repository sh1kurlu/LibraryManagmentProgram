package week05;

class MathDemo{
    public int min(int a, int b){
        int min = (a < b)? a : b;
        return min;
    }
    public int max(int a, int b){
        int max = (a > b)? a : b;
        return max;
    }

    public int sum(int args[]){
        int sum = 0;
        for(int num: args){
            sum += num;
        }

        return sum;
    }

    public float mean(int [] args){
        return sum(args)/args.length;
    }

    public int factorial(int n){
        if(n == 0 || n == 1 ) return 1;
        if(n<0) return -1;
        
        return n * factorial(n-1);
        
    }
}

    /* Advantages of defining these methods as static:
    
     - Static methods can be called on the class itself without creating an instance.
     - They are associated with the class rather than an instance, making the code more concise.
     - Static methods can be easily used in other classes without the need for instantiation. */


