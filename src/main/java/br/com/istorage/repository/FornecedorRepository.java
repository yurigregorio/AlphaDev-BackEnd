package br.com.istorage.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.istorage.model.Fornecedor;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

@Repository
public interface FornecedorRepository extends JpaRepository<Fornecedor, Integer> {

}
