/**
 * Created by james on 10/19/2017.
 */
public class Twelve {
    public static void main(String[] args) {
        generate("test");
    }

    public static void generate(String phrase) {
        int length = phrase.length();

        for(int i=0;i<length;i++) {
            System.out.println(phrase.charAt(i));
        }

    }
}
