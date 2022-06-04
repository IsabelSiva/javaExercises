import java.io.IOException;

public class Help {
    public static void main(String [] args) throws IOException {
        System.out.println("Help on: ");
        System.out.println("1. if ");
        System.out.println("2. switch");
        char resp = (char) System.in.read();
        switch (resp) {
            case '1' -> {
                System.out.println("The if:\n");
                System.out.println("if(condition)statment");
                System.out.println("else statment");
            }
            case '2' -> {
                System.out.println("The switch:\n");
                System.out.println("switch(expression){");
                System.out.println("\tcase constant->{");
                System.out.println("\t\tstatment sequence");
                System.out.println("\t}");
            }
            default -> System.out.println("Entrada inválida");
        }
    }
}
