package ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        List<Song> songs = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] songArgs = sc.nextLine().split("_");
            String typeSong = songArgs[0];
            String name = songArgs[1];
            String time = songArgs[2];

            Song song = new Song(typeSong, name, time);

            songs.add(song);
        }
        String filter = sc.nextLine();
        boolean shouldFilter = !filter.equals("all");

        for (Song song : songs){
            if (!shouldFilter) {
                System.out.println(song.getName());
            } else if (song.getTypeList().equals(filter)) {
                System.out.println(song.getName());
            }
        }
    }
}
