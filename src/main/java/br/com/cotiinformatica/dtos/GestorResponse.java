package br.com.cotiinformatica.dtos;

import java.util.UUID;

import br.com.cotiinformatica.entities.Empresa;
import lombok.Data;

@Data
public class GestorResponse {

	private UUID id;
	private String nome;
	private String email;
	private Empresa empresa;
}
