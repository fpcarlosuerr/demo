package br.edu.uerr.demo.controle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import br.edu.uerr.demo.servicos.PessoaServicos;

@Controller
public class PessoaControle {

	@Autowired
	PessoaServicos pessoaServicos;
	
	/*
	@RequestMapping(value="/pessoas", method=RequestMethod.GET)
	public List<Pessoa> lista() {
	    return pessoaRepositorio.findAll();	
	}
	*/
	
	@GetMapping("/pega")
	public String pegaPessoa(Model model) {
		model.addAttribute("listaPessoas",pessoaServicos.getPessoas());
		return "pessoas";
	}
	
}
