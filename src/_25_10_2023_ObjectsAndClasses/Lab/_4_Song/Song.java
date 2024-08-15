package _25_10_2023_ObjectsAndClasses.Lab._4_Song;

public class Song {
   private String typeSong;
   private String nameSong;
   private  String durationSong;
    public Song(String typeSong, String nameSong, String durationSong) {
        this.typeSong = typeSong;
        this.nameSong = nameSong;
        this.durationSong = durationSong;
    }
    public String getTypeSong() {
        return typeSong;
    }
    public String getNameSong() {
        return nameSong;
    }


    public String getDurationSong() {
        return durationSong;
    }
    public String detail(Song song){
        return String.format("%s %s %s",getTypeSong(),getNameSong(),getDurationSong());
    }
}
