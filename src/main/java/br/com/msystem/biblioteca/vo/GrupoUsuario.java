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
 * GrupoUsuario generated by hbm2java
 */
@Entity
@Table(name="grupo_usuario"
    ,catalog="biblioteca"
)
public class GrupoUsuario  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1316824626103518310L;
	private Integer idGrupoUsuario;
     private String descricaoGrupoUsuario;
     private Set<Usuario> usuarios = new HashSet<Usuario>(0);
     private Set<GrupoUsuarioPermissao> grupoUsuarioPermissaos = new HashSet<GrupoUsuarioPermissao>(0);

    public GrupoUsuario() {
    }

	
    public GrupoUsuario(String descricaoGrupoUsuario) {
        this.descricaoGrupoUsuario = descricaoGrupoUsuario;
    }
    public GrupoUsuario(String descricaoGrupoUsuario, Set<Usuario> usuarios, Set<GrupoUsuarioPermissao> grupoUsuarioPermissaos) {
       this.descricaoGrupoUsuario = descricaoGrupoUsuario;
       this.usuarios = usuarios;
       this.grupoUsuarioPermissaos = grupoUsuarioPermissaos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="id_grupo_usuario", unique=true, nullable=false)
    public Integer getIdGrupoUsuario() {
        return this.idGrupoUsuario;
    }
    
    public void setIdGrupoUsuario(Integer idGrupoUsuario) {
        this.idGrupoUsuario = idGrupoUsuario;
    }

    
    @Column(name="descricao_grupo_usuario", nullable=false, length=50)
    public String getDescricaoGrupoUsuario() {
        return this.descricaoGrupoUsuario;
    }
    
    public void setDescricaoGrupoUsuario(String descricaoGrupoUsuario) {
        this.descricaoGrupoUsuario = descricaoGrupoUsuario;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grupoUsuario")
    public Set<Usuario> getUsuarios() {
        return this.usuarios;
    }
    
    public void setUsuarios(Set<Usuario> usuarios) {
        this.usuarios = usuarios;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="grupoUsuario")
    public Set<GrupoUsuarioPermissao> getGrupoUsuarioPermissaos() {
        return this.grupoUsuarioPermissaos;
    }
    
    public void setGrupoUsuarioPermissaos(Set<GrupoUsuarioPermissao> grupoUsuarioPermissaos) {
        this.grupoUsuarioPermissaos = grupoUsuarioPermissaos;
    }




}


