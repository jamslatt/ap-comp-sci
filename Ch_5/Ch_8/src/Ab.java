// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Ab{
    public static void main(String args[]){
        TwoWheeler test = new Honda();
        test.run();
    }
}
abstract  class TwoWheeler {
    public abstract void run();
}
class Honda extends TwoWheeler{
    public void run(){
        System.out.println("Running..");
    }
}
