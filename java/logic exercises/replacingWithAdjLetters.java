
public class replacingWithAdjLetters {

    static char giveAdjacent(char charater) {
        char adj = (char) (charater + 1);

        return adj;
    }

    public static void main(String[] args) {
        String initialWord = "Hello World";
        char[] arr = new char[initialWord.length()];
        arr = initialWord.toCharArray();

        String adjWord = "";
        int i = 0;

        char c;
        while (i < initialWord.length()) {
            if (arr[i] == 'a' || arr[i] == 'e' || arr[i] == 'i' || arr[i] == 'o' || arr[i] == 'u' || arr[i] == ' ') {
                adjWord += arr[i];
            } else {
                c = giveAdjacent(arr[i]);
                adjWord += c;

            }
            i++;
        }
        System.out.println(adjWord);
    }
}
