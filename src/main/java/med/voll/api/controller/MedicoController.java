package med.voll.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import med.voll.api.medico.DadosCadastroMedico;

@RestController
@RequestMapping("/medicos")
public class MedicoController {
	
//	@PostMapping
//	public void cadastrar(@RequestBody String json) {
//		System.out.println(json);
//	}
	
	//Sempre que precisar receber/devolver informação/dados na api crie um DTO (Data Transfer Object)
	@PostMapping
	public void cadastrar(@RequestBody DadosCadastroMedico dados) {
		System.out.println(dados);
	}
}
