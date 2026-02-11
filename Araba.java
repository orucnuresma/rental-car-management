/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package homework;

/**
 * @file  homework 
* @description test classımızda arabalarımız için girilmesi gereken özelliklerimizi girdik
* @date 24-05-2024
* @author Esmanur Oruç esmanur.oruc@stu.fsm.edu.tr
 */
public class Araba {
    private String arabaAdi;
    private double fiyat;
    private int adet;
    private int modelYili;
    private String renk;

    //constructor yaptık parametreleri girip araba üreteceğiz mainde 
    public Araba(String arabaAdi, double fiyat, int adet) {
        this.arabaAdi = arabaAdi;
        this.fiyat = fiyat;
        this.adet = adet;
    }
   // farklı bi constructor farklı  parametrelere sahip 
    public Araba(String arabaAdi, double fiyat, int adet, int modelYili, String renk) {
        this.arabaAdi = arabaAdi;
        this.fiyat = fiyat;
        this.adet = adet;
        this.modelYili = modelYili;
        this.renk = renk;
    }

    public String getArabaAdi() {
        return arabaAdi;
    }

    public void setArabaAdi(String arabaAdi) {
        this.arabaAdi = arabaAdi;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public int getModelYili() {
        return modelYili;
    }

    public void setModelYili(int modelYili) {
        this.modelYili = modelYili;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    
    public void arabaGoster() {
        System.out.println("Araba Adı: " + arabaAdi);
        System.out.println("Fiyat: " + fiyat);
        System.out.println("Adet: " + adet);
        if (modelYili != 0) { // bi constructor da model yili ve renk parametremiz olmadığı için ilk önce bi kontrol ediyoruz var mı yok mu diye
            System.out.println("Model Yılı: " + modelYili);
        }
        if (renk != null ) { // renk i.in de null kontrolü yapıyoruz
            System.out.println("Renk: " + renk);
        }
    }
    @Override
    public String toString() {
        return "Araba [arabaAdi=" + arabaAdi + ", fiyat=" + fiyat + ", adet=" + adet + ", modelYili=" + modelYili + ", renk=" + renk + "]";
    }
  
}