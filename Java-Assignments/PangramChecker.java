import java.util.Scanner;

public class PangramChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        boolean isPangram = checkPangram(input);
        if(isPangram){
            System.out.println("Given input is a pangram ");
        }
        else{
            System.out.println("Given input is not a pangram ");

        }

        scanner.close();
    }

    private static boolean checkPangram(String s) {
        boolean[] mark = new boolean[26];
        int index;

        for (int i = 0; i < s.length(); i++) {
            if ('A' <= s.charAt(i) && s.charAt(i) <= 'Z') {
                index = s.charAt(i) - 'A';
            } else if ('a' <= s.charAt(i) && s.charAt(i) <= 'z') {
                index = s.charAt(i) - 'a';
            } else {
                continue;
            }
            mark[index] = true;
        }

        for (boolean value : mark) {
            if (!value) {
                return false;
            }
        }

        return true;
    }
}
