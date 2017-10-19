/**
 * Created by james on 10/19/2017.
 */
public class Eleven {
    public static void main(String[] args) {
        padString("Hello",8);

    }



    public static void padString(String phrase, int spaces) {
        int stringLength = phrase.length();
        int spacesToInsert = spaces - stringLength;


        System.out.print(phrase);
        createSpace(spacesToInsert);

    }

    public static void createSpace(int amt){
        for(int i=1;i<=amt;i++) {
            System.out.print(" ");
        }
    }
}
