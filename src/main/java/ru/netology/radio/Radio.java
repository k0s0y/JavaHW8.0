package ru.netology.radio;

public class Radio {
   public int currentWave;
   public int currentVolume;

   public int getCurrentWave(){
      return currentWave;
   }

   public void  setCurrentWave (int currentWave) {
      if (currentWave < 0) {
         return;
      }
      if (currentWave > 9) {
         currentWave = 0;
      }
      this.currentWave =  currentWave;
   }

   public int next (int currentWave) {
      if (currentWave<9) {
         currentWave = currentWave + 1;
      }
      if (currentWave == 9) {
         currentWave = 0;
      }
      return currentWave;
   }

   public int prev(int currentWave) {
      if (currentWave<=9 && currentWave != 0) {
         currentWave = currentWave-1;
      }
      if (currentWave == 0) {
         currentWave = 9;
      }
      return currentWave;
   }

   public void  setCurrentVolume (int currentVolume) {
      if (currentVolume <= 0) {
         return;
      }
      if (currentVolume > 10) {
         currentVolume = 10;
      }
      this.currentVolume =  currentVolume;
   }

   public int increaseVolume(int currentVolume) {
      if (currentVolume < 10) {
         currentVolume = currentVolume + 1;
      }
      return currentVolume;
   }

   public int reduceVolume() {
      if (currentVolume > 0) {
         currentVolume = currentVolume - 1;
      }
      return currentVolume;
   }


}