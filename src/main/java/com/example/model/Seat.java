package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class Seat {
    private int row;             //Ряд
    private int numberOfSeat;    //Номер места в ряду
    private Boolean isAvailable; //Свободно/занято

/*
    public Seat(int row, int numberOfSeat) {
        this.row = row;
        this.numberOfSeat = numberOfSeat;
        isAvailable = true;
    }
*/

    @Override
    public String toString() {
        return "Место {" +
                "в ряду=" + row +
                ", под номером=" + numberOfSeat +
                " свободно";
    }
}
