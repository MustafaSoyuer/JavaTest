package com.mustafa.controller;

import org.junit.jupiter.api.Test;

public class EkranaYazTest {
    private EkranaYaz ekranaYaz;
    /**
     *  printScreen
     *  2 durum bulunmaktadır.
     *  1. durum mesajın dolu gönderilmesi
     *  2. durum mesajın null olması
     *
     */
    @Test
    void printScreenFullTestSmall(){
        ekranaYaz = new EkranaYaz();
        ekranaYaz.printScreen("merhaba");
    }

    @Test
    void printScreenFullTestXXXLarge(){
        ekranaYaz = new EkranaYaz();
        ekranaYaz.printScreen("merhaba nasılsın");
    }

    @Test
    void printScreenNullTest(){
        ekranaYaz = new EkranaYaz();
        ekranaYaz.printScreen(null);
    }

}
