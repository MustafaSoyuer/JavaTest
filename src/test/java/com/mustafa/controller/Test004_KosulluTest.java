package com.mustafa.controller;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.DisabledOnOs;
import org.junit.jupiter.api.condition.EnabledOnOs;

import static org.junit.jupiter.api.condition.OS.*;

public class Test004_KosulluTest {

    /**
     *  Windows -> Path : c:\\desktop\\test
     *  MacOS -> Path : /Users/mustafa/Desktop/test
     *  Linux -> Path : /home/mustafa/Desktop/test
     */


    @Test
    @EnabledOnOs(MAC) // MAC, WINDOWS, LINUX ne olduğuna bak
    void test001(){
        System.out.println("Test 001 MAC");
        System.out.println("system property : " + System.getProperty("os.arch"));

    }

    @Test
    @EnabledOnOs(WINDOWS)
    void test002(){
        System.out.println("Test 002 WINDOWS");
        System.out.println("system property : " + System.getProperty("os.arch"));
    }
    /**
     * 64bit, 32bit, arm64, x86_64, linux
     */

    @Test
    @EnabledOnOs({MAC,LINUX})
    void test003(){
        System.out.println("Test 003 LINUX, MAC");
    }

    @Test
    @DisabledOnOs(WINDOWS)
    void disableWindows(){

    }

    @Test
    @EnabledOnOs(architectures =  "x86_64") // ortama uygun ise çalış
    void enabledMChip(){
        System.out.println("selam");
    }

}
