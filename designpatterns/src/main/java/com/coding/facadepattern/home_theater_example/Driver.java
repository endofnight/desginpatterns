package com.coding.facadepattern.home_theater_example;

import com.coding.facadepattern.home_theater_example.complex_sub_system.*;

public class Driver {

    public static void main(String[] args) {
        Amplifier amplifier = new Amplifier();
        DVDPlayer dvdPlayer = new DVDPlayer();
        CDPlayer cdPlayer = new CDPlayer();
        Screen screen = new Screen();
        PopcornPopper popcornPopper = new PopcornPopper();
        Tuner tuner = new Tuner();
        TheaterLights theaterLights = new TheaterLights();
        Projector projector = new Projector();


        HomeTheaterFacade myHomeTheater = new HomeTheaterFacade(amplifier, dvdPlayer, cdPlayer,
                screen, popcornPopper, tuner, theaterLights, projector);

        myHomeTheater.watchMovie("Forrest Gump");

        myHomeTheater.endMovie();
    }
}
