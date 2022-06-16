package openingChapters;

import java.io.IOException;

public class ASCII {
    public static void main(String []args) throws IOException {
        char ascii;
        System.out.println("Digite qualquer letra" +
                " para parar digite '.'");
        do{
            ascii = (char)System.in.read();
            ascii -= 32;
            System.out.println(ascii);
        }while (ascii != '.');
    }
}
