
/* Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned). */

public class ReverseInteger {

    public static void main ( String[] args) {
        int num = 0;
        int count=0;

        while ( num != 0){
            int divident= num % 10;
            count = count * 10+ divident;
            num = num/10;

        }

        System.out.printf("Reversed integer is :  %d" ,count );

    }
}
