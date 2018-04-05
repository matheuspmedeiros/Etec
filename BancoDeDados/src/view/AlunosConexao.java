package view;

import java.sql.Connection;

import model.Aluno;
import persistence.AlunoJdbcDao;
import persistence.Conexao;

public class AlunosConexao {
	public static void main(String args[]) {
		Aluno alunos = new Aluno();
		try {
			
			/*alunos.setNome("Matheus Medeiros");
			alunos.setEndereco("Rua Guarapariba, 65");
			alunos.setBairro("Jd Lageado");
			*/
			Connection connection = Conexao.getConnection();
			AlunoJdbcDao alunosJdbcDao = new AlunoJdbcDao(connection);
			
		//	alunosJdbcDao.salvar(alunos);
			alunosJdbcDao.listar();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

