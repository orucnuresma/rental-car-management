/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;

/**
 *
 * @author esmanur
 */
public class Test2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Arabalar ve Özellikleri");
        Araba araba1 = new Araba("Mercedes", 10000, 6);
        araba1.arabaGoster();
        System.out.println("******************************************************************");
        Araba araba2 = new Araba("Bmw", 6000, 4, 2005, "siyah");
        araba2.arabaGoster();
        System.out.println("******************************************************************");
        Otomobil o1 = new Otomobil("Clio", 4000, 10, 2020, "beyaz", 18);
        o1.arabaGoster();
        System.out.println("******************************************************************");
        Otomobil o2 = new Otomobil("Honda", 2000, 5, 2019, "siyah", 18);
        o2.arabaGoster();
        System.out.println("******************************************************************");
        Minibus M1 = new Minibus("walkswagen", 9000, 3, 2010, "siyah", 7);
        M1.arabaGoster();
        System.out.println("******************************************************************");
        Minibus m2 = new Minibus("Toyota", 3000, 4, 2005, "siyah", 7);
        m2.arabaGoster();
        System.out.println("******************************************************************");
        TicariArac t1 = new TicariArac("fiat", 8000, 3, 2000, "pembe", 90);
        t1.arabaGoster();
        System.out.println("******************************************************************");
        TicariArac t2 = new TicariArac("skoda", 1000, 1, 2023, "gri", 60);
        t2.arabaGoster();

        System.out.println("******************************************************************");
        System.out.println("Kişiler");

        GencKisi Genc1 = new GencKisi("Esamnur", "oruç", 10000, 10);
        Genc1.LimitleriGoster();

        GencKisi Genc2 = new GencKisi("Yusuf", "said", 15000, 10);
        Genc2.LimitleriGoster();

        System.out.println("******************************************************************");

        OlgunKisi Olgun1 = new OlgunKisi("Yuşa", "Oruç", 100000, 10);
        Olgun1.LimitleriGoster();

        OlgunKisi Olgun2 = new OlgunKisi("Necati", "Oruç", 25000, 10);
        Olgun2.LimitleriGoster();

        System.out.println("******************************************************************");

        KiralamaFirmasi Firma = new KiralamaFirmasi("Gezegen rent a car", Olgun2, 10);

        Firma.yeniArabaEkle(araba1);
        System.out.println("******************************************************************");
        Firma.yeniArabaEkle(araba2);
        System.out.println("******************************************************************");
        Firma.yeniArabaEkle(o1);
        System.out.println("******************************************************************");
        Firma.yeniArabaEkle(o2);
        System.out.println("******************************************************************");
        Firma.yeniArabaEkle(M1);
        System.out.println("******************************************************************");
        Firma.yeniArabaEkle(m2);
        System.out.println("******************************************************************");
        Firma.yeniArabaEkle(t1);
        System.out.println("******************************************************************");
        Firma.yeniArabaEkle(t2);
        System.out.println("******************************************************************");

        Firma.arabaGuncelle("Mercedes", 15000, 10);
        System.out.println("******************************************************************");

        Firma.arabaSil("fiat");
        System.out.println("******************************************************************");

        Firma.arabalariYazdir();
        System.out.println("******************************************************************");

        Firma.arabaYazdir("passat");
        Firma.arabaYazdir("sKoDa"); // BÜYÜK KÜÇÜK HARF
        System.out.println("******************************************************************");

        Firma.arabaKirala(Genc2, "Skoda");
        System.out.println("******************************************************************");

        Firma.arabaKirala(Olgun1, "Skoda");
        System.out.println("******************************************************************");

        Firma.arabaKirala(Olgun1, "Mercedes");
        Firma.arabaKirala(Olgun1, "BmW");
        Firma.arabaKirala(Olgun1, "Bmw");
        Firma.arabaKirala(Olgun1, "clio");
        Firma.arabaKirala(Olgun1, "clio");
        Firma.arabaKirala(Olgun1, "clio");
        Firma.arabaKirala(Olgun1, "clio");
        Firma.arabaKirala(Olgun1, "clio");
        Firma.arabaKirala(Olgun1, "clio");
        Firma.arabaKirala(Olgun1, "clio");
        System.out.println("******************************************************************");

        Firma.firmaToplamBakiyeHesapla();
        System.out.println("******************************************************************");

        Firma.guncelKiralananArabalariGoster();
        System.out.println("******************************************************************");

        Araba araba3 = new Araba("merco", 3000, 5);
        Firma.guncelKiralananArabalariGoster();

        System.out.println("******************************************************************");

        Firma.guncelKiralananArabalariGoster("Yuşa", "Oruç");
        System.out.println("******************************************************************");

        Firma.arabaIade(Olgun1, "Mercedes");
        System.out.println("******************************************************************");

        Firma.guncelKiralananArabalariGoster("Yuşa", "Oruç");
        System.out.println("******************************************************************");
        Firma.arabaIade(Olgun1, "Clio");
        System.out.println("******************************************************************");
        Firma.guncelKiralananArabalariGoster("Yuşa", "Oruç");
        System.out.println("******************************************************************");
        Firma.arabaIade(Olgun1, "Clio");
        System.out.println("******************************************************************");
        Firma.guncelKiralananArabalariGoster("Yuşa", "Oruç");

        //Firma.arabaIade(Olgun1, "Bmw");
        System.out.println("******************************************************************");

        Firma.guncelKiralananArabalariGoster("Yuşa", "Oruç");

    }

}
