package br.com.cotiinformatica.interfaces;

import java.util.List;
import java.util.UUID;

import br.com.cotiinformatica.dtos.EmpresaRequest;
import br.com.cotiinformatica.dtos.EmpresaResponse;

public interface EmpresaDomainService {

	EmpresaResponse criarEmpresa(EmpresaRequest empresaRequest);
	
	EmpresaResponse atualizaEmpresa(UUID id, EmpresaRequest empresaRequest);
	
	EmpresaResponse buscaEmpresaPorId(UUID id);
	
	List<EmpresaResponse> listaEmpresas();
	
	void deletaEmpresa(UUID id);
}
