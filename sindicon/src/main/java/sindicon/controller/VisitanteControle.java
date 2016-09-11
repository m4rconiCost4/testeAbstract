package sindicon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import sindicon.model.persistencia.entidade.Pessoa;
import sindicon.model.persistencia.entidade.Visitante;
import sindicon.model.servico.VisitanteServico;

/**
 * Created by Marconi on 11/09/2016.
 */
@RestController
@RequestMapping("/visitante")
public class VisitanteControle {
    @Autowired
    VisitanteServico visitanteServico;

    //GET(Persons)
    @RequestMapping(method = RequestMethod.GET)
    public Iterable<Visitante> get() {
        return visitanteServico.consultarVisitante();
    }

    //POST(Persons)
    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> post(@RequestBody Visitante visitante) {
        visitanteServico.criarVisitante(visitante);
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }

    //PUT(Persons)
    @RequestMapping(method = RequestMethod.PUT)
    public ResponseEntity<?> put(@RequestBody Visitante visitante) {
        HttpHeaders httpHeaders = new HttpHeaders();
        try {
            visitanteServico.atualizarVisitante(visitante);
        } catch (Exception e) {
            return new ResponseEntity<>(null, httpHeaders, HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.CREATED);
    }

    //DELETE(Persons)
    @RequestMapping(method = RequestMethod.DELETE)
    public ResponseEntity<?> delete(@RequestBody Visitante visitante) {
        visitanteServico.deletarVisitante(visitante);
        HttpHeaders httpHeaders = new HttpHeaders();
        return new ResponseEntity<>(null, httpHeaders, HttpStatus.OK);
    }
}