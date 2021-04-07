/*Given an integer x, return true if x is palindrome integer.

An integer is a palindrome when it reads the same backward as forward. For example, 121 is palindrome while 123 is not.
Author: @arpithasrinivas
*/

public class PalindromeNumber {

    public static void main(String[] args){
       int count=0 , orginal_number=4554;
       int copiedNumber= orginal_number;

       while(copiedNumber!=0) {
           int digit = copiedNumber % 10; 4554
           count = count * 10 + digit; 4554
           copiedNumber = copiedNumber / 10; 455,45,4
       }
           if (orginal_number==count) {
               System.out.println("Entered number is palindrome");
           }
           else {
               System.out.println(" Entered number is not a palindrome");
           }
