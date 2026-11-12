package crudpessoas.service;

import crudpessoas.model.Pessoa;
import crudpessoas.repository.PessoaRepository;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PessoaService {

    private final PessoaRepository repository;

    public PessoaService(PessoaRepository repository){
        this.repository = repository;
    }

    // Create
    public Pessoa cadastrar(Pessoa pessoa){
        return repository.save(pessoa);
    }

    // Read
    public List<Pessoa> listar(){
        return repository.findAll();
    }

    // Read - pelo id
    public Optional<Pessoa> buscarPorId(Long id){
        return repository.findById(id);
    }

    // Update
    public Optional<Pessoa> atualizar(Long id, Pessoa dados){
        return repository.findById(id)
                .map(pessoa -> {
                    pessoa.setNome(dados.getNome());
                    pessoa.setIdade(dados.getIdade());
                    pessoa.setEmail(dados.getEmail());

                    return repository.save(pessoa);
                });
    }

    // Delete
    public boolean excluir(Long id){
        if(!repository.existsById(id)){
            return false;
        }

        repository.deleteById(id);
        return true;
    }
}
