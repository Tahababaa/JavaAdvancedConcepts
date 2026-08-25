public class Client2 {
    public static void main(String[] args) {
        try {
            setMarks(85);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            setMarks(120);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            setMarks(10);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }


    }
    static void setMarks(int marks)  {
        if(marks>=0 &&marks<=100){
            System.out.println("Marks updated to: "+marks);
        }
        else{
            throw new IllegalArgumentException("Marks must be between 0 and 100");
        }
    }
}
