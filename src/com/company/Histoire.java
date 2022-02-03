package com.company;

import java.sql.SQLOutput;

public class Histoire {

    public static void main(String[] args) {
        System.out.println("Dans une petite bourgarde de Black River City");




        Humain barman = new Humain("Edgard");
        barman.sePresenter();

        Dame dame1 = new Dame("Eleanor", "bleu emeraude");
        Brigand brigand1 = new Brigand("Stanford","le borgne");
        brigand1.sePresenter();

        System.out.println("Une des courtisannes descend les escaliers en se pavanant");
        String parole = dame1.parler("Bonjour Messieux !");
        System.out.println(parole);
        dame1.sePresenter();
        dame1.changeRobe("rouge");
        parole = dame1.parler("un verre je vous prie "+barman.getNom());
        System.out.println(parole);
        dame1.boir();

        System.out.println(brigand1.getNom()+ "se tourne vers elle, le regard envieux ! ");
        brigand1.captureDame(dame1);
        dame1.kidnapper();

        System.out.println("Un gentil homme entre dans le bar !");
        Cowboy cowboy1= new Cowboy("Willam Strom");
        cowboy1.sePresenter();
        cowboy1.sesclame();
        cowboy1.parler(" Je vais vous sauver "+ dame1.getNom());
        cowboy1.tireSurBriand(brigand1);
        brigand1.estArrete(cowboy1);
        cowboy1.libereDame(dame1);

        dame1.libérer(cowboy1);
        parole=dame1.parler("Vous m'avez sauvé "+cowboy1.getAdjectif());
        System.out.println(parole);
        parole =dame1.parler("Je vous serez toujours reconnaissante! je vous invite à boire un verre!");
        System.out.println(parole);
        dame1.boir();
        cowboy1.boir();

        System.out.println("Tout redevient calme sur Black River City ! ");

    }

}
