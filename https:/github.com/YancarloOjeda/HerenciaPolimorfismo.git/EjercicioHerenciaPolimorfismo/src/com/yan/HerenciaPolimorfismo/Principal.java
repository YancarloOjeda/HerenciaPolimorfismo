package com.yan.HerenciaPolimorfismo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Playera playera = new Playera(1, 3.5, "Ch", "r", "Recto");
		Jeans jeans = new Jeans(2, 799, "M", "a", "Recto", "H");
		Calcetin calcetin = new Calcetin(3, 25.5, "Gr", "b");
		
		playera.mostrarDatos("playera");
		

	}

}
