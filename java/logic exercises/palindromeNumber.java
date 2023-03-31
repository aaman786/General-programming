public class palindromeNumber {
    public static void main(String[] args) {
        int real = 121, temp;
        temp = real;
        int reverse = 0;

        while (temp > 0) {
            int a = temp % 10;
            temp = temp / 10;
            reverse = reverse * 10 + a;

        }

        if (real == reverse) {
            System.out.println("This is an palindrome number.");
        } else
            System.out.println("This is not a palindrome number.");
    }
}
