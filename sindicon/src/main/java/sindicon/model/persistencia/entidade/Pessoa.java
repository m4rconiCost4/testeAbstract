package sindicon.model.persistencia.entidade;

import javax.persistence.*;

/**
 * Created by Marconi on 01/09/2016.
 */
@MappedSuperclass
@Inheritance (strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Pessoa {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private Integer idPessoa;
    private String nome;
    private Integer rg;
    @Column(name = "orgao_expeditor")
    private String orgaoExpeditor;
    private String cpf;
    private Byte foto;
    @Column(name = "tipo_pessoa")
    private Boolean tipoPessoa;
    private String observação;

//Relacionamentos:
//Gets e Sets:


    public Integer getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(Integer idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getRg() {
        return rg;
    }

    public void setRg(Integer rg) {
        this.rg = rg;
    }

    public String getOrgaoExpeditor() {
        return orgaoExpeditor;
    }

    public void setOrgaoExpeditor(String orgaoExpeditor) {
        this.orgaoExpeditor = orgaoExpeditor;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Byte getFoto() {
        return foto;
    }

    public void setFoto(Byte foto) {
        this.foto = foto;
    }

    public Boolean getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(Boolean tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public String getObservação() {
        return observação;
    }

    public void setObservação(String observação) {
        this.observação = observação;
    }
}