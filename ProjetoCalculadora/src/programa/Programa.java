package programa;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import classes.Subtracao;
import interfaces.ICalculadora;

public class Programa{
		public static void main (String args[]) {
		}		
			
			public static String verificaTipoEntrada(Double[] entrada) {
				Integer numeroEntradaInteiros = 0;
				Integer numeroEntradaFloat = 0;
				Integer numeroEntradaDouble = 0;
				for (int i = 0; i < entrada.length; i++) {
					
					double n = entrada[i];
					
					if ((int) n == n) {
						numeroEntradaInteiros++;
					} else if (Double.toString(n).split("\\.")[1].length() < 7) {
						numeroEntradaFloat++;
					} else {
						numeroEntradaDouble++;
					}			
				}
				
				if (numeroEntradaInteiros > 0 && numeroEntradaFloat == 0 && numeroEntradaDouble == 0) {
					return "inteiro";
				}
				
				if ((numeroEntradaInteiros > 0 || numeroEntradaInteiros == 0) && numeroEntradaFloat > 0 && numeroEntradaDouble == 0) {
					return "float";
				}
				
				return "double";
			
		}
}
