public class removingAdjDuplicates {

    public static String charRemoveAti(String str, int p) {
        return str.substring(0, p) + "-" + str.substring(p + 1);
    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + "0" + str.substring(p + 1);
    }

    public static void main(String[] args) {
        var v = charRemoveAt("oky", 2);
        System.out.println(v);
    }

    // public static void main(String[] args) {
    // String original = "aabaarbarccrabmq";
    // char[] arrOrg = new char[original.length()];
    // arrOrg = original.toCharArray();

    // for (int i = 0; i < arrOrg.length; i++) {
    // for (int j = i + 1; j < arrOrg.length; j++) {

    // if (arrOrg[i] == arrOrg[j]) {
    // System.out.println("com " + i + " " + arrOrg[i] + " and " + j + " " +
    // arrOrg[j]);

    // original = charRemoveAti(original, i);
    // arrOrg[i] = charRemoveAti(original, i).toCharArray()[0];
    // System.out.println("when at i : " + i + " -- " + original);
    // original = charRemoveAt(original, j);
    // arrOrg[j] = charRemoveAt(original, j).toCharArray()[0];
    // System.out.println("when at j : " + j + " -- " + original);
    // break;
    // }
    // }
    // }

    // // original = charRemoveAt(original, 02);
    // System.out.println(original);

    // }
}