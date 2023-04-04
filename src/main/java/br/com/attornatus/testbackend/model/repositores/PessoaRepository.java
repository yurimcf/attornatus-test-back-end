package br.com.attornatus.testbackend.model.repositores;

import br.com.attornatus.testbackend.model.entitys.Pessoa;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PessoaRepository extends CrudRepository<Pessoa, Long> {
}
