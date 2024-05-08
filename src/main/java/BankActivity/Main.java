package BankActivity;

public class Main{

    public static void main(String[] args) {
        GTB gtb = new GTB();
        UBA uba = new UBA();
        ZENITH zenith = new ZENITH();

        gtb.interestRate();
        uba.interestRate();
        zenith.interestRate();
    }
}
