package com.example.fabriciosteixeira.filmesapp2;

/**
 * Created by fabricio.steixeira on 13/04/2018.
 */

public class Api {


    private static final String ROOT_URL = "http://10.23.49.20:8080/HeroApi/v1/Api.php?apicall=";

    public static final String URL_CREATE_HERO = ROOT_URL + "createhero";
    public static final String URL_READ_HEROES = ROOT_URL + "getheroes";
    public static final String URL_UPDATE_HERO = ROOT_URL + "updatehero";
    public static final String URL_DELETE_HERO = ROOT_URL + "deletehero&id=";



}