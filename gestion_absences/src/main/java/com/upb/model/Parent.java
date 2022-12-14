package com.upb.model;
// Generated 2 oct. 2022 � 22:08:38 by Hibernate Tools 4.3.6.Final

import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

/**
 * Parent generated by hbm2java
 */
@Entity
@Table(name = "parent", catalog = "gestion_absences")
public class Parent implements java.io.Serializable {

	private int idParent;
	private String nomparent;
	private String prenomsparent;
	private Long telephoneparent;
	private Set<Etudiant> etudiants = new HashSet<Etudiant>(0);

	public Parent() {
	}

	public Parent(int idParent) {
		this.idParent = idParent;
	}

	public Parent(int idParent, String nomparent, String prenomsparent, Long telephoneparent, Set<Etudiant> etudiants) {
		this.idParent = idParent;
		this.nomparent = nomparent;
		this.prenomsparent = prenomsparent;
		this.telephoneparent = telephoneparent;
		this.etudiants = etudiants;
	}

	@Id
	@GenericGenerator(name="lekerand" , strategy="increment")
	@GeneratedValue(generator="lekerand")
	@Column(name = "ID_PARENT", unique = true, nullable = false)
	public int getIdParent() {
		return this.idParent;
	}

	public void setIdParent(int idParent) {
		this.idParent = idParent;
	}

	@Column(name = "NOMPARENT", length = 30)
	public String getNomparent() {
		return this.nomparent;
	}

	public void setNomparent(String nomparent) {
		this.nomparent = nomparent;
	}

	@Column(name = "PRENOMSPARENT", length = 50)
	public String getPrenomsparent() {
		return this.prenomsparent;
	}

	public void setPrenomsparent(String prenomsparent) {
		this.prenomsparent = prenomsparent;
	}

	@Column(name = "TELEPHONEPARENT")
	public Long getTelephoneparent() {
		return this.telephoneparent;
	}

	public void setTelephoneparent(Long telephoneparent) {
		this.telephoneparent = telephoneparent;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
	public Set<Etudiant> getEtudiants() {
		return this.etudiants;
	}

	public void setEtudiants(Set<Etudiant> etudiants) {
		this.etudiants = etudiants;
	}

}
