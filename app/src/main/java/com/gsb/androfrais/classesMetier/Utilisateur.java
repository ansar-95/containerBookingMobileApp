package com.gsb.androfrais.classesMetier;

import org.json.JSONObject;

public class Utilisateur {

    private int numUtilisateur;
    private String raisonSocial;
    private  String login;
    private String  motDePasse;
    private String client;


    public int getNumUtilisateur() {
        return numUtilisateur;
    }

    public String getRaisonSocial() {
        return raisonSocial;
    }

    public String getLogin() {
        return login;
    }

    public String getMotDePasse() {
        return motDePasse;
    }

    public String getClient() {
        return client;
    }


    public Utilisateur(JSONObject jsonObject) {

        numUtilisateur = jsonObject.optInt("Numclient");

    }


}
