import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Playlist playlist = new Playlist();
        boolean running = true;

        while (running) {
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Display Playlist");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song title: ");
                    String title = scanner.nextLine();
                    System.out.print("Enter artist: ");
                    String artist = scanner.nextLine();
                    Song song = new Song(title, artist);
                    playlist.addSong(song);
                    System.out.println("Song added!");
                    break;
                case 2:
                    System.out.print("Enter song title to remove: ");
                    String titleToRemove = scanner.nextLine();
                    playlist.removeSong(titleToRemove);
                    System.out.println("Song removed if it existed.");
                    break;
                case 3:
                    playlist.displayPlaylist();
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
                    break;
            }
        }

        scanner.close();
    }
}