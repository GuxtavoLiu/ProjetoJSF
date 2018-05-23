package controle;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloJsf {

	private String nomePessoa;

	public String getNomePessoa() {
		return nomePessoa;
	}

	public void setNomePessoa(String nomePessoa) {
		this.nomePessoa = nomePessoa;
	}

	public void mostrarConsole() {

		System.out.println("O nome é: " + nomePessoa);

	}

}