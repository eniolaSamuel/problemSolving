package testProblemSolving;

public class Number4Level1 {
    public static void main(String[] args) {
        String letter = "MISSISSIPI";
        char[] stringChar = letter.toCharArray();
        int sCount = 0;
        int iCount = 0;
        for (int i = 0; i < stringChar.length; i++) {
            if (letter.charAt(i) == 'S') sCount++;
        }
        for (int j = 0; j < stringChar.length ; j++) {
            if (letter.charAt(j) == 'I') iCount++;
        }
        System.out.println((sCount));
        System.out.println((iCount));

    }


}
