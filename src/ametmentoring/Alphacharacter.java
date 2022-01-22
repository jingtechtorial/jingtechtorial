package ametmentoring;

public class Alphacharacter {
    //print out alphabetical,digit,and special characters from
    //the string seperately
    //print out alphacharcter
    //print out digit
    //print out special character
    public static void main(String[] args) {


        String given="ertwsFADSF::IJ67585498testtest8732484375efds*&(&*^)5%^";
        String onlyAlphabetical="";
        String onlyDigit="";
        String onlySpecial="";
        for(int i = 0; i<given.length();i++){
            if(Character.isAlphabetic(given.charAt(i))){
                onlyAlphabetical+=given.charAt(i);
            }else if(Character.isDigit(given.charAt(i))){
                onlyDigit+=given.charAt(i);
            }else{
                onlySpecial+=given.charAt(i);
            }
        }
        System.out.println(onlyAlphabetical);
        System.out.println(onlyDigit);
        System.out.println(onlySpecial);
    }
}














