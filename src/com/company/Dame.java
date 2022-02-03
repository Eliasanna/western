package com.company;

public class Dame extends Humain {
    private String couleurRobe;
    private boolean estPrisoniere;

    public Dame(String nom, String couleurRobe) {
        super(nom);
        this.couleurRobe = couleurRobe;
        estPrisoniere =false;
    }

    public void kidnapper (){
        this.estPrisoniere = false;
        //hurle
        System.out.println(this.nom + " - AHHHHHHHHHHHHHHH!!!!!!!!!!  AUUUU SECOUUUURT");
    }

    public void libérer(Humain coboy){
        this.estPrisoniere = true;
        //hurle
        System.out.println(this.nom + " - Merci beacoup Mr "+coboy.nom);
    }

    public void changeRobe(String couleur){
        this.couleurRobe=couleur;
        System.out.println(this.nom + " - Regardez ma nouvelle robe "+this.couleurRobe);
    }

    public String getCouleurRobe() {
        return couleurRobe;
    }

    public boolean isEstPrisoniere() {
        return estPrisoniere;
    }

    public void setCouleurRobe(String couleurRobe) {
        this.couleurRobe = couleurRobe;
    }

    public void setEstPrisoniere(boolean estPrisoniere) {
        this.estPrisoniere = estPrisoniere;
    }
}
