import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

class MusicPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Deque<String> playlist = new ArrayDeque<>();

        boolean quit = false;
        while (!quit) {
            System.out.println("\nMusic Player Playlist Management");
            System.out.println("1. Add a song to the playlist");
            System.out.println("2. Play the next song");
            System.out.println("3. Play the previous song");
            System.out.println("4. Shuffle the playlist");
            System.out.println("5. Quit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter the name of the song: ");
                    String song = scanner.nextLine();
                    playlist.addLast(song);
                    System.out.println(song + " has been added to the playlist.");
                    break;
                case 2:
                    if (!playlist.isEmpty()) {
                        String nextSong = playlist.removeFirst();
                        System.out.println("Playing: " + nextSong);
                        playlist.addLast(nextSong);
                    } else {
                        System.out.println("Playlist is empty. No song to play.");
                    }
                    break;
                case 3:
                    if (!playlist.isEmpty()) {
                        String prevSong = playlist.removeLast();
                        System.out.println("Playing: " + prevSong);
                        playlist.addFirst(prevSong);
                    } else {
                        System.out.println("Playlist is empty. No song to play.");
                    }
                    break;
                case 4:
                    if (!playlist.isEmpty()) {
                        // Collections.shuffle((List<String>) playlist);
                        Collections.shuffle((List<?>) playlist);
                        System.out.println("Playlist has been shuffled.");
                    } else {
                        System.out.println("Playlist is empty. No songs to shuffle.");
                    }
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting Music Player Playlist Management. Enjoy the music!");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 5.");
            }
        }

        scanner.close();
    }
}
