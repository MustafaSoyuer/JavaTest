package com.mustafa.controller;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) // sıralama işlemi yapmak için anatasyon
public class Test005_SiraliTestler {

    @Test
    @Order(2)
    void sira1() throws InterruptedException{
        System.out.println("1. siradaki test");
        Thread.sleep(100);
    }
    @Test
    @Order(3)
    void sira2() throws InterruptedException{
        System.out.println("2. siradaki test");
        Thread.sleep(400);
    }
    @Test
    @Order(1)
    void sira3() throws InterruptedException{
        System.out.println("3. siradaki test");
    }
}
