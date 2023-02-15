package lt.gintare.telefonas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Taksofonas extends Telefonas {

    private BigDecimal piniguLikutis;
    private final BigDecimal SKAMBUCIOKAINA = BigDecimal.valueOf(0.25);

    public Taksofonas(double pinigelis) {
        super("[cia yra taksofonas]");
        piniguLikutis = BigDecimal.valueOf(pinigelis);
    }

    //Telefonas[numeris: xxx, likutis: xxx]

    public BigDecimal getPiniguLikutis() {
        return piniguLikutis;
    }

    public void papildykLikuti(double pinigelis) {
        this.piniguLikutis = piniguLikutis.add(BigDecimal.valueOf(pinigelis));
    }

    public Taksofonas(String numeris, BigDecimal piniguLikutis) {
        super(numeris);
        this.piniguLikutis = piniguLikutis;
    }

    @Override
    public void paskambink(String numeris) {
        if (piniguLikutis.compareTo(SKAMBUCIOKAINA) >= 0) {
            super.paskambink(numeris);
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
                super.getNumeris(),
                piniguLikutis.setScale(2, RoundingMode.HALF_EVEN)
        );
    }
}


