package br.com.attornatus.testbackend.controller;

import br.com.attornatus.testbackend.model.entitys.Pessoa;
import br.com.attornatus.testbackend.model.repositores.PessoaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class PessoaService {
    private PessoaRepository repository;

    @Autowired
    public PessoaService(PessoaRepository repository) {
        this.repository = repository;
    }

    public Pessoa addPessoa(Pessoa pessoa) {
        return this.repository.save(pessoa);
    }

    public Pessoa updatePessoa(Pessoa pessoa) {
        return this.repository.save(pessoa);
    }

    public Iterable<Pessoa> listPessoas() {
        return this.repository.findAll();
    }

    public Optional<Pessoa> findById(Long id) {
        return this.repository.findById(id);
    }

    public Optional<Pessoa> deletePessoa(Long id) {
        Optional<Pessoa> deleted = findById(id);
        this.repository.deleteById(id);
        return deleted;
    }
}
