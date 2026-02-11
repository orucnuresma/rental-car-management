/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

/**
* @file  homework 
* @description Kisi classından extend ettiğimiz genc kisi bu kişler için limitler tanımladık
* @date 24-05-2024
* @author Esmanur Oruç esmanur.oruc@stu.fsm.edu.tr
 */
public class GencKisi  extends Kisi{
    private final double bakiyeLimiti = 50000;
    private final int kiralamaLimiti = 10;
   
    
    
    public GencKisi(String adi, String soyadi, double bakiye,int kiralamaLimiti) {
        super(adi, soyadi, bakiye, kiralamaLimiti);
        
   
       
    }
    
    public void LimitleriGoster(){
        
        System.out.println(getAdi()+"  kalan bakiye "+ (bakiyeLimiti ));
        System.out.println(getAdi()+"  kiralama limiti "+kiralamaLimiti);
    }
     @Override
    public String toString() {
        return super.toString() + ", GencKisi [bakiyeLimiti=" + bakiyeLimiti + ", kiralamaLimiti=" + kiralamaLimiti + "]";
    }

}
