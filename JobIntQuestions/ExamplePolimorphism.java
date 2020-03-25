Сильная зависимость в коде :
class ClassicalMusic {
  // код для доступа к классич музыке
}

class MusicPlayer {
    privat ClassicalMusic classicalMusic;

    public void playMusic() {
        classicalMusic = new ClassicalMusic();

 
         //..код для воспроизведения музыки
}
}


Исп интерфейс для уменьшения зависимости : полиморфизм

interface Music {
  //.. код для доступа к любому жанру музыки
}

class ClassicalMusic implements Music {
  //..код для доступа к классич музыке
}

class RockMusic implements Music {
   //..код для доступа к рок музыке
}

class MusicPlayer {
     private Music misic;
     public MusicPlayer(Music music) {
         this.music = music;
     }
     public void playMusic() {
         music = new ClassicalMisuc();  //полиморфизм
         // или
         music = new RockMusic();    //полиморфизм 
 
        //.. код для воспроизведения музыки

   }
}        

ниже создаем объект который нужно будет внедрить в music player

class UseMusicPlayer {
      piblic static void main(String[] arg) {
          MusicPlayer musicPlayer = new MusicPlayer(new ClassicalMusic());
       //вначале созд объект new ClassicalMusic и затем он внедряется в конструктор
         // при создании объекта new MusicalPlayer
}
}