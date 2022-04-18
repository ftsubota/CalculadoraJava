package classes;

import interfaces.ICalculadora;

public class Subtracao implements ICalculadora{

	private static final Integer Integer = null;
	private static final Float Float = null;
	private static final Double Double = null;

	@Override
	public Integer calcula(Integer n1, Integer n2) {
		if(n1 == null || n1 != Integer || n2 == null || n2 != Integer ) {
			System.out.println("Insira dois números inteiros!");
		}
		return n1 - n2;
	}

	@Override
	public Float calcula(Float n1, Float n2) {
		if(n1 == null || n1 != Float || n2 == null || n2 != Float) {
			System.out.println("Insira dois números reais");
		}
		return n1 - n2;
	}

	@Override
	public Double calcula(Double n1, Double n2) {
		if(n1 == null || n1 != Double || n2 == null || n2 != Double) {
			System.out.println("Insira dois números flutuantes");
		}
		return n1 - n2;
		
	}

	@Override
	public Integer calcula(Integer[] numeros) {
		Integer subtracao = 0;
		for (Integer n : numeros) {
			subtracao = n.intValue() - n.intValue();
		}
		return subtracao;
	}

	@Override
	public Float calcula(Float[] numeros) {
		Float subtracao = 0f;
		for (Float n : numeros) {
			subtracao = n.floatValue() - n.floatValue();
		}
		return subtracao;
	}

	@Override
	public Double calcula(Double[] numeros) {
		Double subtracao = 0d;
		for (Double n : numeros) {
			subtracao = n.doubleValue() - n.doubleValue();
		}
		return subtracao;
	}

}
