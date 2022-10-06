package com.upb.Controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.Administrateur;
import com.upb.model.Utilisateur;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class AdministrateurController {
		
		   
			@Autowired
			Iservice service;
			private Utilisateur utilisateur = new Utilisateur();
			private Administrateur administrateur= new 	Administrateur();
			private List<Administrateur> listTable = new ArrayList<Administrateur>();
			private Administrateur selectedAdministrateur = new Administrateur();
			
			private CommandButton enregistrerBtn = new CommandButton();
			private CommandButton supprimerBtn = new CommandButton();
			private CommandButton modifierBtn = new CommandButton();
			
			
			public void initialiser() {
				modifierBtn.setDisabled(true);
			}
			
			
			public void enregistrer() {
				//pousser en base de donn�ees
				this.service.addObject(administrateur);
				this.info("Enregistrement effectu�e avec succ�s!");
				
				
				
			}
			public void supprimer() {
				this.service.deleteObject(administrateur);
				this.supprimer();
				
			}
			public void selectionnerLigne() {
				setAdministrateur(selectedAdministrateur);
				this.enregistrerBtn.setDisabled(true);
				this.supprimerBtn.setDisabled(false);
			}
			
			public void info(String message) {
				FacesContext.getCurrentInstance().addMessage((String) null,
						new FacesMessage(FacesMessage.SEVERITY_INFO, message, null));
			}	
			
			
			public Utilisateur getUtilisateur() {
				return utilisateur;
			}
			public void setUtilisateur(Utilisateur utilisateur) {
				this.utilisateur = utilisateur;
			}
			public Administrateur getAdministrateur() {
				return administrateur;
			}
			public void setAdministrateur(Administrateur administrateur) {
				this.administrateur = administrateur;
			}
			public List<Administrateur> getListTable() {
				return listTable;
			}
			public void setListTable(List<Administrateur> listTable) {
				this.listTable = listTable;
			}
			public Administrateur getSelectedAdministrateur() {
				return selectedAdministrateur;
			}
			public void setSelectedAdministrateur(Administrateur selectedAdministrateur) {
				this.selectedAdministrateur = selectedAdministrateur;
			}
			public CommandButton getEnregistrerBtn() {
				return enregistrerBtn;
			}
			public void setEnregistrerBtn(CommandButton enregistrerBtn) {
				this.enregistrerBtn = enregistrerBtn;
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
