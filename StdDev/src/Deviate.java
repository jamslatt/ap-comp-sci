// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Deviate {

    public static void main(String[] args) {
        int[] leShat = {1, -2, 4, -4, 9, -6, 16, -8, 25, -10};
        System.out.println(sd(leShat));
        //Deviate testRun = new Deviate();
        //System.out.println(testRun.stdev(leShat));
    }

    /*public double stdev(int[] a) {
        double average = average(a);

        double aTop = 0.0;
        for (int i = 0; i < (a.length -1); i++) {
            aTop += (a[i] - Math.pow(average,2));
        }

        return Math.sqrt(aTop / (a.length -1));
    }

    public double average(int[] a) {
        double sum = 0.0;

        for (int i = 0; i < a.length; i++) {
            sum += a[i];
        }

        return sum / a.length;
    }
*/
    public static double mean (int[] table) {
        int total = 0;

        for ( int i= 0;i < table.length; i++) {
            int currentNum = table[i];
            total+= currentNum;
        }
        return total/table.length;
    }

    public static double sd (int[] table) {
        double mean = mean(table);
        double temp = 0;

        for (int i = 0; i < table.length; i++) {
            int val = table[i];

            double squrDiffToMean = Math.pow(val - mean, 2);

            temp += squrDiffToMean;
        }

        double meanOfDiffs = (double) temp / (double) (table.length);

        return Math.sqrt(meanOfDiffs);
    }

}
