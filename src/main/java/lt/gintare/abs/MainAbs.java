package lt.gintare.abs;

public class MainAbs {

    public static void main(String[] args) {

        System.out.println("===========");
        //Telefonas telefonas01 = new Telefonas("8-5-123 12345");
        Mobilus mobilus01 = new Mobilus("8-659 -44444", "456 456 456");
        Taksofonas taksofonas01 = new Taksofonas(0.5549);

        // Telefonas[numeris: xxxxxxx, melodija: xxxxx]
//        System.out.println(telefonas01);
//        System.out.println("===========");
//        telefonas01.paskambink("8-46-55555"); //kam skambina
//        System.out.println("===========");
//        telefonas01.setMelodija("lia-lia-lia");
//        System.out.println(telefonas01);

        // Mobilus paveldi viska is klases Telefonas
        System.out.println("+++++++++++++++++++++");
        System.out.println(mobilus01);
        mobilus01.paskambink("8-659-44444");
        mobilus01.setMelodija("bla bla bla");
        System.out.println(mobilus01);

        System.out.println("==========================");
        System.out.println(mobilus01);
        mobilus01.fotografuok();
        mobilus01.fotografuok();
        mobilus01.fotografuok();
        System.out.println(mobilus01);


        System.out.println("==========================");
        System.out.println(taksofonas01);
        taksofonas01.paskambink("123456789");
        System.out.println(taksofonas01);

        System.out.println("==========================");
        taksofonas01.paskambink("4444444444");
        System.out.println("===========");
        System.out.println(taksofonas01);
        taksofonas01.papildykLikuti(0.60);
        System.out.println(taksofonas01);
        taksofonas01.paskambink("4444444444");
        taksofonas01.paskambink("4444444444");
        System.out.println(taksofonas01);












    }
}
