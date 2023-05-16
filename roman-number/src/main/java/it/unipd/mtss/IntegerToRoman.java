////////////////////////////////////////////////////////////////////
// Davide Romano 2008652
// Manuele Bonato 1201121
////////////////////////////////////////////////////////////////////
package it.unipd.mtss;

public class IntegerToRoman {
    public static String convert(int number) throws IllegalArgumentException {
        String roman = "";
        if (number > 1000 || number < 1) {
            throw new IllegalArgumentException(number + " is not valid");
        }
        while (number != 0) {
            if (number < 4) {
                roman += "i";
                number--;
            } else if (number < 5) {
                roman += "iv";
                number -= 4;
            } else if (number < 9) {
                roman += "v";
                number -= 5;
            } else if (number < 10) {
                roman += "ix";
                number -= 9;
            } else if (number < 40) {
                roman += "x";
                number -= 10;
            } else if (number < 50) {
                roman += "xl";
                number -= 40;
            } else if (number < 90) {
                roman += "l";
                number -= 50;
            } else if (number < 100) {
                roman += "xc";
                number -= 90;
            } else if (number < 400) {
                roman += "c";
                number -= 100;
            } else if (number < 500) {
                roman += "cd";
                number -= 400;
            } else if (number < 900) {
                roman += "d";
                number -= 500;
            } else if (number < 1000) {
                roman += "cm";
                number -= 900;
            } else {
                roman += "m";
                number -= 1000;
            }
        }
        return roman;
    }
}