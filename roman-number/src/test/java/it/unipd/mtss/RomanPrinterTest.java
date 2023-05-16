package it.unipd.mtss;


import static it.unipd.mtss.RomanPrinter.print;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Test;
public class RomanPrinterTest {
    @Test
    public void correctAsciArt()
    {
        String[] asciiArts={
                " _____  \n" +
                "|_   _| \n" +
                "  | |   \n" +
                "  | |   \n" +
                " _| |_  \n" +
                "|_____| \n",
                "__      __ \n" +
                "\\ \\    / / \n" +
                " \\ \\  / /  \n" +
                "  \\ \\/ /   \n" +
                "   \\  /    \n" +
                "    \\/     \n",
                "__   __ \n" +
                "\\ \\ / / \n" +
                " \\ V /  \n" +
                "  > <   \n" +
                " / . \\  \n" +
                "/_/ \\_\\ \n",
                " _       \n" +
                "| |      \n" +
                "| |      \n" +
                "| |      \n" +
                "| |____  \n" +
                "|______| \n",
                "  _____  \n" +
                " / ____| \n" +
                "| |      \n" +
                "| |      \n" +
                "| |____  \n" +
                " \\_____| \n",
                " _____   \n" +
                "|  __ \\  \n" +
                "| |  | | \n" +
                "| |  | | \n" +
                "| |__| | \n" +
                "|_____/  \n",
                " __  __  \n" +
                "|  \\/  | \n" +
                "| \\  / | \n" +
                "| |\\/| | \n" +
                "| |  | | \n" +
                "|_|  |_| \n"
        };
        String[] prints={print(1),print(5),print(10),print(50),print(100),print(500),print(1000)};

        assertArrayEquals(asciiArts,prints);
    }
    @Test
    public void asciArtSequence() {
        String asciArtSequence=
                " _____     _____   _       __   __ __      __  _____  \n" +
                "|  __ \\   / ____| | |      \\ \\ / / \\ \\    / / |_   _| \n" +
                "| |  | | | |      | |       \\ V /   \\ \\  / /    | |   \n" +
                "| |  | | | |      | |        > <     \\ \\/ /     | |   \n" +
                "| |__| | | |____  | |____   / . \\     \\  /     _| |_  \n" +
                "|_____/   \\_____| |______| /_/ \\_\\     \\/     |_____| \n";
        String printResult=print(666);

        assertEquals(asciArtSequence,printResult);
    }

    @Test(expected = IllegalArgumentException.class)
    public void outOfRangeLower()
    {
        int zero=0;
        print(zero);
    }
    @Test(expected = IllegalArgumentException.class)
    public void outOfRangeUpper()
    {
        int overOneThousand=1001;
        print(overOneThousand);
    }
}
