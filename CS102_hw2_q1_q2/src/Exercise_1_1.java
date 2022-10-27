//Check reverse strings

public class Exercise_1_1 {
    static String string1 = "google";
    static String string2 = "elgoog";

    public static void main(String[] args) {
        System.out.println(CompareStrings(string2, string1));
    }

    static int CompareStrings(String _s1, String _s2){
        _s1.replaceAll("\\s", "");
        _s2.replaceAll("\\s", "");

        if (_s1.length() != _s2.length()) return 0;

        for (int i = 0; i<_s1.length(); i++){
            if (Character.toLowerCase(_s1.charAt(i)) != Character.toLowerCase(_s2.charAt(_s2.length() - i - 1))) return 0;
        }

        return 1;
    }
}

//Big O: running time: O(n)
