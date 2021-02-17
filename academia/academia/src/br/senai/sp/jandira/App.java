package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Aluno;

public class App {

	public static void main(String[] args) {
		
		Aluno contaGustavo = new Aluno();
		
		contaGustavo.setAltura(1.70);
		contaGustavo.setPeso(70);
		contaGustavo.setNome("Gustavo Marques Fernandes");
		contaGustavo.setDataNascimento(13/02/2003);
		contaGustavo.setNivelAtividade();
		contaGustavo.setSexo("Masculino");
		
		System.out.println("Altura: " + contaGustavo.getAltura());
		System.out.println("Peso: " + contaGustavo.getPeso());
		System.out.println("Calcular: " + contaGustavo.getCalcularImc());
		System.out.println("Nome: " + contaGustavo.getNome());
		System.out.println("Data de Nascimento: " + contaGustavo.getDataNascimento());
		System.out.println("Nível Atividade: " + contaGustavo.getNivelAtividade());
		System.out.println("Sexo: " + contaGustavo.getSexo());
		
	}
}
