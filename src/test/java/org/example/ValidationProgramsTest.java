package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.util.logging.*;

import static org.junit.jupiter.api.Assumptions.assumeFalse;
import static org.junit.jupiter.api.Assumptions.assumeTrue;

class ValidationProgramsTest {

    private final static Logger LOGGER =
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    @DisplayName("Testing if the passwords are valid or not")
    @Test
    void isValidPassword(){
        String[] testPasswordsTrue = {
                "Password123!",
                "SecurePass!2022",
                "HelloWorld!42",
                "P@ssw0rd123",
                "MyPa$$w0rd!"
        };

        String[] testPasswordsFalse = {
        "password",
        "PASSWORD", "12345678",
        "!@#$%^&*",
        "abcdEFGH",
        };

        for(String password : testPasswordsFalse){
            assumeFalse(ValidationPrograms.isValidPassword(password));
        }

        for(String password : testPasswordsTrue){
            assumeTrue(ValidationPrograms.isValidPassword(password));
        }

    }


    @DisplayName("Testing if the date is in correct format")
    @Test
    void isValidDate(){
        String[] testDatesTrue = {
                "01/01/2022",
                "02/29/2024",
                "03/15/2023",
                "04/30/2025",
                "12/31/2026"
        };

        String[] testDatesFalse = {
                "12/31/202"
        };

        for(String dates : testDatesTrue){
            assumeTrue(ValidationPrograms.isValidDates(dates));
        }

        for(String dates : testDatesFalse){
            assumeFalse(ValidationPrograms.isValidDates(dates));
        }

    }

    @DisplayName("Testing if the IP adder are valid or not")
    @Test
    void isValidIPAddr() {

        String[] testIPsTrue = {
                "192.168.0.1",
                "10.0.0.0",
                "255.255.255.255",
                "172.16.0.0",

        };

        String[] testIPsFalse = {
                "256.0.0.0",
                "abc.def.ghi.jkl",
                "123.456.789.0",
                "1.2.3.4."
        };

        for(String Ip : testIPsTrue){
            assumeTrue(ValidationPrograms.isValidIPAddr(Ip));
        }

        for(String Ip: testIPsFalse){
            assumeFalse(ValidationPrograms.isValidIPAddr(Ip));
        }


    }



    @DisplayName("Testing URL")
    @Test
    void isURl(){
        String[] testURLTrue = {
                "http://www.example.com",
                "https://www.example.com",
                "http://example.com/path",
                "https://example.com/path?param=value",
                "https://www.example.com:8080"
        };

        for(String url : testURLTrue){
            assumeTrue(ValidationPrograms.isValidURL(url));
        }


    }


}