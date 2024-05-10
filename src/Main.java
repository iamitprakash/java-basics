import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // Exercise    1
        ComplexNumber num1 = new ComplexNumber(2, 3);
        ComplexNumber num2 = new ComplexNumber(4, -1);
        ComplexNumber sum = num1.add(num2);
        System.out.println(sum.toString());

        // Exercise 2
        NumberGame game = new NumberGame();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        try {
            int input = Integer.parseInt(scanner.nextLine());

            System.out.println(game.Playing(input));
        } catch (NumberFormatException e) {
            System.out.println("You entered an invalid number.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Something went wrong with Error ." + e.getMessage().toString());
        }
// Exercise 3

        CircleAreaCalculator calculator = new CircleAreaCalculator();
        double radius = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                System.out.print("Enter the radius of the circle: ");
                radius = Double.parseDouble(scanner.nextLine());
                validInput = true;
                System.out.println("The area of the circle is: ");
                System.out.print(calculator.CalculateArea((int) radius));
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }
        }


        // Exercise 4

        List<Car> cars = Arrays.asList(
                new Car("Toyota", "Camry", 2028, "Red", true),
                new Car("Honda", "Civic", 2024, "Blue", true),
                new Car("Ford", "Mustang", 2020, "Red", false),
                new Car("Chevrolet", "Cruze", 2017, "Black", true),
                new Car("Toyota", "Corolla", 2018, "White", true)
        );

        String[] uniqueColors = cars.stream()
                .map(Car::colour)
                .distinct()
                .sorted()
                .toArray(String[]::new);

        System.out.println("Unique colors: " + Arrays.toString(uniqueColors));

        // Exercise 5
        Car car1 = cars.stream()
                .filter(car -> car.year() >= 2023)
                .findFirst()
                .orElseThrow(() -> new RuntimeException());



        // Exercise 6
        List<Book> books = List.of(// list of
                new Book("Java Programming", 500, 29.99, new String[]{"English", "Spanish"}),
                new Book("Python Basics", 300, 19.99, new String[]{"English", "French"}),
                new Book("C++ Fundamentals", 400, 24.99, new String[]{"English", "German"}),
                new Book("JavaScript Essentials", 250, 14.99, new String[]{"English", "Spanish"}),
                new Book("Ruby on Rails", 350, 22.99, new String[]{"English", "French"})
        );

        String[] uniqueLanguages = books.stream()
                .flatMap(book -> Arrays.stream(book.languages()))
                .distinct()
                .sorted(Comparator.reverseOrder())
                .toArray(String[]::new);

        System.out.println("Reverse-sorted array of de-duplicated languages: " + Arrays.toString(uniqueLanguages));
    }

}