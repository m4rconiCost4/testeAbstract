package sindicon.model.persistencia.entidade;

import javax.persistence.*;

/**
 * Created by Marconi on 04/09/2016.
 */
@Entity
@AttributeOverrides(value=
@AttributeOverride(name = "idPessoa",column = @Column(name = "id_visitante")))
public class Visitante extends Pessoa {

}