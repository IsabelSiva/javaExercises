package openingChapters;

import java.lang.System;
import java.util.Scanner;

public class Sound {
    public static void main(String []args) {
     
    double velocidade = 1100;
    double time ;
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("VAMOS CALCULAR DISTÂNCIAS");
    System.out.println("DIGITE O INTERVALO DE TEMPO ENTRE O RAIO E O SOM");
    time = scanner.nextDouble();
    double distancia = velocidade * time;
    System.out.println("A distância do raio era de: " 
                        + distancia + " polegadas");    
    }       
}
