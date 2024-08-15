package _25_10_2023_ObjectsAndClasses.Lab._4_Song;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=Integer.parseInt(scanner.nextLine());
        List<Song> songList=new ArrayList<>();
        String lines=scanner.nextLine();
        for (int i = 0; i < n; i++) {
        String[] line=lines.split("_");
            String typeList=line[0];
            String nameSong=line[1];
            String durationSong=line[2];
            Song song=new Song(typeList,nameSong,durationSong);
            songList.add(song);
            lines=scanner.nextLine();
        }
        String sortedList=lines;
        for (Song song:songList) {
            if (song.getTypeSong().equals(sortedList)||sortedList.equals("all")){
                System.out.println(song.getNameSong());
            }
        }
    }
}