package com.company;

public class Brigand extends Humain {
    private String look;
    private int nbDamesKidnapees;
    private double recompance;
    private boolean estEnPrison;

    public Brigand() {
    }

    public Brigand(String nom, String look) {
        super(nom);
        this.look = look;
        this.nbDamesKidnapees = 0;
        this.recompance = 100;
        this.estEnPrison = false;
    }

    public void captureDame (Dame dame){
        dame.setEstPrisoniere(true);
        System.out.println(this.nom + "- Ah ah!! " + dame.getNom()+", tu es mienne désormais !");
        nbDamesKidnapees++;
    }

    public void estArrete(Cowboy cowboy){
        this.estEnPrison=true;
        System.out.println(this.nom + "- Damed, je suis fait! "+ cowboy.getNom()+", tu m'as eu!");
    }
    @Override
    public void quelEstTonNom(){
        System.out.println(this.nom+" le "+ this.look);
    }

    public String getLook() {
        return look;
    }

    public int getNbDamesKidnapees() {
        return nbDamesKidnapees;
    }

    public double getRecompance() {
        return recompance;
    }

    public boolean isEstEnPrison() {
        return estEnPrison;
    }

    public void setLook(String look) {
        this.look = look;
    }

    public void setNbDamesKidnapees(int nbDamesKidnapees) {
        this.nbDamesKidnapees = nbDamesKidnapees;
    }

    public void setRecompance(double recompance) {
        this.recompance = recompance;
    }

    public void setEstEnPrison(boolean estEnPrison) {
        this.estEnPrison = estEnPrison;
    }


}
