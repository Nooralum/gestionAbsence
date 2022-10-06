package com.upb.Controller;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.Enseignant;
import com.upb.model.Utilisateur;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class EnseignantControllers {
	
	@Autowired
	Iservice service;
	private Utilisateur utilisateur = new Utilisateur();
	private Enseignant enseignant = new Enseignant();
	private List<Enseignant> listEnseignant = new ArrayList<>();
	private Enseignant selectedEnseignant = new Enseignant();
	private String nomutilisateur;
	private String prenomsutilisateur;
	private String emailenseignant;
	private String specialiteenseignant;
	private long telephoneutilisateur;
	
	private CommandButton btnEnregistrer = new CommandButton();
	
	
	public void enregistrer() {
		utilisateur.setNomutilisateur(nomutilisateur);
		utilisateur.setPrenomsutilisateur(prenomsutilisateur);
		utilisateur.setTelephoneutilisateur(telephoneutilisateur);
		service.addObject(utilisateur);
		enseignant.setUtilisateur(utilisateur);
		enseignant.setNomutilisateur(nomutilisateur);
		enseignant.setPrenomsutilisateur(prenomsutilisateur);
		enseignant.setTelephoneutilisateur(telephoneutilisateur);
		enseignant.setEmailenseignant(emailenseignant);
		enseignant.setSpecialiteenseignant(specialiteenseignant);
		service.addObject(enseignant);
		
	}
	
	public void selectionerUneLigne() {
		setEnseignant(selectedEnseignant);
		btnEnregistrer.setDisabled(true);
	}
	public Utilisateur getUtilisateur() {
		return utilisateur;
	}
	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}
	public Enseignant getEnseignant() {
		return enseignant;
	}
	public void setEnseignant(Enseignant enseignant) {
		this.enseignant = enseignant;
	}
	
	@SuppressWarnings("unchecked")
	public List<Enseignant> getListEnseignant() {
		listEnseignant = service.getObjects("Enseignant");
		System.out.println("========Taille de la liste est:" +listEnseignant.size());
		return listEnseignant;
	}
	public void setListEnseignant(List<Enseignant> listEnseignant) {
		this.listEnseignant = listEnseignant;
	}
	public Enseignant getSelectedEnseignant() {
		return selectedEnseignant;
	}
	public void setSelectedEnseignant(Enseignant selectedEnseignant) {
		this.selectedEnseignant = selectedEnseignant;
	}
	public CommandButton getBtnEnregistrer() {
		return btnEnregistrer;
	}
	public void setBtnEnregistrer(CommandButton btnEnregistrer) {
		this.btnEnregistrer = btnEnregistrer;
	}
	public String getNomutilisateur() {
		return nomutilisateur;
	}
	public void setNomutilisateur(String nomutilisateur) {
		this.nomutilisateur = nomutilisateur;
	}
	public String getPrenomsutilisateur() {
		return prenomsutilisateur;
	}
	public void setPrenomsutilisateur(String prenomsutilisateur) {
		this.prenomsutilisateur = prenomsutilisateur;
	}
	public String getEmailenseignant() {
		return emailenseignant;
	}
	public void setEmailenseignant(String emailenseignant) {
		this.emailenseignant = emailenseignant;
	}
	public String getSpecialiteenseignant() {
		return specialiteenseignant;
	}
	public void setSpecialiteenseignant(String specialiteenseignant) {
		this.specialiteenseignant = specialiteenseignant;
	}
	public long getTelephoneutilisateur() {
		return telephoneutilisateur;
	}
	public void setTelephoneutilisateur(long telephoneutilisateur) {
		this.telephoneutilisateur = telephoneutilisateur;
	}

}
