# Mehdi Shukurlu
# ID: 19525
# CRN: 20420
## Week02 Folder

### NOTE: You have to install *JDK* to run these codes in your IDE!

### 1. [Sum.java]
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

---

# Week03 Folder
## *Geometry*
## [Point.java]
### Instance Variables (x and y):

``private float x, y;``
- These are private variables representing the x and y coordinates of the point. By marking them as private, access is restricted to within the class, and external classes must use public methods to interact with these variables.

### Constructors:

- Default Constructor:

`` public Point() {} ``



- This constructor is empty and does not take any parameters. It initializes a Point object with default values for x and y. It's often included for convenience.

### Parameterized Constructor:

``public Point(float x, float y) {``
    ``this.x = x;``
   `` this.y = y;``
``}``
- This constructor accepts initial values for x and y and sets the instance variables accordingly. It allows creating a Point object with specified coordinates.

### Copy Constructor:

``public Point(Point p) {``
   `` this.x = p.x;``
    ``this.y = p.y;``
``}``
- The copy constructor takes another Point object p and creates a new Point object with the same coordinates. 
- It provides a way to duplicate a point.

### Accessor and Mutator Methods (Getter and Setter):

`public float getX() {`
   ` return x;`
`}`

`public void setX(float x) {`
  `  this.x = x;`
`}`

`public float getY() {`
  `  return y;`
`}`

`public void setY(float y) {`
  `  this.y = y;`
`}`
- These methods provide controlled access to the private variables. 
- 'getX' and 'getY' are getter methods returning the values of x and y, while 'setX' and 'setY' are setter methods for modifying these values.

### Translation Method (translate):

`public void translate(float dX, float dY) {`
  `  this.x = this.x + dX;`
  `  this.y = this.y + dY;`
`}`
- The translate method takes two parameters (dX and dY) and moves the point by adding these values to the current coordinates. 
- It effectively shifts the point in the x and y directions.

### Distance Calculation Method (distance):

`public float distance(Point p) {`
   ` float dx = this.x - p.x;`
  `  float dy = this.y - p.y;`
   ` double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2));`
    `return (float) distance;`
`}`
- The distance method calculates the Euclidean distance between the current point and another point p. 
- It uses the distance formula: sqrt((x2 - x1)^2 + (y2 - y1)^2).

### Equality Check Method (equals):

`public boolean equals(Point p) {`
   ` return this.x == p.getX() && this.y == p.getY();`
`}`
- The equals method checks if the coordinates of the current point are equal to the coordinates of another point p. 
- It ensures equality based on values, not references.

- This Point class encapsulates common operations for a 2D point, making it reusable and providing a clean and organized way to work with geometric points in Java programs.

## [Segment.java]

### Instance Variables (p1 and p2):

`private Point p1, p2;`
- These are private variables of the Point type representing the two endpoints of the segment.

### Constructors:

#### Parameterized Constructors:

``public Segment(Point p1, Point p2) {``
  ``  this.p1 = new Point(p1);``
    ``this.p2 = new Point(p2);``
``}``

``public Segment(float x1, float y1, float x2, float y2) {``
   `` this.p1 = new Point(x1, y1);``
    ``this.p2 = new Point(x2, y2);``
``}``
- The constructors allow the creation of a Segment object either by providing two Point objects or by specifying the coordinates of the endpoints directly.

### Getter and Setter Methods:

``public Point getp1() {``
   `` return p1;``
``}``

``public Point getp2() {``
    ``return p2;``
``}``

``public void setp1(Point pnt) {``
  ``  this.p1 = pnt;``
``}``

``public void setp2(Point pnt) {``
  ``  this.p2 = pnt;``
``}``
- These methods provide access to the private variables p1 and p2, allowing retrieval and modification.

### Translation Method (translate):

``public void translate(float dX, float dY) {``
 ``  p1.translate(dX, dY);``
    ``p2.translate(dX, dY);``
``}``

- The translate method translates both endpoints of the segment by a given amount in the x and y directions.

###Length Calculation Method (length):

``public float length() {``
 ``return p1.distance(p2);``
``}``
- The length method calculates and returns the Euclidean distance between the two endpoints, representing the length of the segment.

### Equality Check Method (equals):

``public boolean equals(Segment s) {``
   `` return this.p1.equals(s.getp1()) && this.p2.equals(s.getp2());``
``}``
- The equals method checks if two segments are equal based on the equality of their endpoints.

### Slope and Intercept Calculation Methods (getSlope and getIntercept):

``public float getSlope() {``
   `` return (p2.getY() - p1.getY()) / (p2.getX() - p1.getX());``
``}``

``public float getIntercept() {``
  ``  float slope = getSlope();``
  ``  return p1.getY() - slope * p1.getX();``
``}``
- These methods calculate and return the slope and y-intercept of the line formed by the segment.

### Check if Point is on Line (isOnLine):

``public boolean isOnLine(Point p) {``
    ``return p.getY() == getSlope() * p.getX() + getIntercept();``
``}``
- The isOnLine method checks if a given point lies on the line defined by the segment.

### Check if Point is on Segment (isOnSegment):

``public boolean isOnSegment(Point p) {``
    ``if (!isOnLine(p)) return false;``

   `` float minX = Math.min(p1.getX(), p2.getX());``
   `` float maxX = Math.max(p1.getX(), p2.getX());``
  ``  float minY = Math.min(p1.getY(), p2.getY());``
  ``  float maxY = Math.max(p1.getY(), p2.getY());``

   `` return p.getX() >= minX && p.getX() <= maxX && p.getY() >= minY && p.getY() <= maxY;``
``}``

- The isOnSegment method checks if a given point lies on the segment by first verifying if it is on the line and then ensuring it falls within the range of the segment's bounding box.

- This Segment class provides functionality for working with line segments in a 2D space, including calculations for length, slope, intercept, and checks for equality and point inclusion.
- 


## *Invoice* 
## [Invoice.java]
### Instance Variables (partNumber, partDescription, quantity, price):

``private String partNumber, partDescription;``
``private int quantity;``
``private double price;``
- These are private variables representing the details of an invoice item. partNumber and partDescription are String types, while quantity is of type int and price is of type double.

### Constructor:

```public Invoice(String partNumber, String partDescription, int quantity, double price) {```
   ` setPartNumber(partNumber);`
  `  setPartDescription(partDescription);`
  `  setQuantity(quantity);`
  ` setPrice(price);`
``}``
- The constructor initializes an Invoice object with the provided values for partNumber, partDescription, quantity, and price. 
- It uses setter methods to ensure that the values meet certain criteria.

### Getter and Setter Methods for partNumber and partDescription:

`public String getPartNumber() {`
  ` return partNumber;`
`}`

`public void setPartNumber(String partNumber) {`
    `this.partNumber = partNumber;`
`}`

`public String getPartDescription() {`
   ` return partDescription;`
`}`

`public void setPartDescription(String partDescription) {`
  `  this.partDescription = partDescription;`
`}`
- These methods provide controlled access to the private variables partNumber and partDescription, allowing retrieval and modification.

### Getter and Setter Methods for quantity with Validation:

`public int getQuantity() {
    return quantity;
}`

`public void setQuantity(int quantity) {`
   ` if (quantity > 0) {`
      `  this.quantity = quantity;`
   ` }`
   `else {`
      `  this.quantity = 0; `
  `  }`
`}`

- These methods ensure that the quantity is set to a non-negative value. If a negative value is provided, it sets the quantity to 0.

### Getter and Setter Methods for price with Validation:

`public double getPrice() {`
    `return price;`
`}`

`public void setPrice(double price) {`
   ` if (price > 0.0) {`
   `     this.price = price;`
   ` } else {`
     `   this.price = 0.0;`
  `  }`
`}`
- Similar to the quantity, these methods ensure that the price is set to a non-negative value. If a negative value is provided, it sets the price to 0.0.

### Method to Calculate Invoice Amount (getInvoiceAmount):

`public double getInvoiceAmount() {`
 `   return (double) price * quantity;`
`}`

- This method calculates and returns the total invoice amount by multiplying the quantity and price.

- This Invoice class provides a simple representation of an invoice item with encapsulated data and methods for accessing and modifying its properties. The use of validation in setter methods ensures that the object maintains sensible values for quantity and price. The getInvoiceAmount method calculates the total cost of the items in the invoice.


## [InvoiceTest.java]
### Invoice Object Creation:

`Invoice invoice = new Invoice(s.nextLine(), s.nextLine(), s.nextInt(), s.nextDouble());`

- An Invoice object named invoice is created using the parameterized constructor. The user is prompted to input values for partNumber, partDescription, quantity, and price using the Scanner object.

###Displaying Invoice Details:

`System.out.println("Part Number: " + invoice.getPartNumber());
System.out.println("Part Description: " + invoice.getPartDescription());
System.out.println("Quantity: " + invoice.getQuantity());
System.out.println("Price Per Item: " + invoice.getPrice());
System.out.println("Invoice Amount: " + invoice.getInvoiceAmount());`

- The details of the Invoice object are then displayed using various getter methods. This includes the part number, part description, quantity, price per item, and the calculated invoice amount.


## *Datetime*
## [CustomDate.java]
`package week03.datetime;`

`public class CustomDate {`
   ` private int month;`
    `private int day;`
   ` private int year;`
 - Instance Variables (month, day, year):
 - These private variables represent the month, day, and year components of a date.
 
### Constructor:
- The constructor initializes a CustomDate object with the provided month, day, and year values.
- It checks if the date is valid using the isValidDate method, and if not, it prints an error message.

    `public CustomDate(int month, int day, int year) {`
      `  if (isValidDate(month, day, year)) {`
       `     this.month = month;`
         `   this.day = day;`
         `   this.year = year;`
   `     } else {`
          `  System.out.println("Invalid date parameters.");`
    `    }`
 `   }`

###Getter and Setter Methods for month:
- These methods provide access to and allow modification of the month variable.
- The setter (setMonth) checks if the provided month value is valid using the isValidMonth method.

   ` public int getMonth() {`
       ` return month;`
 `   }`

    `public void setMonth(int month) {`
        `if (isValidMonth(month)) {`
        `    this.month = month;
     `   } else {`
        `    System.out.println("Invalid month value.");`
     `   }`
   ` }`
   
### Getter and Setter Methods for day:
- Similar to month, these methods provide access to and allow modification of the day variable.
- The setter (setDay) checks if the provided day value is valid using the isValidDay method.

   ` public int getDay() {`
      `  return day;`
 `   }`

  `  public void setDay(int day) {`
    `    if (isValidDay(day, month, year)) {`
     `      this.day = day;`
    `    } else {`
        `    System.out.println("Invalid day value.");`
       ` }`
   ` }`

### Getter and Setter Methods for year:
- Similar to month and day, these methods provide access to and allow modification of the year variable.
- The setter (setYear) checks if the provided year value is valid using the 'isValidYear' method.

    `public int getYear() { `
      `return year;`
   ` }`

   `public void setYear(int year) {`
        `if (isValidYear(year)) {`
        `    this.year = year;`
    `   } `
    `else {`
         `   System.out.println("Invalid year value.");`
   `     }`
 ` }`

### Private Validation Methods *(isValidDate, isValidMonth, isValidDay, isValidYear)*:
- These private methods validate whether the provided date components (month, day, year) are valid.
- isValidDate calls the other three validation methods.

    `private boolean isValidDate(int month, int day, int year) {`
    `    return isValidMonth(month) && isValidDay(day, month, year) && isValidYear(year);`
`    }`

   ` private boolean isValidMonth(int month) {`
   `     return month >= 1 && month <= 12;`
    `}`

    private boolean isValidDay(int day, int month, int year) {
        `// Performs validation based on the month and checks for leap years when necessary`
    }

   ` private boolean isValidYear(int year) {`
     `   return year >= 1;`
    `}`

    `private boolean isLeapYear(int year) {`
       ` return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);`
    `}`

### Display Date Method (displayDate):
- This method prints the date in the format "month/day/year".

    `public void displayDate() {`
       ` System.out.println(month + "/" + day + "/" + year);`
   ` }`
### Difference Calculation Method (difference):
- This method calculates and returns the difference in months between two dates. 

    `public int difference(CustomDate date) {`
    
      `  // Designed to calculate the difference in months between the current date (this) and another CustomDate object passed as a parameter`
      
  `  }`

### Static Comparison Method (compare):
- This static method compares two dates and returns:
- 1 if date1 is greater than date2
-1 if date1 is smaller than date2
- 0 if they are equal.

  `public static int compare(CustomDate date1, CustomDate date2) {`
  
  `// ...`
       
  ` }`
   
### Formatted Date Display Method (displayFormatted):
- This method prints the date in a formatted manner using month abbreviations.

    public void displayFormatted() {
        // ...
    }

- This CustomDate class provides a simple date management system with validation and functionality for displaying formatted dates, calculating differences, and comparing dates.

- It encapsulates the logic related to date manipulation and ensures that the date components adhere to valid values.

## [CustomDateTest.java]
- Designed to test the functionality of the CustomDate class. 
- It prompts the user to input values for two dates then creates CustomDate objects based on these inputs and  performs various operations such as 'displaying the dates', 'comparing them' and 'calculating the difference' (in days) between them.

###Input for Date 1:

`System.out.print("Month Of Date1: ");`
`int date1_month = s.nextInt();`

`System.out.print("Day Of Date1: ");`
`int date1_day = s.nextInt();`

`System.out.print("Year Of Date1: ");`
`int date1_year = s.nextInt();`

- The user is prompted to input values for the month, day, and year of the first date (date1).

###Input for Date 2:

`System.out.print("Month Of Date2: ");`
`int date2_month = s.nextInt();`

`System.out.print("Day Of Date2: ");`
`int date2_day = s.nextInt();`

`System.out.print("Year Of Date2: ");`
`int date2_year = s.nextInt();`
- The user is prompted to input values for the month, day, and year of the second date (date2).

###Creating CustomDate Objects:

`CustomDate date1 = new CustomDate(date1_month, date1_day, date1_year);`
`CustomDate date2 = new CustomDate(date2_month, date2_day, date2_year);`
`CustomDate objects (date1 and date2) are created using the provided input values.`

###Displaying Dates:

`System.out.print("Date 1: ");`
`date1.displayDate();`
`System.out.print("Date 2: ");`
`date2.displayDate();`

- The dates are displayed using the displayDate method.

###Displaying Formatted Dates:

`System.out.print("Formatted Date 1: ");`
`date1.displayFormatted();`
`System.out.print("Formatted Date 2: ");`
`date2.displayFormatted();`

- The formatted dates are displayed using the displayFormatted method.

### Calculating Difference in Days:

`System.out.println("Difference between dates in terms of 'days': " + date1.difference(date2));`

- The difference in days between the two dates is calculated and displayed.

### Comparing Dates:
`int result = CustomDate.compare(date1, date2);`
`System.out.println("Comparison result: " + result);`

## [CustomTime.java]
- Represents a simple time management system with functionalities for 'creating', 'manipulating' and 'displaying' times.

### Instance Variables (hour, minute, second):
- These private variables represent the hour, minute, and second components of a time.
package week03.datetime;

`public class CustomTime {`
   ` private int hour, minute, second;`

### Constructor with Hour, Minute, and Second:
- The constructor initializes a CustomTime object with the provided hour, minute, and second values.
- It also calls the normalizeTime method to ensure that the time is normalized (i.e., within a valid range).

    `public CustomTime(int hour, int minute, int second){`
      `  this.hour = hour;`
      `  this.minute = minute;`
        `this.second = second;`

    `    normalizeTime();`
`    }`

### Default Constructor:
- This constructor initializes a CustomTime object with default values (00:00:00).
    `public CustomTime(){`
        `this(0,0,0);`
  `  }`

### Constructor with Hour (Minute and Second set to 0):
- This constructor initializes a CustomTime object with the provided hour and sets minute and second to 0.
    `public CustomTime(int hour){`
      `  this(hour,0,0);`
   ` }`

### Constructor with Hour and Minute (Second set to 0):
- This constructor initializes a CustomTime object with the provided hour and minute, setting the second to 0.

   ` public CustomTime(int hour, int minute){`
       ` this(hour,minute,0);`
  `  }`
### Copy Constructor:
- This constructor initializes a CustomTime object with the values of another CustomTime object.
   ` public CustomTime(CustomTime time){`
       ` this.hour = time.hour;`
       ` this.minute = time.minute;`
      `  this.second = time.second;`
    `}`

### Getter Methods (getHour, getMinute, getSecond):
- These methods provide access to the hour, minute, and second variables.

  `public int getHour(){`
      `  return hour;`
   ` }`

  `  public int getMinute(){`
       ` return minute;`
    `}`

    `public int getSecond(){`
       ` return second;`
 `   }`
 
### Universal Time Format Method (toUniversalString):
- This method returns a string representation of the time in universal time format (HH:MM:SS).

    `public String toUniversalString(){`
     `  return String.format("%02d:%02d:%02d", hour, minute, second);`
  `  }`
### Standard Time Format Method (toStandardString):
- This method returns a string representation of the time in standard time format (H:MM:SS AM/PM).
   ` public String toStandardString() {`
      `  // ...`
   ` }`

##Normalize Time Method (normalizeTime):
- This method ensures that the time is normalized by adjusting minutes and hours if they exceed their respective ranges.

    `public void normalizeTime() {`
       ` int extraMinutes = second / 60;`
      `  second %= 60;`
       ` minute += extraMinutes;`

     `   int extraHours = minute / 60;`
   `     minute %= 60;`
       ` hour += extraHours;`

  `  hour %= 24;`
`    }`
`}`

## [CustomTimeTest.java]
- Tests the functionality of the CustomTime class. 
- It prompts the user to input hours, minutes, and seconds for four different times, creates 'CustomTime objects' based on the inputs and then displays the times in both universal and standard formats.

- The program prompts the user to enter hours, minutes, and seconds for each of the four times (time1 to time4).

- For each time, the program reads the input using scanner.nextInt() and creates a new CustomTime object based on the entered values.

## *Math*
## ComplexNumber.java
###
`package week03.math;`

`public class ComplexNumber {`
  `  private double real;`
  `  private double imag;`
### Instance Variables (real and imag):
- The class has two private double variables, real and imag, representing the real and imaginary parts of a complex number.


   ` public ComplexNumber(double real, double imag) {`
      `  this.real = real;`
     `   this.imag = imag;`
 `   }`
### Constructor:
- The constructor initializes a ComplexNumber object with the provided real and imaginary parts.

   ` public boolean equals(ComplexNumber number) {`
      `  return this.real == number.real && this.imag == number.imag;`
`    }`
###Equals Method:
- The equals method checks if the current complex number is equal to another complex number by comparing their real and imaginary parts.

   ` public String toString() {`
   `     return real + " + " + imag + "i";`
 `   }`
### ToString Method:
- The toString method provides a string representation of the complex number in the form "real + imagi". It is used when you want to convert the complex number to a string for display or printing.

   ` public double re() {`
       `return real;`
 `   }`

 `   public double imag() {`
 `       return imag;`
    }
### Getter Methods (re and imag):
- These methods (re and imag) provide access to the real and imaginary parts of the complex number, respectively.

    `public ComplexNumber conjugate() {`
      `  return new ComplexNumber(real, -imag);`
 `   }`
### Conjugate Method:
- The conjugate method returns a new complex number that is the conjugate of the current complex number (negation of the imaginary part).

   ` public ComplexNumber abs() {`
      `  double magnitude = Math.sqrt(real * real + imag * imag);`
  `      return new ComplexNumber(magnitude, 0);`
 `   }`
### Absolute Value Method (abs):
- The abs method calculates the absolute value (magnitude) of the complex number and returns a new complex number with the magnitude as the real part and 0 as the imaginary part.

    `public ComplexNumber add(ComplexNumber number) {`
      `  return new ComplexNumber(this.real + number.real, this.imag + number.imag);`
`   }`
### Addition Method (add):
- The add method performs complex number addition and returns a new complex number representing the sum of the current complex number and another complex number.

    `public ComplexNumber sub(ComplexNumber number) {`
      `  return new ComplexNumber(this.real - number.real, this.imag - number.imag);`
`    }`
### Subtraction Method (sub):
- The sub method performs complex number subtraction and returns a new complex number representing the difference between the current complex number and another complex number.

    `public ComplexNumber mult(ComplexNumber number) {`
       ` double newReal = this.real * number.real - this.imag * number.imag;`
       ` double newImag = this.real * number.imag + this.imag * number.real;`
       ` return new ComplexNumber(newReal, newImag);`
    `}`
`}`

### Multiplication Method (mult):
- The mult method performs complex number multiplication and returns a new complex number representing the product of the current complex number and another complex number.

## [ComplexNumberTest.java]
- Two ComplexNumber objects (num1 and num2) are created using the provided real and imaginary parts.

### Print Statements:

- The program prints the string representations of num1 and num2 using the toString method.
Equality Check:

- The program prints whether num1 is equal to num2 using the equals method.

### Conjugate and Absolute Value:

- The program prints the conjugate of num1 and the absolute value of num2 using the conjugate and abs methods, respectively.

### Arithmetic Operations:

- The program performs arithmetic operations on complex numbers:
-The sum of num1 and num2 is calculated using the add method.
- The difference between num1 and num2 is calculated using the sub method.
- The product of num1 and num2 is calculated using the mult method.
- The results of these operations are printed.

- 'ComplexNumberTest' class allows the user to input real and imaginary parts for two complex numbers, performs various operations on them and prints the results. 
- The class serves as a practical demonstration of the functionalities provided by the ComplexNumber class.
- 















 

