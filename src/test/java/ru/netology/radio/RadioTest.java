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
        int expected = 0;
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

        int expected = 6;
        int actual = radio.next(radio.currentWave);
        assertEquals(expected, actual);
    }
    @Test
    public void nextMaxStation() {
        radio.setCurrentWave(9);

        int expected = 0;
        int actual = radio.next(radio.currentWave);
        assertEquals(expected, actual);
    }

// prev method testing
    @Test
    public void prevMaxStationInValue() {
        radio.setCurrentWave(9);

        int expected = 8;
        int actual = radio.prev(radio.currentWave);

        assertEquals(expected, actual);
    }
    @Test
    public void prevMinStationInValueZero() {
        radio.setCurrentWave(0);

        int expected = 9;
        int actual = radio.prev(radio.currentWave);

        assertEquals(expected, actual);
    }

    @Test
    public void prevOverMaxStation() {
        radio.setCurrentWave(12);

        int expected = 9;
        int actual = radio.prev(radio.currentWave);

        assertEquals(expected, actual);
    }
    @Test
    public void prevNumInValue() {
        radio.setCurrentWave(5);

        int expected = 4;
        int actual = radio.prev(radio.currentWave);

        assertEquals(expected, actual);
    }

// volume
// increaseVolume testing
    @Test
    public void increaseVolumeInValue() {
    radio.setCurrentVolume(5);

    int expected = 6;
    int actual = radio.increaseVolume(radio.currentVolume);

    assertEquals(expected, actual);
}
    @Test
    public void increaseVolumeOverMax() {
        radio.setCurrentVolume(11);
        int expected = 10;
        int actual = radio.increaseVolume(radio.currentVolume);

        assertEquals(expected, actual);
    }
// reduceVolume testing
    @Test
    public void reduceVolumeInRange() {
        radio.setCurrentVolume(10);
        int expected = 9;
        int actual = radio.reduceVolume();

        assertEquals(expected, actual);
    }
    @Test
    public void reduceVolumeMin() {
        radio.setCurrentVolume(0);
        int expected = 0;
        int actual = radio.reduceVolume();

        assertEquals(expected, actual);
    }

}