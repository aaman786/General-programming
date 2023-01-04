
public class romanNumber {

    static void convertToRoman(int num) {
        int[] values = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] romanLetters = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder roman = new StringBuilder();

        for (int item = 0; item < values.length; item++) {
            while (num >= values[item]) {
                num -= values[item];
                roman.append(romanLetters[item]);
            }
        }

        System.out.println("The roman number is: " + roman);
    }

    public static void main(String[] args) {
        int num = 1994;
        convertToRoman(num);
    }
}