package it.unipd.mtss;

import org.junit.Test;

import static org.junit.Assert.*;

public class IntegerToRomanTest {

    @Test
    public void oneToThree()
    {
        String[] expectedOutput={"i","ii","iii"};
        String[] resultToTest=new String[3];
        for (int i=0;i<3;i++){
            resultToTest[i]=IntegerToRoman.convert(i+1);
        }
        assertArrayEquals(expectedOutput,resultToTest);
    }
    @Test
    public void fourToSix()
    {
        String[] expectedOutput={"iv","v","vi"};
        String resultToTest[]=new String[3];
        for (int i=0;i<3;i++){
            resultToTest[i] =IntegerToRoman.convert(i+4);
        }
        assertArrayEquals(expectedOutput,resultToTest);
    }
    @Test
    public void sevenToTen()
    {
        String[] expectedOutput={"vii","viii","ix","x"};
        String resultToTest[]=new String[4];
        for (int i=0;i<4;i++){
            resultToTest[i] =IntegerToRoman.convert(i+7);
        }
        assertArrayEquals(expectedOutput,resultToTest);
    }
    @Test
    public void elevenToTwenty()
    {
        String[] expectedOutput={"xi","xii","xiii","xiv","xv","xvi","xvii","xviii","xix","xx"};
        String resultToTest[]=new String[10];
        for (int i=0;i<10;i++){
            resultToTest[i] =IntegerToRoman.convert(i+11);
        }
        assertArrayEquals(expectedOutput,resultToTest);
    }
    @Test
    public void tenToHundred()
    {
        String[] expectedOutput={"x","xx","xxx","xl","l","lx","lxx","lxxx","xc","c"};
        String resultToTest[]=new String[10];
        for (int i=10;i<=100;i+=10){
            resultToTest[i/10-1] =IntegerToRoman.convert(i);
        }
        assertArrayEquals(expectedOutput,resultToTest);
    }
    @Test
    public void hundredToThousand()
    {
        String[] expectedOutput={"c","cc","ccc","cd","d","dc","dcc","dccc","cm","m"};
        String resultToTest[]=new String[10];
        for (int i=100;i<=1000;i+=100){
            resultToTest[i/100-1] =IntegerToRoman.convert(i);
        }

    }
    @Test(expected = IllegalArgumentException.class)
    public void outOfRangeLower()
    {
        int zero=0;
        IntegerToRoman.convert(zero);
    }
    @Test(expected = IllegalArgumentException.class)
    public void outOfRangeUpper()
    {
        int overOneThousand=1001;
        IntegerToRoman.convert(overOneThousand);
    }

    @Test
    public void forceError()
    {
        String[] expectedOutput={"i","xi","liii","cx","xv","lxvii"};
        String resultToTest[]={IntegerToRoman.convert(2),
        IntegerToRoman.convert(15),
        IntegerToRoman.convert(54),
        IntegerToRoman.convert(500),
        IntegerToRoman.convert(20),
        IntegerToRoman.convert(300)};

        for (int i=0;i<6;i++){
            assertNotEquals(expectedOutput[i],resultToTest[i]);
        }
    }

}
