package lt.gintare.telefonas;

public class Mobilus extends Telefonas {

    private String simKortelesNr;
    private int nuotraukuSkaicius = 0;

    public Mobilus(String numeris, String simKortelesNr) {
        super(numeris);
        this.simKortelesNr = simKortelesNr;
    }

    // sukuriam metoda fotografuok, padidina nuotraukuSkaicius vienu vienetu
    // visi geteriai
    // overide to string formatu: Mobilus[ numeris: xxx, simNr: xxx, melodija: xxxx, nuotraukuSkaicius: xxx]
    // main metode keleta kartu iskviesti metoda fotografuok ir atspausdinti objekta


    public void fotografuok() {
        nuotraukuSkaicius++;
    }

    public String getSimKortelesNr() {
        return simKortelesNr;
    }

    public int getNuotrukuSkaicius() {
        return nuotraukuSkaicius;
    }

    public Mobilus(String numeris, int nuotrukuSkaicius) {
        super(numeris);
        this.nuotraukuSkaicius = nuotrukuSkaicius;
    }

    // overide to string formatu: Mobilus[ numeris: xxx, simNr: xxx, melodija: xxxx, nuotraukuSkaicius: xxx]

    @Override
    public String toString() {
        return String.format("Mobilus:[numeris : %s, simNr: %s, melodija: %s, nuotrauku skaicius: %s]",
                super.getNumeris(),
                simKortelesNr,
                super.getMelodija(),
                nuotraukuSkaicius
        );

    }
}
