package br.com.attornatus.testbackend.model.repositores;

import br.com.attornatus.testbackend.model.entitys.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, Long> {
}
