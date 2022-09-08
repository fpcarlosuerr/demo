package br.edu.uerr.demo.servicos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.edu.uerr.demo.modelo.Pessoa;
import br.edu.uerr.demo.repositorio.PessoaRepositorio;

@Service
public class PessoaServicos {

	@Autowired
	PessoaRepositorio pessoaRepositorio;
	
	// CREATE 
	public Pessoa createPessoa(Pessoa p) {
	    return pessoaRepositorio.save(p);
	}

	// READ
	public List<Pessoa> getPessoas() {
	    return pessoaRepositorio.findAll();
	}

	// DELETE
	public void deletePessoa(Integer pessoaId) {
	    pessoaRepositorio.deleteById(pessoaId);
	}
	
	// UPDATE
	public Pessoa updatePessoa(Integer pessoaId, Pessoa pessoaDetails) {
	        Pessoa p = pessoaRepositorio.findById(pessoaId).get();
	        p.setNome(pessoaDetails.getNome());
	        p.setCpf(pessoaDetails.getCpf());
	        p.setDataDeNascimento(pessoaDetails.getDataDeNascimento());
	        
	        return pessoaRepositorio.save(p);                                
	}
}
