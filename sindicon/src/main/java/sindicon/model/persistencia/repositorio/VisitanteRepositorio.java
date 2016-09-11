package sindicon.model.persistencia.repositorio;

import org.springframework.data.repository.CrudRepository;
import sindicon.model.persistencia.entidade.Pessoa;
import sindicon.model.persistencia.entidade.Visitante;

/**
 * Created by Marconi on 11/09/2016.
 */
public interface VisitanteRepositorio extends CrudRepository<Visitante, Integer> {

}
