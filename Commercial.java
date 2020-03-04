/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaprojet2020;

/**
 *
 * @author julie
 */
public class Commercial extends Employe {

    private int ventes;

    public Commercial(String nom, String prenom, int matricule, int indiceSalaire, int ventes) {
        super(nom, prenom, matricule, indiceSalaire);
        this.ventes = ventes;
    }

    public double calculSalaire() {
        return this.getIndiceSalaire() * 12 + ventes * 0.1;
    }

    @Override
    public String toString() {
        return "Commercial : " + super.toString();
    }


    /*public void hieAide(int nb) {
        System.out.println("Aucune hierarchie en dessous de " + this);
    }*/
}
