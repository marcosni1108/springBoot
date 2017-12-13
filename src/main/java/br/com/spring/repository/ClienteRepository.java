package br.com.spring.repository;

import org.springframework.data.repository.CrudRepository;

import br.com.spring.model.Cliente;

public interface ClienteRepository extends CrudRepository<Cliente, String> {

}
