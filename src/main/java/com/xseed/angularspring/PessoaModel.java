package com.xseed.angularspring;

import javax.persistence.*;

@Entity
@Table(name = "pessoas")
public class PessoaModel {
	
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column
	private String nome;
	@Column
	private String sobrenome;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	
}
