// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class BadIdea {
    private String name;
    private int rating;
    private  boolean verified;


    // Mutatos
    public void changeRating(int n) {
        rating = n;
    }

    public void verify() {

        verified = true;
    }

    public void changeName(String n) {
        name = n;
    }

    // Accessoss
    public int getRating() {

        return rating;
    }

    public boolean isVerified() {

        return verified;
    }

    public String getName() {

        return name;
    }

    public BadIdea (String n, int r, boolean v){
        name = n;
        rating = r;
        verified = v;
    }

}
