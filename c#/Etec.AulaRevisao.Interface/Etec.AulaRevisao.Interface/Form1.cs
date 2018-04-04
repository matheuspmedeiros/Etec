using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Windows.Forms;
using System.Data.SqlClient;

namespace Etec.AulaRevisao.Interface
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void Form1_Load(object sender, EventArgs e)
        {

        }

        private void btnLimpar_Click(object sender, EventArgs e)
        {
            LimparCampos();
            MessageBox.Show("Campos foram Limpos", "ETEC ZL");
        }

        private void btnCadastrar_Click(object sender, EventArgs e)
        {
            // validação
            if (txtNome.Text == "" || txtCargo.Text == "")
            {
                MessageBox.Show("Todos os Campos devem ser preenchidos", "ETEC ZL");
            }
            else
            {
                //salvar informações no banco de dados
                string conexao = "Persist Security Info=False;User ID=sa;Initial Catalog=AulaRevisao;Data Source=LAB-08-11;password=info211";
                
                //conectando ao sql server
                SqlConnection conexaoBanco = new SqlConnection(conexao);
                conexaoBanco.Open();
                
                //Colocando dados no sql
                string comandoSQL = "INSERT INTO tbFuncionario VALUES('" + txtNome.Text +"','"
                    +txtCargo.Text+ "','"
                    + txtSalario.Text+ "','"
                    +txtRG.Text+ "','"
                    +txtCPF.Text+ "','"
                    +dtpNasc.Text+ "')";

                //execução de banco
                SqlCommand execucaoSQL = new SqlCommand(comandoSQL, conexaoBanco);
                execucaoSQL.ExecuteNonQuery();

                //fechando a conexão com o banco
                conexaoBanco.Close();

                MessageBox.Show("Cadastro Realizado com Sucesso", "ETEC ZL");
                LimparCampos();                
            }
        }
        private void LimparCampos()
        {
            txtCargo.Text = "";
            txtNome.Text = "";
            txtCPF.Text = "";
            txtRG.Text = "";
            txtSalario.Text = "";
            dtpNasc.Text = "";
        }

      


        
    }
}
