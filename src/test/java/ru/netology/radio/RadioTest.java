package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class RadioTest {
    Radio radio = new Radio(100);

    // install station method testing
    @Test
    public void installStationInValue() {
        radio.setCurrentWave(radio.getMaxCountOfStation()-1);
        int expected = radio.getMaxCountOfStation()-1;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void installStationMaxStation() {
        radio.setCurrentWave(radio.getMaxCountOfStation());
        int expected = radio.getMaxCountOfStation();
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void installStationMoreMinStation() {
        radio.setCurrentWave(radio.getMaxCountOfStation()+1);
        int expected = radio.getMaxCountOfStation();
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void installStationLowMinStation() {
        radio.setCurrentWave(-1);
        int expected = 0;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    // next method testing
    @Test
    public void nextInValue() {
        radio.setCurrentWave(5);
        radio.next();

        int expected = 6;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    public void nextOverMaxStation() {
        radio.setCurrentWave(radio.getMaxCountOfStation());
        radio.next();

        int expected = 0;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    public void nextPreMaxStation() {
        radio.setCurrentWave(8);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    // prev method testing
    @Test
    public void prevMaxStationInValue() {
        radio.setCurrentWave(radio.getMaxCountOfStation());
        radio.prev();

        int expected = radio.getMaxCountOfStation() -1;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void prevZeroStation() {
        radio.setCurrentWave(0);
        radio.prev();

        int expected = radio.getMaxCountOfStation();
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void prevPreZeroStation() {
        radio.setCurrentWave(1);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    // volume
    // increaseVolume testing
    @Test
    public void increaseVolumeInValue() {
        radio.setCurrentVolume(5);
        radio.increaseVolume();

        int expected = 6;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void increaseVolumeOverMax() {
        radio.setCurrentVolume(101);
        radio.increaseVolume();
        int expected = 100;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    // reduceVolume testing
    @Test
    public void reduceVolumeInRange() {
        radio.setCurrentVolume(10);
        radio.reduceVolume();
        int expected = 9;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

    @Test
    public void reduceVolumeMin() {
        radio.setCurrentVolume(0);
        radio.reduceVolume();
        int expected = 0;
        int actual = radio.getCurrentVolume();

        assertEquals(expected, actual);
    }

}