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
 * Niveaux generated by hbm2java
 */
@Entity
@Table(name = "niveaux", catalog = "gestion_absences")
public class Niveaux implements java.io.Serializable {

	private int idNiveau;
	private Administrateur administrateur;
	private String designationNiveau;
	private Set<Administrateur> administrateurs = new HashSet<Administrateur>(0);
	private Set<Etudiant> etudiants = new HashSet<Etudiant>(0);

	public Niveaux() {
	}

	public Niveaux(int idNiveau, Administrateur administrateur) {
		this.idNiveau = idNiveau;
		this.administrateur = administrateur;
	}

	public Niveaux(int idNiveau, Administrateur administrateur, String designationNiveau,
			Set<Administrateur> administrateurs, Set<Etudiant> etudiants) {
		this.idNiveau = idNiveau;
		this.administrateur = administrateur;
		this.designationNiveau = designationNiveau;
		this.administrateurs = administrateurs;
		this.etudiants = etudiants;
	}

	@Id

	@Column(name = "ID_NIVEAU", unique = true, nullable = false)
	public int getIdNiveau() {
		return this.idNiveau;
	}

	public void setIdNiveau(int idNiveau) {
		this.idNiveau = idNiveau;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_UTILISATEUR", nullable = false)
	public Administrateur getAdministrateur() {
		return this.administrateur;
	}

	public void setAdministrateur(Administrateur administrateur) {
		this.administrateur = administrateur;
	}

	@Column(name = "DESIGNATION_NIVEAU", length = 50)
	public String getDesignationNiveau() {
		return this.designationNiveau;
	}

	public void setDesignationNiveau(String designationNiveau) {
		this.designationNiveau = designationNiveau;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "niveaux")
	public Set<Administrateur> getAdministrateurs() {
		return this.administrateurs;
	}

	public void setAdministrateurs(Set<Administrateur> administrateurs) {
		this.administrateurs = administrateurs;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "niveaux")
	public Set<Etudiant> getEtudiants() {
		return this.etudiants;
	}

	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
