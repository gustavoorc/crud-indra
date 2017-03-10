package br.com.crud.crud.rest;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class CadastroPessoa {
	
@Id //da identidade unica ao registro
@GeneratedValue //gera automaticamente o id 
private long id;

private String nome;
private String sobreNome;
private Number cpf;
private Date dataNascimento;

public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getNome() {
	return nome;
}
public void setNome(String nome) {
	this.nome = nome;
}
public String getSobreNome() {
	return sobreNome;
}
public void setSobreNome(String sobreNome) {
	this.sobreNome = sobreNome;
}
public Number getCpf() {
	return cpf;
}
public void setCpf(Number cpf) {
	this.cpf = cpf;
}
public Date getDataNascimento() {
	return dataNascimento;
}
public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
}

	
	

}
