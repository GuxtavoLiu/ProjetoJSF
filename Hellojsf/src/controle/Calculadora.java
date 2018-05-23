package controle;

import javax.faces.bean.ManagedBean;

import modelo.Calculo;

@ManagedBean
public class Calculadora {
	// private double valor1;
	// private double valor2;
	// public String valorFinal;
	// private String operador;
	private Calculo calculo = new Calculo();

	public void somar() {
		calculo.setValorFinal(String.valueOf(calculo.getValor1() + calculo.getValor2()));
	}

	public void dividir() {

		calculo.setValorFinal(String.valueOf(calculo.getValor1() / calculo.getValor2()));

	}

	public void multiplicar() {

		calculo.setValorFinal(String.valueOf(calculo.getValor1() * calculo.getValor2()));
	}

	public Calculo getCalculo() {
		return calculo;
	}

	public void setCalculo(Calculo calculo) {
		this.calculo = calculo;
	}

	public void subtrair() {

		calculo.setValorFinal(String.valueOf(calculo.getValor1() - calculo.getValor2()));
	}

	public void calculadora() {
		if (calculo.getOperador().equals("+")) {
			somar();
		} else if (calculo.getOperador().equals("-")) {
			subtrair();
		} else if (calculo.getOperador().equals("/")) {
			dividir();
		} else if (calculo.getOperador().equals("*")) {
			multiplicar();
		} else {
			calculo.setValorFinal("operador Inválido");
		}

	}

}
