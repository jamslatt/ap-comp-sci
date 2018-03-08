/**
 * Created by james on 3/7/2018.
 */
import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;
import java.util.stream.Collectors;
import java.util.Scanner;

public class Words
{
    public static void main( String[] args ) throws IOException
    {
        // Setup and read dict into ArrayList
        List<String> list = Files.readAllLines( new File("words.txt").toPath(), Charset.defaultCharset() );

        //List<String> lowercase = list.stream().map( s -> s.toLowerCase() ).filter( s->s.chars().allMatch(Character::isLetter)).collect( Collectors.toList() );
        // Options
        System.out.print("+---------------------------+\n+-----DICTIONARY SEARCH-----+\n+---------------------------+\n+ Enter first term....\n");
        Scanner input = new Scanner(System.in);
        String firstTerm = input.nextLine();
        System.out.println("+ Enter second term....\n");
        String secondTerm = input.nextLine();


        search(list,firstTerm,secondTerm);

    }

    public static void search(List<String> arr, String termOne, String termTwo) {
        int right = arr.size() - 1;
        int left = 0;

        int markT1 = -1;
        // find Term One
            for (int i=0; i < arr.size(); i++) {
                if (arr.get(i).equals(termOne.toUpperCase())) {
                    markT1 = i;
                }
            }

        int markT2 = -1;
        // find term two
        for (int i=0; i < arr.size(); i++) {
            if (arr.get(i).equals(termTwo.toUpperCase())) {
                markT2 = i;
            }
        }
        //
        System.out.print("+---------------------------+\n\n+ First Term Location: " + markT1 + "\n+ Second Term Location: " + markT2 + "\n+ + There are " + (markT2 - markT1) + " words in between " + termOne + " and " + termTwo + ".");

    }

}