import java.io.IOException;

public class FinalDot {
    public static void main(String []args) throws IOException {
        char chr;
        int count = 0;

        System.out.println("Digite o que quiser," +
                " caso digite espaços\neles serão contados," +
                " para parar execução digite '.'");

        do{
            chr = (char)System.in.read();
           if (chr == ' ') count ++;

        }while (chr != '.');

        System.out.println("Número de espaços:" + count);
    }
}
