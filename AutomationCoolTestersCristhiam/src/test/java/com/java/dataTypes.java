package com.java;

public class dataTypes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte abc = 127;
		short var = 30000;
		
		long var2 = 9223372036854775807L;
		
		double altura =  2.54;
		
		System.out.println(altura);
		
		char letra = '\u00D5';
		System.out.println(letra);
		
		String frase = "Hola Mundo";
		String fraseDos = " soy nuevo";
		System.out.println(frase + fraseDos);

		//UNARIO
				int a = 3;
				a--;
				
				System.out.println("El valor de a es "+ a);
				
				// Relacionales
				int var1 = 3;
				int var4 = 4;
				boolean var3 = false;
				
				if(var1>=var4 || !var3) {
					System.out.println("HERE");
				}
		
	}

}
