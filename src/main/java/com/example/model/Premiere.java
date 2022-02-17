package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
public class Premiere {
    private final String nameOfThePremiere; //название
    private final String description;       //описание премьеры
    private final int ageCategory;          //возрастная категория
    private final int quantityOfSeats;      //количество мест
    private final List<Seat> seats;

    @Override
    public String toString() {
        return "Премьера {" +
                "" + nameOfThePremiere + '\'' +
                ", description='" + description + '\'' +
                ", ageCategory=" + ageCategory +
                ", seatList=" + quantityOfSeats +
                '}';
    }
}
