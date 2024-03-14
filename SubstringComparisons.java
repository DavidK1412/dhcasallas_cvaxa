import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


public class SubstringComparisons {

    public static ArrayList<String> subStrings(String s, int n) {
        String[] splittedString = new String[s.length() - n + 1];
        for (int i = 0; i < s.length() - n + 1; i++) {
            splittedString[i] = s.substring(i, i + n);
        }
        ArrayList<String> result = new ArrayList<>(Arrays.asList(splittedString));
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        int n = scanner.nextInt();
        ArrayList<String> result = subStrings(s, n);
        Collections.sort(result);
        System.out.println(result.get(0));
        System.out.println(result.get(result.size() - 1));
    }
}