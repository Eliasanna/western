package com.company;

public class Cowboy extends Humain {
        private int popularite;
        private String adjectif;

    public Cowboy() {
    }

    public Cowboy(String nom) {
        super(nom);
        this.popularite = 0;
        this.adjectif = "vaillant";
    }

    public void sesclame(){
        System.out.println(this.nom + " - Prend ça, rascal!");
    }

    public void libereDame(Dame dame){
        this.popularite++;
        System.out.println(this.nom + " - Vous etes bien belle Dame ! C'était un plaisir Mselle "+ dame.getNom());
        System.out.println(this.nom + " - Votre robe " + dame.getCouleurRobe()+" est de toute beauté! Et vous siée à ravire!");
    }

    public void tireSurBriand(Brigand brigand){
        System.out.println("le "+this.adjectif+" "+this.nom+ " tire sur "+ brigand.getNom()+". PAN !");
    }

    public int getPopularite() {
        return popularite;
    }

    public String getAdjectif() {
        return adjectif;
    }

    public void setPopularite(int popularite) {
        this.popularite = popularite;
    }

    public void setAdjectif(String adjectif) {
        this.adjectif = adjectif;
    }
}
