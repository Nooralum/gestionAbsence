package com.upb.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import com.upb.model.Filiere;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class FiliereController {
	
	@Autowired
	Iservice service;
	private Filiere filiere = new Filiere();
	private List<Filiere> listTable = new ArrayList<Filiere>();
	private Filiere selectedFiliere = new Filiere();
	
	
	private CommandButton ajouterBtn = new CommandButton();
	private CommandButton supprimerBtn = new CommandButton();
	private CommandButton modifierBtn = new CommandButton();
	
	
	
	public void ajouter() {
		//pousser en base de donn�ees
		this.service.addObject(filiere);
		this.info("ajout effectu�e avec succ�s!");
	}
	/*
	public void supprimer() {
		this.service.deleteObject(filiere);
		this.supprimer();
		
	}*/
	public void selectionnerLigne() {
		setFiliere(selectedFiliere);
		this.ajouterBtn.setDisabled(true);
		
	}
	
	
	public void info(String monMessage) {
		FacesContext.getCurrentInstance().addMessage((String) null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, monMessage ,null ));
		
	}
	
	
	public Filiere getFiliere() {
		return filiere;
	}
	public void setFiliere(Filiere filiere) {
		this.filiere = filiere;
	}
	@SuppressWarnings("unchecked")
	public List<Filiere> getListTable() {
		listTable = service.getObjects("Filiere");
		System.out.println("Taille de la liste est :"+listTable.size());
		return listTable;
	}
	public void setListTable(List<Filiere> listTable) {
		this.listTable = listTable;
	}
	public Filiere getSelectedFiliere() {
		return selectedFiliere;
	}
	public void setSelectedFiliere(Filiere selectedFiliere) {
		this.selectedFiliere = selectedFiliere;
	}

	public CommandButton getModifierBtn() {
		return modifierBtn;
	}
	public void setModifierBtn(CommandButton modifierBtn) {
		this.modifierBtn = modifierBtn;
	}
	public CommandButton getAjouterBtn() {
		return ajouterBtn;
	}
	public void setAjouterBtn(CommandButton ajouterBtn) {
		this.ajouterBtn = ajouterBtn;
	}
	public CommandButton getSupprimerBtn() {
		return supprimerBtn;
	}
	public void setSupprimerBtn(CommandButton supprimerBtn) {
		this.supprimerBtn = supprimerBtn;
	}
	

}
