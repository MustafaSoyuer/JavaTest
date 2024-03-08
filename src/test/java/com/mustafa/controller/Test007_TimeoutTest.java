package com.mustafa.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.util.concurrent.TimeUnit;

public class Test007_TimeoutTest {

    /**
     *  Timeout -> defaults olarak saniye cinsinden test metodunun suresini belirler ve
     *  bu süre altında çalışan metodlar için okey verirken üzerine çıkan
     *  her zaman dilimi için fail olur.
     */

    @Test
    @Timeout(1) // 1 saniye sonra testi iptal eder
    void timeOut1() throws InterruptedException  { // bütün bir şekilde totalde ne kadar çalıştığına bakmak için
        System.out.println("timeOut1");
        Thread.sleep(994); // Ok
//        Thread.sleep(996); // fail
    }

    @Test
    @Timeout(value = 5, unit = TimeUnit.MILLISECONDS) // 0.5 saniye sonra testi iptal eder
    void timeOut2() throws InterruptedException {
        System.out.println("Diger kullanim");
    }
}
