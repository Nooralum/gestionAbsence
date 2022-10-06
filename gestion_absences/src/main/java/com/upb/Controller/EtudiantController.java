package com.upb.Controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import com.upb.model.Etudiant;
import com.upb.model.Filiere;
import com.upb.model.Niveaux;
import com.upb.model.Parent;
import com.upb.model.Utilisateur;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class EtudiantController {
        
	@Autowired
	Iservice service;
	private Utilisateur utilisateur = new Utilisateur();
	private Etudiant etudiant = new Etudiant();
	private List<Parent> listParent = new ArrayList<Parent>();
	private List<Niveaux> listNiveaux = new ArrayList<Niveaux>();
	private List<Filiere> listFiliere = new ArrayList<Filiere>();
	private Etudiant selectedEtudiant = new Etudiant();
	private Date datedenaissance = new Date();
	
	private CommandButton ajouterBtn = new CommandButton();
	private CommandButton annulerBtn = new CommandButton();
	private CommandButton modifierBtn = new CommandButton();
	
	
	public void ajouter() {
		
		SimpleDateFormat formaterDate = new SimpleDateFormat("");
		String date = formaterDate.format(datedenaissance);
		etudiant.setDatedenaissance(datedenaissance);
		service.addObject(etudiant);
		etudiant.setAbsenceses(null);
		etudiant.setFiliere(null);
		etudiant.setNiveaux(null);
		etudiant.getParent();
	}
	

	public CommandButton getAjouterBtn() {
		return ajouterBtn;
	}

	public void setAjouterBtn(CommandButton ajouterBtn) {
		this.ajouterBtn = ajouterBtn;
	}

	public CommandButton getAnnulerBtn() {
		return annulerBtn;
	}

	public void setAnnulerBtn(CommandButton annulerBtn) {
		this.annulerBtn = annulerBtn;
	}

	
	public Etudiant getSelectedEtudiant() {
		return selectedEtudiant;
	}

	public void setSelectedEtudiant(Etudiant selectedEtudiant) {
		this.selectedEtudiant = selectedEtudiant;
	}

	public Etudiant getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiant etudiant) {
		this.etudiant = etudiant;
	}



	public Utilisateur getUtilisateur() {
		return utilisateur;
	}


	public void setUtilisateur(Utilisateur utilisateur) {
		this.utilisateur = utilisateur;
	}


	public Date getdatedenaissance() {
		return datedenaissance;
	}


	public void setDatedenaissance(Date datedenaissance) {
		this.datedenaissance = datedenaissance;
	}


	public CommandButton getModifierBtn() {
		return modifierBtn;
	}


	public void setModifierBtn(CommandButton modifierBtn) {
		this.modifierBtn = modifierBtn;
	}

	@SuppressWarnings("unchecked")
	public List<Parent> getListParent() {
		listParent= service.getObjects("Parent");
		System.out.println("=================Taille de laliste: "+listParent.size());
		return listParent;
	}


	public void setListParent(List<Parent> listParent) {
		this.listParent = listParent;
	}

	@SuppressWarnings("unchecked")
	public List<Niveaux> getListNiveaux() {
		listNiveaux= service.getObjects("Niveaux");
		System.out.println("=================Taille de laliste: "+listNiveaux.size());
		return listNiveaux;
	}


	public void setListNiveaux(List<Niveaux> listNiveaux) {
		this.listNiveaux = listNiveaux;
	}

	@SuppressWarnings("unchecked")
	public List<Filiere> getListFiliere() {
		listFiliere= service.getObjects("Filiere");
		System.out.println("=================Taille de laliste: "+listFiliere.size());
		return listFiliere;
	}


	public void setListFiliere(List<Filiere> listFiliere) {
		this.listFiliere = listFiliere;
	}
}
	
	

