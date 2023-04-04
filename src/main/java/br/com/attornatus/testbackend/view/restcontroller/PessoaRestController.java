package br.com.attornatus.testbackend.view.restcontroller;

import br.com.attornatus.testbackend.controller.PessoaService;
import br.com.attornatus.testbackend.model.entitys.Pessoa;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pessoas")
public class PessoaRestController {
    private PessoaService service;

    public PessoaRestController(PessoaService service) {
        this.service = service;
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Pessoa create(@RequestBody Pessoa pessoa) {
        return this.service.addPessoa(pessoa);
    }


    //feito
    @PutMapping(
            value = "/{id}",
            consumes = {MediaType.APPLICATION_JSON_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Pessoa update(@PathVariable("id") Long id,
                         @RequestBody Pessoa pessoa) {
        pessoa.setId(id);
        return this.service.updatePessoa(pessoa);
    }


    //feito
    @GetMapping(
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Iterable<Pessoa> list() {
        return this.service.listPessoas();
    }


    //feito
    @GetMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Pessoa get(@PathVariable("id") Long id) {
        return this.service.findById(id).get();
    }


    //feito
    @DeleteMapping(
            value = "/{id}",
            produces = {MediaType.APPLICATION_JSON_VALUE}
    )
    public Pessoa delete(@PathVariable("id") Long id) {
        return this.service.deletePessoa(id).get();
    }
}
