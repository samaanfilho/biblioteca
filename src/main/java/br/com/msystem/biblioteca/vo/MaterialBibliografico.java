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
 * MaterialBibliografico generated by hbm2java
 */
@Entity
@Table(name = "material_bibliografico", catalog = "biblioteca")
public class MaterialBibliografico implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6175791388456755916L;
	private Integer idMaterialBibliografico;
	private String codigoMaterialBibliografico;
	private TipoMaterialBibliografico tipoMaterialBibliografico;
	private LocalMaterialBibliografico localMaterialBibliografico;
	private String autor;
	private String titulo;
	private String edicao;
	private Date dataAquisicao;
	private String editora;
	private String resenha;
	private byte[] capa;
	private Set<ReservarMaterialBibliografico> reservarMaterialBibliograficos = new HashSet<ReservarMaterialBibliografico>(
			0);
	private Set<EmprestarMaterialBibliografico> emprestarMaterialBibliograficos = new HashSet<EmprestarMaterialBibliografico>(
			0);
	private Set<BloquearMaterialBibliografico> bloquearMaterialBibliograficos = new HashSet<BloquearMaterialBibliografico>(
			0);
	private Set<SolicitarReserva> solicitarReservas = new HashSet<SolicitarReserva>(
			0);

	public MaterialBibliografico() {
	}

	public MaterialBibliografico(
			String codigoMaterialBibliografico, TipoMaterialBibliografico tipoMaterialBibliografico,
			LocalMaterialBibliografico localMaterialBibliografico,
			String autor, String titulo, String edicao, Date dataAquisicao,
			String editora) {
		this.codigoMaterialBibliografico = codigoMaterialBibliografico;
		this.tipoMaterialBibliografico = tipoMaterialBibliografico;
		this.localMaterialBibliografico = localMaterialBibliografico;
		this.autor = autor;
		this.titulo = titulo;
		this.edicao = edicao;
		this.dataAquisicao = dataAquisicao;
		this.editora = editora;
	}

	public MaterialBibliografico(
			String codigoMaterialBibliografico, 
			TipoMaterialBibliografico tipoMaterialBibliografico,
			LocalMaterialBibliografico localMaterialBibliografico,
			String autor,
			String titulo,
			String edicao,
			Date dataAquisicao,
			String editora,
			String resenha,
			byte[] capa,
			Set<ReservarMaterialBibliografico> reservarMaterialBibliograficos,
			Set<EmprestarMaterialBibliografico> emprestarMaterialBibliograficos,
			Set<BloquearMaterialBibliografico> bloquearMaterialBibliograficos,
			Set<SolicitarReserva> solicitarReservas) {
		this.codigoMaterialBibliografico = codigoMaterialBibliografico;
		this.tipoMaterialBibliografico = tipoMaterialBibliografico;
		this.localMaterialBibliografico = localMaterialBibliografico;
		this.autor = autor;
		this.titulo = titulo;
		this.edicao = edicao;
		this.dataAquisicao = dataAquisicao;
		this.editora = editora;
		this.resenha = resenha;
		this.capa = capa;
		this.reservarMaterialBibliograficos = reservarMaterialBibliograficos;
		this.emprestarMaterialBibliograficos = emprestarMaterialBibliograficos;
		this.bloquearMaterialBibliograficos = bloquearMaterialBibliograficos;
		this.solicitarReservas = solicitarReservas;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id_material_bibliografico", unique = true, nullable = false)
	public Integer getIdMaterialBibliografico() {
		return this.idMaterialBibliografico;
	}

	public void setIdMaterialBibliografico(Integer idMaterialBibliografico) {
		this.idMaterialBibliografico = idMaterialBibliografico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_tipo_material_bibliografico", nullable = false)
	public TipoMaterialBibliografico getTipoMaterialBibliografico() {
		return this.tipoMaterialBibliografico;
	}

	public void setTipoMaterialBibliografico(
			TipoMaterialBibliografico tipoMaterialBibliografico) {
		this.tipoMaterialBibliografico = tipoMaterialBibliografico;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "id_local_material_bibliografico", nullable = false)
	public LocalMaterialBibliografico getLocalMaterialBibliografico() {
		return this.localMaterialBibliografico;
	}

	public void setLocalMaterialBibliografico(
			LocalMaterialBibliografico localMaterialBibliografico) {
		this.localMaterialBibliografico = localMaterialBibliografico;
	}

	@Column(name = "codigo_material_bibliografico", nullable = false, length = 100)
	public String getCodigoMaterialBibliografico() {
		return this.codigoMaterialBibliografico;
	}

	public void setCodigoMaterialBibliografico(String codigoMaterialBibliografico) {
		this.codigoMaterialBibliografico = codigoMaterialBibliografico;
	}

	@Column(name = "autor", nullable = false, length = 45)
	public String getAutor() {
		return this.autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Column(name = "titulo", nullable = false, length = 45)
	public String getTitulo() {
		return this.titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	@Column(name = "edicao", nullable = false, length = 45)
	public String getEdicao() {
		return this.edicao;
	}

	public void setEdicao(String edicao) {
		this.edicao = edicao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "data_aquisicao", nullable = false, length = 19)
	public Date getDataAquisicao() {
		return this.dataAquisicao;
	}

	public void setDataAquisicao(Date dataAquisicao) {
		this.dataAquisicao = dataAquisicao;
	}

	@Column(name = "editora", nullable = false, length = 45)
	public String getEditora() {
		return this.editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	@Column(name = "resenha", length = 65535)
	public String getResenha() {
		return this.resenha;
	}

	public void setResenha(String resenha) {
		this.resenha = resenha;
	}

	@Column(name = "capa")
	public byte[] getCapa() {
		return this.capa;
	}

	public void setCapa(byte[] capa) {
		this.capa = capa;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materialBibliografico")
	public Set<ReservarMaterialBibliografico> getReservarMaterialBibliograficos() {
		return this.reservarMaterialBibliograficos;
	}

	public void setReservarMaterialBibliograficos(
			Set<ReservarMaterialBibliografico> reservarMaterialBibliograficos) {
		this.reservarMaterialBibliograficos = reservarMaterialBibliograficos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materialBibliografico")
	public Set<EmprestarMaterialBibliografico> getEmprestarMaterialBibliograficos() {
		return this.emprestarMaterialBibliograficos;
	}

	public void setEmprestarMaterialBibliograficos(
			Set<EmprestarMaterialBibliografico> emprestarMaterialBibliograficos) {
		this.emprestarMaterialBibliograficos = emprestarMaterialBibliograficos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materialBibliografico")
	public Set<BloquearMaterialBibliografico> getBloquearMaterialBibliograficos() {
		return this.bloquearMaterialBibliograficos;
	}

	public void setBloquearMaterialBibliograficos(
			Set<BloquearMaterialBibliografico> bloquearMaterialBibliograficos) {
		this.bloquearMaterialBibliograficos = bloquearMaterialBibliograficos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "materialBibliografico")
	public Set<SolicitarReserva> getSolicitarReservas() {
		return this.solicitarReservas;
	}

	public void setSolicitarReservas(Set<SolicitarReserva> solicitarReservas) {
		this.solicitarReservas = solicitarReservas;
	}

}
