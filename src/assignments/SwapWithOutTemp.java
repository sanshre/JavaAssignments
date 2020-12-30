package assignments;

public class SwapWithOutTemp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(" Before swap a is " + a + " b is " + b);

        a = a + b;
        b = a - b;
        a = a - b;

        System.out.println(" After swap a is " + a + " b is " + b);
    }
}
