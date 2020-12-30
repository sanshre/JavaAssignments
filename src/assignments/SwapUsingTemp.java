package assignments;

public class SwapUsingTemp {
    public static void main(String[] args) {
        int a = 5;
        int b = 6;
        System.out.println("Before swap Value of a: "+ a +" and value of b: "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swap Value of a: "+ a +" and value of b: "+ b);


    }

}
