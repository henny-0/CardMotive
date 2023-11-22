package com.example.cardmotive;

public class Card {
    String text;
    int bgID;

    public Card(String text, int bgID) {
        this.text = text;
        this.bgID = bgID;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getBgID() {
        return bgID;
    }

    public void setBgID(int bgID) {
        this.bgID = bgID;
    }

}
