package util;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Calculadora {
	private double valor1;
	private double valor2;
	private double resultado;
	public String valorFinal;
	private String operador;

	public String getValorFinal() {
		return valorFinal;
	}

	public void setValorFinal(String valorFinal) {
		this.valorFinal = valorFinal;
	}

	public String getOperador() {
		return operador;
	}

	public void setOperador(String operador) {
		this.operador = operador;
	}

	public double getValor1() {
		return valor1;
	}

	public void setValor1(double valor1) {
		this.valor1 = valor1;
	}

	public double getValor2() {
		return valor2;
	}

	public void setValor2(double valor2) {
		this.valor2 = valor2;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	public void somar() {

		resultado = valor1 + valor2;
		valorFinal = String.valueOf(resultado);
	}

	public void dividir() {

		resultado = valor1 / valor2;
		valorFinal = String.valueOf(resultado);
	}

	public void multiplicar() {

		resultado = valor1 * valor2;
		valorFinal = String.valueOf(resultado);
	}

	public void subtrair() {

		resultado = valor1 - valor2;
		valorFinal = String.valueOf(resultado);
	}

	public void calculadora() {
		if (operador.equals("+")) {
			somar();
		} else if (operador.equals("-")) {
			subtrair();
		} else if (operador.equals("/")) {
			dividir();
		} else if (operador.equals("*")) {
			multiplicar();
		} else {
			valorFinal = "Operador Inválido";
		}

	}

}
