package com.company;

public class Dame extends Humain {
    private String couleurRobe;
    private boolean estLibre;

    public Dame(String nom, String couleurRobe) {
        super(nom);
        this.couleurRobe = couleurRobe;
        estLibre=true;
    }

    public void kidnapper (){
        this.estLibre= false;
        //hurle
        System.out.println("AHHHHHHHHHHHHHHH!!!!!!!!!!  AUUUU SECOUUUURT");
    }

    public void libérer(Humain coboy){
        this.estLibre= true;
        //hurle
        System.out.println("Merci beacoup Mr "+coboy.nom);
    }

    public void changeRobe(String couleur){
        this.couleurRobe=couleur;
        System.out.println("Regarde ma nouvelle robe "+this.couleurRobe);
    }

    public String getCouleurRobe() {
        return couleurRobe;
    }

    public boolean isEstLibre() {
        return estLibre;
    }

    public void setCouleurRobe(String couleurRobe) {
        this.couleurRobe = couleurRobe;
    }

    public void setEstLibre(boolean estLibre) {
        this.estLibre = estLibre;
    }
}
