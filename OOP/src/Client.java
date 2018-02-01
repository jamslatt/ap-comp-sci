// By James Slattery     //
// GitHub: @jamslatt     //
///////////////////////////

public class Client {
    public static void main(String[] args) {
        SBRGun myGun = new SBRGun("Vortex 11.5\" SBR Rifle",556,false,11.5);
        myGun.supressGun();
        //System.out.println(myGun.getBarrelLength());

        Handgun pew = new Handgun("Colt 1911",17,false, "single");
        pew.print();


    }

}
