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

    public void sePresent (){
        System.out.println("Bonjour, "+this.nom+" ma boisson favorite est "+this.boisson);
    }

    public void boir (){
        System.out.println("Ah !  un bon verre de "+this.boisson+"! GLOUPS !");
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
}
