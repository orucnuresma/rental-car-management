/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
* @file  homework 
* @description ticariarac'larımız için alacağımız parametler burda tanımlıypruz
* @date 24-05-2024
* @author Esmanur Oruç esmanur.oruc@stu.fsm.edu.tr*/
public class TicariArac extends Araba{
    private int  yukKapasitesi;
    
    public TicariArac ( String arabaAdi, double fiyat, int adet, int modelYili, String renk,int YukKapasitesi){
        super(arabaAdi,fiyat,adet,modelYili,renk);
        this.yukKapasitesi = YukKapasitesi;
    }
    public int getyukKapasitesi(){
        return yukKapasitesi;
    }
    
     @Override
    public void arabaGoster() {
        super.arabaGoster();
        System.out.println("Yük Kapasitesi: " + yukKapasitesi);
    }

    
       @Override
    public String toString() {
        return super.toString() + ", TicariArac [yukKapasitesi=" + yukKapasitesi + "]";
    }
}
