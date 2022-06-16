package openingChapters;

public class Polegada {
    public static void main(String args []){
		double polegadas = 12.0, metros;

        System.out.println("--------------------------------");
        System.out.println("CONVERSÃO DE POLEGADAS EM METROS");
        System.out.println("--------------------------------");
		
		for(int i = 0; i < 12; i++){
			metros = polegadas * 39.37;
			System.out.println(polegadas + " Polegadas são: " + metros + " metros");
			System.out.println();
            polegadas --;
		}
	}
    
}
