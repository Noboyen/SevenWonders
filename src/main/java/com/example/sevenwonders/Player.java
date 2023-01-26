package com.example.sevenwonders;

import java.util.List;

public class Player {

    //stocker la merveille que le joueur a choisi
    //stocker les cartes qu'il pose

    private String pseudo;

    private Wonder wonder;

    private List<Card> playedCard;



    public Player(String pseudo, Wonder wonder) {
        this.pseudo = pseudo;
        this.wonder = wonder;
    }

    public String getPseudo() {
        return pseudo;
    }

    public Wonder getWonder() {
        return wonder;
    }
}
