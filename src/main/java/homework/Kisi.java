/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.Arrays;

/**
 *
* @file  homework 
* @description Kisinin genel taslaığını yapıp özelliklerini yazdık.
* @date 24-05-2024
* @author Esmanur Oruç esmanur.oruc@stu.fsm.edu.tr
 */
public class Kisi {
    
    private String adi;
    private String soyadi;
    private double bakiye;
    private Araba[] kiralamaGecmisi;
    private Araba[] guncelKiraladigiArac;
    private int kiralamaLimiti;
    private int guncelkiralananarabalar;

    public Kisi(String adi, String soyadi, double bakiye, int kiralamaLimiti) {
       this.adi = adi; // Adı atama
        this.soyadi = soyadi; // Soyadı atama
        this.bakiye = bakiye; // Bakiye atama
        this.kiralamaGecmisi = new Araba[100]; // Kiralama geçmişi için 100 elemanlı dizi oluşturma
        this.guncelKiraladigiArac = new Araba[kiralamaLimiti]; // Kiralama limiti kadar güncel araç dizisi oluşturma
        this.kiralamaLimiti = kiralamaLimiti; // Kiralama limitini atama
        this.guncelkiralananarabalar = 0; // Güncel kiralanan araç sayısını sıfır olarak başlatma
    }
    
    public String getAdi() {
        return adi;
    }
    public void setAdi(String adi) {
        this.adi = adi; 
    }
   public String getSoyadi() {
        return soyadi;
    }
    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }
    public double getBakiye() {
        return bakiye;
    }
    public void setBakiye(double bakiye) {
        this.bakiye = bakiye;
    }
    public Araba[] getKiralamaGecmisi() {
       
        return kiralamaGecmisi;
    }

    public Araba[] getGuncelKiraladigiArac() {
        return guncelKiraladigiArac;
    }

    public int getKiralamaLimiti() {
        return kiralamaLimiti;
    }

    public int getguncelkiralananarabalar() {
        return this.guncelkiralananarabalar;
    }

    public void setGuncelkiralananaraba(int guncelkiralananarabalar) {
        this.guncelkiralananarabalar =guncelkiralananarabalar;
    }

    
    public void KiralamaGecmisiniGoster() {
        System.out.println(adi + " " + soyadi + " adlı kişinin kiralama geçmişi:");
        for (int i = 0; i < kiralamaGecmisi.length; i++) {
            if (kiralamaGecmisi[i] != null) {
                kiralamaGecmisi[i].arabaGoster();
                System.out.println();
            }
        }
    }

        
    
public void kiralamaGecmisiniGoster(String arabaTipi) {
        for (int i = 0; i < kiralamaGecmisi.length; i++) {
            if (kiralamaGecmisi[i] != null) {
                switch (arabaTipi.toLowerCase()) {
                    case "otomobil":
                        if (kiralamaGecmisi[i] instanceof Otomobil) {
                            kiralamaGecmisi[i].arabaGoster();
                            System.out.println();
                        }
                        break;
                    case "minibus":
                        if (kiralamaGecmisi[i] instanceof Minibus) {
                            kiralamaGecmisi[i].arabaGoster();
                            System.out.println();
                        }
                        break;
                    case "ticariarac":
                        if (kiralamaGecmisi[i] instanceof TicariArac) {
                            kiralamaGecmisi[i].arabaGoster();
                            System.out.println();
                        }
                        break;
                }
            }
        }
      
   

}



 
   @Override
    public String toString() {
        return "Kisi [adi=" + adi + ", soyadi=" + soyadi + ", bakiye=" + bakiye 
            + ", kiralamaGecmisi=" + Arrays.toString(kiralamaGecmisi) 
            + ", guncelKiraladigiArac=" + Arrays.toString(guncelKiraladigiArac) 
            + ", kiralamaLimiti=" + kiralamaLimiti 
            + ", guncelkiralananarabalar=" + guncelkiralananarabalar + "]";
    }
}
