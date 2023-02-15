package lt.gintare.inheritance;

import lt.gintare.inheritance.KlaseA;

public class MainInheritance {
    public static void main(String[] args) {

        KlaseA klaseA = new KlaseA("");
        KlaseB klaseB = new KlaseB("", "");
        KlaseC klaseC = new KlaseC("","");
        KlaseD klaseD = new KlaseD("", "","");

        klaseA.kintamasisA_A = "asdf";
        klaseA.doSomethingA_A();

        klaseB.kintamasisA_A = "kita reiksme";
        klaseB.kintamasisB_A = "kita reiksme";
        klaseB.doSomethingA_A();
        klaseB.doSomethingB_A();

        klaseC.kintamasisA_A = "dar kita reiksme";
        klaseC.kintamasisC_A = "dar kita reiksme";
        klaseC.doSomethingA_A();
        klaseC.doSomethingC_A();

        klaseD.kintamasisA_A = "tiesiog reiksme A";
        klaseD.kintamasisB_A = "tiesiog reiksme B";
        klaseD.doSomethingA_A();
        klaseD.doSomethingB_A();

    }
}
