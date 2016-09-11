package sindicon.model.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sindicon.model.persistencia.entidade.Pessoa;
import sindicon.model.persistencia.entidade.Visitante;
import sindicon.model.persistencia.repositorio.VisitanteRepositorio;

/**
 * Created by Marconi on 11/09/2016.
 */
@Service
public class VisitanteServico {
        @Autowired
        VisitanteRepositorio visitanteRepositorio;

        //GET(Persons)
        public Iterable<Visitante> consultarVisitante() {
            return visitanteRepositorio.findAll();
        }

        //POST(Persons)
        public void criarVisitante(Visitante visitante) {
            visitanteRepositorio.save(visitante);
        }

        //PUT(Persons)
        public void atualizarVisitante(Visitante visitante) throws Exception {
            if (visitante.getIdVisitante() == null) {
                throw new Exception("Não foi possível atualizar um documento(Document) com Id nulo.");
            }
            visitanteRepositorio.save(visitante);
        }

        //DELETE(Documents)
        public void deletarVisitante(Visitante visitante) {
            visitanteRepositorio.delete(visitante);
        }
}
