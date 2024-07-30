import java.util.ArrayList;

public class Playlist {
    private ArrayList<Song> songs;

    public Playlist() {
        songs = new ArrayList<>();
    }

    public void addSong(Song song) {
        songs.add(song);
    }

    public void removeSong(String title) {
        songs.removeIf(song -> song.getTitle().equals(title));
    }

    public void displayPlaylist() {
        if (songs.isEmpty()) {
            System.out.println("The playlist is empty.");
            return;
        }
        System.out.println("Playlist:");
        for (Song song : songs) {
            System.out.println(song);
        }
    }
}