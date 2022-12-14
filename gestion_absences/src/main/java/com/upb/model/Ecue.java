package com.upb.model;
// Generated 2 oct. 2022 ? 22:08:38 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Ecue generated by hbm2java
 */
@Entity
@Table(name = "ecue", catalog = "gestion_absences")
public class Ecue implements java.io.Serializable {

	private String codeecue;
	private Semestre semestre;
	private String intituleecue;
	private String typedecours;
	private Set<Absences> absenceses = new HashSet<Absences>(0);

	public Ecue() {
	}

	public Ecue(String codeecue, Semestre semestre) {
		this.codeecue = codeecue;
		this.semestre = semestre;
	}

	public Ecue(String codeecue, Semestre semestre, String intituleecue, String typedecours, Set<Absences> absenceses) {
		this.codeecue = codeecue;
		this.semestre = semestre;
		this.intituleecue = intituleecue;
		this.typedecours = typedecours;
		this.absenceses = absenceses;
	}

	@Id

	@Column(name = "CODEECUE", unique = true, nullable = false, length = 10)
	public String getCodeecue() {
		return this.codeecue;
	}

	public void setCodeecue(String codeecue) {
		this.codeecue = codeecue;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_SEMESTRE", nullable = false)
	public Semestre getSemestre() {
		return this.semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	@Column(name = "INTITULEECUE", length = 100)
	public String getIntituleecue() {
		return this.intituleecue;
	}

	public void setIntituleecue(String intituleecue) {
		this.intituleecue = intituleecue;
	}

	@Column(name = "TYPEDECOURS", length = 30)
	public String getTypedecours() {
		return this.typedecours;
	}

	public void setTypedecours(String typedecours) {
		this.typedecours = typedecours;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "ecue")
	public Set<Absences> getAbsenceses() {
		return this.absenceses;
	}

	public void setAbsenceses(Set<Absences> absenceses) {
		this.absenceses = absenceses;
	}

}
