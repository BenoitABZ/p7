package com.library.LibraryBatch.bean;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIdentityInfo;
import com.fasterxml.jackson.annotation.JsonIdentityReference;
import com.fasterxml.jackson.annotation.ObjectIdGenerators;

@Entity
@JsonIdentityInfo(generator=ObjectIdGenerators.PropertyGenerator.class, property="id",scope=Bibliotheque.class)

public class Bibliotheque implements Serializable{
	
	private static final long serialVersionUID = 1L; 
	
	    @Id
	    @GeneratedValue
	    @Column(name="id_bibliotheque")
	    private Integer id;
	    
	    @Column(name="nom")
	    private String nom;
	    
	    @Column(name="telephone")
	    private String telephone;
	    
		@Column(name="mail")
	    private String mail;
		
		@Column(name="image")
		private String image;
	 
		@Embedded		
	    private Adresse adresse;
	    
		
	    @OneToMany(mappedBy="bibliotheque", cascade=CascadeType.PERSIST)
		private Set<Exemplaire> exemplaires;

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}
		
	    public String getTelephone() {
			return telephone;
	    }

	    public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
			
			   
		public String getMail() {
			return mail;
		}

		public void setMail(String mail) {
			this.mail = mail;
		}

		public Adresse getAdresse() {
			return adresse;
		}

		public void setAdresse(Adresse adresse) {
			this.adresse = adresse;
		}
		
		public String getImage() {
			return image;
		}

		public void setImage(String image) {
			this.image = image;
		}

		public Set<Exemplaire> getExemplaires() {
			return exemplaires;
		}

		public void setExemplaires(Set<Exemplaire> exemplaires) {
			this.exemplaires = exemplaires;
		}
	
	

}