package com.example.atelier_2.controleur;

import android.content.Context;

import com.example.atelier_2.modele.AccesLocal;
import com.example.atelier_2.modele.Profil;
import com.example.atelier_2.outils.Serializer;

import java.util.Date;

public final class Controle {
    private static Controle instance = null;
    private static Profil profil;
    private static String nomFic = "saveprofil";
    private static AccesLocal accesLocal;
    /**
     * Constructor private
     */
    private Controle() {
        super();
    }

    /**
     * Creation instance
     * @return instance
     */
    public static final Controle getInstance(Context contexte) {
        if (Controle.instance == null) {
            Controle.instance = new Controle();
            accesLocal= new AccesLocal(contexte);
            profil=accesLocal.recupDernier();
            //recupSerialize(contexte);
        }
        return Controle.instance;
    }

    /**
     * Creation du profile
     * @param poids
     * @param taille en cm
     * @param age
     * @param sexe 1 pour homme, 0 pour femme
     */
    public void creerProfil(Integer poids, Integer taille, Integer age, Integer sexe,Context contexte) {
        profil = new Profil(new Date(),poids, taille, age, sexe);
        accesLocal.ajout(profil);
        //Serializer.serialize(nomFic, profil, contexte);
    }

    /**
     * Recuperation image de profile
     * @return img
     */
    public float getImg() {
        return profil.getImg();
    }

    /**
     * Recuperation du message de profile
     * @return message
     */
    public String getMessage() {
        return profil.getMessage();
    }
    private static void recupSerialize(Context contexte) {
        profil = (Profil) Serializer.deserialize(nomFic, contexte);
    }
    public Integer getPoids(){
        if (profil==null){return null;}
        else {return profil.getPoids();}
    }

    public Integer getTaille(){
        if (profil==null){return null;}
        else {return profil.getTaille();}
    }


    public Integer getAge(){
        if (profil==null){return null;}
        else {return profil.getAge();}
    }

    public Integer getSexe(){
        if (profil==null){return null;}
        else {return profil.getSexe();
        }}
}
