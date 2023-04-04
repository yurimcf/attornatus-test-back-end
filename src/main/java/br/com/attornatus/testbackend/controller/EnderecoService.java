package br.com.attornatus.testbackend.controller;

import br.com.attornatus.testbackend.model.entitys.Endereco;
import br.com.attornatus.testbackend.model.entitys.Pessoa;
import br.com.attornatus.testbackend.model.repositores.EnderecoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EnderecoService {
    private EnderecoRepository repository;

    @Autowired
    public EnderecoService(EnderecoRepository repository) {
        this.repository = repository;
    }

    public Endereco addEndereco(Endereco endereco) {
        return this.repository.save(endereco);
    }

    public Endereco updateEndereco(Endereco endereco) {
        return this.repository.save(endereco);
    }

    public List<Endereco> listEndereco() {
        return (List<Endereco>) this.repository.findAll();
    }

    public Optional<Endereco> findById(Long id) {
        return this.repository.findById(id);
    }

    public Optional<Endereco> deleteEndereco(Long id) {
        Optional<Endereco> deleted = findById(id);
        this.repository.deleteById(id);
        return deleted;
    }
}
