package LogicalQuestions;

public class AddTwoVariablesWithoutPlusOperatorAndThirdVariable {
	public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a -= -b; // same as a = a + b

        System.out.println("a = " + a); // Expected output: a = 30
    }
}
