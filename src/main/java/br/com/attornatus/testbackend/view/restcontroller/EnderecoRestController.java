package br.com.attornatus.testbackend.view.restcontroller;

import br.com.attornatus.testbackend.controller.EnderecoService;
import br.com.attornatus.testbackend.model.entitys.Endereco;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/enderecos")
public class EnderecoRestController {
    private EnderecoService service;

    @Autowired
    public EnderecoRestController(EnderecoService service) {
        this.service = service;
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Endereco create(@RequestBody Endereco endereco) {
        return this.service.addEndereco(endereco);
    }

    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Endereco update(@PathVariable("id") Long id, Endereco endereco) {
        endereco.setId(id);
        return this.service.addEndereco(endereco);
    }

    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Iterable<Endereco> list() {
        return this.service.listEndereco();
    }

    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Endereco get(@PathVariable("id") Long id) {
        return this.service.findById(id).get();
    }

    @DeleteMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Endereco delete(@PathVariable("id") Long id) {
        return this.service.deleteEndereco(id).get();
    }
}
