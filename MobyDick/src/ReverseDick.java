// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.util.List;

public class ReverseDick
{
    public static void main( String[] args ) throws IOException
    {

        // Setup and read dict into ArrayList
        List<String> list = Files.readAllLines( new File("dick.txt").toPath(), Charset.defaultCharset() );


        for (int i = 0; i < list.size(); i++) {
           list.set(i, reverseIt(list.get(i)));
        }

        // PRINT
        PrintWriter writer = new PrintWriter("ybomDICK.txt", "UTF-8");

        for (int j = 0; j < list.size(); j++) {
            writer.println(list.get(j));
        }


    }

    public static String reverseIt(String source) {
        int i, len = source.length();
        StringBuilder dest = new StringBuilder(len);

        for (i = (len - 1); i >= 0; i--){
            dest.append(source.charAt(i));
        }

        return dest.toString();
    }


}
