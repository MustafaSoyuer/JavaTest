package com.mustafa.service;

import com.mustafa.exceptions.IslemException;
import com.mustafa.utility.IslemType;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IslemServiceTest {

    private final IslemService islemService;

    public IslemServiceTest() {
        this.islemService = new IslemService();
    }

    @Test
    void islemToplamSuccessTest() {
        int toplam = islemService.islem(IslemType.TOPLAMA,3,4,57,7);
//        assertEquals(70, toplam); // bu işlemin sonucu bu olmalı bunu kontrol et
        assertEquals(71, toplam, "Toplam degeri 70 olmalı");
        System.out.println("Toplam = " + toplam);
    }

    @Test
    void islemBolmeSuccessTest() {
        int bolum = islemService.islem(IslemType.BOLME,930,6);
        assertTrue(bolum >= 155,()->"Bolum 155 ten buyuk olmali"); // bu doğru mu? bu buna eşit mi?
    }


    @Test
    void IslemTopluSuccessTest() {
        assertAll("Coklu test ornegi",
                ()->assertEquals(5, islemService.islem(IslemType.TOPLAMA,2,3)),
                ()->assertTrue(islemService.islem(IslemType.CARPMA, 6,9) > 50)
                );
    }



    @Test
    void islemToplamFailTest() {
        IslemException exception = assertThrows(IslemException.class, () -> {
            islemService.islem(IslemType.TOPLAMA,3,4,null,7);
        });
        assertEquals("Sayi null olamaz", exception.getMessage());

    }

}