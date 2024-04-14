# Mehdi Shukurlu
# ID: 19525
# CRN: 20420

---
## __Commits From Previous Weeks__

## week03
### Feb 18
- added a 'ToString' method to `Point.java` file because 'Task 17' The commit id (SHA, hash) value is `ca76998890d95c688fd625c7aa9d8eff02430a60`. +`ca76998`

- added a 'ToString' method to Every week03 .java files because 'Task 18' The commit id (SHA, hash) value is `0e6ab2cee3cd5694d12d0e849df09d11b78df673`. +`` and `0e6ab2cee3cd5694d12d0e849df09d11b78df673`.

## week03
### Feb 24
- Changed and overrided 'toString()' and 'equals(Object obj)' methods of 'Point.java' and 'Circle.java'. The commit _hash_ value is `92def0aa99199acc95a0dd1e3ac920c3acec1799`

## week05
### Mar 2
- Added clone method with '@Override' to 'Task11.java'.
- Commit _SHA_ value is `7c950cc8e911c8addb489e7784af9a1bcb627cb7`

## week05
### Mar 2
- Updated the equals method in 'Task11.java'.
- Commit _SHA_ value is `763fd33b726f5e521264a88d15d280ceef1fc617`

## week03
### Mar 2
- Added clone mehtod with Override in both Segment and Point classes
- Commit _SHA_ value is `9cb3ea028f5cbea0533f71d30fbf2e96eee1b29c`

## week03
### Mar 2
- Changed the clone method of Point class.
- Commit _SHA_ value is `0de99d4c6775e780b8ab60ed9aa83505da354615`

## week03
### Mar 2
- Added movable interface and implemented it in point and segment classes
- Commit _SHA_ value is `7398926cf4ec664f24748b50f3c6d70312d9a5ba`

## week05
### Mar 2
- Updated certain files and implemented resizeable in week05
- Commit _SHA_ value are `ae397f3fb0a69e3105006dd0aa817a94d98f45a4` and `c7173aca4db239bd5e14523dcaf1c0de7a5ee72d`

## week05
### Mar 2
- Shifted the 'resizable' interface to week05 + made some changes to other classes.
- Commit _SHA_ value is `d7711c3cbbbf443ffde16c76a74a116f81b82c4e` 

## week05
### Mar 3
- Updated 'Point' and 'Segment' classes for week06 
- Commit _SHA_ value is `9139bcf5ef66fc38c1937458cb9d87ca6c662e63`

## week03
### Mar 10
- Added exception handlers in the original 'Invoice.java' for Task 3
- Commit _SHA_ value is `30e89665c86572f230c516c1333e9772eefb6830`

## week03
### Mar 10
- Reverted the 'Invoice.java' back to itself
- Commit _SHA_ value is `65a6de447145dba7b23db03677c15ca4f72ea5b8`
---



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

## Task 11
### __Explanation__:
- The provided Java code defines a Rectangle class and a Task11 class to demonstrate the usage of the equals method for comparing instances of the Rectangle class.

### Rectangle Class:
- Represents a rectangle with attributes width and height.
- Provides a constructor to initialize the width and height.
- Overrides the equals method from the Object class to compare two Rectangle objects based on their width and height.
- The method first checks if the provided object is an instance of Rectangle.
- It then casts the object to a Rectangle and compares the width and height of both rectangles.
- Returns 'true' if the widths and heights are equal; otherwise, returns 'false'.

### Task11 Class:
- Contains the main method to demonstrate the use of the Rectangle class.
- Creates three instances of the Rectangle class: r1, r2, and r3.
- Calls the equals method on pairs of rectangles and prints the results.

### __Output__:
- The program prints the results of comparing pairs of rectangles using the equals method.

```java
r1.equals(r2): Prints false since the widths (5 and 15) are different.
r1.equals(r3): Prints true since the widths (5) and heights (10) are the same.
r2.equals(r3): Prints false since the widths (15 and 5) are different.
```
- The output illustrates how the overridden equals method in the Rectangle class compares rectangles based on their width and height.

## Task 12
###  __Explanation__:
- The provided Java code defines a Square class that extends the Rectangle class and a Task12 class to demonstrate the usage of the equals method with instances of the Rectangle, Square and Object classes.

### Square Class (extends Rectangle):
- Represents a square, which is a specific type of rectangle where all sides are of equal length.
- Extends the Rectangle class, inheriting its attributes and behaviors.
- Provides a constructor to initialize the side of the square.
    -  Calls the constructor of the superclass (Rectangle) using super(side, side) to set both width and height to the same value.
   - Assigns the value of side to the instance variable this.side.
- Overrides the equals method to correctly compare Square objects.
  - Checks if the object being compared is the same reference (this == obj).
  - Ensures the object is an instance of Square (obj instanceof Square).
  - Casts the object to a Square.
  - Compares the side values of both squares and returns true if they are equal; otherwise, returns false.

### Task12 Class:
- Contains the main method to demonstrate the use of the equals method with instances of the Rectangle, Square, and Object classes.
- Creates three instances: o1, o2, and o3, of types Object, representing rectangles and a square.
- Calls the equals method on pairs of objects and prints the results.

### _Output_:
- The program prints the results of comparing pairs of objects using the equals method.

```java
o1.equals(o2): Prints false since the rectangles have different widths and heights.
o1.equals(o3): Prints false since the Rectangle and Square have different types.
o2.equals(o3): Prints true since the squares have the same side length.
```

## Task 12
### __Explanation__:
- This code defines a Square class that extends the Rectangle class and a Task12 class to demonstrate the usage of the equals method with instances of the Rectangle, Square and Object classes.

### Square Class (extends Rectangle):
- Represents a square, which is a specific type of rectangle where all sides are of equal length.
- Extends the Rectangle class, inheriting its attributes and behaviors.
- Provides a constructor to initialize the side of the square.
  - Calls the constructor of the superclass (Rectangle) using super(side, side) to set both width and height to the same value.
  - Assigns the value of side to the instance variable this.side.
  - Overrides the equals method to correctly compare Square objects.
  - Checks if the object being compared is the same reference (this == obj).
  - Ensures the object is an instance of Square (obj instanceof Square).
  - Casts the object to a Square.
  - Compares the side values of both squares and returns 'true' if they are equal; otherwise, returns 'false'.
  
### Task12 Class:
- Contains the main method to demonstrate the use of the equals method with instances of the Rectangle, Square, and Object classes.
- Creates three instances: o1, o2, and o3, of types Object, representing rectangles and a square.
- Calls the equals method on pairs of objects and prints the results.

### __Output__:
- The program prints the results of comparing pairs of objects using the equals method.

```java
o1.equals(o2): Prints false since the rectangles have different widths and heights.
o1.equals(o3): Prints false since the Rectangle and Square have different types.
o2.equals(o3): Prints true since the squares have the same side length.
```

---
# Week 06
## Task 4
### A) Why is `clone()` method protected in Object class?

The `clone()` method in the `Object` class is declared with `protected` visibility to control its access. This decision ensures that the cloning process is managed carefully and only accessible within the class or its subclasses. The `protected` visibility allows access within the same package and subclasses, enabling a controlled cloning behavior.

## B) Benefits of keeping `clone()` protected in extending class:

1. **Controlled Access:**
   By keeping the `clone()` method protected, access is restricted to the current class and its subclasses. This ensures controlled cloning and allows customization within the class hierarchy.

2. **Customization:**
   Extending classes can override the `clone()` method to provide a custom cloning implementation. This flexibility allows adapting the cloning process to specific class requirements, handling additional fields or special cases.

3. **Encapsulation:**
   Protecting the `clone()` method helps maintain encapsulation, as cloning logic is contained within the class or its subclasses, preventing external classes from direct manipulation.

### When to use `public` instead of `protected`:

1. **Widest Accessibility:**
   If the `clone()` method needs to be accessible from any class, including those outside the package and unrelated to the class hierarchy, consider making it public. Exercise caution to avoid unintended usage.

2. **Immutable Classes:**
   In some cases, immutable classes might benefit from a public `clone()` method, allowing clients to create copies without violating immutability. Ensure immutability guarantees are maintained.

## Task 5
### A) __Deep__ or __Shallow__ Cloning?
The implemented `clone()` method in both `Point` and `Segment` classes provides __deep cloning__ - it creates a completely separate copy of an object.

 
### B) Trying the Other Approach
The cloning operation can also be performed with __Shallow__ type:
__Note__: A shallow clone shares the same references with the original.

**Shallow cloning in Point class**:
```java 
@Override
public Point clone() {
    try {
        return (Point) super.clone();
    } catch (CloneNotSupportedException e) {
        throw new AssertionError();
    }
}
```
**Shallow cloning in Segment class**:
```java
@Override
public Segment clone() {
    try {
        return (Segment) super.clone();
    } catch (CloneNotSupportedException e) {
        throw new AssertionError();
    }
}
```
### Applications

*Deep Clone*: Employ when you require an entirely autonomous duplicate, meaning alterations to the copied instance will have no impact on the original.

*Shallow Clone*: Use when copying quickly is important and changes to the copy may reflect in the original.

- The code's `clone()` method makes a deep copy, ensuring the cloned objects are entirely separate from the originals. 
- Shallow cloning, which is mainly chosen for speed, has the downside of shared references between the original and cloned objects, impacting independence.

## Task 6
## Movable Interface and Implementation

### Movable Interface
Define an interface `Movable` with four methods:
- `moveUp`
- `moveDown`
- `moveLeft`
- `moveRight`

```java
public interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
}
```

### Point and Segment Implementation
Take the Point class and implement the Movable interface so that any object of the point can be moved in all four directions on a 2D coordinate system. 
_Apply the same to the Segment class._


```java
class Circle implements Movable {
    // Other codes...
    
    @Override
    public void moveUp() {
        center.moveUp();
    }

    @Override
    public void moveDown() {
        center.moveDown();
    }

    @Override
    public void moveLeft() {
        center.moveLeft();
    }

    @Override
    public void moveRight() {
        center.moveRight();
    }
}
```

### __Testing and Main Class__
Define a Circle class which is represented by the center point and a radius. Make Circle implement Movable. Test the added behavior by creating an array consisting of a mixture of Points, Segments and Circles in a Main class.

```java
public class MovableTest {
    public static void main(String[] args) {
        Point point = new Point(1, 1);
        Segment segment = new Segment(new Point(2, 2), new Point(3, 3));
        Circle circle = new Circle(new Point(4, 4), 5);
        
        Movable[] objects = {point, segment, circle};
        
        moveObjects(objects, 2, 2); 
        
        for (Movable object : objects) {
            System.out.println(object);
        }
    }
    
    public static void moveObjects(Movable[] objects, float deltaX, float deltaY) {
        for (Movable object : objects) {
            object.moveUp();
            object.moveLeft();
        }
    }
}
```
- In the Main class, a test scenario is created with a Point, Segment, and Circle. The moveObjects method is called to move all objects up and left. The final positions of the objects are printed for verification.

```java
Output:
Point at (0, 1)
Segment from (0, 2) to (-1, 1)
Circle at (-1, 2) with radius 5.0
```

## Task 7
### UML Diagram and Class Descriptions

## 1. Interface Resizable
An interface that has an abstract method `resize()` to enhance an object by given percent.

## 2. Class Shape
An abstract class that represents a generic shape. The class describes the general characteristics of a shape.

## 3. Class Circle
The `Circle` class extends `Shape` and implements `Resizable`. It represents a circle with a certain `radius`. Complete properties and behaviors of a circle are encapsulated in this class. The `resize()` method is overridden to increase the `radius` according to the provided percentage.

## 4. Class Rectangle
The class `Rectangle` extends `Shape` and implements `Resizable`. A rectangle has a `width` and a `length`. The `resize()` method is overridden to increase both the `length` and `width` by a certain percentage.

## 5. Class Square
The `Square` class extends `Rectangle` as a square is a specific type of rectangle where all sides are equal. Because the `Square` class inherits from `Rectangle`, which already implements `Resizable`, the `Square` class is also `Resizable`. The `resize` method in `Rectangle` is appropriate for `Square` because resizing square involves increasing its sides evenly, similar to Rectangle.

## C) Can we make Circle, Rectangle and Square classes resizable?

Yes, we can make `Circle`, `Rectangle`, and `Square` classes resizable. In fact, based on the current class design, they all are resizable. The `Circle` and `Rectangle` classes directly implement the `Resizable` interface, and the `Square` class indirectly implements it through inheritance. When the `resize()` method is called on an object of these classes, their size will increase by the given percent.

## Task 8
### BigInteger1
This is a program that calculates both the factorial of a number and the power of a number.
__Note__: `BigInteger` class is beneficial when you're dealing with really __large__ integers that exceed the range of primitive data types like `int` or `long`.

### __How it Works__

#### Factorial Calculation

Following is the code snippet to calculate Factorial of an integer:
```java
public void factorial(int n) {
    BigInteger result = BigInteger.ONE;


for (int i = 2; i <= n; i++) {
    result = result.multiply(BigInteger.valueOf(i));
}

System.out.println("Factorial of " + n + " is: " + result);

}
```

- In the method above, it loops from 2 to the given number, multiplying the `result` with each number. Here, `BigInteger.ONE` is used as the initial value of `result`. The `multiply()` method of `BigInteger` is used to multiply the numbers.

#### Power Calculation

Following is the code snippet to calculate power of a number:
```java
public void power(int base, int exponent){
    BigInteger result = BigInteger.valueOf(base).pow(exponent);

System.out.println(base + " raised to the power of " + exponent + " is: " + result);

}
```

- In the method above, `BigInteger.valueOf(base).pow(exponent)` is used to calculate the power of a number. `pow()` method of `BigInteger` is used to raise the base to the power of the exponent.

### Test Run

This program can be run using the `main()` method:

```java
public static void main(String[] args) {
    BigInteger1 bg = new BigInteger1();

bg.factorial(10);
bg.power(5,10);

}
```


## Task 9
### BigDecimal1
This is a program that performs subtraction and addition operations using `BigDecimal`.
__Note__: Just like BigInteger helps handle massive integers in Java, BigDecimal would be the most suitable option when dealing with _precise decimal_ arithmetic operations.

### __How it Works__

#### Operation A: Subtraction
```java
BigDecimal result_A = new BigDecimal("2.35").subtract(new BigDecimal("1.95"));
System.out.println("Result of a: " + result_A);
```

- In the code snippet above, the `subtract()` method of `BigDecimal` is used to subtract 1.95 from 2.35.

#### Operation B: Addition and Subtraction
```java
BigDecimal result_B = new BigDecimal("1000000.0").add(new BigDecimal("1.2"))
                .subtract(new BigDecimal("1000000.0"));
System.out.println("Result of b: " + result_B);
```

- In the code snippet above, the `add()` method is first used to add 1.2 to 1000000.0. Then, the `subtract()` method is used to subtract 1000000.0 from the result, leaving the sum of the first operation. 

### Test Run

This program can be run using the `main()` method:
```java
public static void main(String[] args) {
    BigDecimal result_A = new BigDecimal("2.35").subtract(new BigDecimal("1.95"));
    System.out.println("Result of a: " + result_A);


BigDecimal result_B = new BigDecimal("1000000.0").add(new BigDecimal("1.2"))
                 .subtract(new BigDecimal("1000000.0"));

System.out.println("Result of b: " + result_B);

}
```

- In the `main()` method, the addition and subtraction of BigDecimal are tested with given 'sample inputs'.


# Week07
## Task 1 

__The exception block in this Java program is responsible for gracefully handling errors and preventing application crashes due to unanticipated input__.

```java
try {
                for (int i = 0; i < word.length(); i++) {
                    char currentChar = word.charAt(i);
                    if (Character.isLetter(currentChar)) {
                        counts[currentChar - 'a']++;
                    }
                }

                System.out.println("\tHere are the letters:");

                for (int i = 0; i < counts.length; i++) {
                    if (counts[i] != 0) {
                        System.out.println((char) (i + 'a') + ": " + counts[i]);
                    }
                }
            } catch (Exception e) {
                System.out.println("Please enter only English letters!");
            }

```
            
- In this snippet, we are counting the frequency of each letter in the input words using a try-catch block.
- If any error is encountered while processing an input word (say, if the user input something that's not an English letter, causing an array indexing error), the Exception catch block is invoked and a simple error message is displayed to the user, suggesting to enter only English letters. 
- This way, the program continues to run and doesn't crash due to the various exceptions that could occur.

## Task 2
__The exception handling part of this code is designed to handle scenarios where _invalid_ input is given.__
__In this program, the invalid scenario is when a _negative number_ is given as input for finding the factorial.__


##### In the factorial(int n) method, there is an if condition:


``` java

if(n < 0){
    throw new IllegalArgumentException("Negative value detected!");
}
This condition checks if n, the input number for which factorial is to be computed, is less than zero. If it is, an IllegalArgumentException is thrown with the message "Negative value detected!".
```

Now, in the main method, the invocation to factorial method is wrapped inside a try block:


```java
try{
    System.out.println(factorial(-12));
}catch(RuntimeException e){
    System.out.println(e.getMessage());
}
```

So, if the `IllegalArgumentException` is thrown from the factorial method (as would happen when input is -12 in this case), this exception is caught in the catch block. 


- The `RuntimeException e` in the catch block catches any exception that is a RuntimeException or its subclass (Including IllegalArgumentException, as it is a subclass of RuntimeException). 
- When this happens, the catch block executes and the e.getMessage() prints the message that was set when the exception was thrown - "Negative value detected!". 
- This way, the program can handle the error elegantly instead of crashing.

## Task 4

- Copied and pasted the `Invoice class` from the week03 folder, then modified its methods.
- Included the `IllegalArgumentException` to handle cases where the quantity and the price of an item are negative (_in setter methods of each_). 
- The program will display the message that the quantity cannot be negative and the price per item cannot be negative relatively.

```java
public void setQuantity(int quantityOfItem){
        if(quantityOfItem <= 0) {
            throw new IllegalArgumentException("Quantity cannot be negative or zero");
        }
        this.quantityOfItem = quantityOfItem;
    }
   
    public void setPriceItem(double pricePerItem){
        if(pricePerItem <= 0.0) {
            throw new IllegalArgumentException("Price cannot be negative or zero");
        }
        this.pricePerItem = pricePerItem;
    }
```

## Task 4
- Copied the Customer(_Task9, week05_)and its subclass Account classes from the week05 folder and modified their functionality.
- Created the InvalidAmountException for handling errors. If the included withdrawal amount exceeds the balance, the program displays the message: `'Withdrawal amount cannot be more than the balance`
- Made a test class to test the functionalities of new 'Account.java'

#### Withdrawal Class:
```java
public Account withdraw(double amount) throws InvalidAmountException {
        if (amount > balance) {
            throw new InvalidAmountException("Amount of withdrawal cannot be more than the balance!");
        }
        balance -= amount;
        return this;
    }
```
#### Exception in Test Class:
```java
try {
            System.out.println("Current balance: $" + account.getBalance());
            
            System.out.println("Amount to withdraw:");
            double withdrawAmount = scanner.nextDouble();
            account.withdraw(withdrawAmount);
            
            System.out.println("New balance after withdrawal: $" + account.getBalance());
        } catch (InvalidAmountException e) {
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
        }
```

## Task 5
# CustomUserGeneration Class and Exception Handling

The `CustomUserGeneration` class contains a `createUser` method. This method creates a new user, and it uses exceptions to handle the error cases related to username, password, and roles.

## Exceptions

The `CustomUserGeneration` class uses two custom exceptions:

- `InvalidUsernameException` - an exception specific to invalid usernames.
- `InvalidPasswordException` - an exception specific to invalid passwords.

The exceptions are defined using the `class` keyword and extend the built-in Java `Exception`.

```java
class InvalidUsernameException extends Exception{
    public InvalidUsernameException(String message){
        super(message);
    }
}


class InvalidPasswordException extends Exception{
    public InvalidPasswordException(String message){
        super(message);
    }
}
```

## Exception handling inside createUser

`createUser` uses these exceptions to verify the username and password passed in.

- If the username is null or less than 3 characters long:
```java
if (username == null || username.length() < 3)
     throw new InvalidUsernameException("Username cannot contain less than three symbols");
```

- If the username does not start with an alphabetical character:
```java
if (!Character.isAlphabetic(username.charAt(0)))
    throw new InvalidUsernameException("Username cannot start with non-alphabetical character");
```

- If the password is less than 8 characters long:
```java
if (password.length() < 8)
     throw new InvalidPasswordException("The length of the password cannot be less than 8.");
```

- If any of these conditions are not met, the corresponding exception is thrown with an appropriate message.

- The function also checks if the roles array is null or empty, in which case it throws an `IllegalArgumentException`.
```java
if (roles == null || roles.length == 0)
    throw new IllegalArgumentException("The list of role can not be empty or null");
```

## Catching the Exceptions in main

Exceptions thrown by `createUser` are caught in the `main` function using multiple `catch` blocks.

- If `InvalidUsernameException` is thrown:
```java
catch (InvalidUsernameException e) {
    e.printStackTrace();
}
```

- If `InvalidPasswordException` is thrown:
```java
catch (InvalidPasswordException e) {
    e.printStackTrace(); 
}
```

- If `IllegalArgumentException` is thrown:
```java
catch (IllegalArgumentException e){
```

## Task 6 

#### Exceptions in `ParseNumbers.java`:


Created custom _NoInputException_, which is thrown when no integer inputs are present.


```java
class NoInputException extends Exception{
        public NoInputException(String message){
            super(message);
        }
    }
```

#### Exception Handling in main method


- The NumberFormatException is a built-in Java Exception. It is raised when an attempt to convert a string to one of the numeric types fails due to the string format being inappropriate. 
- Here, NumberFormatException is used in the main function to handle the event when there's an attempt to parse non-integer inputs.

```java
while (scan.hasNext()) { 
        word = scan.next();
        try{
        sum += Integer.parseInt(word); 
        count++;
        }
        catch(NumberFormatException e){
            System.out.println(word + " Is not a valid input");
        }
    }
```

- In the `try-catch` block, non-integer inputs are captured and handled by outputting a message to the console.


__The custom NoInputException is thrown when no integers are found in the entered line.__


```java
try{
    if (count == 0)
    throw new NoInputException("No Input");
    else
        System.out.printf("Sum = %d\nCount = %d\nAverage = %.3f\n", sum, count, (float) sum / count);
    }
    catch (NoInputException e){
        System.out.println(e.getMessage());
    }
```

- In this block, if the `count` is 0 (indicating no integers have been parsed and added to `sum`), a `NoInputException` is thrown with the message "No Input".
- However, if `count` is not 0, the sum, count, and average are printed to the console.
- If the `NoInputException` is thrown, it is caught and the exception message is printed to the console.


--- 
## Week08
### 1) List in Action

This program demonstrates various operations on lists and shows the usage of different collection types in Java.

## Code Explanation

- The code starts by importing the necessary Java utilities.
- It defines a class named `ListsInAction`.
- Inside the `main` method, the code creates an `ArrayList` called `list1` and adds integers 1, 2, and 3 to it.
- It then prints out the list using the `toString` method and demonstrates accessing elements using a `for` loop, an enhanced `for` loop, and an iterator.
- Next, the code creates another `ArrayList` called `shoppingList` and adds various string items to it.
- It performs similar operations on `shoppingList` as before, demonstrating the different ways to print, access, and manipulate elements in a list.
- The code removes an item from `shoppingList` and creates a new list called `newShoppingList` using the elements from `shoppingList`.
- `newShoppingList` is modified by adding two more items and printing it out.
- It checks if the `newShoppingList` contains the item "tea" and prints an appropriate message based on the result.
- Finally, a `LinkedList` called `newLinkedList` is created, and elements are added to it.
- `newShoppingList` is then added to `newLinkedList`, and the first and last elements are removed and printed.

## 2) Sort the elements of list
### This Java code is a simple program to sort integer lists using various techniques.

```java
public class SortElementsOfList {
    public static void main(String[] args) {
```

### The program creates a class SortElementsOfList with a main method.


```java
List <Integer> unsorted = new ArrayList<Integer>();
unsorted.add(5);
unsorted.add(4);
unsorted.add(3);
Collections.sort(unsorted);
System.out.println("\"Collections.sort\" version: " +unsorted);
```

### An ArrayList of integers is created and populated with values. This list is sorted using Collections.sort method, and the sorted list is printed.

```java
List <Integer> unsorted2 = new ArrayList<Integer>();
unsorted2.add(6);
unsorted2.add(5);
unsorted2.add(4);
unsorted2.sort(null);
System.out.println("\"List.sort\" version: " +unsorted2);
```

### A second list of integers is created and sorted using the .sort() method of List class, and the sorted list is printed.

```java
List <Integer> unsorted3 = new ArrayList<Integer>();
unsorted3.add(10);
unsorted3.add(9);
unsorted3.add(8);
unsorted3.sort(new Comparator<Integer>() {
    @Override
    public int compare(Integer num1, Integer num2) {
        return num1.compareTo(num2);
    }
});
System.out.println("\"Comparator\" (anonymous class): " + unsorted3);

unsorted3.sort(new CustomComparator());
System.out.println("\"Comparator\" (concrete class): " + unsorted3);
```

### A third list of integers is created. Two different comparators are used to sort this list, first is an anonymous inner Comparator class, second is a CustomComparator class. The sorted lists are printed.

```java
class CustomComparator implements Comparator {
    @Override
    public int compare(Integer num1, Integer num2) {
        return num1.compareTo(num2);
    }
}
```

- The CustomComparator class is created, implementing Comparator and overriding its compare method to be used for sorting.

## 3)List Of Accounts

This Java code represents a simple simulation of bank accounts and provides functionality to sort them based on different criteria.

### Account Class

An individual account is characterized by the account holder's first name, last name, and the account balance. The class provides methods for 
1. Constructing an account object.
2. Getting a full name of the account holder.
3. Getting the balance of the account.
4. A string representation of the account.

### ListOfAccounts Class

This class creates a list of various accounts. It then performs two sorts on this list:
1. Sorting by the full name of the account holder.
2. Sorting by the account balance.

After each sorting operation, the sorted list is printed on the console. In this way, the user can see the arrangement of accounts before and after each sorting method.


## 4) Distinct Words

The Java code in the `DistinctWords` program performs following steps:

1. Creates an array of `String` that contain few names (some of them are repeated).

2. Converts this array to a `List` named `namesList`.

3. Constructs a `LinkedHashSet` named `uniqueNamesSet` from this list. This data structure maintains the insertion order and doesn't allow duplicate entries, which is used to remove duplicates from `namesList`.

4. Converts this `LinkedHashSet` back to a `List` named `uniqueNamesList`.

5. Sorts `uniqueNamesList` in ascending order.

6. Prints out the names from sorted `uniqueNamesList`, which are distinct and sorted.

## 5) Queue Demo

The `QueueDemo` Java code illustrates a scenario where people are buying bread. It demonstrates the use of a queue in computing how many people can purchase bread based on the supply of bread and each person's needed amount.

1. `main` function: A given amount of bread (`totalBreads`) and an array specifying the required bread amount per person (`bread`) is provided. The `calculateNumber` function is invoked to compute the total number of people who can buy bread with the given supply.

2. `calculateNumber` function:
   - It initializes a queue with the required bread amount per person.
   - It initializes a counter (`personsCanBuyBread`) with zero to keep track of the number of people who can get bread.
   - Then it enters a loop where it dequeues from the queue as long the queue is not empty. The dequeued value is considered as the required bread amount for a consumer.
     - If the total bread is more or equal to the required bread per consumer, it reduces the total bread by the required amount for the current consumer and increases the number of persons who can buy bread.
     - Otherwise, it breaks the loop as there is not enough bread for the current consumer.

The result, indicating the total number of people who can buy bread, is printed to the console in the `main` function.

## 6) Priority Queue Demo

The `PriorityQueueDemo` Java code demonstrates an approach to a bread-buying scenario making use of a Priority Queue. The Priority Queue allows the persons who require the least amount of bread to buy first.

1. `main` function: It initiates the available amount of bread (`totalBreads`) and an array that specifies the required amount of bread for each individual (`bread`). It calls `calculateNumber` to figure out the total amount of people that can buy bread with the supplied amount.

2. `calculateNumber` function:
   - It builds a priority queue with the required amount of bread for each individual.
   - A counter is set(`personsCanBuyBread`) to zero to track how many people can purchase bread.
   - It enters a loop that continues until the priority queue becomes empty. In each loop iteration, the total available bread is reduced by the amount needed by the person who requires the least amount(divided by priority). The number of buyers that can be supplier (`personsCanBuyBread`) is increased.

The program finishes by producing the output of the `main` function which prints the maximum number of people that can be supplied with the available bread.

--- 

## Week09

## Task 1

This Java program implements a simple task scheduler using a priority queue. The `Taskfile` class represents tasks with properties such as name, duration, and priority. Tasks are added to a priority queue based on their priority. The main method initializes a priority queue of tasks, schedules tasks until available time is exhausted, and prints the total time spent on tasks and the remaining available time. If a task cannot be completed within the available time, it breaks the loop and prints a message accordingly.

## Usage
1. Compile and run the `Task1` class.
2. Adjust the available time and task durations as needed.
3. Observe the output to see which tasks are completed within the available time and the remaining time.


## Task 2

This Java program compares two methods of sorting elements in a linked list. In the `main` method, it generates random integers and adds them to two separate linked lists. 

1. In the first approach, the method `addInSortedOrder` is used to insert elements into `list1` in sorted order. It iterates over the list and inserts the element at the correct position.
2. In the second approach, random integers are directly added to `list2`, and then the entire list is sorted using `Collections.sort()`.

The program measures the time taken for each approach and prints the elapsed time. It provides insights into the efficiency of sorting by insertion versus sorting the entire list.

## Task 3

This Java program demonstrates how to print the characters of a string along with their corresponding indexes. 

The `printCharactersWithIndexes` method takes a string input and a boolean flag to indicate whether to print the indexes in ascending or descending order. 

It utilizes a `TreeMap` to store characters as keys and their corresponding indexes as values. The indexes are stored in an `ArrayList` and added to the map using `computeIfAbsent` method. 

Finally, it iterates over the map and prints each character followed by its indexes, either in ascending or descending order based on the flag.

## Task 4

This Java program analyzes the frequency of characters in a given string and identifies the most and least frequent characters.

The `Task4` class maintains a cache of character frequency maps to optimize repeated calculations. The `mostFrequentCharacter` and `leastFrequentCharacter` methods calculate the character frequencies using the `calculateCharacterFrequency` method if the result is not already cached. Then, they iterate over the frequency map to find the most and least frequent characters.

The `calculateCharacterFrequency` method computes the frequency of each character in the input string and returns a map containing characters as keys and their frequencies as values.

The program demonstrates efficient character frequency analysis with caching to enhance performance for repeated computations.


## Task 5

This Java program identifies the unique characters present in a given string.

The `Task5` class maintains a cache of sets containing unique characters to optimize repeated calculations. 

The `uniqueCharacters` method checks if the input string is already cached. If not, it calculates the unique characters using the `calculateUniqueCharacters` method and caches the result. It then returns the set of unique characters.

The `calculateUniqueCharacters` method iterates through the input string and adds each character to a set. This ensures that duplicate characters are automatically removed, leaving only unique characters.

The program demonstrates an efficient approach to find unique characters in a string with caching for improved performance.

---
## Week 10
### __Task1__

This Java code defines a class `Task` and a generic class `Generics`. It includes methods for printing arrays, finding the middle and maximum elements, and sorting arrays using bubble sort. The `Task` class has a private string field `s` and methods for getting and printing the string value. The `Generics` class contains generic methods for array manipulation, including printing, finding middle and maximum elements, and sorting.

## Class: Task

### Fields:
- `s`: A private string field to store a value.

### Methods:
- `Task(String s)`: Constructor to initialize the `s` field with the provided string.
- `getS()`: Getter method to retrieve the string value.
- `toString()`: Overrides the `toString()` method to return the string value stored in `s`.

## Class: Generics

### Methods:
- `printArray(T[] array)`: Prints the elements of a generic array.
- `printArray(T[] array, int lowerIndex, int upperIndex)`: Prints the elements of a generic array within a specified range.
- `printArray(Task[] array)`: Specialized method to print pairs of `Task` objects.
- `getMiddleElement(T[] array)`: Returns the middle element of a generic array.
- `getMaxElement(T[] array)`: Returns the maximum element of a generic array.
- `bubbleSort(T[] array)`: Sorts a generic array using bubble sort algorithm.
- `swap(T[] array, int i, int j)`: Swaps two elements in a generic array.


### __Task 2__

This Java code defines a generic class `Generics` with a type parameter `T` constrained to extend `Number`. It contains methods to perform mathematical operations on the stored number, such as finding the reciprocal, fraction, and absolute value for both double and float types.

## Class: Generics

### Fields:
- `number`: A private field of type `T` to store a number.

### Constructor:
- `Generics(T number)`: Constructor to initialize the `number` field with the provided value.

### Methods:
- `reciprocal()`: Calculates the reciprocal of the stored number. Throws an exception if the number is zero.
- `fraction()`: Calculates the fraction part of the stored number.
- `absValueOfDouble()`: Calculates the absolute value of the stored number as a double.
- `absValueOfFloat()`: Calculates the absolute value of the stored number as a float.

## Class: Task2

### Main Method:
- Reads a double input from the user.
- Creates an instance of `Generics` with the provided double value.
- Calls various methods of the `Generics` instance to perform mathematical operations and prints the results.

## __Task 3__

This Java code defines a generic class `Pair` that represents a pair of two elements of potentially different types along with an associated comment. It then prompts the user to enter values for two pairs and their comments, creates instances of the `Pair` class with the provided values, and prints them.

## Class: Pair

### Fields:
- `first`: A private field of type `T` to store the first element of the pair.
- `second`: A private field of type `U` to store the second element of the pair.
- `comment`: A private field to store an associated comment.

### Constructor:
- `Pair(T first, U second, String comment)`: Constructor to initialize the `first`, `second`, and `comment` fields with the provided values.

### Methods:
- `getFirst()`: Returns the first element of the pair.
- `getSecond()`: Returns the second element of the pair.
- `getComment()`: Returns the associated comment.
- `setComment(String comment)`: Sets the associated comment.
- `toString()`: Overrides the `toString()` method to return a string representation of the pair along with the comment.

## Class: Task3

### Main Method:
- Prompts the user to enter values for the first pair (`Pair 1`) and its comment.
- Prompts the user to enter values for the second pair (`Pair 2`) and its comment.
- Creates instances of `Pair` with the provided values.
- Prints the created pairs along with their comments.


## __Task 4__

This Java code defines a class `Task4` representing bank accounts and includes methods to test certain properties of collections of integers, strings, and account objects.

## Class: Task4

### Fields:
- `accountNumber`: An integer representing the account number.
- `accountHolder`: A string representing the account holder's name.
- `balance`: A double representing the account balance.

### Constructor:
- `Task4(int accountNumber, String accountHolder, double balance)`: Constructor to initialize the account number, account holder, and balance fields.

### Methods:
- `countElementsWithProperty(Collection<T> collection, PropertyChecker<T> checker)`: A generic method that counts the number of elements in a collection that satisfy a given property.
- `testEvenIntegers()`: Tests the property of even integers in an array of integers.
- `testPalindromeStrings()`: Tests the property of palindrome strings in an array of strings.
- `testEmptyAccounts()`: Tests the property of empty accounts in a list of `Task4` objects.

### Interfaces:
- `PropertyChecker<T>`: An interface defining a method `check(T element)` to check a property of an element.

### Inner Classes:
- `EvenIntegerChecker`: An implementation of `PropertyChecker` for checking even integers.
- `PalindromeStringChecker`: An implementation of `PropertyChecker` for checking palindrome strings.
- `EmptyAccountChecker`: An implementation of `PropertyChecker` for checking empty accounts.

### Main Method:
- Calls the `testEvenIntegers()`, `testPalindromeStrings()`, and `testEmptyAccounts()` methods to test the properties of even integers, palindrome strings, and empty accounts, respectively.


## __Task 5__

This Java code defines a generic stack implementation `Task5` with methods to push, pop, and peek elements, along with exception classes for handling stack full and empty conditions.

## Class: Task5<T>

### Fields:
- `maxSize`: An integer representing the maximum size of the stack.
- `top`: An integer representing the index of the top element in the stack.
- `stackArray`: An array of type `T` to store the stack elements.

### Constructor:
- `Task5(int size)`: Constructor to initialize the maximum size and set the top index to -1.

### Methods:
- `push(T element)`: Pushes an element onto the stack. Throws a `StackFullException` if the stack is full.
- `pop()`: Pops an element from the stack and returns it. Throws a `StackEmptyException` if the stack is empty.
- `peek()`: Returns the element at the top of the stack without removing it. Throws a `StackEmptyException` if the stack is empty.
- `isEmpty()`: Checks if the stack is empty.
- `isFull()`: Checks if the stack is full.

## Exception Classes:

### `StackFullException`
- Constructor: `StackFullException(String message)`: Constructor to set the exception message.

### `StackEmptyException`
- Constructor: `StackEmptyException(String message)`: Constructor to set the exception message.

### Main Method:
- Creates an instance of `Task5` with an integer type stack.
- Attempts to push elements onto the stack, exceeding its capacity to trigger a `StackFullException`.
- Attempts to peek and pop elements from the stack, handling `StackEmptyException` when the stack is empty.


---

# __Week 11__

## __Task 1__

This Java code demonstrates exception handling using try-catch-finally blocks.

## Code Explanation

The `Task1` class contains a `main` method where the `testFinally` method is invoked within a try-catch block to handle any exceptions thrown.

The `testFinally` method is declared with a `throws` clause, indicating that it may throw an `Exception`. Within this method:

1. It attempts to throw a `ExceptionDemo4` instance.
2. If a `ExceptionDemo4` is caught, it rethrows a `ExceptionDemo2`.
3. The `finally` block is executed regardless of whether an exception is thrown or not.
4. Inside the `finally` block, it attempts to throw a `ExceptionDemo3` instance.

## Custom Exceptions

The code defines four custom exception classes:
- `ExceptionDemo1`
- `ExceptionDemo2`
- `ExceptionDemo3`
- `ExceptionDemo4`

Each extends the `Exception` class, providing specific exception types for different scenarios in the code.

## Execution Flow

1. The `main` method invokes `testFinally`.
2. `testFinally` attempts to throw `ExceptionDemo4`.
3. If `ExceptionDemo4` is caught, it throws `ExceptionDemo2`.
4. Regardless of the exceptions thrown, the `finally` block executes.
5. Inside the `finally` block, `ExceptionDemo3` is thrown.
6. If any exceptions occur during this process, they are printed to the standard error output.

## __Task 2__

This Java code demonstrates file input and output operations using `FileInputStream` and `FileOutputStream`.

## Code Explanation

The `Task2` class is located in the `week11` package. It contains a `main` method that throws an `IOException`.

Within the `main` method:

1. It initializes a string variable `stringData` and a string variable `file` with the name "output.txt".
2. It creates a `FileOutputStream` object `fos` to write the string data to the file.
3. It writes the content of `stringData` to the file using the `write` method of `fos`.
4. It closes the `FileOutputStream`.
5. It creates a `BufferedReader` object `bufread` to read the content of the file.
6. It reads each line of the file using the `readLine` method of `bufread` and prints it to the console.
7. It closes the `BufferedReader`.
8. It creates a `FileInputStream` object `fis` to read the content of the file.
9. It reads each character of the file using the `read` method of `fis` and appends it to a `StringBuilder` object `content`.
10. It prints the content of the file using `System.out.println`.
11. It closes the `FileInputStream`.
12. It reinitializes `fis` to read the content of the file.
13. It reads the content of the file into a byte array `b` using the `read` method of `fis`.
14. It appends the content of the byte array to a `StringBuilder` object `content` and prints it to the console.
15. It closes the `FileInputStream`.

## File Handling

The code demonstrates various file handling operations, including:
- Writing data to a file (`FileOutputStream`)
- Reading data from a file (`FileInputStream`)
- Reading data line by line (`BufferedReader`)

## Execution Flow

1. The program writes the string "Java" to a file named "output.txt".
2. It then reads the content of the file in two different ways:
    - Reading each character individually and appending it to a StringBuilder.
    - Reading the content into a byte array and converting it to a string before appending it to the StringBuilder.
3. The content of the file is printed to the console twice, once for each reading method.


## __Task 3__

This Java code demonstrates file copying and checking if two files are identical.

## Code Explanation

The `Task3` class is located in the `week11` package. It contains a `main` method that throws an `IOException`.

### Copying Files

1. The `main` method initializes two string variables, `originalFilePath` and `duplicateFilePath`, with the paths of the original and duplicate files respectively.
2. It creates a `FileInputStream` object `originalFileInputStream` to read the content of the original file.
3. It creates a `FileOutputStream` object `duplicateFileOutputStream` to write the content to the duplicate file.
4. It reads each byte from the original file using the `read` method of `originalFileInputStream` and writes it to the duplicate file using the `write` method of `duplicateFileOutputStream`.
5. After copying, it closes both input and output streams.

### Checking File Identity

The `Task3` class also contains a static method `isFilesIdentical` that takes two file paths as input arguments and returns a boolean indicating whether the files are identical.

1. It creates two `FileInputStream` objects to read from each file.
2. It compares the bytes of both files byte by byte using a while loop.
3. If any byte differs between the two files, it returns `false`.
4. If the loop completes without finding any differences, it returns `true`.

## Execution Flow

1. The `main` method copies the content of the original file to a duplicate file.
2. The `isFilesIdentical` method can be used to check if two files have the same content by comparing their bytes.

## __Task 4__

This Java code demonstrates file writing and reading using `FileWriter` and `FileReader` respectively.

## Code Explanation

The `Task4` class is located in the `week11` package. It contains a `main` method that throws an `IOException`.

### Writing to File

1. The `main` method initializes a string variable `file` with the name "test.txt" and another string variable `text` with the content "Coding!".
2. It creates a `FileWriter` object `wr` to write the text to the file.
3. It writes the content of `text` to the file using the `write` method of `wr`.
4. After writing, it closes the `FileWriter`.

### Reading from File

1. It creates two `FileReader` objects to read from the file.
2. The first `FileReader` (`reader1`) reads each character individually using the `read` method and appends it to a `StringBuilder` `s1`.
3. The second `FileReader` (`reader2`) reads the content of the file into a character array `b` using the `read` method.
4. It appends the content of the character array to another `StringBuilder` `s2`.
5. Finally, it prints the content of `s2` to the console.
6. Both `FileReader` objects are closed after reading.

## Execution Flow

1. The program writes the string "Coding!" to a file named "test.txt" using a `FileWriter`.
2. It then reads the content of the file in two different ways:
    - Reading each character individually.
    - Reading the content into a character array.
3. The content of the file is printed to the console.


## __Task 6__

This Java code demonstrates serialization and deserialization of objects using `ObjectOutputStream` and `ObjectInputStream`.

## Code Explanation

The `Person` class implements the `Serializable` interface, which indicates that its objects can be serialized (converted into a sequence of bytes) and deserialized (converted back into objects).

### Person Class

The `Person` class has two private fields: `name` and `age`, along with getter and setter methods for each field. It overrides the `toString` method to provide a string representation of a `Person` object.

### Serialization

1. The `savingPersons` method takes an array of `Person` objects and a filename as input arguments.
2. It creates an `ObjectOutputStream` to write the `persons` array to a file specified by the `filename`.
3. It writes the `persons` array to the file using the `writeObject` method of `ObjectOutputStream`.
4. After writing, it closes the `ObjectOutputStream`.

### Deserialization

1. The `readingPersons` method takes a filename as an input argument.
2. It creates an `ObjectInputStream` to read the serialized `Person` objects from the file specified by the `filename`.
3. It reads the `Person` objects from the file using the `readObject` method of `ObjectInputStream`.
4. It iterates over the array of `Person` objects and prints each object using the `println` method.
5. After reading, it closes the `ObjectInputStream`.

### Main Method

1. In the `main` method, an array of `Person` objects is created.
2. The array is then serialized and saved to a file named "persons.bin" using the `savingPersons` method.
3. The serialized `Person` objects are then deserialized and printed to the console using the `readingPersons` method.

## Execution Flow

1. The program creates an array of `Person` objects with predefined values.
2. It serializes the array and saves it to a file named "persons.bin".
3. It then deserializes the array from the file and prints each `Person` object to the console.



## __Task 7__

This Java code demonstrates file and directory information retrieval and directory traversal.

## Code Explanation

The `Task7` class contains methods to print information about files and directories, and to traverse directories recursively.

### `printFileInfo` Method

1. The `printFileInfo` method takes a `path` as input.
2. It creates a `File` object representing the file or directory specified by the `path`.
3. If the file or directory does not exist, it prints a message and returns.
4. It prints various information about the file or directory, such as name, absolute path, size, readability, writability, and executability.
5. If the object represents a directory, it prints its contents by listing the names of the files and subdirectories.

### `traverseDirectory` Method

1. The `traverseDirectory` method takes a `path` as input.
2. It prints information about the file or directory specified by the `path` using the `printFileInfo` method.
3. If the object represents a directory, it gets a list of its contents and recursively calls itself for each content, effectively traversing the directory structure.

### Main Method

1. In the `main` method, a `path` variable is initialized with the name of the directory to be traversed.
2. The `traverseDirectory` method is called with this `path` to start traversing the directory.

## Execution Flow

1. The program starts by calling the `traverseDirectory` method with the specified directory path.
2. For each directory encountered during traversal, it prints information about the directory and its contents recursively.
3. For each file encountered, it prints information about the file.

## __Task 9__

This Java code reads data from a CSV file containing information about persons, calculates the average age, and splits the persons into two groups based on whether their age is below or above the average. It then writes the data of each group to separate CSV files.

## Code Explanation

The `Task9` class contains the `main` method, which orchestrates the reading, processing, and writing of CSV data.

### PersonCSV Class

- The `PersonCSV` class represents a person with attributes such as ID, first name, last name, and age.

### CSVReader Class

- The `CSVReader` class contains a static method `readCSV` that reads data from a CSV file and returns a list of `PersonCSV` objects.

### Main Method

1. The main method reads data from the "persons.csv" file using the `CSVReader` class.
2. It calculates the average age of all persons.
3. It iterates over the list of persons, categorizing them into two groups: those with age below the average and those with age above the average.
4. It writes the data of each group to separate CSV files: "under_average_age.csv" and "above_average_age.csv".

## Execution Flow

1. The program starts by reading data from the "persons.csv" file and creating `PersonCSV` objects for each record.
2. It calculates the average age of all persons.
3. It categorizes persons into two groups: those with age below the average and those with age above the average.
4. It writes the data of each group to separate CSV files.
5. Any encountered IOExceptions are printed to the standard error output.


















