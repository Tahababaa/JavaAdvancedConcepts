public class AgeClient {
    public static void main(String[] args) {
        validateAge(22);
        validateAge(44);
        validateAge(12);
        validateAge(90);
    }
    static void checkAge(int age) throws InvalidAgeException{
        if(age>=18 && age<=60){
            System.out.println("Age accepted!");
        }
        else {
            throw new InvalidAgeException ("Age should be between 18 and 60! Your age is "+age);
        }
    }
    static void validateAge(int age){
        try {
            checkAge(age);
        }
        catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
    }
}
