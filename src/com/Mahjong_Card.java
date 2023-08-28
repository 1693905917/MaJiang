package com;

import java.util.Objects;

public class Mahjong_Card {
    private String Card_color;
    private String Card_num;
    private int Card_time;
    public  Mahjong_Card(){

    }

    public Mahjong_Card(String card_color, String card_num, int card_time) {
        this.Card_color = card_color;
        this.Card_num = card_num;
        this.Card_time = card_time;
    }

    @Override
    public String toString() {
        return  Card_color + "-" + Card_num;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mahjong_Card that = (Mahjong_Card) o;
        return Card_time == that.Card_time && Objects.equals(Card_color, that.Card_color) && Objects.equals(Card_num, that.Card_num);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Card_color, Card_num, Card_time);
    }

    public String getCard_color() {
        return Card_color;
    }

    public void setCard_color(String card_color) {
        Card_color = card_color;
    }

    public String getCard_num() {
        return Card_num;
    }

    public void setCard_num(String card_num) {
        Card_num = card_num;
    }

    public int getCard_time() {
        return Card_time;
    }

    public void setCard_time(int card_time) {
        Card_time = card_time;
    }

}
