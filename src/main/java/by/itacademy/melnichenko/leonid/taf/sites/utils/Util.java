package by.itacademy.melnichenko.leonid.taf.sites.utils;

public class Util {
    public static String generateEmail(){
        String[] letter = {"a", "b", "с", "d", "e", "f", "g", "h"};
        String result = "";
        for(int i = 0; i < 8; i++){
            int j;
            j = (int) Math.random() * letter.length;
            result += result.concat(letter[j]);
        }
        return result + "@gmail.com";
    }
    public static String generatePassword(){
        String[] letter = {"1", "b", "2", "d", "3", "f", "4", "h"};
        String result = "";
        for(int i = 0; i < 8; i++){
            int j;
            j = (int) Math.random() * letter.length;
            result += result.concat(letter[j]);
        }
        return result + "@gmail.com";
    }
}
