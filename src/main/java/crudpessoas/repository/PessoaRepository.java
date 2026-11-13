package crudpessoas.repository;

import crudpessoas.model.Pessoa;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

    boolean existsByEmail(String email);
    boolean existsByCPF(String CPF);

}
