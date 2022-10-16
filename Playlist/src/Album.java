import java.util.ArrayList;
import java.util.LinkedList;

public class Album {
    private String name;
    private String artist;
    private ArrayList<Song> songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new ArrayList<Song>();
    }
    public boolean addSong(String titleOfSong, double durationOfSong){
        Song existingSong = findSong(titleOfSong);
        if(existingSong==null){
            this.songs.add(new Song(titleOfSong,durationOfSong));
            return true;
        }
        return false;
    }
    private Song findSong(String titleOfSong){
        for(int i=0; i<this.songs.size();i++){
            Song checkedSong = this.songs.get(i);
            if(checkedSong.getTitle().equals(titleOfSong)){
                return checkedSong;
            }
        }
        return null;
    }
    public boolean addToPlaylist(int trackNumberOfSongInAlbum, LinkedList<Song> thePlaylist){
        int index = trackNumberOfSongInAlbum-1;
        if(index>=0 && index<=this.songs.size()){
            thePlaylist.add(this.songs.get(index));
            return true;
        }
        System.out.println("This album does not have a track "+ trackNumberOfSongInAlbum);
        return false;
    }
    public boolean addToPlaylist(String titleOfSong, LinkedList<Song> thePlaylist){
        if(findSong(titleOfSong)!=null){
            thePlaylist.add(findSong(titleOfSong));
            return true;
        }
        System.out.println("The song "+ titleOfSong + " is not in the album");
        return false;
    }
}

