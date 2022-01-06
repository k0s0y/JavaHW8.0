package ru.netology.radio;

public class Radio {
    private int currentWave;
    private int currentVolume;

    //getters
    public int getCurrentWave() {
        return currentWave;
    }

    //setters
    public void setCurrentWave(int currentWave) {
        if (currentWave < 0) {
            return;
        }
        if (currentWave > 9) {
            currentWave = 9;
        }
        this.currentWave = currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        if (currentVolume > 10) {
            currentVolume = 10;
        }
        this.currentVolume = currentVolume;
    }

    //remote controller wave functions
    public void next() {
        if (currentWave < 9) {
            currentWave = currentWave + 1;
        }
        if (currentWave == 9) {
            currentWave = 0;
        }
        this.currentWave = currentWave;
    }

    public void prev() {
        if (currentWave != 0) {
            currentWave = currentWave - 1;
        }
        this.currentWave = currentWave;
        if (currentWave == 0) {
            currentWave = 9;
        }
        this.currentWave = currentWave;
    }


    //remote controller volume functions
    public void increaseVolume() {
        if (currentVolume < 10) {
            currentVolume = currentVolume + 1;
        }
        this.currentVolume = currentVolume;
    }

    public void reduceVolume() {
        if (currentVolume > 0) {
            currentVolume = currentVolume - 1;
        }
        this.currentVolume = currentVolume;
    }

}