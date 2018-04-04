package view;

import java.sql.Connection;

import model.Aluno;
import persistence.AlunoJdbcDao;
import persistence.Conexao;

public class AlunosConexao {
	public static void main(String args[]) {
		Aluno alunos = new Aluno();
		try {
			
			alunos.setNome("Jeferson Roberto de Lima");
			alunos.setEndereco("Av Águia de Haia, 2600");
			alunos.setBairro("Jd São Nicolau");
			
			Connection connection = Conexao.getConnection();
			AlunoJdbcDao alunosJdbcDao = new AlunoJdbcDao(connection);
			
			alunosJdbcDao.salvar(alunos);
			

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

