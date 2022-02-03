package com.company;

public class Humain {
    protected String nom;
    protected String boisson;

    public Humain() {
    }

    public Humain(String nom) {
        this.nom = nom;
        this.boisson = "eau";
    }

    public void sePresenter(){
        System.out.println(this.nom + " - Bonjour, "+this.nom+". Ma boisson favorite est "+this.boisson+".");
    }

    public void boir(){
        System.out.println(this.nom + " - Ah !  Un bon verre de "+this.boisson+"! GLOUPS !");
    }

    public String parler(String parole){
        String chaine;
        chaine = "("+this.nom+") - "+ parole;
        return chaine;
    }

    public String getNom() {
        return nom;
    }

    public String getBoisson() {
        return boisson;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setBoisson(String boisson) {
        this.boisson = boisson;
    }

    public void quelEstTonNom(){
        System.out.println(this.nom);
    }


}


