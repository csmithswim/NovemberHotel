package com.csmithswim;

//Fields and methods for room

//Static number of rented/available/total rooms
//hotelGuest
//Room Number
//Rented boolean

//Methods
//Display rented/available/total rooms
//Rent room method
//Return room method

public class Room extends Hotel {
    private String hotelGuest;
    private String roomNumber;
    private boolean rented;

    public Room(String hotelName, String hotelGuest, String roomNumber, boolean rented){
        super(hotelName);
        this.hotelGuest = hotelGuest;
        this.roomNumber = roomNumber;
        this.rented = rented;
    }

    //Rent room method
    private void rentRoom() {
        if (rented == false)
            rented = true;
    }

    //Return room method
    private void returnRoom(){
            if (rented == true){
                rented = false;
            }
        }

    //Display rented/available/total rooms


    //Display room message
    @Override
    public String toString() {return hotelGuest + " is renting "+roomNumber;}
}
