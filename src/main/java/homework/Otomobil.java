/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
* @file  homework 
* @description otomobil arabalarımız için özel olarak tanımladığımız yaslimiti ve burada paramaetrelerimizi tanımlıyoruz
* @date 24-05-2024
* @author Esmanur Oruç esmanur.oruc@stu.fsm.edu.tr
 */ 
    public class Otomobil extends Araba {

    
    public int yasLimiti;

    public Otomobil( String arabaAdi, double fiyat, int adet, int modelYili, String renk, int yasLimit) {
        super(arabaAdi, fiyat, adet, modelYili, renk);
        this.yasLimiti = yasLimit;
    }
    public void setYasLimit(int yasLimit) {
        this.yasLimiti = yasLimit;
    }
    public int getYasLimit() {
        return yasLimiti;
    }

    @Override
    public void arabaGoster() {
        super.arabaGoster();
        System.out.println("Yaş Limiti: " + yasLimiti);
        }
    
   @Override
    public String toString() {
        return super.toString() + ", Otomobil [yasLimit=" + yasLimiti + "]";
    }
    }
   
    
