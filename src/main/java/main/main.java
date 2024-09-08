package main;

import java.util.List;

import dao.PessoaDao;
import model.Pessoa;

public class main {
	public static void main(String[] args) {
		Pessoa p1 = new Pessoa();
		p1.setName("Raquel");
		p1.setAge(44);
		p1.setPassword("545872");
		p1.setDateBirth("16-01-1970");
		
		PessoaDao.save(p1);
		
//		Pessoa p2 = PessoaDao.find(2);
//		System.out.println(p2);
//		p2.setName("Lucas");
//		PessoaDao.update(p2);
		
//		PessoaDao.delete(p2);
		
		List<Pessoa> pessoa = PessoaDao.findAll();
		System.out.println(pessoa);
	}
}
