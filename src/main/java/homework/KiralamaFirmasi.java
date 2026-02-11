/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package homework;

import java.util.Arrays;

/**
 * @file homework
 * @description Firmamızın yaptığı işlemleri tanımladık
 * @date 24-05-2024
 * @author Esmanur Oruç esmanur.oruc@stu.fsm.edu.tr
 */
public class KiralamaFirmasi {

    private String firmaAdi;
    private int arabaSayisi;
    private Kisi sahibi;
    private Araba[] arabaListesi;
    private Araba[] kiralananArabalar;
    private Kisi[] musteriListesi;
    private int firmakiralamaLimiti;
    private double gelir;
    private int kiralananArabaSayisi = 0; // Firmanın güncel olarak kiraladığı araba sayısını takip eder

    public double getGelir() {
        return gelir;
    }

    public void setGelir(double gelir) {
        this.gelir = gelir;
    }

    public KiralamaFirmasi(String adi, Kisi sahibi, int firmakiralamaLimiti) {
        this.firmaAdi = adi;
        this.sahibi = sahibi;
        this.firmakiralamaLimiti = firmakiralamaLimiti;
        this.arabaListesi = new Araba[100];
        this.kiralananArabalar = new Araba[firmakiralamaLimiti];
        this.musteriListesi = new Kisi[200];
        this.arabaSayisi = 0;
        this.gelir = 0.0;

    }

    public boolean yeniArabaEkle(Araba araba) {
        for (int i = 0; i < arabaListesi.length; i++) {
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equalsIgnoreCase(araba.getArabaAdi())) { // araba listesinde var mı kontrolu
                arabaListesi[i].setAdet(arabaListesi[i].getAdet() + araba.getAdet()); // araba listesinde adetiyle topluyoruz 
                System.out.println("Araba adetini arttı!");
                return true;
            }
        }
        if (arabaSayisi < 100) {
            arabaListesi[arabaSayisi] = araba;  // aldığımız arabayı araba listesine ekleyiyoruz
            arabaSayisi++; // arabayı sayısını arttırıyoruz
            System.out.println("İstenilen araba Firmaya eklendi!");

            return true;
        } else // araba sayımız 100'ün üstünde ise daha almıyoruz bu yüzden false döndürüyoruz
        {
            System.out.println("Bu Firmaya daha fazla araba eklenemez!");
        }

        return false;

    }

    public void arabaSil(String arabaAdi) {
        Araba araba = null;
        for (int i = 0; i < arabaSayisi; i++) {
            if (arabaListesi[i].getArabaAdi().equalsIgnoreCase(arabaAdi)) {
                araba = arabaListesi[i];
                break;
            }
        }

        if (araba == null) {
            System.out.println(arabaAdi +" Silinmek istenen araba firmada bulunamadı");
        } else {
            for (int i = 0; i < arabaSayisi; i++) {
                if (kiralananArabalar[i] != null && kiralananArabalar[i].getArabaAdi().equalsIgnoreCase(arabaAdi)) {
                    System.out.println("Silinmek istenen araba şu anda müşteri tarafından kiralnamış durumda");
                    return;
                }
                if (araba == arabaListesi[i]) {
                    arabaListesi[i] = null;
                    arabaSayisi--;
                    System.out.println("Silinmek istenen araba başarıyla silinmiştir. ");
                    return;
                }
            }
        }
    }

    public void arabalariYazdir() { //araba bir nesne Araba classından üretilmiş yazılan : ise for each döngüsünde kullanılan ögedir.
        for (Araba araba : arabaListesi) { // for each loop u ile yazdırıyoruz değer değiştirme ekleme çıkarma işlemleri olmadıpı için
            if (araba != null) {
                System.out.println("Araba adı : " + araba.getArabaAdi());
            }
        }
    }

    public void arabaYazdir(String arabaAdi) {
        boolean arabaBulundu = false;
        for (Araba araba : arabaListesi) {
            if (araba != null && araba.getArabaAdi().equalsIgnoreCase(arabaAdi)) {
                System.out.println("Arabanın adı: " + araba.getArabaAdi());
                arabaBulundu = true;
                break;
            }
        }
        if (!arabaBulundu) {
            System.out.println("Araba firmada yok.");
        }
    }

    public boolean arabaKirala(Kisi sahis, String arabadi) {
        System.out.println("Araba kiralama burda");
        for (int i = 0; i < arabaListesi.length; i++) { // arabaListemiz kadar dönücek
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equalsIgnoreCase(arabadi)) { // ignoreCase deme sebebimiz küçük ya da büyük harf gözetmeksizin kontrol sağlamak
                Araba kiralanacakAraba = arabaListesi[i]; // Kiralanacak araba değişkeni tanımlandı

                if (kiralananArabaSayisi >= firmakiralamaLimiti) { // Firma kiralama limiti kontrol edildi
                    System.out.println("Firmanın araba kiralama limiti dolmuştur");
                    return false;
                }
                if (sahis.getguncelkiralananarabalar() >= sahis.getKiralamaLimiti()) { // Müşterinin kiralama limiti kontrol edildi
                    System.out.println("Kişinin kiralama limiti dolmuştur");
                    return false;
                }
                if (kiralanacakAraba.getAdet() == 0) { // Arabanın adedi kontrol edildi
                    System.out.println("Araba firmada var ama başka müşterilere kiralanmış durumda.");
                    return false;
                }
                if (sahis.getBakiye() < kiralanacakAraba.getFiyat()) { // Müşterinin bakiyesi kontrol edildi
                    System.out.println("Yetersiz bakiye.");
                    return false;
                }

                for (int j = 0; j < sahis.getGuncelKiraladigiArac().length; j++) { // Müşterinin güncel kiraladığı araçlar dizisi üzerinde dönüş yapılıyor
                    if (sahis.getGuncelKiraladigiArac()[j] == null) { // Boş bir yer bulunduğunda araba ekleniyor
                        sahis.getGuncelKiraladigiArac()[j] = kiralanacakAraba;
                        
                    }
                    musteriListesi[j] = sahis;
                   // System.out.println("MUSTERİ LİSTESİ BASILDI");
                   // System.out.println(Arrays.toString(musteriListesi));
                }

                kiralanacakAraba.setAdet(kiralanacakAraba.getAdet() - 1); // Kiralanacak arabanın adedi azaltılıyor
                kiralananArabaSayisi++; // Kiralanan araba sayısı arttırılıyor
                sahis.setBakiye(sahis.getBakiye() - kiralanacakAraba.getFiyat()); // Müşterinin bakiyesinden araba fiyatı çıkarılıyor
                this.gelir += kiralanacakAraba.getFiyat(); // Firmanın gelirine araba fiyatı ekleniyor
                sahis.setGuncelkiralananaraba(sahis.getguncelkiralananarabalar() + 1); // Müşterinin güncel kiraladığı araba sayısı arttırılıyor
                System.out.println("Araba başarıyla kiralandı.");
                return true;
            }
        }
        System.out.println("Araba firmada yok");
        return false;
    }

    public boolean arabaIade(Kisi kisi, String arabaAdi) {
        System.out.println("ARABA İADE BURADA");
        System.out.println(Arrays.toString(kisi.getGuncelKiraladigiArac()));
        for (int i = 0; i < arabaListesi.length; i++) { //   araba sayısı kadar dönücek
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equalsIgnoreCase(arabaAdi)) { // araba adını küçük büyük harf göz etmeden eşitlik kontrolü 
                 if (Arrays.toString(kisi.getGuncelKiraladigiArac()) != null) {
                    double iadeFiyati = arabaListesi[i].getFiyat(); // iade edilen arabanın fiyatını al
                    kisi.getGuncelKiraladigiArac()[i] = null; // kiralanan araba listesinden çıkarttık 
                    kisi.setBakiye(kisi.getBakiye() + iadeFiyati); // kişinin bakiyesine araba fiyatı kadar para ekledik
                    this.gelir -= iadeFiyati; // firma gelirinden araba fiyatını çıkartıyoruz
                    kiralananArabaSayisi--; // Kiralanan araba sayısını azaltık
                    kisi.setGuncelkiralananaraba(kisi.getguncelkiralananarabalar() - 1);// Kişinin güncel kiralanan araba sayısını güncelledik
                    System.out.println("Araba iade işlemi başarılı.");
                    return true;
                }
            }
        }
        System.out.println("Araba firmada yok, yanlış firma!");
        return false;
    }

    public double firmaToplamBakiyeHesapla() {
        System.out.println("Firmanın toplam geliri: " + this.gelir); //this.gelir döndürüyoruz gelir de olabilirdi
        return this.gelir;

    }

    public void guncelKiralananArabalariGoster() {
        for (Araba araba : arabaListesi) {
            if (araba != null) {
                System.out.println(araba);
            }
        }
    }

    public void guncelKiralananArabalariGoster(String kisiAdi, String kisiSoyadi) {
        Araba[] kiraladigiAraclar = null;
        for (Kisi musterileri : musteriListesi) { // müşteriListesimiz zaten kiralanan arabalar kadardır
            if (musterileri != null
                    && musterileri.getAdi().equals(kisiAdi)
                    && musterileri.getSoyadi().equals(kisiSoyadi)) { // musterilistesinde dönücek ve burda koştuğum şartları kontrol edicek

                kiraladigiAraclar = musterileri.getGuncelKiraladigiArac();
            }
        }
        if (kiraladigiAraclar != null) {
            for (Araba k : kiraladigiAraclar) {
                if (k != null && k.getArabaAdi() != null) {
                    System.out.println(k.getArabaAdi());
                }
            }
        } else {
            System.out.println("Kişi araba kiralamadi");
        }
    }

    public boolean arabaGuncelle(String arabaAdi, double yeniFiyat, int yeniAdet) {
        for (int i = 0; i < arabaSayisi; i++) {
            if (arabaListesi[i] != null && arabaListesi[i].getArabaAdi().equals(arabaAdi)) { // burada girilen araba adıyla eşleşip eşleşmediğne dair kontrol gerçekleştiriyoruz.
                arabaListesi[i].setFiyat(yeniFiyat); // bu kodlarda parametre olarak aldığımız yeniAdet ve yeniFiyatlarımızı set metoduyla gerekli yerlere atarız.
                arabaListesi[i].setAdet(yeniAdet);

                System.out.println("Güncelleme işlemi başarıyla gerçekleştirilmiştir.");
                System.out.println("Araba adeti : " + arabaListesi[i].getAdet());
                System.out.println("Araba Fiyatı : " + arabaListesi[i].getFiyat());
                return true;
            }
        }

        System.out.println("Güncellenmek istenen araba firmada bulunamadı.");

        return false;
    }

    @Override
    public String toString() {
        return "KiralamaFirmasi [firmaAdi=" + firmaAdi + ", arabaSayisi=" + arabaSayisi + ", sahibi=" + sahibi + ", arabaListesi=" + Arrays.toString(arabaListesi) + ", kiralananArabalar=" + Arrays.toString(kiralananArabalar) + ", musteriListesi=" + Arrays.toString(musteriListesi) + ", kiralamaLimiti=" + firmakiralamaLimiti + ", gelir=" + gelir + "]";
    }

}
