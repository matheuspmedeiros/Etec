package persistence;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import model.Aluno;

public class AlunoJdbcDao {

	private Connection conn;
	
	
	public AlunoJdbcDao(Connection conn) {
		this.conn = conn;
	}
	
	
	public void salvar(Aluno c) throws SQLException {
		String sql = "insert into alunos(nome, endereco, bairro) values ('"+c.getNome()+"','"+c.getEndereco()+"','"+c.getBairro()+"')";
		System.out.println(sql);
		PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
		prepareStatement.executeUpdate();
        prepareStatement.close();
	}
	public List<Aluno> listar() {
		String sql = "select * from alunos";
        System.out.println(sql);		
        List<Aluno> alunos = new ArrayList<Aluno>();
		try {
			PreparedStatement prepareStatement = this.conn.prepareStatement(sql);
			ResultSet rs = prepareStatement.executeQuery();
			while(rs.next()) {
			
				String nome = rs.getString("nome");
				String endereco = rs.getString("endereco");
				String bairro = rs.getString("bairro");
				
				Aluno aluno = new Aluno();

				aluno.setNome(nome);
				aluno.setEndereco(endereco);
				aluno.setBairro(bairro);	
				
				System.out.println("\n" + aluno.getNome());
				System.out.println("\n" + aluno.getEndereco());
				System.out.println("\n" + aluno.getBairro());
				
				System.out.println("\n**********outra pessoa*********");
				

			}
			prepareStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return alunos;
	}
}
