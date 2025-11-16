package LogicalQuestions;

public class ConvertLowercaseToUppercaseWithoutBuiltInMethods {
	public static void main(String[] args) {
        char ch = 'm';

        ch = (char)(ch & 95); // or ch & '_'

        System.out.println(ch); // M
    }
}
