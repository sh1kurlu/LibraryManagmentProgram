package week12;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@FunctionalInterface
interface SpecificProperty<T> {
    boolean check(T value);
}

public class Task2 {

    public static <T> Collection<T> filter(Collection<T> c, SpecificProperty<T> p) {
        List<T> result = new ArrayList<>();
        for (T item : c) {
            if (p.check(item)) {
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        SpecificProperty<Integer> isOdd = (num) -> num % 2 != 0;

        SpecificProperty<Point> isFirstQuadrant = (point) -> point.getX() > 0 && point.getY() > 0;

        SpecificProperty<String> isPangram = (str) -> str.chars().filter(Character::isAlphabetic).distinct().count() == 26;

        SpecificProperty<Person> isOlderThan20 = (person) -> person.getAge() > 20;

        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        Collection<Integer> oddNumbers = filter(numbers, isOdd);
        System.out.println("Odd Numbers: " + oddNumbers);

        List<Point> points = List.of(new Point(1, 1), new Point(-2, 3), new Point(4, -5), new Point(-6, -7));
        Collection<Point> pointsInFirstQuadrant = filter(points, isFirstQuadrant);
        System.out.println("Points in the First Quadrant: " + pointsInFirstQuadrant);

        List<String> strings = List.of("The quick brown fox jumps over the lazy dog", "Hello World!", "Pack my box with five dozen liquor jugs");
        Collection<String> pangrams = filter(strings, isPangram);
        System.out.println("Pangrams: " + pangrams);

        List<Person> persons = List.of(new Person("John", "Doe", 25), new Person("Alice", "Smith", 18), new Person("Bob", "Johnson", 30));
        Collection<Person> olderThan20 = filter(persons, isOlderThan20);
        System.out.println("Persons older than 20: " + olderThan20);
    }
}

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}

class Person {
    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " (Age: " + age + ")";
    }
}
