package br.senai.sp.jandira.gui;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

public class FrameTabuada {
	
	public String titulo;
	public int largura;
	public int altura;

	public void criarTela() {

		JFrame tela = new JFrame();
		tela.setTitle(titulo);
		tela.setSize(largura, altura);
		tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tela.setLayout(null);

		Container painel = tela.getContentPane();
		painel.setBackground(Color.WHITE);

		ImageIcon icone = new ImageIcon("src/br/senai/sp/jandira/img/questionario.png");
		JLabel labelIcone = new JLabel(icone);
		labelIcone.setBounds(-10, -5, 100, 100);

		JLabel labelTitulo = new JLabel();
		labelTitulo.setText("Tabuada 1.0");
		labelTitulo.setFont(new Font("Arial", Font.BOLD, 30));
		labelTitulo.setForeground(Color.RED);
		labelTitulo.setBounds(75, 5, 180, 50);

		JLabel labelSubTitulo = new JLabel();
		labelSubTitulo.setText("Com a tabuada 1.0 os seus problemas acabaram. Calcule");
		labelSubTitulo.setFont(new Font("Arial", Font.BOLD, 15));
		labelSubTitulo.setForeground(Color.LIGHT_GRAY);
		labelSubTitulo.setBounds(75, 30, 400, 50);

		JLabel labelSubTituloContinuacao = new JLabel();
		labelSubTituloContinuacao.setText("a tabuada que desejar em segundos!");
		labelSubTituloContinuacao.setFont(new Font("Arial", Font.BOLD, 15));
		labelSubTituloContinuacao.setForeground(Color.LIGHT_GRAY);
		labelSubTituloContinuacao.setBounds(75, 48, 260, 50);

		JLabel labelMultiplicando = new JLabel();
		labelMultiplicando.setText("Multiplicando:");
		labelMultiplicando.setFont(new Font("Arial", Font.PLAIN, 25));
		labelMultiplicando.setForeground(Color.BLACK);
		labelMultiplicando.setBounds(100, 100, 160, 50);

		JTextField textFieldNumMultiplicado = new JTextField();
		textFieldNumMultiplicado.setBorder(new LineBorder(Color.BLUE));
		textFieldNumMultiplicado.setFont(new Font("Arial", Font.BOLD, 25));
		textFieldNumMultiplicado.setForeground(Color.BLUE);
		textFieldNumMultiplicado.setHorizontalAlignment(JTextField.RIGHT);
		textFieldNumMultiplicado.setBounds(280, 108, 170, 35);

		JLabel labelMinimoMultiplicador = new JLabel();
		labelMinimoMultiplicador.setText("Mínimo Multiplicador:");
		labelMinimoMultiplicador.setFont(new Font("Arial", Font.PLAIN, 25));
		labelMinimoMultiplicador.setForeground(Color.BLACK);
		labelMinimoMultiplicador.setBounds(15, 150, 240, 50);

		JTextField textFieldMinimoMultiplicador = new JTextField();
		textFieldMinimoMultiplicador.setBorder(new LineBorder(Color.BLUE));
		textFieldMinimoMultiplicador.setFont(new Font("Arial", Font.BOLD, 25));
		textFieldMinimoMultiplicador.setForeground(Color.BLUE);
		textFieldMinimoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMinimoMultiplicador.setBounds(280, 158, 170, 35);

		JLabel labelMaximoMultiplicador = new JLabel();
		labelMaximoMultiplicador.setText("Máximo Multiplicador:");
		labelMaximoMultiplicador.setFont(new Font("Arial", Font.PLAIN, 25));
		labelMaximoMultiplicador.setForeground(Color.BLACK);
		labelMaximoMultiplicador.setBounds(10, 200, 250, 50);

		JTextField textFieldMaximoMultiplicador = new JTextField();
		textFieldMaximoMultiplicador.setBorder(new LineBorder(Color.BLUE));
		textFieldMaximoMultiplicador.setFont(new Font("Arial", Font.BOLD, 25));
		textFieldMaximoMultiplicador.setForeground(Color.BLUE);
		textFieldMaximoMultiplicador.setHorizontalAlignment(JTextField.RIGHT);
		textFieldMaximoMultiplicador.setBounds(280, 208, 170, 35);

		JButton buttonCalcular = new JButton();
		buttonCalcular.setText("Calcular");
		buttonCalcular.setBackground(new Color(3, 147, 48));
		buttonCalcular.setForeground(Color.WHITE);
		buttonCalcular.setFont(new Font("Arial", Font.BOLD, 20));
		buttonCalcular.setBounds(10, 280, 270, 40);

		JButton buttonLimpar = new JButton();
		buttonLimpar.setText("Limpar");
		buttonLimpar.setBackground(new Color(255, 168, 51));
		buttonLimpar.setForeground(Color.WHITE);
		buttonLimpar.setFont(new Font("Arial", Font.BOLD, 20));
		buttonLimpar.setBounds(285, 280, 165, 40);

		JLabel labelResultado = new JLabel();
		labelResultado.setText("Resultado:");
		labelResultado.setFont(new Font("Arial", Font.BOLD, 20));
		labelResultado.setBounds(15, 330, 150, 50);

		painel.add(labelIcone);
		painel.add(labelTitulo);
		painel.add(labelSubTitulo);
		painel.add(labelSubTituloContinuacao);
		painel.add(labelMultiplicando);
		painel.add(textFieldNumMultiplicado);
		painel.add(labelMinimoMultiplicador);
		painel.add(textFieldMinimoMultiplicador);
		painel.add(labelMaximoMultiplicador);
		painel.add(textFieldMaximoMultiplicador);
		painel.add(buttonCalcular);
		painel.add(buttonLimpar);
		painel.add(labelResultado);

		tela.setVisible(true);

	}

	
}