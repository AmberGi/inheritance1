package lt.gintare.inheritance;

public class KlaseB extends KlaseA {

    public String kintamasisB_A;
    public String kintamasisB_B;
    public String testA;

    public KlaseB(String kintamasisB_A, String kintamasisA_A) {
        super(kintamasisA_A);
        this.kintamasisB_A = kintamasisB_A;
    }

    public String getKintamasisB_B() {
        return kintamasisB_B;
    }

    public void setKintamasisB_B(String kintamasisB_B) {
        this.kintamasisB_B = kintamasisB_B;
    }

    public void doSomethingB_A() {

    }
}
