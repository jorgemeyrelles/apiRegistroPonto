package br.com.cotiinformatica.dtos;

import java.util.UUID;

import lombok.Data;

@Data
public class FuncionarioResponse {

	private UUID id;
	private String nome;
	private String email;
}