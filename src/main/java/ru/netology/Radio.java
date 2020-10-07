package ru.netology;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Radio {
    private int currentStation;
    private int soundVolume;
    private int maxStation = 10;
    private int minStation = 0;
    private int maxVolume = 100;
    private int minVolume = 0;

    public void setCurrentStation(int currentStation) {
        if (currentStation > maxStation) {
            this.currentStation = maxStation;
            return;
        }
        if (currentStation < minStation) {
            this.currentStation = minStation;
            return;
        }
        this.currentStation = currentStation;
    }

    public void increaseCurrentStation() {
        if (currentStation == maxStation) {
            currentStation = minStation;
            return;
        }
        currentStation++;
    }

    public void decreaseCurrentStation() {
        if (currentStation == minStation) {
            currentStation = maxStation;
            return;
        }
        currentStation--;
    }

    public void setSoundVolume(int soundVolume) {
        if (soundVolume > maxVolume) {
            this.soundVolume = maxVolume;
            return;
        }
        if (soundVolume < minStation) {
            this.soundVolume = minVolume;
            return;
        }
        this.soundVolume = soundVolume;
    }

    public void increaseSoundVolume() {
        if (soundVolume < maxVolume) {
            soundVolume++;
        }
    }

    public void decreaseSoundVolume() {
        if (soundVolume > minVolume) {
            soundVolume--;
        }
    }
}