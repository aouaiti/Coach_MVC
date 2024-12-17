package com.example.atelier_2.modele;

import junit.framework.TestCase;

public class ProfilTest extends TestCase {

    // Création d'un profil pour les tests
    private Profil profil = new Profil(67, 165, 35, 0); // poids, taille, age, sexe
    // Résultats attendus
    private float img = (float) 32.2;
    private String message = "trop élevé";

    public void testGetImg() {
        assertEquals(img, profil.getImg(), (float) 0.1);
    }
    public void testGetMessage() {
        assertEquals(message, profil.getMessage());
    }
}