package org.example;

import java.util.regex.Pattern;

public class ValidationPrograms {

    public static boolean isValidIPAddr(String ip){

        String pattern = "^((([01]?\\d\\d?)|(2[0-4]\\d)|(25[0-5]))\\.){3}(([01]?\\d\\d?)|(2[0-4]\\d)|(25[0-5]))$";
        return Pattern.matches(pattern, ip);
    }

    public static boolean isValidPassword(String password){
        String pattern ="^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[!@#$%^&*]).{8,}$";
        return Pattern.matches(pattern,password);
    }

    public static boolean isValidDates(String date){
        String pattern ="^(0[1-9]|1[0-2])/(0[1-9]|[12][0-9]|3[01])/\\d{4}$";
        return Pattern.matches(pattern,date);
    }

    static boolean isValidURL(String url){
        String pattern = "^(http(s)?:\\/\\/)?[a-zA-Z0-9_-]+(\\.[a-zA-Z0-9_-]+)*(\\.[a-zA-Z]{2,})(:\\d+)?(\\/[^\\s]*)?(\\?[^\\s]*)?$";
        return Pattern.matches(pattern,url);
    }

}
