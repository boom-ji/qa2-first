import org.junit.jupiter.api.Test;

public class HomeWork1 {

    int a = 5000;
    int p = 29;


    @Test
    public void firstHomeWork() {
        System.out.println("Hi, Dima! This is my first home work!");
        System.out.println(" ");
        System.out.println("Sam is going to get quick credit from bank but his maths is extremely poor.");
        System.out.println("Let's help him!");
        int multilpy = multiply(5000, 29);
        int divide = devideTwoDigits(multilpy, 100);
        int sum = sumTwoDigits(5000, divide);
        System.out.println("He needs " + a + " dollars credit and bank wants " + p + "% only.");
        System.out.println("But it means, that in total Sam will pay to bank " + sum + " dollars.");
        System.out.println("Poor Sam! Final number is really big!");
        String Str1 = "Hi, Dima! This is my first home work!";
        String Str2 = "Let's help him!";
        System.out.println(" ");
        System.out.println(Str1.length() + " symbols are in the first line.");
        System.out.println(Str2.length() + " symbols are in the fourth line.");


    }

    private int sumTwoDigits(int a, int b) {
        int s = a + b;
        return s;
    }
    private int multiply(int a, int p) {
        int d = a * p;
        return d;
    }
    private int devideTwoDigits(int d, int z) {
        int b = d / z;
        return b;
    }




}
