package br.edu.uerr.demo.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.uerr.demo.modelo.Pessoa;

@Repository
public interface PessoaRepositorio extends JpaRepository<Pessoa, Integer>{

}
