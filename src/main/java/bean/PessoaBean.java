package bean;

import javax.faces.bean.ManagedBean;

import model.Pessoa;

@ManagedBean
public class PessoaBean {
	private Pessoa pessoa = new Pessoa();

	public String submit() {
		System.out.println("Nome:" + pessoa.getName());
		System.out.println("Data:" + pessoa.getDateBirth());
		System.out.println("Sexo:" + pessoa.getAge());
		System.out.println("Senha:" + pessoa.getPassword());
		return null;	
	}
	
	public Pessoa getPessoa() {
		return pessoa;
	}
	
	public void setPessoa(Pessoa pessoa) {
		this.pessoa = pessoa;
	}
}
