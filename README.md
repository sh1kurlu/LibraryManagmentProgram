# Mehdi Shukurlu
# ID: 19525
# CRN: 20420
## Week02 Folder

### NOTE: You have to install *JDK* to run these codes in your IDE!

### 1. Sum.java
 *Description:*
 - Takes two integers from user by using _Scanner class_ and sum them up
 -  ``` java.util.Scanner;``` or ``` java.util.*;```
 -  ``` Scanner scanner = new Scanner(System.in);```
  


### 2. Calc.java
 *Description:*
 - Also takes two integers but now from the _command-line arguments_ and perform arithmetic calculations such as adding, substracting, division quotient and finding the remainder
 - Note: _Command-line arguments_ take inputs as _String_ so we have to convert it to _int_ in order to calculate. ``` Integer.parseInt(args[0]);``` and ``` Integer.parseInt(args[1]);```

### 3. Time.java
 *Description:*
- By using either _command-line arguments_ or _Scanner class_ we took a _second_ from user and convert it into _(hours:minutes:seconds)_.
- Assing each of the variable (hour,minute,second) and calculating each accordingly to the variable that has input - as a _second_.


### 4. PolarityOfNumber.java
 *Description:*
- Check if a given _double_ variable by user is positive,negative or neutral=0
- Note: _Double-precision floating-point number_ have a higher size than usual data types(64-bits long). Like in Java, as well as in many other programming languages, _double-precision floating-point number_ is represented by the _double_ data type.

### 5. MonthInfo.java
 *Description:*
 - By using a _switch case_, determine the _month name_ and the _number of days_ inside that month based on a _provided month number_.
 - `switch(month);`

### 6. LeapYear.java
 *Description:*
- Take a year from the user and to determine whether its a leap year or not
- _Leap Year_: Check if the year is divisible by 4, not divisible by 100 unless it is divisible by 400.
- Condition: `if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) true; else false;`

### 7. Fact.java
 *Description:*
 -  Takes an integer as input from the user via _Scanner class_ and calculates its factorial.
 -  If the given number is negative, an error message is printed without attempting to calculate the factorial with _for loop_.
 

### 8. SumOfOdd.java
 *Description:*
- Takes two integers from user and finds all of the _odd_ numbers between them and summing them up.
- If the order is reverse (e.g 9 to 2) then the program will recognize it and reverse it for printing the correct output.
- Checking if the number is odd or not: `if(num%2!=0)`

### 9. Average.java
 *Description:*
 - _Scanner class_ will read several integer values until EOF(End Of the File) and print the average of the values that were given by the user.
 - Note: To terminate the program, 'Ctrl+Z' in =Windows and 'Ctrl+D' in Mac. Once the program is terminated the results will be given, if no input then it will raise 'Error'
 
### 10. Harmonic.java
 *Description:*
- It will read the _n_ variable given by user and print the nth harmonic sum, accordingly.
- Harmonic numbers: In mathematics, the n-th harmonic number is the sum of the reciprocals of the first n natural numbers:
  `1/1 + 1/2 + 1/3 + ... 1/n`

### 11. TaylorSin.java
 *Description:*
- Calculates the sine of a given _floating-point value_ 'x' by user and the _number of terms_ 'n' to be used in the Taylor series.
- First, calculates the sine using the custom 'calculateSin' method and then compares it with 'Math.sin(x)''.
- It also provides approximations of sin(x) for the n five terms of the Taylor series.te for 'n' times.

### 12. Digits.java
 *Description:*
- Takes integer from users and finds the sum, product and average of its digits.
- For handling the negative inputs: `num = (num < 0) ? -num : num;`

### 13. CoinTossing.java
 *Description:*
- Takes user input for the number of tosses 'n' and performs the coin tosses using _Math.random()_ then calculates the _probabilities_ of getting heads and tails.
- `Heads = 0, Tails = 1;`
- `Probability = P(A) = n(A)/n(S);`

### 14. CoinTossing.java
 *Description:*
- Takes user input for the number of tosses 'n' and performs the coin tosses using _Math.random()_ then calculates the _probabilities_ of getting heads and tails.
- `Heads = 0, Tails = 1;`
- `Probability = P(A) = n(A)/n(S);`

### 15. PrintingPatterns.java
 *Description:*
 - Printing a pattern made my '#' and '*'s using _multi-dimensional arrays_
 - `String[][] pattern = new String[size][size];`
 - The overall area should be (size - 1) x (size)
 `size = 5:`
 >‏‏‎ ‎* # * # *
 >‏‏‎ ‎# * # * #
 >‏‏‎ ‎* # * # *
 > ‏‏‎ ‎# * # * #

### 16. RandomPointsInCircle.java
 *Description:*
- Generates and prints n points chosen uniformly at random inside the circle of radius 1 centered at (0, 0).
- It uses the formula for a circle (x^2 + y^2 <= 1) to determine if a point is inside the circle.
- The program takes user input for the number of points 'n' and uses a loop to generate and check each point.
- Note: _Random_ and (In-built)_Math_ classes were used for the calculations.

### 17. MinMax.java
 *Description:*
- Takes several _floats_ values(count is not known) and prints the minimum and maximum among those numbers.
- Algorithm is assigning min and max values as the first number and then goes into loop where each time 'min' and 'max' reaches out lesser and higher value respectively, it eventually finds the minimum and maximum among the numbers.

### 18. Primes.java
 *Description:*
 - Checks if given number 'n' by user is a prime or not
 - It checks by incrementing the i in _n/i_, if i has more than 1 value which can be divided to n then that number is not prime.
 - Note: reason why it was mentioned only '1' is because the 'i' in this code goes up until the square root of the n to reduce the unneccesary computations.
 So i never reaches to n, and the only factors that shows that the number is prime or not is whether it has more divisors other than 1.








 

