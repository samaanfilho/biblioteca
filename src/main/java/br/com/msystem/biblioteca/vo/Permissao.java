package br.com.msystem.biblioteca.vo;
// Generated 01/03/2012 01:28:16 by Hibernate Tools 3.4.0.CR1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Permissao generated by hbm2java
 */
@Entity
@Table(name="permissao"
    ,catalog="biblioteca"
)
public class Permissao  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = -3089105672031078300L;
	private Integer idPermissao;
     private String funcionalidade;
     private Set<GrupoUsuarioPermissao> grupoUsuarioPermissaos = new HashSet<GrupoUsuarioPermissao>(0);

    public Permissao() {
    }

	
    public Permissao(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }
    public Permissao(String funcionalidade, Set<GrupoUsuarioPermissao> grupoUsuarioPermissaos) {
       this.funcionalidade = funcionalidade;
       this.grupoUsuarioPermissaos = grupoUsuarioPermissaos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_permissao", unique=true, nullable=false)
    public Integer getIdPermissao() {
        return this.idPermissao;
    }
    
    public void setIdPermissao(Integer idPermissao) {
        this.idPermissao = idPermissao;
    }

    
    @Column(name="funcionalidade", nullable=false, length=45)
    public String getFuncionalidade() {
        return this.funcionalidade;
    }
    
    public void setFuncionalidade(String funcionalidade) {
        this.funcionalidade = funcionalidade;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="permissao")
    public Set<GrupoUsuarioPermissao> getGrupoUsuarioPermissaos() {
        return this.grupoUsuarioPermissaos;
    }
    
    public void setGrupoUsuarioPermissaos(Set<GrupoUsuarioPermissao> grupoUsuarioPermissaos) {
        this.grupoUsuarioPermissaos = grupoUsuarioPermissaos;
    }




}


