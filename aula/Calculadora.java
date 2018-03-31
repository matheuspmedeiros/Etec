package aula;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeListener;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	JTextField txtVisor = new JTextField();
	JButton btnMC = new JButton("MC");
	JButton btnMR = new JButton("MR");
	JButton btnMS = new JButton("MS");
	JButton btnM1 = new JButton("M+");
	JButton btnM2 = new JButton("M-");
	JButton btnM3 = new JButton("←");
	JButton btnCE = new JButton("CE");
	JButton btnC = new JButton("C");
	JButton btnM4 = new JButton("±");
	JButton btnRAIZ = new JButton("√");
	JButton btnM7 = new JButton("7");
	JButton btnM8 = new JButton("8");
	JButton btnM9 = new JButton("9");
	JButton btnDIV = new JButton("/");
	JButton btnPORC = new JButton("%");
	JButton btnN2 = new JButton("4");
	JButton btnN3 = new JButton("5");
	JButton btnN4 = new JButton("6");
	JButton btnMULTI = new JButton("*");
	JButton btnN6 = new JButton("1/x");
	JButton btnN7 = new JButton("1");
	JButton btnN8 = new JButton("2");
	JButton btnN9 = new JButton("3");
	JButton btnMENS = new JButton("-");
	JButton btnRESULT = new JButton("=");
	JButton btnO1 = new JButton("0");
	JButton btnO2 = new JButton(",");
	JButton btnMAIS = new JButton("+");
	
	double valor1, valor2;
	int operacao;
	
	public Calculadora(){
		super("Calculadora"); // rotulo/titulo da janela
		Container paine = this.getContentPane(); // fixar objetos na tela
		paine.add(txtVisor);
		txtVisor.setBounds(20, 20, 340, 40);
		paine.add(btnMC);
		btnMC.setBounds(20, 80, 60, 60);
		paine.add(btnMR);
		btnMR.setBounds(90, 80, 60, 60);
		paine.add(btnMS);
		btnMS.setBounds(160, 80, 60, 60);
		paine.add(btnM1);
		btnM1.setBounds(230, 80, 60, 60);
		paine.add(btnM2);
		btnM2.setBounds(300, 80, 60, 60);
		paine.add(btnM3);
		btnM3.setBounds(20, 160, 60, 60);
		btnM3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtVisor.setText(""+txtVisor.getText().subSequence(0, txtVisor.getText().length()-1));
			}
		});
		
		paine.add(btnCE);
		btnCE.setBounds(90, 160, 60, 60);
		
		paine.add(btnC);
		btnC.setBounds(160, 160, 60, 60);
		paine.add(btnM4);
		btnM4.setBounds(230, 160, 60, 60);
		paine.add(btnRAIZ);
		btnRAIZ.setBounds(300, 160, 60, 60);
		paine.add(btnM7);
		btnM7.setBounds(20, 230, 60, 60);
		btnM7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"7");
			}
		});
		paine.add(btnM8);
		btnM8.setBounds(90, 230, 60, 60);
		btnM8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"8");
			}
		});
		paine.add(btnM9);
		btnM9.setBounds(160, 230, 60, 60);
		btnM9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"9");
			}
		});
		paine.add(btnDIV);
		btnDIV.setBounds(230, 230, 60, 60);
		btnDIV.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = 4;
			}
		});
	
		paine.add(btnPORC);
		btnPORC.setBounds(300, 230, 60, 60);
		btnPORC.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = 5;
			}
		});
		paine.add(btnN2);
		btnN2.setBounds(20, 300, 60, 60);
		btnN2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"4");
			}
		});
		paine.add(btnN3);
		btnN3.setBounds(90, 300, 60, 60);
		btnN3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"5");
			}
		});
		paine.add(btnN4);
		btnN4.setBounds(160, 300, 60, 60);
		btnN4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"6");
			}
		});
		paine.add(btnMULTI);
		btnMULTI.setBounds(230, 300, 60, 60);
		btnMULTI.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = 3;
			}
		});
		paine.add(btnN6);
		btnN6.setBounds(300, 300, 60, 60);
		paine.add(btnN7);
		btnN7.setBounds(20, 370, 60, 60);
		btnN7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"1");
			}
		});
		paine.add(btnN8);
		btnN8.setBounds(90, 370, 60, 60);
		btnN8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"2");
			}
		});
		paine.add(btnN9);
		btnN9.setBounds(160, 370, 60, 60);
		btnN9.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"3");
			}
		});
		paine.add(btnMENS);
		btnMENS.setBounds(230, 370, 60, 60);
		btnMENS.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = 2;
			}
		});
		paine.add(btnRESULT);
		btnRESULT.setBounds(300, 370, 60, 130);
		btnRESULT.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				valor2 = Double.parseDouble(txtVisor.getText());
				Calculos calc = new Calculos();
				if(operacao == 3){
					txtVisor.setText("" + calc.multiplicacao(valor1, valor2));		
				}
				if(operacao == 4){
					txtVisor.setText("" + calc.divisao(valor1, valor2));					
				}
				if(operacao == 2){
					txtVisor.setText("" + calc.subtraçao(valor1, valor2));					
				}
				if(operacao == 1){
					txtVisor.setText("" + calc.soma(valor1, valor2));					
				}
				if(operacao == 5){
					txtVisor.setText("" + calc.porcentagem(valor1, valor2));					
				}
				
			}
		});
		
		
		paine.add(btnO1);
		btnO1.setBounds(20, 440, 130, 60);
		btnO1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+"0");
			}
		});
		
		paine.add(btnO2);
		btnO2.setBounds(160, 440, 60, 60);
		btnO2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				txtVisor.setText(txtVisor.getText()+",");
			}
			
		});
		paine.add(btnMAIS);
		btnMAIS.setBounds(230, 440, 60, 60);
		btnMAIS.addActionListener(new ActionListener() {			
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				valor1 = Double.parseDouble(txtVisor.getText());
				txtVisor.setText("");
				operacao = 1;
			}
		});
		paine.setLayout(null); // posicionamento dos objetos do layout
		this.setSize(390,560); // tamanho da tela
		this.setVisible(true); //deixar tela visivel
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main (String args[]){
		Calculadora cal  = new Calculadora();
		
		
	}

}
