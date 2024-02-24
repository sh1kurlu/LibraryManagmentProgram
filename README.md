# Mehdi Shukurlu
# ID: 19525
# CRN: 20420

## week03
### Feb 18
- added a 'ToString' method to `Point.java` file because 'Task 17' The commit id (SHA, hash) value is `ca76998890d95c688fd625c7aa9d8eff02430a60`. +`ca76998`

- added a 'ToString' method to Every week03 .java files because 'Task 18' The commit id (SHA, hash) value is `0e6ab2cee3cd5694d12d0e849df09d11b78df673`. +`` and `0e6ab2cee3cd5694d12d0e849df09d11b78df673`.

## week03
### Feb 24
- Changed and overrided 'toString()' and 'equals(Object obj)' methods of 'Point.java' and 'Circle.java'. The commit _hash_ value is `92def0aa99199acc95a0dd1e3ac920c3acec1799`

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

### Getter and Setter Methods for month:
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
    
     ` // Designed to calculate the difference in months between the current date (this) and another CustomDate object passed as a parameter`
      
  `  }`

### Static Comparison Method (compare):
- This static method compares two dates and returns:
- 1 if date1 is greater than date2
- -1 if date1 is smaller than date2
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

### Input for Date 1:

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

### Displaying Dates:

`System.out.print("Date 1: ");`
`date1.displayDate();`
`System.out.print("Date 2: ");`
`date2.displayDate();`

- The dates are displayed using the displayDate method.

### Displaying Formatted Dates:

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

## Normalize Time Method (normalizeTime):
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
### Equals Method:
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
`System.out.println("num1: " + num1.toString());`
`System.out.println("num2: " + num2.toString());`
### Equality Check:

- The program prints whether num1 is equal to num2 using the equals method.
`System.out.println("Equals: " + num1.equals(num2));`

### Conjugate and Absolute Value:

- The program prints the conjugate of num1 and the absolute value of num2 using the conjugate and abs methods, respectively.
`System.out.println("Conjugate of num1: " + num1.conjugate().toString());`
`System.out.println("Absolute value of num2: " + num2.abs().toString());`

### Arithmetic Operations:

- The program performs arithmetic operations on complex numbers:
-The sum of num1 and num2 is calculated using the add method.
- The difference between num1 and num2 is calculated using the sub method.
- The product of num1 and num2 is calculated using the mult method.
- The results of these operations are printed.

`ComplexNumber sum = num1.add(num2);`
`System.out.println("Sum: " + sum.toString());`

`ComplexNumber difference = num1.sub(num2);`
`System.out.println("Difference: " + difference.toString());`

`ComplexNumber product = num1.mult(num2);`
`System.out.println("Product: " + product.toString());`
    
- 'ComplexNumberTest' class allows the user to input real and imaginary parts for two complex numbers, performs various operations on them and prints the results. 
- The class serves as a practical demonstration of the functionalities provided by the ComplexNumber class.


---
## Week 04
### Task1

- The Task1 program is a simple Java application that takes command line arguments as input, converts them into an array of integers, and then calculates and prints the sum and average of those integers.

### Main Method:
- The main method is the entry point of the program.
- It first calls the printCommandLineArguments method to display the command line arguments.
- If there are command line arguments provided (args.length > 0), it proceeds to convert the arguments to an array of integers using parseArgumentsToIntArray.
- It then prints the integer array using printIntArray and calculates/print the sum and average using printSumAndAverage.
- If no arguments are provided, it prints a message stating "No integers provided."
- Helper Methods:
- printCommandLineArguments: Takes an array of strings (command line arguments) and prints each argument on a new line.

- parseArgumentsToIntArray: Takes an array of strings and converts them into an array of integers using Integer.parseInt. Returns the resulting integer array.

- printIntArray: Takes an array of integers and prints them on the same line, separated by a space.

- printSumAndAverage: Takes an array of integers, calculates the sum using calculateSum, then calculates and prints the average.

- calculateSum: Takes an array of integers and calculates the sum using a simple loop.

- Usage:
To use the program
1) Compile the Task1.java file.
2) Execute the generated class file.
3) Optionally provide integers as command line arguments

- Input:
`java Task1 5 10 15`
- Output:
`Command Line Arguments:`
`5`
`10`
`15`
`Integer Array:`
`5 10 15 `
`Sum: 30`
`Average: 10.0`

## Task2
- Code Explanation:
The Task2 program is a Java application that finds the maximum, minimum, and both minimum and maximum values in an array of integers. It allows the user to either input the array size and elements manually or provide the array as command line arguments.

- Main Method:
Declares an array of integers named numbers.
If command line arguments are provided (args.length > 0), it initializes the numbers array with the provided values.
- If no command line arguments are provided, it prompts the user to enter the size of the array and then the array elements manually using a Scanner object.
- Calls three methods (findMaximum, findMinimum, findBothMinimumAndMaximum) to find and print the maximum, minimum, and both minimum and maximum values in the array.
- Helper Methods:
- findMaximum: Takes an array of integers and iterates through it to find and return the maximum value.

- findMinimum: Takes an array of integers and iterates through it to find and return the minimum value.

- findBothMinimumAndMaximum: Takes an array of integers and iterates through it to find and return both the minimum and maximum values as an array.

- Usage:
- To use the program:

1) Compile the Task2.java file.
2) Execute the generated class file.
3) If using command line arguments, provide the array values separated by spaces.
4) If not using command line arguments, enter the size of the array and the array elements manually.
Example:
- Using Command Line Arguments:

Input:
`java Task2 5 10 3 8 15`
Output:

`Maximum: 15`
`Minimum: 3`
`Both Minimum and Maximum: 3, 15`

- Without Command Line Arguments:`

`Enter the size of the array: 4`
`Enter the elements of the array:`
`20 4 12 8`

- Output:

`Maximum: 20`
`Minimum: 4`
`Both Minimum and Maximum: 4, 20`

## Task3
- Code Explanation:
The Task3 program is a Java application that takes a list of integer grades, calculates and prints the mean, median, mode, and histogram of the grades.

- Main Method:
Creates a Scanner object for user input and an ArrayList<Integer> to store grades.

- Reads integer grades from the user until no more integers are entered, adding them to the gradesList.
- Converts gradesList to an array of integers named grades.
- Calls findMeanMedianAndMode to calculate mean, median, and mode, and then prints them.
- Calls calculateHistogram to compute the histogram of the grades and prints the result.
- Helper Methods:
- findMeanMedianAndMode: Takes an array of integers, sorts it, and calculates and returns the mean, median, and mode.

- Median: If the array size is even, it takes the average of the two middle elements. If odd, it takes the middle element.
- Mean: Calculates the average of all the elements in the array.
- Mode: Finds the mode (the number that appears most frequently) in the array.
- calculateHistogram: Takes an array of integers representing grades, determines the range of grades, and creates a histogram.

- Finds the minimum and maximum grades.
- Calculates the number of bins (unique grades).
- Initializes an array histogram to store the frequency of each grade.
- Populates the histogram by incrementing the corresponding bin for each grade.
- Usage:
To use the program:

1) Compile the Task3.java file.
2) Execute the generated class file.
3) Enter integer grades when prompted. To end input, press Ctrl+D (Unix/Linux) or Ctrl+Z (Windows).
4) The program will output the mean, median, mode, and histogram of the entered grades.

- Example:
Input:

`85 92 78 92 90 78 88 87 80 82 85 78 90`
- Output:


`Mean: 84.0`
`Median: 85.5`
`Mode: 78`

`Histogram:`
`78: 3`
`79: 0`
`80: 1`
`81: 0`
`82: 1`
`83: 0`
`84: 0`
`85: 2`
`86: 0`
`87: 1`
`88: 1`
`89: 0`
`90: 2`
`91: 0`
`92: 2`


## Task7

- Code Explanation:
The Task7 program is a Java application that takes a string as input, reverses it, and then prints the reversed string.

- Main Method:
- Initializes a string input with the value "Salam".
- Calls the reverseString method, passing the input string.
- Prints the reversed string.
- Helper Method:
reverseString: Takes a string as input, iterates through its characters in reverse order, and builds a reversed string using StringBuilder.


- Usage:
To use the program:

1) Compile the Task7.java file.
2) Execute the generated class file.
3) The program will output the reversed string.
- Example:
Output:

`Reversed String: malaS`

## Task 8 

- Code Explanation:
The Task8 program is a Java application that takes a string as input, "explodes" it, and then prints the resulting exploded string. The concept of exploding here means that for each character in the input string, it appends all the characters from the beginning of the string up to that position.

- Main Method:
- Initializes a string input with the value "Baku".
 Calls the explodeString method, passing the input string.
- Prints the exploded string.
- Helper Method:
- 'explodeString': Takes a string as input, iterates through its characters, and for each character, appends all the characters from the beginning of the string up to that position using StringBuilder.
- Usage:
To use the program:

1) Compile the Task8.java file.
2) Execute the generated class file.
3) The program will output the exploded string.

- Example:
Output:

`Exploded String: BBAABAKBAKUBAKU`

## Task 9 
- Code Explanation:
- The Task9 program is a Java application that takes a string as input, converts it to lowercase(`.toLowerCase()`), sorts the characters in a case-insensitive manner, and then prints the resulting sorted string.

- Main Method:
- Creates a Scanner object for user input.
- Reads a line of text from the user.
- Calls the 'toSort' method, passing the input string.
- Prints the sorted string.
- Helper Method:
- 'toSort': Takes a string as input, converts it to lowercase, creates a character array, sorts it, and returns the sorted string.
- Usage:
To use the program:

1) Compile the Task9.java file.
2) Execute the generated class file.
3) Enter a line of text when prompted.
4) The program will output the sorted version of the entered text.
- Example:
Input:

`Hello World`
- Output:

`Sorted Text: dehllloorw`

## Task 10
- Code Explanation:
The Task10 program is a Java application that checks whether two strings are anagrams. Anagrams are words or phrases formed by rearranging the letters of another, using all the original letters exactly once.

- Main Method:
- Initializes two strings, str1 and str2, with values "Alasm" and "Salam" respectively.
- Calls the 'areAnagrams' method, passing the two strings.
- Prints the result, indicating whether the strings are anagrams.
- Helper Method:
- 'areAnagrams': Takes two strings as input, converts them to lowercase, checks if their lengths are equal, converts them to character arrays, sorts the arrays, and then checks if they are equal using Arrays.equals.
- Usage:
To use the program:

1) Compile the Task10.java file.
2) Execute the generated class file.
3) The program will output whether the given strings are anagrams.
- Example:

- Input: 
`Alasm`
`Salam`
Output:

`Result: true`

## Task 11
- Code Explanation:
- The Task11 program is a Java application that takes a sentence as input, swaps the first and last letters of each word (if the word has more than one letter), and then prints the modified sentence.

- Main Method:
- Initializes a string input with the value "This is PP2 Fall 2021".
- Calls the swapFirstAndLast method, passing the input string.
- Prints the modified sentence.
 Helper Method:
- swapFirstAndLast: Takes a sentence as input, splits it into words using space as a delimiter, iterates through the words, and swaps the first and last letters (if the word has more than one letter). The modified words are then joined to form the modified sentence.
Usage:
To use the program:

1) Compile the Task11.java file.
2) Execute the generated class file.
3) The program will output the modified sentence.
- Example:

- Input: 
`"This is PP2 Fall 2021"`
Output:
`sihT si PP2 llaF 1202`
- Note:
The program modifies each word in the sentence by swapping its first and last letters, considering only words with more than one letter.

# Task 12

- Code Explanation:
The Task12 program is a Java application that takes two strings as input, a main string, and a substring. It then finds and prints the index at which the substring is found in the main string.

- Main Method:
- Creates a Scanner object for user input.
- Reads two lines of text from the user, representing the main string and the substring.
- Calls the findSubstringIndex method, passing the main string and substring.
- Prints the index at which the substring is found, or -1 if not found.
- Helper Method:
- 'findSubstringIndex': Takes a main string and a substring as input and iterates through the main string to find the index where the substring starts. If the substring is not found, it returns -1.

- Usage:
To use the program:

1) Compile the Task12.java file.
2) Execute the generated class file.
3) Enter the main string and substring when prompted.
4) The program will output the index at which the substring is found or -1 if not found.

- Example:
Input:

`Hello World`
`World`
Output:
`The program performs a simple substring search by iterating through the main string and comparing substrings of the same length to the given substring.`

## Task 13
- Code Explanation:
The Task13 program is a Java application that takes a single word as input and prints all possible slices of the word by inserting a space at different positions.

- Main Method:
- Creates a Scanner object for user input.
Reads a line of text from the user, representing the input word.
Iterates through each position in the word and prints a slice of the word by inserting a space at that position.
- Usage:
To use the program:

1) Compile the Task13.java file.
2) Execute the generated class file.
3) Enter a word when prompted.
4) The program will output all possible slices of the word by inserting a space at different positions.
- Example:
Input:

`hello`

- Output:

` hello`
`h ello`
`he llo`
`hel lo`
`hello `

- Note:
The program demonstrates how to generate all possible slices of a word by inserting a space at different positions. It uses the 'substring method' to achieve this

## Task 15

- Code Explanation:
The Task15 program is a Java application that takes user input to create an array of invoices and then prints the invoice amounts for each invoice.

- Main Method:
- Creates a Scanner object for user input.
- Reads the number of invoices as an integer.
- Initializes an array of Invoice objects with the given number of invoices.
- Reads input for each invoice, including part number, description, quantity of item, and price per item.
- Creates an Invoice object for each set of inputs and adds it to the array.
- Prints the invoice amounts for each invoice.

- Usage:
To use the program:

1) Compile the Task15.java file.
2) Execute the generated class file.
3) Enter the number of invoices and input details for each invoice as prompted.
4) The program will output the invoice amounts for each invoice.
- Example:
- Input:

`2`
`ABC123`
`Product 1`
`5`
`10.5`
`XYZ456`
`Product 2`
`3`
`15.2`
- Output:

`52.5`
`45.6`
- Note:
The program utilizes the Invoice class (from week03.invoice.Invoice) to create and store invoice details. It then calculates and prints the invoice amounts for each invoice.

## Task 16
- Code Explanation:
- The Task16 program is a Java application that takes user input to create an array of points and then finds and prints the extreme points in terms of northernmost, southernmost, westernmost, and easternmost.

- Main Method:
- Creates a Scanner object for user input.
- Reads the number of points as an integer.
- Initializes an array of Point objects with the given number of points.
- Reads input for each point, including x and y coordinates.
- Creates a Point object for each set of inputs and adds it to the array.
- Initializes variables to store northernmost, southernmost, westernmost, and easternmost points.
- Iterates through the points to find extreme points based on coordinates.
- Calls the printExtremePoints method for each extreme point.
- Helper Method:
- printExtremePoints: Takes an array of points and a coordinate value as input, and prints points that have the specified x or y coordinate.
- Usage:
To use the program:

1) Compile the Task16.java file.
2) Execute the generated class file.
3) Enter the number of points and input details for each point as prompted.
4) The program will output the extreme points for northernmost, southernmost, westernmost, and easternmost.
- Example:
Input:


`3`
`2.5 4.0`
`1.0 3.0`
`3.0 5.0`
- Output:

`(2.5, 4.0)`
`(1.0, 3.0)`
`(2.5, 4.0)`
`(1.0, 3.0)`
`(1.0, 3.0)`
`(3.0, 5.0)`
`(1.0, 3.0)`
`(3.0, 5.0)`

- Note:
The program utilizes the Point class (from week03.geometry.Point) to create and store point details. It then finds and prints the extreme points based on coordinates

## Task 17 
- Code Explanation:
- The Task17 program is a Java application that takes user input to create an array of line segments and then finds and prints the segments with the minimum length.

- Main Method:
- Creates a Scanner object for user input.
- Reads the number of line segments as an integer.
- Initializes an array of Segment objects with the given number of line segments.
- Reads input for each line segment, including coordinates of two points.
- Creates a Segment object for each set of inputs and adds it to the array.
- Calls the findSegmentsWithMinimumLength method to find line segments with the minimum length.
- Prints the line segments with the minimum length.
- Helper Method:
- 'findSegmentsWithMinimumLength': Takes an array of line segments and finds segments with the minimum length. It returns an array containing all segments with the minimum length.
- Usage:
To use the program:

1) Compile the Task17.java file.
2) Execute the generated class file.
3) Enter the number of line segments and input details for each segment as prompted.
4) The program will output the line segments with the minimum length.
- Example:
Input:

`3`
`0.0 0.0 2.0 0.0`
`0.0 0.0 0.0 3.0`
`1.0 1.0 4.0 1.0`

- Output:

`0.0 - 2.0`
- Note:
The program utilizes the Segment class (from week03.geometry.Segment) to create and store line segment details. It then finds and prints the line segments with the minimum length

## Task 18
### `toString()` Method with `StringBuilder` Explanation

- The `toString()` method is a commonly overridden method in Java classes to provide a string representation of an object. When using `StringBuilder` to build the string representation, it improves performance compared to concatenating strings directly.

- Here's an example of the `toString()` method with `StringBuilder`:

```java
public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("[").append(p1.toString()).append(", ").append(p2.toString()).append("]");
    return sb.toString();
}
```

---
# Week 5
### Task 1
### `Class X`:

- Defines a class X with a default constructor that prints "In constructor X."

### `Class Y extends X`:

- Defines a class Y that extends class X.
- Has its own default constructor that prints "In constructor Y."
- Calls the constructor of its superclass X implicitly before its own constructor.

### `Main class`:

- Contains the main method.
- Creates an object of class Y (Y y = new Y();).

### When the program is executed, it prints the following output:

- When you run the main method, it creates an object of class Y, which implicitly calls the default constructor of its superclass X before its own constructor. Therefore, the output of the given code will be:

`In constructor X.`
`In constructor Y.`

- This is because the constructor of the superclass (X) is always called before the constructor of the subclass (Y) when an object of the subclass is created.

### Task 2
### `Class A`:
- Defines a class A with a static initialization block and an instance initialization block.
- The static initialization block `(static { System.out.println("In static init block of A"); })` is executed when the class is loaded, printing "In static init block of A."
- The instance initialization block `({ System.out.println("In instance init block of A"); })` is executed before the constructor when an instance of the class is created, printing "In instance init block of A."
- Has a default constructor `(public A() { System.out.println("In constructor A."); })` that prints "In constructor A."
### `Class B extends A`:
- Defines a class B that extends class A with similar static and instance initialization blocks.
- The static initialization block `(static { System.out.println("In static init block of B"); })` is executed when the class is loaded, printing "In static init block of B."
- The instance initialization block `({ System.out.println("In instance init block of B"); })` is executed before the constructor when an instance of the class is created, printing "In instance init block of B."
- Has a default constructor `(public B() { System.out.println("In constructor B."); })` that prints "In constructor B."

### `Main2 class`:
- Contains the main method.
- Creates an object of `class B (B b = new B();)`.
- When the program is executed, it prints the corrected output:
- The static initialization blocks are executed when the classes A and B are loaded. Therefore, the output includes the static init blocks of both classes.
- The instance initialization blocks are executed before the constructors when objects of classes A and B are created.
- The constructors are called after the instance initialization blocks.

### Therefore, the corrected output of the given code will be:

`In static init block of A`
`In static init block of B`
`In instance init block of A`
`In constructor A.`
`In instance init block of B`
`In constructor B.`


## Task 3
### `OverrideDemo class`:
- Contains the main method.
- Creates an object of class Child (Child child = new Child();).
- Calls the calcValue method on the child object with one and two arguments.
- Prints the results of the method calls.
### `Parent class`:
- Defines a class Parent with a method calcValue that takes one parameter.
- The method in the Parent class prints "Super" and returns the result of multiplying the parameter by 2.

### `Child class extends Parent`:
- Defines a class Child that extends class Parent.
- Overrides the calcValue method from the Parent class by providing a new implementation that takes two parameters.
- The overridden method in the Child class prints "Subclass" and returns the result of multiplying the sum of the two parameters by 2.

### When the program is executed, it prints the following output:
- The calcValue method of the Child class is called twice with different numbers of arguments.
- For the first call (child.calcValue(5)), the method in the Parent class is executed (since it doesn't have a method with two parameters). The output will be "Super," and the result is 5 * 2 = 10.
- For the second call (child.calcValue(5, 10)), the overridden method in the Child class is executed. The output will be "Subclass," and the result is (5 + 10) * 2 = 30.

### Therefore, the output of the given code will be:

`Super`
`10`
`Subclass`
`30`


## Task 4
### `Class A`:
- Defines a class A with a static initialization block, an instance initialization block, and two constructors.
- The static initialization block `(static { System.out.println("AS"); })` is executed when the class is loaded, printing "AS."
- The instance initialization block `({ System.out.println("A"); })` is executed before any constructor when an instance of the class is created, printing "A."
- Has a default constructor `(public A() { System.out.println("AC"); })` that prints "AC."
- Has another constructor with an int parameter `(public A(int x) { System.out.println(x + " AC"); })` that prints the value of x followed by " AC."

### `GeneralType class extends A`:
- Defines a class GeneralType that extends class A with a static initialization block, an instance initialization block, and a constructor.
- The static initialization block `(static { System.out.println("GTS"); })` is executed when the class is loaded, printing "GTS."
- The instance initialization block `({ System.out.println("GT"); })` is executed before the constructor when an instance of the class is created, printing "GT."
- Has a constructor `(public GeneralType() {super(5);System.out.println("GTC");})` that calls the parameterized constructor of its superclass (A) with the value 5 and prints "GTC" after that.

### When the program is executed, it prints the following output:
- The output is a result of the static and instance initialization blocks as well as the constructors being executed in the order of class hierarchy when objects are created.
- The static blocks are executed when the classes A and GeneralType are loaded. Therefore, the output includes the static init blocks of both classes.
- The instance blocks are executed before the constructors when objects of classes A and GeneralType are created.
- The constructors are called after the instance blocks.

### Therefore, the output of the given code will be:

`AS`
`A`
`AC`
`GTS`
`GT`
`5 AC`
`GTC`

## Task 5 

### 1. Single Inheritance:
- Definition: _Single inheritance occurs when a class inherits from only one superclass._
- Example:

```java 
class Animal {
    void eat() {
        System.out.println("Eating...");
  }
 }

`class Dog extends Animal {`
    void bark() {
        System.out.println("Barking...");
   }
}
```

### 2. Multilevel Inheritance:
- Definition: _Multilevel inheritance occurs when a class is derived from a class, and then another class is derived from that derived class._
- Example:
```java
class A {
    void display() {
        System.out.println("Class A");
  }
}

class B extends A {
    void show() {
        System.out.println("Class B");
    }
}

class C extends B {
    void print() {
        System.out.println("Class C");
   }
}
```

### 3. Hierarchical Inheritance:
- Definition: _Hierarchical inheritance occurs when multiple classes inherit from a single superclass._
- Example:
```java
class Shape {
    void draw() {
       System.out.println("Drawing...");
    }
}

class Circle extends Shape {
   void drawCircle() {
        System.out.println("Drawing Circle...");
    }
}


class Square extends Shape {
    void drawSquare() {
        System.out.println("Drawing Square...");
    }
}
```

### 4. Multiple Inheritance:
- Definition: _Multiple inheritance occurs when a class inherits from more than one superclass._
- __(Note: Java does not support multiple inheritance for classes, but it can be achieved using 'interfaces')__

- Example: 

```java
interface A {
    void methodA();
}

interface B {
    void methodB();
}

class C implements A, B {
  public void methodA() {
       System.out.println("Method A");
   }

    public void methodB() {
    System.out.println("Method B");
    }
}
```
### 5. Hybrid Inheritance:
- Definition: _Hybrid inheritance is a combination of two or more types of inheritance (mix of others such as single, multiple, multilevel, etc.) in a single program._
Example: __(Combining single and multiple inheritance using classes and interfaces)__

```java
class D {
    void display() {`
        System.out.println("Class D");`
    }
}

`interface E {`
    void show();
}

class F extends D implements E {
    public void show() {
        System.out.println("Interface E");
    }
}
```

__As it can been seen from the examples, Java supports single and multilevel inheritance through 'classes' and 'interface-based' multiple inheritance.__

## Task 6 

### Method methodOne(int i) in ClassB:
- Action: This method is marked as 'static' in ClassB.
- Explanation: In Java, static methods cannot be overridden but can be hidden. So, 'methodOne' in ClassB is hiding the 'methodOne' in ClassA since both are static methods with the same signature.
### Method methodTwo(int i) in ClassB:
- Action: This method is 'not' marked as static.
- Explanation: This method in ClassB is overriding the 'methodTwo' in ClassA because it has the same method signature (same name and parameter types) and is not marked as static.
### Method methodThree(int i) in ClassB:
- Action: This method is 'not' marked as static.
- Explanation: This method in ClassB is not overriding or hiding the 'methodThree' in ClassA because it is marked as static. In ClassA, 'methodThree' is a static method, and static methods cannot be overridden.
### Method methodFour(int i) in ClassB:
- Action: This method is marked as 'static'.
- Explanation: Similar to 'methodOne', this method in ClassB is hiding the 'methodFour' in ClassA because both are static methods with the same signature.
---
- So to _summarize_, ClassB is hiding the static methods 'methodOne' and 'methodFour' from ClassA and it is overriding the instance method 'methodTwo' from ClassA. 
- 'methodThree' in ClassB is not overriding or hiding anything because it's a static method and static methods __cannot be overridden__ in Java.


## MathDemo(Task 7)
### `Code Explanation`:

- The MathDemo class is a Java utility class that provides methods for basic mathematical operations and factorial calculation.

### __Methods__:
### 'min' method:

- Takes two integers a and b as parameters.
- Returns the minimum of the two integers.

### 'max' method:

- Takes two integers a and b as parameters.
- Returns the maximum of the two integers.

### 'sum' method:

- Takes an array of integers args as a parameter.
- Calculates and returns the sum of all elements in the array.

### 'mean' method:

- Takes an array of integers args as a parameter.
- Calculates and returns the mean (average) of the elements in the array.

### 'factorial' method:

- Takes an integer n as a parameter.
- Recursively calculates and returns the factorial of n.
- _Note_: If n is negative, it returns -1.
### `Usage`:

- To use the MathDemo class, create an instance of the class and call its methods with appropriate parameters.
### Example:

```java
MathDemo mathDemo = new MathDemo();
int minResult = mathDemo.min(3, 7); // minResult is 3
int maxResult = mathDemo.max(3, 7); // maxResult is 7
int[] numbers = {1, 2, 3, 4, 5};
int sumResult = mathDemo.sum(numbers); // sumResult is 15
float meanResult = mathDemo.mean(numbers); // meanResult is 3.0
int factorialResult = mathDemo.factorial(5); // factorialResult is 120
```
- Importance Of _Static Methods_ in this code:

1) No need for instantiation: Static methods can be called directly on the class without creating an instance. This is useful when you want to use these utility methods without the overhead of creating an object.

2) Class-level association: Since these methods are related to mathematical operations and don't depend on specific instances of the class, it makes sense to define them as static. This emphasizes that these methods are associated with the class itself, rather than any particular instance.

3) Conciseness: Using static methods makes the code more concise. You don't need to create an object to use these methods. You can call them directly on the class, which can lead to much more cleaner and readable code.

## Inheritance (Task 8)
### __Explanation__:
- This code defines a simple inheritance hierarchy for Person, Teacher, Student, and PhdStudent classes. It also includes a main class named "Inheritance" to test the functionality of these classes.

###Person Class:
- Represents a basic person with attributes such as firstName, lastName, and gender.
- Provides getters, setters, and a toString method for object representation.
- Implements an 'equals' method for comparing two Person objects.

### Teacher Class (extends Person):
- Extends the Person class and adds attributes for department and courses.
- Provides getters, setters, and a toString method for object representation.
- Overrides the 'equals' method to compare Teacher objects.

### Student Class (extends Person):
- Represents a student with an additional attribute for studentId.
- Provides getters, setters, and a toString method for object representation.
- Overrides the 'equals' method to compare Student objects.
- PhdStudent Class (extends Student):
- Extends the Student class and adds attributes for department and courses.
- Provides getters, setters, and a toString method for object representation.
- Overrides the 'equals' method to compare PhdStudent objects.

### Inheritance Class (Main):
- Contains the main method for testing the classes by taking user input.
- Includes methods to create and display instances of Person, Teacher, Student, and PhdStudent.

### `Testing Methods`:
```
testPerson: Takes user input to create and display a Person object.
testTeacher: Takes user input to create and display a Teacher object.
testStudent: Takes user input to create and display a Student object.
testPhdStudent: Takes user input to create and display a PhdStudent object.
```
### Usage:
- Compile the Inheritance.java file.
- Execute the generated class file.
- Follow the prompts to input details for Person, Teacher, Student, and PhdStudent.
- The program will create instances and display their details.


## Task 9 
### __Explanation:__
 - This code defines two classes: Customer and Account, which represent a customer and their associated bank account.

### Customer Class:
- Represents a customer with attributes for ID, name, and gender.
- Provides a constructor to initialize these attributes.
- Includes getters for ID, name, and gender.
- Overrides the toString method to return a formatted string with the customer's name and ID.

### Account Class (extends Customer):
- Extends the Customer class, implying an "is-a" relationship, but it contains a design issue regarding composition.
- Represents a bank account with additional attributes such as ID, customer (of type Customer), and balance.
- Provides constructors to initialize the account's attributes.
- Includes getters and setters for ID, balance, and a method to get the customer's name.
- Overrides the toString method to display information about the account.
- Provides methods for withdrawing and depositing money.

### Usage:
- Compile the AccountTest.java file.
- Execute the generated class file.
- The program will run tests on account creation, withdrawal, and deposit methods, displaying the results for each test case.

































