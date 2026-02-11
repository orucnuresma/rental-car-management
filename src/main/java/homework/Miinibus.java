/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 * @file homework
 * @description minibüs classlarımız için özel olarak tanımladığımız
 * değişkenlerimizi ve constructorlarımızı tanımlıyoruz
 * @date 24-05-2024
 * @author Esmanur Oruç esmanur.oruc@stu.fsm.edu.tr
 */
public class Minibus extends Araba {

    String arabaMarkaModeli;
    int kisiKapasite;

    public Minibus(String arabaAdi, double fiyat, int adet, int modelYili, String renk, int kisiKapasitesi) {
        super(arabaAdi, fiyat, adet, modelYili, renk);
        this.kisiKapasite = kisiKapasitesi;
        this.arabaMarkaModeli = arabaMarkaModeli;
    }

    public String getArabaMarkaModeli() {
        return arabaMarkaModeli;
    }

    public void setArabaMarkaModeli(String arabaMarkaModeli) {
        this.arabaMarkaModeli = arabaMarkaModeli;
    }

    public void setKisiKapasite(int kisiKapasite) {
        this.kisiKapasite = kisiKapasite;
    }

    public int getKisiKapasite() {
        return kisiKapasite;
    }
 @Override
    public void arabaGoster() {
        super.arabaGoster();
        System.out.println("Kişi Kapasitesi: " + kisiKapasite);
    }

    @Override
    public String toString() {
        return super.toString() + ", Minibus [arabaMarkaModeli=" + arabaMarkaModeli + ", kisiKapasite=" + kisiKapasite + "]";
    }    
}
