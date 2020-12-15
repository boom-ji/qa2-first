import org.junit.jupiter.api.Test;

public class MyFirstTest {
    private String name = "Vladika";


    @Test
    public void firstTest() {
        System.out.println("Hello, Corona! Corona go away!");
        System.out.println("Corona go away!");

        int sum = sumTwoDigits( 2001, 19);
        System.out.println("Away from:" + sum);

        System.out.println(sumTwoDigits(2020, 1));

        System.out.println(name);



    }

    private int sumTwoDigits(int a, int b) {
        int c = a + b;
        return c;

    }
}
