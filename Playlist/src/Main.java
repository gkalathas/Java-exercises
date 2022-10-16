import java.util.*;

public class Main {
    private static ArrayList<Album> myAlbums = new ArrayList<>();
    public static void main(String[] args) {
        Album album1 = new Album("Master of Puppets", "Metallica");
        album1.addSong("Battery", 5.12);
        album1.addSong("The Thing That Should Not Be ", 6.36);
        album1.addSong("Disposable Heroes", 8.17);
        album1.addSong("Orion", 8.12);
        album1.addSong("Master of Puppets", 8.35);
        album1.addSong("Welcome Home", 6.27);
        album1.addSong("Leper Messiah", 5.40);
        album1.addSong("Damage, Inc", 5.08);
        myAlbums.add(album1);
        album1 = new Album("Hybrid Theory", "Linkin Park");

        album1.addSong("Nobody Can Save Me", 3.45);
        album1.addSong("Good Bye", 3.31);
        album1.addSong("Talking to my Self", 3.51);
        album1.addSong("Battle Symphony", 3.36);
        album1.addSong("Invisible", 3.34);
        album1.addSong("Heavy", 2.49);
        album1.addSong("Sorry For Now", 3.23);
        album1.addSong("Halfway Right", 3.37);
        album1.addSong("One More Light", 4.15);
        album1.addSong("Sharp Edges", 2.58);
        myAlbums.add(album1);

        LinkedList<Song> playlist = new LinkedList<Song>();

        myAlbums.get(1).addToPlaylist("Nobody Can Save Me", playlist);
        myAlbums.get(1).addToPlaylist("Sharp Edges", playlist);
        myAlbums.get(1).addToPlaylist("One More Light", playlist);
       myAlbums.get(1).addToPlaylist(6,playlist);
       myAlbums.get(1).addToPlaylist(3,playlist);
       myAlbums.get(1).addToPlaylist(4,playlist);
       myAlbums.get(1).addToPlaylist(2,playlist);
       myAlbums.get(1).addToPlaylist(1,playlist);

        play(playlist);
    }

    private static void play(LinkedList<Song> playlist){
        Scanner scan = new Scanner(System.in);
        boolean quit=false;
        boolean forward = true;
        ListIterator<Song> listIterator = playlist.listIterator();
        if(playlist.size()==0){
            System.out.println("The playlist is empty");
            return;
        }else{
            System.out.println("Now Playing "+ listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action = scan.nextInt();
            scan.nextLine();
            switch(action){
                case 0:
                    System.out.println("Playlist complete");
                    quit=true;
                    break;
                case 1:
                    if(!forward){
                       if(listIterator.hasNext()) {
                           listIterator.next();
                       }
                       forward=true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing "+ listIterator.next().toString());
                    }else{
                        System.out.println("We have reached the end of the list");
                        forward=false;
                    }
                    break;
                case 2:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        forward=false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing "+ listIterator.previous().toString());
                    }else{
                        System.out.println("We are at the start of the list");
                        forward=true;
                    }
                    break;
                case 3:
                    if(forward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now playing "+ listIterator.previous().toString());
                            forward=false;
                        }else{
                            System.out.println("We are at the start of the list");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println(" Now playing "+ listIterator.next().toString());
                            forward=true;
                        }else{
                            System.out.println("We have reached the end of the list");
                        }
                    }
                    break;
                case 4:
                    printList(playlist);
                    break;
                case 5:
                    printMenu();
                    break;
                case 6:
                    if(playlist.size()>0){
                        listIterator.remove();
                        if(listIterator.hasNext()){
                            System.out.println("Now playing "+ listIterator.next());
                        }else{
                            System.out.println("Now playing "+ listIterator.previous());
                        }
                    }
                    break;
            }
        }
    }
    private static void printList(LinkedList<Song> playlist){
        Iterator<Song> iterator= playlist.iterator();
        System.out.println("=========================");
        while(iterator.hasNext()){
            System.out.println(iterator.next().toString());
        }
        System.out.println("=============================");
    }
    public static void printMenu(){
        System.out.println("Available actions:\npress");
        System.out.println("0 - to quit");
        System.out.println("1 - to play next song");
        System.out.println("2 - to play previous song");
        System.out.println("3 - to replay current song");
        System.out.println("4 - list songs in the playlist");
        System.out.println("5 - print available actions");
        System.out.println("6 - delete current song from playlist");
    }
}