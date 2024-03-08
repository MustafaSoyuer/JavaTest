package com.mustafa.controller;

import org.junit.jupiter.api.*;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class Test001_YasamDongusu {

    /**
     *  Test işlemlerinde, her case yani @Test anatasyonuna sahip metod kendi özelinde
     *  çalışır. Diğer testler ile bir bağı yoktur. Ancak sınıf içinfr tanımlanan
     *  nesneleri tüketebilirler. Bu nedenle sınıf içinde kullanılacak olan bileşenlerin
     *  başlatılması ve her test olgusu için revize edilmesi işlemleri için bir dizi
     *  işlem sıralaması başlatmalısınız. Bunu yapmak için şu anatasyonlar kullanılır.
     * @BeforeAll -> ilk çalışan metod
     * @BeforeEach -> her test için tekrar tekrar calısan ilk metod
     * @AfterEach -> her test sonrasında tekrar tekrar calısan metod
     * @AfterAll -> son calısan metod
     */


    private static int sayac = 0;

    @BeforeAll
    void ilkCalisanMetod(){
        System.out.println("Ilk Calisan metod");
    }

    @BeforeEach
    void herTestIcinTekrarCalisir(){
        System.out.println("Ben tekrar tekrar calisirim.");
    }


    @Test
    void basariliTestOrnegi(){
        sayac++;
        System.out.println("Test yaptim "+sayac);
    }

    @Test
    void basariliTestOrnegi2(){
        sayac++;
        System.out.println("Test yaptim "+sayac);
    }

    @Test
    void basariliTestOrnegi3(){
        sayac++;
        System.out.println("Test yaptim "+sayac);
    }

    @Test
    void basarisizTestOrnegi(){
        sayac++;
        Assertions.fail("Olmadı yaa");
        System.out.println("Test yaptım ama olmadı " +sayac);
    }

    @Test
    @Disabled("Artık calısmıyor")
    void kapatilanTestOrnegi(){
        sayac++;
        System.out.println("Ben artık calısmıyorum. " +sayac);
    }

    @AfterEach
    void testSonuCalisanMetod(){
        System.out.println("Her testten sonra ben calisirim ");
    }

    @AfterAll
    void enSonCalisanMetod(){
        System.out.println("EN SON CALISIRIM");
    }

}
