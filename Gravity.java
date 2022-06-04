public class Gravity{

	public static void main(String args []){
		
		double peso_na_lua, peso_na_terra = 67.7;

		
		System.out.println("VAMOS CALCULAR SEU PESO NA LUA!");
		System.out.println();
		System.out.println("DIGITE SEU PESO EM KG: ");

		peso_na_lua = ((peso_na_terra / 9.81) * 1.6622);
		
		System.out.println("SEU PESO NA LUA É: " + peso_na_lua);	
	
	}
} 
