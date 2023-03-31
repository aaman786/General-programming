
class palindrome {
    public static void main(String[] args) {
        String s = getReverseWord("swap");
        System.out.println(s);

        // String st = Integer.toString(121);

        // System.out.println(st.getClass().getName());
        // int a = Integer.parseInt(st);
        // System.out.println(a);

    }

    public static String getReverseWord(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }

        return word.charAt(word.length() - 1) + getReverseWord(word.substring(0, word.length() - 1));
    }
}