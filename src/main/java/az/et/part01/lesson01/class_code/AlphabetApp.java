package az.et.part01.lesson01.class_code;

public class AlphabetApp {
    public static void main(String[] args) {
        for (int i = 97; i < 123; i++) {
            System.out.println((char) i + " --- " + ((char) (i - 32)));
        }
    }
}
