package com.coding.facadepattern.home_theater_example;

import com.coding.facadepattern.home_theater_example.complex_sub_system.*;

public class HomeTheaterFacade {
    //Here is the Composition
    //these are all the components of the subsystem we are going to use.

    Amplifier amplifier;
    DVDPlayer dvdPlayer;
    CDPlayer cdPlayer;
    Screen screen;
    PopcornPopper popcornPopper;
    Tuner tuner;
    TheaterLights theaterLights;
    Projector projector;

    public HomeTheaterFacade(Amplifier amplifier, DVDPlayer dvdPlayer,
                             CDPlayer cdPlayer, Screen screen,
                             PopcornPopper popcornPopper, Tuner tuner,
                             TheaterLights theaterLights, Projector projector) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
        this.theaterLights = theaterLights;
        this.tuner = tuner;
        this.projector = projector;
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch the movie....");

        popcornPopper.on();
        popcornPopper.pop();

        theaterLights.dim();
        screen.down();

        projector.on();
        projector.wideScreenMode();

        amplifier.on();
        amplifier.setDVD();
        amplifier.setSurroundSound();
        amplifier.setVolume();

        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    public void endMovie() {
        System.out.println("Shutting down the theater...");

        popcornPopper.off();

        theaterLights.on();

        screen.up();

        projector.off();

        amplifier.off();

        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }

}
