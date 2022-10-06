package com.upb.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import com.upb.model.Niveaux;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class NiveauxController {
	
	@Autowired
	Iservice service;
	private Niveaux niveaux = new Niveaux();
	private List<Niveaux> listTable = new ArrayList<Niveaux>();
	private Niveaux selectedNiveaux = new Niveaux();
	
	private CommandButton ajouterBtn = new CommandButton();
	private CommandButton supprimerBtn = new CommandButton();
	private CommandButton modifierBtn = new CommandButton();
	
	public void ajouter() {
		//pousser en base de donn�ees
		service.addObject(niveaux);
		info("ajout effectu�e avec succ�s!");
	}
	
	
	public void selectionnerLigne() {
		setNiveaux(selectedNiveaux);
		this.ajouterBtn.setDisabled(true);
		
	}
	
	public void info(String monMessage) {
		FacesContext.getCurrentInstance().addMessage((String) null,
				new FacesMessage(FacesMessage.SEVERITY_INFO, monMessage ,null ));
		
	}
	

	
	public Niveaux getNiveaux() {
		return niveaux;
	}
	
	
	public void setNiveaux(Niveaux niveaux) {
		this.niveaux = niveaux;
	}
	
	@SuppressWarnings("unchecked")
	public List<Niveaux> getListTable() {
		listTable = service.getObjects("Niveaux");
		System.out.println("=============Taille de la liste:" +listTable.size());
		return listTable;
	}
	public void setListTable(List<Niveaux> listTable) {
		this.listTable = listTable;
	}
	public Niveaux getSelectedNiveaux() {
		return selectedNiveaux;
	}
	public void setSelectedNiveaux(Niveaux selectedNiveaux) {
		this.selectedNiveaux = selectedNiveaux;
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


	public CommandButton getModifierBtn() {
		return modifierBtn;
	}


	public void setModifierBtn(CommandButton modifierBtn) {
		this.modifierBtn = modifierBtn;
	}

}
