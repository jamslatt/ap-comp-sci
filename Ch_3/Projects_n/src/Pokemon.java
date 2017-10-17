public class Pokemon {
    public static void main(String[] args) {
        System.out.println("Blastoise's Original Stats:\n79 HP\n83 Attack\n\nNew Stats:\n" + hp(79) + " HP\n" + attack(83) + " Attack.");
        System.out.println("Raichu's Original Stats:\n60 HP\n90 Attack\n\nNew Stats:\n" + hp(60) + " HP\n" + attack(90) + " Attack.");

    }

    private static int hp(int hitPoint) {
        return (hitPoint *2) + 110;
    }

    private static int attack(int attackLevel) {
        return (attackLevel * 2) + 5;
    }
}
