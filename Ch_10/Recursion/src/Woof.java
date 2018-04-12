// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Woof implements BigDog {
    public void eat() {
        System.out.println("** Attacks child walking down street and eats it.**");
    }

    public void shit() {
        System.out.println("**Poops out child it ate hours earlier.**");
    }

    public static void main(String[] args) {
        Woof w = new Woof();
        w.eat();
        w.shit();
    }
}
