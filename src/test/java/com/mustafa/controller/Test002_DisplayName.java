package com.mustafa.controller;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

@DisplayName("Ozel Test 0001")
public class Test002_DisplayName {


    @Test
    @DisplayName("DB Test Mongo - 1") // ozel isim vermek panelde daha rahat ayıklamak için kullanılır
    void test1(){
        System.out.println("Calisan test");
    }

    @Nested // ic sınıf için kullanılan anatasyon
    @DisplayName("Ic Sinif Test - 2")
    class IcSinif{

        @Test
        @DisplayName("Ic Sinif Cache Test")
        void icSinifTest(){

        }
    }

}
