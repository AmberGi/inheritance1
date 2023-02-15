package lt.gintare.interF;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Taksofonas implements Telefonas {

    private String numeris;
    private BigDecimal piniguLikutis;
    private final BigDecimal SKAMBUCIOKAINA = BigDecimal.valueOf(0.25);

    public Taksofonas(double pinigelis) {
        this.numeris = "[cia yra taksofonas]";
        this.piniguLikutis = BigDecimal.valueOf(pinigelis);
    }

    //Telefonas[numeris: xxx, likutis: xxx]

    public BigDecimal getPiniguLikutis() {
        return piniguLikutis;
    }

    public String getNumeris() {
        return numeris;
    }

    public void papildykLikuti(double pinigelis) {
        this.piniguLikutis = piniguLikutis.add(BigDecimal.valueOf(pinigelis));
    }

    public Taksofonas(String numeris, BigDecimal piniguLikutis) {
        this.numeris = numeris;
        this.piniguLikutis = piniguLikutis;
    }

    @Override
    public void paskambink(String numeris) {
        if (piniguLikutis.compareTo(SKAMBUCIOKAINA) >= 0) {
        //    super.paskambink(numeris);
            System.out.println(
                    String.format(
                            "Abonimentas %s skambina numeriu %s", this,numeris, numeris)
            );
            piniguLikutis = piniguLikutis.subtract(SKAMBUCIOKAINA);
        } else {
            System.out.println(
                    "Skambuciui nepakanka pinigu, likutis yra toks: " +
                            piniguLikutis.setScale(2, RoundingMode.HALF_EVEN)
            );
        }
    }

    @Override
    public String toString() {
        return String.format("Taksofonas [numeris: %s, likutis %s]",
                this.numeris,
                piniguLikutis.setScale(2, RoundingMode.HALF_EVEN)
        );
    }
}


