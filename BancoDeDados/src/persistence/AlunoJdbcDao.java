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
}
