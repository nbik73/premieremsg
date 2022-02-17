package com.example.service;

import com.example.model.Premiere;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PremiereService {
    private final List<Premiere> premieres = new ArrayList<>();

    public Premiere getPremiereByName(String nameOfThePremiere) {
        for (Premiere p : premieres
        ) {
            if (p.getNameOfThePremiere().equals(nameOfThePremiere)) {
                return p;
            }
        }
        return null;
    }

    public void addPremiere(String nameOfThePremiere, String description, int ageCategory, int count) {//описание премьеры
        premieres.add(new Premiere(nameOfThePremiere, description, ageCategory, count, new ArrayList<>()));
    }

    public void deletePremiere(String nameOfThePremiere) {
        premieres.remove(getPremiereByName(nameOfThePremiere));
    }

    public void updatePremiere(String oldNameOfThePremiere, String newNameOfThePremiere, String description, int ageCategory, int count) {
        deletePremiere(oldNameOfThePremiere);
        addPremiere(newNameOfThePremiere, description, ageCategory, count);
    }

    public void printPremiers() {
        for (Premiere premiere : premieres
        ) {
            System.out.println(premiere.getNameOfThePremiere());
        }
        System.out.println("****************************");
    }

    public void printFullDescription(String nameOfThePremiere) {
        System.out.println(getPremiereByName(nameOfThePremiere));
        System.out.println("****************************");
    }


    public void buyTicked() {

    }

    public void returnTicked() {

    }


}
