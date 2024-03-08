package com.mustafa.controller;

import org.junit.jupiter.api.Test;

import java.time.Duration;

import static org.junit.jupiter.api.Assertions.*;

public class Test003_Assertions {

    /**
     *  Kontrol etmek istediğimiz durumları karşılaktırabileceğimiz, büyüklük küçüklük durumları
     *  eşitlikler, hata olup olmadığı, kodun belli zaman aralığında çalışıp çalışmadığı gibi tüm
     *  durumları kontrol etmek için Assertion.* kullanılır.
     *  Assertions sınıfını statik olarak import etmek doğru olavaktır.
     */
    @Test
    void test01(){
        int s1 = 5, s2=3, toplam=0;
        toplam = s1 + s2;
        assertEquals(8,toplam); // birşeylerin olup olmadığı, eşit mi değil mi
        assertEquals(8,toplam,"Toplam degeri 8 olmalı");
    }


    @Test
    void test02(){
        int s1 = 5, s2=3, bolum=0;
        bolum = s1 / s2;
        assertTrue(bolum>1); // bu buna eşit mi küçük gibi kural yazmam lazım eşitlik için assertEquals kullanmak daha iyi. büyük, küçük, birden fazla durum için assertTrue
        assertTrue(bolum>1,"Bolum 1 den buyuk olmali");
    }



    @Test
    void test03(){
        Exception exception = assertThrows(Exception.class, ()->{ // hata ve metot..Metot hata fırlatırsa exceptiona setliyor
            int s1 = 3, s2=0;
            int bolum = s1 / s2;
            System.out.println("Bolum = " + bolum);
        });
        System.out.println("Hata Mesaji = " + exception);
        assertEquals("/ by zero",exception.getMessage()); // hata mesajını kontrol et.yukarda gelen exception ile aynı mı
    }


    @Test
    void test04(){
        assertTimeout(Duration.ofMillis(400),()->{ // kod kaç ms den aşağı olmalı, metot.. kodun süresini test et
            System.out.println("Kod basladi");
            Thread.sleep(394);
            System.out.println("Kod bitti");
        });
    }


    @Test
    void test05(){
        String sonuc = assertTimeout(Duration.ofMillis(400), ()->{
            return "islem bitti";
        });
        assertEquals("islem bitti",sonuc);
    }

}
