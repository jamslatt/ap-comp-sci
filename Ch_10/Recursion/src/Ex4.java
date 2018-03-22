// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Ex4 {
    public static void main(String[] args) {
        int number = 348;
        int num = number;
        if(number<0) {
            num = -number;
        }
        System.out.print("Input " + number + "\nOutput ");
        if(number<0) {
            System.out.print("-" + doubleDigit(num));
        }
        else {
            System.out.print(doubleDigit(num));
        }
    }

    public static String doubleDigit(int num) {
        if (num == 0) {
            return "0";
        }
        if (num<10) {
            return Integer.toString(num+num*10);
        }
        else
            return doubleDigit(num/10) + (num%10 + (num%10)*10);
    }
}
