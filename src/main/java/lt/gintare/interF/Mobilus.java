package lt.gintare.interF;

public class Mobilus implements Telefonas {

    private String numeris;
    private String simKortelesNr;
    private String melodija;
    private int nuotraukuSkaicius = 0;

    public Mobilus(String numeris, String simKortelesNr) {
        this.numeris = numeris;
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

    public String getNumeris() {
        return numeris;
    }

    public String getMelodija() {
        return melodija;
    }

    public void setMelodija(String melodija) {
        this.melodija = melodija;
    }

    public Mobilus(String numeris, int nuotrukuSkaicius) {
        this.numeris = numeris;
        this.nuotraukuSkaicius = nuotrukuSkaicius;
    }

    // overide to string formatu: Mobilus[ numeris: xxx, simNr: xxx, melodija: xxxx, nuotraukuSkaicius: xxx]

    @Override
    public void paskambink(String numeris) {
        System.out.println(
                String.format(
                        "Abonimentas %s skambina numeriu %s", this.numeris, numeris)
        );
    }

    @Override
    public String toString() {
        return String.format("Mobilus:[numeris : %s, simNr: %s, melodija: %s, nuotrauku skaicius: %s]",
                this.numeris,
                simKortelesNr,
                this.melodija,
                nuotraukuSkaicius
        );

    }
}
