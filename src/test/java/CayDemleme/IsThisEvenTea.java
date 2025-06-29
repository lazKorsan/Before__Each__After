package CayDemleme;

import java.util.Arrays;
import java.util.List;

public class IsThisEvenTea {

    // Çay demleme elemanları
    private String cay;
    private String caydanlik;
    private String tup;
    private String ocak;
    private String cakmak;
    private String su;
    private String seker;
    private String caySaklamaKabi;

    // Ev halkı listesi
    List<String> cayIcenler;

    public IsThisEvenTea() {
        // Başlangıç kontrolleri
        MalzemeleriKontrolEt();

        ekipmanlariHazirla();
    }

    private void MalzemeleriKontrolEt() {
        System.out.println("Malzemeler kontrol ediliyor...");
        this.cay = "Siyah çay";
        this.su = "Temiz su";
        this.seker = "Beyaz şeker";
    }

    private void ekipmanlariHazirla() {
        System.out.println("Ekipman hazırlanıyor...");
        this.caydanlik = "Temiz çaydanlık";
        this.tup = "Dolu ve güvenli tüp";
        this.ocak = "Çalışır durumda ocak";
        this.cakmak = "Çalışır çakmak";
        this.caySaklamaKabi = "Hazır çay saklama kabı";
    }

    public void demlemeSuresi() {
        System.out.println("Çay demleme süreci başlıyor...");

        // 1. Suyu doldur
        System.out.println("1. Demlik kısmını tezgahta kuru ve temiz bir yere koy");

        try {
            Thread.sleep(3000); // 3 saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2. çaydanlığın altına suyu doldur

        System.out.println("1. Su(çaydanlığın alt kısmı) haznesi  içine 5 kişilik çay suyu koy...");
        try {
            Thread.sleep(3000); // 3 saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 3. çaydanlığın alt haznesini , çayın demleneceği gözün üzerine koy

        System.out.println("3.Su Dolu  Çaydanlığın alt haznesini ," +
                " çayın demleneceği gözün üzerine koy...");
        try {
            Thread.sleep(3000); // 3 saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 4. demlik kısmını alt haznenin uzerine koy
        System.out.println("4.Demlik kısmını , su dolu haznenin üzerine " +
                "düzgün bir şekilde yerleştir ...");
        try {
            Thread.sleep(3000); // 3 saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 5. Çaydanlığın bulunduğu  ocağın gözünü  aç ve gazı yanar hale getir
        System.out.println("5. Çaydanlığın bulunduğu  ocağın gözünü  aç " +
                "ve gazı yanar hale getir (ocak kendinden manyetolu değilse " +
                "..." +
                 "çakmağını çakarak ocak gazını yanar hale geitri");
        try {
            Thread.sleep(3000); // 3 saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 1. Su kaynatma
        System.out.println("1. Su kaynatılıyor...");
        try {
            Thread.sleep(3000); // 3 saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 2. Çay ekleme
        System.out.println("2. su kaynamaya başlayınca:" );
        try {
            Thread.sleep(5000); // 5 saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println( "Demlik kısmını kuru ve temiz bir yere koy...") ;
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Demliğin kapağını aç");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Demlik kapağını temiz bir yere koy");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("ÇaySaklama Kabını güvenli bir şekilde aç");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("çayı boşa dökmeden ;Demlik bölmesine 3 tepeleme çorba kaşığı çay koy");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("dEMLİk kapağını Demlik üzerine yerleştir");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Ocağın altını 7dk boyunca kapalı tut");
        try {
            Thread.sleep(700); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("7 dakika sonra :");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Çaydınlığın üst bölmesini kuru ve temiz bir yere koy");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Dinlenmiş alt bölmeden Demlik üzerine taşmayacak şekilde su ilave et.");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Saatini kontrol et. Demliğe su koyduktan 20 dk sonra çay hazır");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Çaydanlığın alt bölmesine dikkatli bir şekilde temiz su ekle");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("Suyun kaynamasını bekle ");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Su kaynayınca , ocağın altını kıs ");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("20 dakika doldu Afiyet olsun");
        try {
            Thread.sleep(800); // 800 mili saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }










        // 3. Demlenme
        System.out.println("3. 7 dakika demleniyor...");
        try {
            Thread.sleep(5000); // 5 saniye simülasyon
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // 4. Alt demlik hazırlığı
        System.out.println("4. Alt demliğe taze su ekleniyor...");

        // 5. Servis hazırlığı
        System.out.println("5. Çay 20 dakika sonra servise hazır!");
    }

    public static void main(String[] args) {
        IsThisEvenTea cayDemleme = new IsThisEvenTea();
        cayDemleme.demlemeSuresi();
    }
}