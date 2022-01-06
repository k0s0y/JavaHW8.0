package ru.netology.radio;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


class RadioTest {
    Radio radio = new Radio();

    // install station method testing
    @Test
    public void installStationInValue() {
        radio.setCurrentWave(8);
        int expected = 8;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void installStationMaxStation() {
        radio.setCurrentWave(9);
        int expected = 9;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void installStationMoreMinStation() {
        radio.setCurrentWave(10);
        int expected = 9;
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
        radio.setCurrentWave(9);
        radio.nextOverMax();

        int expected = 0;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    public void nextMoreMaxStation() {
        radio.setCurrentWave(9);
        radio.next();

        int expected = 9;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    @Test
    public void nextOverInValue() {
        radio.setCurrentWave(5);
        radio.nextOverMax();

        int expected = 5;
        int actual = radio.getCurrentWave();
        assertEquals(expected, actual);
    }

    // prev method testing
    @Test
    public void prevMaxStationInValue() {
        radio.setCurrentWave(9);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void prevZeroStation() {
        radio.setCurrentWave(0);
        radio.prev();

        int expected = 0;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void prevOverMaxStation() {
        radio.setCurrentWave(12);
        radio.prev();

        int expected = 8;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void prevLessMinStationInValueZero() {
        radio.setCurrentWave(0);
        radio.prevLessMin();

        int expected = 9;
        int actual = radio.getCurrentWave();

        assertEquals(expected, actual);
    }

    @Test
    public void prevLessStationInValue() {
        radio.setCurrentWave(5);
        radio.prevLessMin();

        int expected = 5;
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
        radio.setCurrentVolume(11);
        radio.increaseVolume();
        int expected = 10;
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