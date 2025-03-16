package br.com.cotiinformatica.dtos;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class EmpresaRequest {
	
	@NotEmpty(message = "Informe o nome da empresa.")
	@Size(min = 5, max = 100, message = "Infomre um nome com no mínimo 5 caracteres.")
	private String nome;
	
	@NotEmpty(message = "Informe o cnpj da empresa.")
	@Pattern(regexp = "^[0-9]{14}$", message = "CNPJ deve conter exatamente 14 dígitos numéricos")
    @Size(min = 14, max = 14, message = "CNPJ deve ter 14 caracteres")
    private String cnpj;
    
}
