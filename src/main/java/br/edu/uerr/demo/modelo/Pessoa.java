package br.edu.uerr.demo.modelo;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import net.bytebuddy.build.ToStringPlugin.Exclude;



@Entity
@Table(name="pessoa")
public class Pessoa {

	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name="pessoa_id")
	 private Integer id;
	 private String nome;
	 private String cpf;
	 private String rg;
	 @Column(name="data_de_nascimento")
	 private Calendar dataDeNascimento;
	 @Column(name = "cep")
	 private String cepLogradouro;
	 @Column(name = "endereco")
	 private String enderecoLogradouro;
	 @Column(name = "numero")
	 private String numeroLogradouro;
	 @Column(name = "bairro")
	 private String bairroLogradouro;
	 @Column(name = "cidade")
	 private String cidadeLogradouro;
	 @Column(name = "uf")
	 private String ufLogradouro;
	 	 
	 
	public Pessoa(String nome, String cpf, Calendar dataDeNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataDeNascimento = dataDeNascimento;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}
	public void setDataDeNascimento(Calendar dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
	}
	public String getCepLogradouro() {
		return cepLogradouro;
	}
	public void setCepLogradouro(String cepLogradouro) {
		this.cepLogradouro = cepLogradouro;
	}
	public String getEnderecoLogradouro() {
		return enderecoLogradouro;
	}
	public void setEnderecoLogradouro(String enderecoLogradouro) {
		this.enderecoLogradouro = enderecoLogradouro;
	}
	public String getNumeroLogradouro() {
		return numeroLogradouro;
	}
	public void setNumeroLogradouro(String numeroLogradouro) {
		this.numeroLogradouro = numeroLogradouro;
	}
	public String getBairroLogradouro() {
		return bairroLogradouro;
	}
	public void setBairroLogradouro(String bairroLogradouro) {
		this.bairroLogradouro = bairroLogradouro;
	}
	public String getCidadeLogradouro() {
		return cidadeLogradouro;
	}
	public void setCidadeLogradouro(String cidadeLogradouro) {
		this.cidadeLogradouro = cidadeLogradouro;
	}
	public String getUfLogradouro() {
		return ufLogradouro;
	}
	public void setUfLogradouro(String ufLogradouro) {
		this.ufLogradouro = ufLogradouro;
	}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
}
