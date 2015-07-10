package br.com.msystem.biblioteca.vo;
// Generated 01/03/2012 01:28:16 by Hibernate Tools 3.4.0.CR1


import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * SolicitarReserva generated by hbm2java
 */
@Entity
@Table(name="solicitar_reserva"
    ,catalog="biblioteca"
)
public class SolicitarReserva  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 6122758414871606074L;
	private Integer idSolicitarReserva;
     private Usuario usuario;
     private MaterialBibliografico materialBibliografico;
     private Date dataSolicitacao;
     private String observacao;
     private Set<ReservarMaterialBibliografico> reservarMaterialBibliograficos = new HashSet<ReservarMaterialBibliografico>(0);

    public SolicitarReserva() {
    }

	
    public SolicitarReserva(Usuario usuario, MaterialBibliografico materialBibliografico, Date dataSolicitacao) {
        this.usuario = usuario;
        this.materialBibliografico = materialBibliografico;
        this.dataSolicitacao = dataSolicitacao;
    }
    public SolicitarReserva(Usuario usuario, MaterialBibliografico materialBibliografico, Date dataSolicitacao, String observacao, Set<ReservarMaterialBibliografico> reservarMaterialBibliograficos) {
       this.usuario = usuario;
       this.materialBibliografico = materialBibliografico;
       this.dataSolicitacao = dataSolicitacao;
       this.observacao = observacao;
       this.reservarMaterialBibliograficos = reservarMaterialBibliograficos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_solicitar_reserva", unique=true, nullable=false)
    public Integer getIdSolicitarReserva() {
        return this.idSolicitarReserva;
    }
    
    public void setIdSolicitarReserva(Integer idSolicitarReserva) {
        this.idSolicitarReserva = idSolicitarReserva;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_usuario", nullable=false)
    public Usuario getUsuario() {
        return this.usuario;
    }
    
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_material_bibliografico", nullable=false)
    public MaterialBibliografico getMaterialBibliografico() {
        return this.materialBibliografico;
    }
    
    public void setMaterialBibliografico(MaterialBibliografico materialBibliografico) {
        this.materialBibliografico = materialBibliografico;
    }

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="data_solicitacao", nullable=false, length=19)
    public Date getDataSolicitacao() {
        return this.dataSolicitacao;
    }
    
    public void setDataSolicitacao(Date dataSolicitacao) {
        this.dataSolicitacao = dataSolicitacao;
    }

    
    @Column(name="observacao", length=65535)
    public String getObservacao() {
        return this.observacao;
    }
    
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="solicitarReserva")
    public Set<ReservarMaterialBibliografico> getReservarMaterialBibliograficos() {
        return this.reservarMaterialBibliograficos;
    }
    
    public void setReservarMaterialBibliograficos(Set<ReservarMaterialBibliografico> reservarMaterialBibliograficos) {
        this.reservarMaterialBibliograficos = reservarMaterialBibliograficos;
    }




}


