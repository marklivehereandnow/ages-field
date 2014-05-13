/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.livehereandnow.ages.card;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author mark
 */
public class Card {

    private Integer id;
    private String name;
    private Integer age;
    private String civilMilitary;
    private String tag;
    private String action;
    private String iconPoints;
    private String cost;
    private String color;
    private int cnt;
    private int tokenWhite;
    private int tokenRed;
    private int tokenYellow;
    private int tokenBlue;

    public Card() {
        this.id = 1000;
        this.name = "NOCARD";
        this.tag = "";
    }

    public Card(Integer id) {
        this.id = id;
    }

    public Card(Integer id, String name, Integer age, String civilMilitary, String tag, String action, String iconPoints, String cost, String color, int cnt) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.civilMilitary = civilMilitary;
        this.tag = tag;
        this.action = action;
        this.iconPoints = iconPoints;
        this.cost = cost;
        this.color = color;
        this.cnt = cnt;
    }

    public Card(Integer id, String action, String iconPoints, int cnt, int tokenWhite, int tokenRed, int tokenYellow, int tokenBlue) {
        this.id = id;
        this.action = action;
        this.iconPoints = iconPoints;
        this.cnt = cnt;
        this.tokenWhite = tokenWhite;
        this.tokenRed = tokenRed;
        this.tokenYellow = tokenYellow;
        this.tokenBlue = tokenBlue;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getCivilMilitary() {
        return civilMilitary;
    }

    public void setCivilMilitary(String civilMilitary) {
        this.civilMilitary = civilMilitary;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getIconPoints() {
        return iconPoints;
    }

    public void setIconPoints(String iconPoints) {
        this.iconPoints = iconPoints;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getCnt() {
        return cnt;
    }

    public void setCnt(int cnt) {
        this.cnt = cnt;
    }

    public int getTokenWhite() {
        return tokenWhite;
    }

//[14:07:10] maxchen20041: 作一個方法
//[14:07:31] maxchen20041: 叫做生產
//[14:07:55] maxchen20041: 讓tokenBlue=tokenBlue+tokenYellow
    /**
     *
     * [14:07:10] maxchen20041: 作一個方法, 叫做生產, 讓tokenBlue=tokenBlue+tokenYellow
     */
    public void produce() {
        tokenBlue += tokenYellow;
    }

    public void setTokenWhite(int tokenWhite) {
        this.tokenWhite = tokenWhite;
    }

    public int getTokenRed() {
        return tokenRed;
    }

    public void setTokenRed(int tokenRed) {
        this.tokenRed = tokenRed;
    }

    public int getTokenYellow() {
        return tokenYellow;
    }

    public void setTokenYellow(int tokenYellow) {
        this.tokenYellow = tokenYellow;
    }

    public int getTokenBlue() {
        return tokenBlue;
    }

    public void setTokenBlue(int tokenBlue) {
        this.tokenBlue = tokenBlue;
    }

    public Card copy() {
        Card card = new Card();
        card.action = this.action;
        card.age = this.age;
        card.civilMilitary = this.civilMilitary;
        card.color = this.color;
        card.cost = this.cost;
        card.iconPoints = this.iconPoints;
        card.id = this.id;
        card.name = this.name;
        card.tag = this.tag;

        return card;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Card)) {
            return false;
        }
        Card other = (Card) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Card{" + "id=" + id + ", name=" + name + ", age=" + age + ", civilMilitary=" + civilMilitary + ", tag=" + tag + ", action=" + action + ", iconPoints=" + iconPoints + ", cost=" + cost + ", color=" + color + ", cnt=" + cnt + ", tokenWhite=" + tokenWhite + ", tokenRed=" + tokenRed + ", tokenYellow=" + tokenYellow + ", tokenBlue=" + tokenBlue + '}';
    }

    public String toString(int style) {
        String[] ageStr = {"A", "I", "II", "III", "-"};

        switch (style) {
            case 1:// for CardNow
                StringBuilder sb = new StringBuilder();
                sb.append("[");
                sb.append(ageStr[age]);
                sb.append("");
                sb.append(name);
                sb.append("-");
                sb.append(tag);
                sb.append("] ");
                return sb.toString();
            default:
                return toString();
        }
    }
}
