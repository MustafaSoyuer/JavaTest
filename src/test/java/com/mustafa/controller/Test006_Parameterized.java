package com.mustafa.controller;

import com.mustafa.service.IslemService;
import com.mustafa.utility.IslemType;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.EnumSource;
import org.junit.jupiter.params.provider.ValueSource;

public class Test006_Parameterized {

    @ParameterizedTest    // parametreli olduğunda bu anatasyon
    @ValueSource(strings = {"Mustafa"})  // buraya parametreler yazılır
    void parametreliTest(String ifade) {
        System.out.println("Gelen deger: " + ifade);
        Assertions.assertEquals(
                "MUSTAFA",ifade.toUpperCase()
        );
    }


    @ParameterizedTest    // parametreli olduğunda bu anatasyon
    @ValueSource(strings = {"Mustafa","Ahmet","Ali","Veli","Fatma"})  // verdiğim parametrelerde test yapılır
    void cokluParametreliTest(String ifade) {
        System.out.println("Gelen deger: " + ifade);
        Assertions.assertTrue(ifade.contains("a")); // mustafa, fatma testten gecer
    }


    @ParameterizedTest
    @ValueSource(ints = {10,20,30,40,50,12,34,34,52})
    void sayisalTipParametre(int sayi){
        Assertions.assertEquals(0,sayi%5,"5e bolunen sayi");
    }


    @ParameterizedTest
    @EnumSource(names = {"TOPLAMA","BOLME"})
    void enumTypeTest(IslemType type){
        IslemService islemService = new IslemService();
        int sonuc = islemService.islem(type,84,3);
        if(type == IslemType.TOPLAMA){
            Assertions.assertEquals(87,sonuc);
        }else if(type == IslemType.BOLME){
            Assertions.assertEquals(28,sonuc);
        }
    }


    @ParameterizedTest
    @CsvSource({  // her biri ayrı cvs dosyası..virgülle ayrılmış dataları satır satır gösterir.
            "Mustafa,12345678",
            "Demet,1234",
            "Hakan,1234567",
            "Ayse,12345678",
            "Asli,4567",
            "Mustafa,12345"
    })
    void csvParameterTest(String userName, String password){ // yukarıda verilen parametrelerden
        Assertions.assertEquals("Mustafa",userName);
        Assertions.assertEquals("12345",password);

    }


    @ParameterizedTest
    @CsvFileSource(resources = "/MOCK_DATA.csv", numLinesToSkip = 80) // bu filedan bu dosyadan verileri kontrol ederek hangisi metot içine eşit.. numLinesToSkip = 80..ilk 80 satırı silerek kontrol et
    void csvFilePArameterTest(String userName, String password){
        Assertions.assertEquals("Mustafa",userName);
        Assertions.assertEquals("12345",password);

    }


}
