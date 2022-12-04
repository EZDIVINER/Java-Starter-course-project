package Task1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter a number");
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        System.out.println(function(num));

    }
    static int function(int num){
        int sum = 0;
        for ( ; num > 0; num /= 10)
            sum += num % 10;
        return sum;
    }
}
