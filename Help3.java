import java.io.IOException;

public class Help3 {
    public static void main(String[] args) throws IOException {
        char choice, ignore;

        for (;;) {
            do {
                System.out.println("Help on: ");
                System.out.println("1. if ");
                System.out.println("2. switch");
                System.out.println("3. for");
                System.out.println("4. while");
                System.out.println("5. do-while");
                System.out.println("6. Break");
                System.out.println("7. Continue\n");
                System.out.println("Choose one or q to quit: ");

                choice = (char) System.in.read();

                do {
                    ignore = (char) System.in.read();
                } while (ignore != '\n');
            } while (choice < '1' | choice > '7' & choice != 'q');

            if (choice == 'q') break;
            System.out.println("\n");

            switch (choice) {
                case '1' -> {
                    System.out.println("The if:\n");
                    System.out.println("if(condition)statment;");
                    System.out.println("else statment;");
                }
                case '2' -> {
                    System.out.println("The switch:\n");
                    System.out.println("switch(expression){");
                    System.out.println("\tcase constant->{");
                    System.out.println("\t\tstatment sequence;");
                    System.out.println("\t}");
                }
                case '3' -> {
                    System.out.println("The for:\n");
                    System.out.println("for(int i; expression; i ++){");
                    System.out.println("\tstatment sequence;");
                    System.out.println("}");
                }
                case '4' -> {
                    System.out.println("The while: ");
                    System.out.println("while(boolean expression){");
                    System.out.println("\tstatment sequence;");
                    System.out.println("\ti++;");
                    System.out.println("}");
                }
                case '5' -> {
                    System.out.println("The do-While: ");
                    System.out.println("do{");
                    System.out.println("\tstatment sequence;");
                    System.out.println("}while(boolean expression);");
                }
                case '6' -> {
                    System.out.println("The break: ");
                    System.out.println("break; or break label;");
                }
                case '7' -> {
                    System.out.println("The continue: ");
                    System.out.println("continue; or continue label");
                }
                default -> System.out.println("Entrada inválida");
            }
            System.out.println();
        }

    }

}
