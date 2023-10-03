import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        sc.close();

        String result = convertCase(input);
        System.out.println(result);
    }

    public static String convertCase(String input) {
        //문자열을 배열로 받아 대소문자를 바꾸는 메서드
        char[] str = input.toCharArray();

        for (int i = 0; i < str.length; i++) {
            char c = str[i];
            if (Character.isUpperCase(c)) {
                str[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                str[i] = Character.toUpperCase(c);
            }
        }
        return new String(str);
    }
}
