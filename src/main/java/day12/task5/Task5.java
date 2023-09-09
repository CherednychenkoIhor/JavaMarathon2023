package day12.task5;

import java.util.ArrayList;
import java.util.List;

public class Task5 {
    public static void main(String[] args) {
        List<MusicArtist> members1 = new ArrayList<>();
        members1.add(new MusicArtist("Grace Slick", 50));
        members1.add(new MusicArtist("Marty Balin", 35));
        members1.add(new MusicArtist("Paul Kantner", 24));
        members1.add(new MusicArtist("Jorma Kaukonen", 40));
        day12.task5.MusicBand band1 = new day12.task5.MusicBand("Jefferson Airplane", 1965, members1);

        List<MusicArtist> members2 = new ArrayList<>();
        members2.add(new MusicArtist("John Lennon", 32));
        members2.add(new MusicArtist("Paul McCartney", 54));
        members2.add(new MusicArtist("Ringo Starr", 61));
        day12.task5.MusicBand band2 = new day12.task5.MusicBand("The Beatles", 1960, members2);

        MusicBand.transferMembers(band1, band2);

        band1.printMembers();
        band2.printMembers();
    }
}
