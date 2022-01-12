package ru.netology.radio;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data

public class Radio {
    private int currentWave;
    private int currentVolume;
    private int maxCountOfStation = 9;

    public Radio(int maxVolumeOfStation) {
        this.maxCountOfStation = (maxVolumeOfStation-1);
    }

    //getters
    public int getCurrentWave() {
        return currentWave;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMaxCountOfStation() {
        return maxCountOfStation;
    }


    //setters
    public void setCurrentWave(int currentWave) {
        if (currentWave < 0) {
            return;
        }
        if (currentWave > maxCountOfStation) {
            currentWave = maxCountOfStation;
        }
        this.currentWave = currentWave;
    }

    public void setCurrentVolume(int currentVolume) {
        if (currentVolume <= 0) {
            return;
        }
        if (currentVolume > 100) {
            currentVolume = 100;
        }
        this.currentVolume = currentVolume;
    }

    //remote controller wave functions
    public void next() {
        if (currentWave == maxCountOfStation) {
            currentWave = 0;
        } else {
            currentWave = currentWave + 1;
        }
        this.currentWave = currentWave;
    }

    public void prev() {
        if (currentWave == 0) {
            currentWave = maxCountOfStation;
        } else {
            currentWave = currentWave - 1;
        }
        this.currentWave = currentWave;
    }


    //remote controller volume functions
    public void increaseVolume() {
        if (currentVolume < 100) {
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