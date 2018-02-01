// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

import java.io.*;

import com.google.firebase.*;
import com.google.auth.oauth2.GoogleCredentials;

public class Tunnel {
    public static void main(String[] args) throws IOException {
        // SDK init
        FileInputStream serviceAccount = new FileInputStream("/home/james/GitHub/ap-comp-sci/java_fb_test/cert.json");

        FirebaseOptions options = new FirebaseOptions.Builder()
                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
                .setDatabaseUrl("https://javatest-90f04.firebaseio.com")
                .build();

        FirebaseApp.initializeApp(options);

        // Config
        FirebaseApp defaultApp = FirebaseApp.initializeApp();




    }
}
