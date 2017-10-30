public class RandomNumber {
    public static void main(String[] args) {

        int grade = 80;
        char letter;

        if (grade < 60) {
            letter = 'F';
        }
        else if (grade >= 90) {
            letter = 'A';
        }
        else if (grade < 90 || grade >=80) {
            letter = 'B';
        }
        else if (grade < 80 || grade >= 70) {
            letter = 'C';

        }

    }
}
