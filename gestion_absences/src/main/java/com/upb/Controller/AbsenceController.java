package com.upb.Controller;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import com.upb.model.Absences;
import com.upb.model.Ecue;
import com.upb.model.Enseignant;
import com.upb.model.Etudiant;
import com.upb.model.Justification;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class AbsenceController {
	
	@Autowired
	Iservice service;
	private Absences absence= new Absences();
	private Enseignant enseignant = new Enseignant();
	private Etudiant etudiant = new Etudiant();
	private Ecue ecue = new Ecue();
	private Justification justification = new Justification();
	
	
	private int idAbsence;
	private int idUtilisateur;
	private List<Enseignant> listEnseignant = new ArrayList<Enseignant>();
	private List<Etudiant> listEtudiant = new ArrayList<Etudiant>();
	private List<Ecue> listEcue = new ArrayList<Ecue>();
	private List<Absences> listAbsences = new ArrayList<Absences>();
	private Absences selectAbsences = new Absences();
	
	
	private CommandButton boutonSupprimer= new CommandButton();
	private CommandButton boutonAnnuler = new CommandButton();
	private CommandButton boutonModifier = new CommandButton();
	
	
	
	
	
	public void supprimer() {
		this.service.deleteObject(absence);
		this.supprimer();
	}
	
	
	
	public Absences getAbsence() {
		return absence;
	}
	public void setAbsence(Absences absence) {
		this.absence = absence;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	public Etudiant getEtudiant() {
		return etudiant;
	}
	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}
	public Justification getJustification() {
		return justification;
	}
	public void setJustification(Justification justification) {
		this.justification = justification;
	}
	public int getIdAbsence() {
		return idAbsence;
	}
	public void setIdAbsence(int idAbsence) {
		this.idAbsence = idAbsence;
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	
	@SuppressWarnings("unchecked")
	public List<Enseignant> getListEnseignant() {
		listEnseignant= service.getObjects("Medecin");
		System.out.println("=================Taille de laliste: "+listEnseignant.size());
		return listEnseignant;
	}
	
	
	public void setListEnseignant(List<Enseignant> listEnseignant) {
		this.listEnseignant = listEnseignant;
	}
	
	@SuppressWarnings("unchecked")
	public List<Etudiant> getListEtudiant() {
		listEtudiant= service.getObjects("Etudiant");
		System.out.println("=================Taille de laliste: "+listEtudiant.size());
		return listEtudiant;
	}
	public void setListEtudiant(List<Etudiant> listEtudiant) {
		this.listEtudiant = listEtudiant;
	}
	
	@SuppressWarnings("unchecked")
	public List<Ecue> getListEcue() {
		listEcue= service.getObjects("Ecue");
		System.out.println("=================Taille de laliste: "+listEcue.size());
		return listEcue;
	}
	public void setListEcue(List<Ecue> listEcue) {
		this.listEcue = listEcue;
	}
	
	@SuppressWarnings("unchecked")
	public List<Absences> getListAbsences() {
		listAbsences= service.getObjects("Absences");
		System.out.println("=================Taille de laliste: "+listAbsences.size());
		return listAbsences;
	}
	
	public void setListAbsences(List<Absences> listAbsences) {
		this.listAbsences = listAbsences;
	}
	public Absences getSelectAbsences() {
		return selectAbsences;
	}
	public void setSelectAbsences(Absences selectAbsences) {
		this.selectAbsences = selectAbsences;
	}

	public CommandButton getBoutonSupprimer() {
		return boutonSupprimer;
	}
	public void setBoutonSupprimer(CommandButton boutonSupprimer) {
		this.boutonSupprimer = boutonSupprimer;
	}
	public CommandButton getBoutonAnnuler() {
		return boutonAnnuler;
	}
	public void setBoutonAnnuler(CommandButton boutonAnnuler) {
		this.boutonAnnuler = boutonAnnuler;
	}
	public CommandButton getBoutonModifier() {
		return boutonModifier;
	}
	public void setBoutonModifier(CommandButton boutonModifier) {
		this.boutonModifier = boutonModifier;
	}
	public Ecue getEcue() {
		return ecue;
	}
	public void setEcue(Ecue ecue) {
		this.ecue = ecue;
	}
	
	

}
