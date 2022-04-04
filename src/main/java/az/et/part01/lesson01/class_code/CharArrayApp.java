package az.et.part01.lesson01.class_code;

public class CharArrayApp {
    public static void main(String[] args) {
        char[] chars = new char[26];
        int start = 97;
        for (int i = 0; i < chars.length; i++) {
            chars[i] = (char) (start++);
            System.out.print(chars[i] + " ");
        }
        char[] alphabet =
                {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
                        'u', 'v', 'w', 'x', 'y', 'z'};
        String str = "abcdefghijklmnopqrstuvwxyz";
    }
}
