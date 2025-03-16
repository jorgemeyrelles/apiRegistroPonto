package br.com.cotiinformatica.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.com.cotiinformatica.entities.Empresa;

@Repository
public interface EmpresaRepository extends JpaRepository<Empresa, UUID> {

	@Query("select e from Empresa e where e.cnpj = :cnpj")
	Empresa findByCnpj(String cnpj);
}
