package ru.netology;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RadioTest {

    Radio radio = new Radio();

    @Test
    public void setMaxStation(){
        radio.setMaxStation(13);
        assertEquals(13, radio.getMaxStation());
    }

    @Test
    public void increaseWithNewMaxStation(){
        radio.setMaxStation(13);
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        assertEquals(11, radio.getCurrentStation());
    }

    @Test
    void increaseCurrentStation() {
        radio.setCurrentStation(3);
        radio.increaseCurrentStation();
        assertEquals(4, radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStation() {
        radio.setCurrentStation(3);
        radio.decreaseCurrentStation();
        assertEquals(2, radio.getCurrentStation());
    }

    @Test
    void currentStation() {
        radio.setCurrentStation(3);
        assertEquals(3, radio.getCurrentStation());
    }

    @Test
    void increaseCurrentStationIfMax() {
        radio.setCurrentStation(10);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void increaseCurrentStationIfOverMax() {
        radio.setCurrentStation(14);
        radio.increaseCurrentStation();
        assertEquals(0, radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStationIfMin() {
        radio.setCurrentStation(0);
        radio.decreaseCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void decreaseCurrentStationIfBelowMin() {
        radio.setCurrentStation(-1);
        radio.decreaseCurrentStation();
        assertEquals(10, radio.getCurrentStation());
    }

    @Test
    void increaseSoundVolume() {
        radio.setSoundVolume(3);
        radio.increaseSoundVolume();
        assertEquals(4, radio.getSoundVolume());
    }

    @Test
    void increaseSoundVolumeIfUnderMax() {
        radio.setSoundVolume(120);
        radio.increaseSoundVolume();
        assertEquals(100, radio.getSoundVolume());
    }

    @Test
    void decreaseSoundVolume() {
        radio.setSoundVolume(3);
        radio.decreaseSoundVolume();
        assertEquals(2, radio.getSoundVolume());
    }

    @Test
    void decreaseSoundVolumeIfOverMin() {
        radio.setSoundVolume(-100);
        radio.decreaseSoundVolume();
        assertEquals(0, radio.getSoundVolume());
    }
}