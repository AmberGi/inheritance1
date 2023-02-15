package lt.gintare.inheritance;

public class KlaseD extends KlaseB {

    public String testA;

    public KlaseD(String testA, String kintamasisB_A, String kintamasisA_A) {
        super(kintamasisB_A, kintamasisA_A); // zodelis super() reiskia kad pasiekiam tevines klases B parametrus
        super.kintamasisA_A = "";
        super.kintamasisB_A = "";
        this.testA = testA;
        super.testA = testA;
        super.doSomethingA_A();
    }

    @Override
    public void doSomethingA_A() {
        System.out.println("Spausdinam Kaip klaseje D");
        super.doSomethingA_A();
    }

    @Override
    public String getKintamasisB_B() {
        return super.getKintamasisB_B();
    }

    @Override
    public String toString() {
        return "KlaseD{" +
                "testA='" + testA + '\'' +
                ", kintamasisB_A='" + kintamasisB_A + '\'' +
                ", testA='" + testA + '\'' +
                ", kintamasisA_A='" + kintamasisA_A + '\'' +
                '}';
    }

}
