import java.lang.reflect.Array;
import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        //Custom Interface Lambda
        Greeting sayHello = (x) -> {
            System.out.println("Hello, " + x + "!");
        };

        sayHello.greet("Mr Kim");
        sayHello.greet("Mrs Sushi");
        sayHello.greet("Ms Rori");
        sayHello.greet("Mr Sulaguhan");

        Calculator adder = (a, b) -> a + b; // adder Lambda
        System.out.println(adder.calculate(29, 8));
        System.out.println(adder.calculate(10987, 22324));
        System.out.println(adder.calculate(45646, 1634));

        Calculator multiplier = (a, b) -> a * b; // Multiplier Lambda

        System.out.println(multiplier.calculate(23, 44));
        System.out.println(multiplier.calculate(56, 43454));
        System.out.println(multiplier.calculate(345, 234));
        System.out.println(multiplier.calculate(65, 29));

        StringTester isEmpty = (x) -> x.isEmpty();
        System.out.println(isEmpty.testString("apple"));
        System.out.println(isEmpty.testString(""));

        StringTester greaterThanFive = (x) -> x.length() > 5;
        System.out.println(greaterThanFive.testString("apple"));
        System.out.println(greaterThanFive.testString("apples"));

        StringTester startsWithA = (x) -> x.charAt(0) == 'a' || x.charAt(0) == 'A';
        System.out.println(startsWithA.testString("apple"));
        System.out.println(startsWithA.testString("banana"));


        StringTester checkDigit = (x) -> {
            for (int i = 0; i < x.length(); i++) {
                if (Character.isDigit(x.charAt(i))) {
                    return true;
                }

            }
            return false;
        };

        System.out.println(checkDigit.testString("Trueman2"));
        System.out.println(checkDigit.testString("Batman1"));

        List<Integer> l = Arrays.asList(7, 8, 4, 5, 1, 9);
        l.sort((x, y) -> Integer.compare(y, x));
        System.out.println(l);
        l.sort((x, y) -> Integer.compare(x, y));
        System.out.println(l);

        List<Integer> l2 = Arrays.asList(7, -2, 6, -5, 3, 1);
        l2.sort((x, y) -> x * x - y * y);
        System.out.println(l2);

        List<Integer> numbers = Arrays.asList(10, 15, 20, 25, 30, 25, 40, 45, 50);
        List<Integer> evenNums = numbers.stream()
                .filter(x -> x % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(evenNums);

        List<Integer> oddNums = numbers.stream()
                .filter(x -> x % 2 != 0)
                .toList();

        System.out.println(oddNums);

        List<Integer> greaterThan20 = numbers.stream()
                .filter(x -> x > 20)
                .toList();
        System.out.println(greaterThan20);

        List<String> names = Arrays.asList("john", "alex", "robert", "sam", "david");
        List<String> upperNames = names.stream()
                .map(x -> x.toUpperCase())
                .toList();
        System.out.println(upperNames);
        List<String> names2 = Arrays.asList("Alex", "Bob", "Andrew", "David", "Adam", "John", "Aaron");
        List<String> modNames2 = names2.stream()
                .filter(x -> x.startsWith("A"))
                .map(x -> x.toUpperCase())
                .sorted()
                .toList();

        System.out.println(modNames2);

        List<Student> students = List.of(
                new Student("Ali", 19, 85),
                new Student("Rahul", 17, 90),
                new Student("Sara", 20, 72),
                new Student("John", 18, 65),
                new Student("Ayesha", 21, 91),
                new Student("David", 16, 88),
                new Student("Zain", 19, 69),
                new Student("Emma", 22, 78)
        );
        List<String> modStudents = students.stream()
                .filter(s -> s.getMarks() > 70 && s.getAge() >= 18)
                .map(s -> s.getName().toUpperCase())
                .toList();
        System.out.println(modStudents);

        List<String> topStudents = students.stream()
                .sorted((y, x) -> Double.compare(x.getMarks(), y.getMarks()))
                .limit(3)
                .map(x -> x.getName())
                .toList();
        System.out.println(topStudents);

        int sum = numbers.stream()
                .mapToInt(x -> x)
                .sum();
        System.out.println(sum);

        double avg = numbers.stream()
                .mapToInt(x -> x)
                .average()
                .orElse(0);

        System.out.println(avg);

        int max = numbers.stream()
                .mapToInt(x -> x)
                .max()
                .orElse(0);

        System.out.println(max);

        int reduce = numbers.stream()
                .reduce(0, (a, b) -> a + b);

        System.out.println(reduce);

        List<String> cities = Arrays.asList(
                "Delhi",
                "Mumbai",
                "Delhi",
                "Srinagar",
                "Mumbai",
                "Pune",
                "Delhi",
                "Pune"
        );

        List<String> noDuplicate = cities.stream()
                .distinct()
                .toList();

        System.out.println(noDuplicate);

        List<Employee> employees = List.of(
                new Employee("Hasbulla", "IT",233432),
                new Employee("Crag", "HR",78),
                new Employee("Mr Kim", "Finance",9871256),
                new Employee("Khabib", "IT",45231),
                new Employee("Volkanoski", "Finance",9876),
                new Employee("Islam", "HR",23482),
                new Employee("Conor", "IT",34562)

        );

        Map<String, List<Employee>> employeesByDepartment = employees.stream()
        .collect(Collectors.groupingBy(Employee::getDepartment));

        System.out.println(employeesByDepartment);
    }
}