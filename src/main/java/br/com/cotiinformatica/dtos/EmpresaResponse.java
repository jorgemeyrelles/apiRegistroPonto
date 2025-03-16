package br.com.cotiinformatica.dtos;

import java.util.List;
import java.util.UUID;

import lombok.Data;

@Data
public class EmpresaResponse {

	private UUID id;
    private String nome;
    private String cnpj;
    private List<FuncionarioResponse> funcionarios;
    private List<GestorResponse> gestores;
}
