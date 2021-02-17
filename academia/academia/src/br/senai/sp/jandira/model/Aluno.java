package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Aluno {

	private String nome;
	private char sexo;
	private double peso;
	private double altura;
	private int nivelAtividade;
	private LocalDate dataNascimento;
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getNome() {
		return this.nome;
	}
	
	
	public void setSexo(char sexo) {
		this.sexo = sexo;
	}
	public char getSexo() {
		return this.sexo;
	}
	
	
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPeso() {
		return this.peso;
	}
	
	
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public double getAltura() {
		return this.altura;
	}
	
	
	public void setNivelAtividade(int nivelAtividade) {
		this.nivelAtividade = nivelAtividade;
	}	
	public int getNivelAtividade() {
		return this.nivelAtividade;
	}
	
	
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	public LocalDate setDataNascimento() {
		return this.dataNascimento;
	}
	
	public double getCalcularImc() {
		return ((this.altura*this.altura)/this.peso);
	} 
	
	public double getMcd() {
		return 
	}
	
	public int getIdade() {
		return
	}
	
	public String getStatusImc() {
		if(this.getImc() < 18.5) {
			
		}
	}
}
