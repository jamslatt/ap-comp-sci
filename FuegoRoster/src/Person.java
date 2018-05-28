// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public abstract class Person {
    public String name;
    public int age;
    public String address;
    public boolean probation;
    public String notes;

    public void addToProbation() {
        probation = true;
    }

    public void reliveFromProbation() {
        probation = false;
    }

    public String info() {
        return "| " +name + " | " + age + " | " + address + " | " + probation + " | " + notes + " |";
    }
}
