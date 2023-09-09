package day12.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Task3 {
    public static void main(String[] args) {
        MusicBand musicBand1 = new MusicBand("Beatls", 1980);
        MusicBand musicBand2 = new MusicBand("21_Pilots", 2000);
        MusicBand musicBand3 = new MusicBand("Pilots", 1929);
        MusicBand musicBand4 = new MusicBand("ImDrag", 2015);
        MusicBand musicBand5 = new MusicBand("Eminem", 1990);
        MusicBand musicBand6 = new MusicBand("B2", 1986);
        MusicBand musicBand7 = new MusicBand("Mijagi", 2019);
        MusicBand musicBand8 = new MusicBand("Skillet", 1993);
        MusicBand musicBand9 = new MusicBand("LinPark", 2020);
        MusicBand musicBand10 = new MusicBand("Serebro", 2010);

        List<MusicBand> bands = new ArrayList<>(Arrays.asList(musicBand1, musicBand2, musicBand3, musicBand4,
                musicBand5, musicBand6, musicBand7, musicBand8, musicBand9, musicBand10));

        Collections.shuffle(bands);

        System.out.println(bands);

        groupsAfter2000(bands);

        System.out.println(bands);
    }

    public static List<MusicBand> groupsAfter2000(List<MusicBand> bands) {
        bands.removeIf(band -> band.getYear() < 2000);
        return bands;
    }
}
