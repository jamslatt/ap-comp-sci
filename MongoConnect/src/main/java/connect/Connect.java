package connect;

import com.mongodb.*;

import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoCollection;

import org.bson.Document;
import java.util.Arrays;

import com.mongodb.client.MongoCursor;
import static com.mongodb.client.model.Filters.*;
import com.mongodb.client.result.DeleteResult;
import static com.mongodb.client.model.Updates.*;
import com.mongodb.client.result.UpdateResult;
import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
public class Connect {
    public static void main(String[] args) {
        // Define and Connect to DB
        MongoClientURI connectionString = new MongoClientURI("mongodb://primary:Unity555@ds259117.mlab.com:59117/javaconnect");
        MongoClient mongoClient = new MongoClient(connectionString);

        MongoDatabase database = mongoClient.getDatabase("javaconnect");

        // Connect to Collection
        MongoCollection<Document> box = database.getCollection("box");

        // Scanner setup
        Scanner scanner = new Scanner(System.in);

        System.out.println("Would you like to get or post data?");
        String s = scanner.nextLine();

        if(s.toLowerCase().equals("get")) {
            System.out.println("What doc should we look for? Contains...");
            String query = scanner.nextLine();

            DBObject doc = (DBObject) box.find();

            System.out.println();
        }
        else if(s.toLowerCase().equals("post")){
            System.out.println("Enter the data you want to post.");
            String post = scanner.nextLine();

            Document doc = new Document("name",post);
            box.insertOne(doc);

        }
        else {
            System.out.println("Im sorry, I don't understand what you want me to do.");
        }



    }


}