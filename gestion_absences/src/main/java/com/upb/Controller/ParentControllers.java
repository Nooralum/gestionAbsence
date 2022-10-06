package com.upb.Controller;

import java.util.ArrayList;
import java.util.List;

import org.primefaces.component.commandbutton.CommandButton;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


import com.upb.model.Parent;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class ParentControllers {

	@Autowired
	Iservice service;
	private Parent parent = new Parent();
	private List<Parent> listparent = new ArrayList<Parent>();
	private Parent selectedParent = new Parent();
	
	private CommandButton btnEnregistrer = new CommandButton();
	
	public void enregistrer() {
		service.addObject(parent);
	}
	
	public void selectionnerUneLigne() {
		setParent(selectedParent);
		btnEnregistrer.setDisabled(true);
	}
	public Parent getParent() {
		return parent;
	}
	public void setParent(Parent parent) {
		this.parent = parent;
	}
	
	@SuppressWarnings("unchecked")
	public List<Parent> getListparent() {
		listparent = service.getObjects("Parent");
		System.out.println("=========Taille de la liste est:" +listparent.size());
		return listparent;
	}
	public void setListparent(List<Parent> listparent) {
		this.listparent = listparent;
	}
	public Parent getSelectedParent() {
		return selectedParent;
	}
	public void setSelectedParent(Parent selectedParent) {
		this.selectedParent = selectedParent;
	}
	public CommandButton getBtnEnregistrer() {
		return btnEnregistrer;
	}
	public void setBtnEnregistrer(CommandButton btnEnregistrer) {
		this.btnEnregistrer = btnEnregistrer;
	}
}
