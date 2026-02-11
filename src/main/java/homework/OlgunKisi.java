/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
 *
  @file  homework 
* @description Kisi classımızdan extends ettiğimiz olgunkisinin özellikleride burda tanımlıyoruz
* @date 24-05-2024
* @author Esmanur Oruç esmanur.oruc@stu.fsm.edu.tr*/
public class OlgunKisi extends Kisi {
   private final int KİRALAMALİMİTİ =10 ;
    
    public OlgunKisi(String adi, String soyadi, double bakiye, int kiralamaLimiti) {
        super(adi, soyadi, bakiye, kiralamaLimiti);
       
    }
     @Override
    public String toString() {
        return super.toString() + ", OlgunKisi [kiralamaLimiti=" + KİRALAMALİMİTİ + "]";
    }
    
    public void LimitleriGoster(){
        System.out.println(getAdi()+"  Kiralama limiti; "+KİRALAMALİMİTİ); //kalan kiralama limiti yazdır
   
    }
}
