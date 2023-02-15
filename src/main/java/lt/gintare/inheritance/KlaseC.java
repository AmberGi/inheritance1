package lt.gintare.inheritance;

import lt.gintare.inheritance.KlaseA;

public class KlaseC extends KlaseA {

    public KlaseC(String kintamasisA_A, String kintamasisC_A) {
        super(kintamasisA_A);
        this.kintamasisC_A = kintamasisC_A;
    }

    public String kintamasisC_A;

    public void doSomethingC_A() {

    }
}
