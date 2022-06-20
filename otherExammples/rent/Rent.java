package otherExammples.rent;

import java.util.Scanner;

public class Rent {
    public static void main(String[] args){
        Student[] rents = new Student[10];
        Scanner scanner = new Scanner(System.in);
        int qtdRoom;

        System.out.println("Quantos quartos serão alugados?");
        qtdRoom = scanner.nextInt();
        for (int i = 0; i < qtdRoom; i++){

            System.out.println("Que quarto deseja alugar?");
            int room = scanner.nextInt();

            System.out.println("Nome do estudante?");
            scanner.nextLine();
            String name = scanner.nextLine();

            System.out.println("Email do estudante?");
            scanner.nextLine();
            String email = scanner.nextLine();

            rents[room] = new Student(name, email);
        }

        for (int j = 0; j < rents.length; j++){
            if(rents[j] != null)System.out.println(rents[j]);
        }
        scanner.close();

    }

}
