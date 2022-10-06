package com.upb.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.upb.model.Ecue;
import com.upb.model.Semestre;
import com.upb.service.Iservice;

@Component
@Scope("session")
public class EcueController {
	
	@Autowired
	Iservice service;
	private Ecue ecue = new Ecue();
	private Semestre semestre = new Semestre();
	private Ecue selectedEcue = new Ecue();
	
   private String codeecue;
   private int idSemestre;
   private List<Ecue> listEcue = new ArrayList<Ecue>();
   private List<Semestre> listSemestre = new ArrayList<Semestre>();
   
   
	
   
	
	public Ecue getEcue() {
		return ecue;
	}
	public void setEcue(Ecue ecue) {
		this.ecue = ecue;
	}
	
	
	
	public Ecue getSelectedEcue() {
		return selectedEcue;
	}
	public void setSelectedEcue(Ecue selectedEcue) {
		this.selectedEcue = selectedEcue;
	}
	public Semestre getSemestre() {
		return semestre;
	}
	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}
	public String getCodeecue() {
		return codeecue;
	}
	public void setCodeecue(String codeecue) {
		this.codeecue = codeecue;
	}
	public int getIdSemestre() {
		return idSemestre;
	}
	public void setIdSemestre(int idSemestre) {
		this.idSemestre = idSemestre;
	}
	public List<Ecue> getListEcue() {
		return listEcue;
	}
	public void setListEcue(List<Ecue> listEcue) {
		this.listEcue = listEcue;
	}
	public List<Semestre> getListSemestre() {
		return listSemestre;
	}
	public void setListSemestre(List<Semestre> listSemestre) {
		this.listSemestre = listSemestre;
	}
	

}
