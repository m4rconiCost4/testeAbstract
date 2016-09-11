package sindicon.model.persistencia.entidade;

import javax.persistence.*;

/**
 * Created by Marconi on 04/09/2016.
 */
@Entity
public class Visitante extends Pessoa {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Integer idVisitante;

    public Integer getIdVisitante() {
        return idVisitante;
    }

    public void setIdVisitante(Integer idVisitante) {
        this.idVisitante = idVisitante;
    }
}