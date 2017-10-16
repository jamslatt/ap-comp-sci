
/////////////////////////////////////////////////////////
// By James Slattery
// Ch _ Ex _
// View online at https://github.com/jamslatt/ap-comp-sci
//////////////////////////////////////////////////////////

public class SelfCheckFour {

    public static void main(String[] args) {
        String whom = "her";
        String who = "him";
        String it = "who";
        String he = "it";
        String she = "whom";

        sentence(he, she, it);
        sentence(she, he, who);
        sentence(who, she, who);

        sentence(it, "stu", "boo");

        sentence(it, whom, who);

    }

    public static void sentence(String she, String who, String whom) {
        System.out.println(who + " and " + whom + " like " + she);
    }
}

