////////////////////////////////////////////////////////////////////
// Davide Romano 2008652
// Manuele Bonato 1201121
////////////////////////////////////////////////////////////////////

package it.unipd.mtss;
public class RomanPrinter {
    public static String print(int num){
        return printAsciiArt(IntegerToRoman.convert(num));
    }
    private static String printAsciiArt(String romanNumber) throws IllegalArgumentException{
        char romanSimbol[]={'i','v','x','l','c','d','m'};
        for(int i=0;i<romanNumber.length();i++){
            boolean valid=false;
            for (char j:romanSimbol) {
                if(romanNumber.charAt(i)==j){
                    valid=true;
                }
            }
            if (!valid)
                throw new IllegalArgumentException("invalid input");
        }
        String[][] romanArt={{
                    " _____ ",
                    "|_   _|",
                    "  | |  ",
                    "  | |  ",
                    " _| |_ ",
                    "|_____|"},
                    {"__      __",
                    "\\ \\    / /",
                    " \\ \\  / / ",
                    "  \\ \\/ /  ",
                    "   \\  /   ",
                    "    \\/    "},
                    {"__   __",
                    "\\ \\ / /",
                    " \\ V / ",
                    "  > <  ",
                    " / . \\ ",
                    "/_/ \\_\\"},
                    {" _      ",
                    "| |     ",
                    "| |     ",
                    "| |     ",
                    "| |____ ",
                    "|______|"},
                    {"  _____ ",
                    " / ____|",
                    "| |     ",
                    "| |     ",
                    "| |____ ",
                    " \\_____|"},
                    {" _____  ",
                    "|  __ \\ ",
                    "| |  | |",
                    "| |  | |",
                    "| |__| |",
                    "|_____/ "},
                    {" __  __ ",
                    "|  \\/  |",
                    "| \\  / |",
                    "| |\\/| |",
                    "| |  | |",
                    "|_|  |_|"}
        };
        String asciiArt="";
        for(int i=0;i<=5;i++){
            for (int j=0;j<romanNumber.length();j++){
                for(int k=0;k<romanSimbol.length;k++) {
                    if (romanNumber.charAt(j) == romanSimbol[k]) {
                        asciiArt += romanArt[k][i]+" ";
                    }
                }
            }
            asciiArt+="\n";
        }
        return asciiArt;
    }

}
