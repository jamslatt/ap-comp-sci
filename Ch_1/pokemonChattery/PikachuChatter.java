
///////////////////
// By James Slattery
// Pokemon Chatter Thing
/////////////////////////

public class PikachuChatter {
    public static void main(String args[]) {
        print("Pika pika pika chu pika chu peeeeee ka pika chu!");
        pika();
        space();
        print("Pika? Pika pika pika chu peeeee ka chu!");
        pika();
    }
    
    // Prints pika thing
    public static void pika() {
        System.out.println(" (\\_/)");
        space();
        System.out.println(" (o^.^)");
        space();
        System.out.println("z(_(\")(\")");
        space();
    }
    
    // Break Line
    public static void space() {
        System.out.println();
    }
    
    // Print Command arguement: String to print.
    public static void print(String txt) {
        System.out.println(txt);
    }
}
