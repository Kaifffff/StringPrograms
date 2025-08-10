package StringPrograms;
public class StringToIntManual {
    public static int stringToInt(String str) {
        // Check for null or empty string
        if (str == null || str.isEmpty()) {
            throw new NumberFormatException("Invalid input: " + str);
        }
        int num = 0;
        boolean isNegative = false;
        int i = 0;
        // Check for negative numbers
        if (str.charAt(0) == '-') {
            isNegative = true;
            i = 1; // Start from next character
        }
        // Convert each character to its numeric value
        for (; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch < '0' || ch > '9') {
                throw new NumberFormatException("Invalid character: " + ch);
            }
            num = num * 10 + (ch - '0');
        }
        return isNegative ? -num : num;
    }
    public static void main(String[] args) {
        System.out.println(stringToInt("1234"));   // 1234
        System.out.println(stringToInt("-5678"));  // -5678
        System.out.println(stringToInt("0"));      // 0
    }
}
