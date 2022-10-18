import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Album {
    private String name;
    private String artist;
    private SongList songs;

    public Album(String name, String artist) {
        this.name = name;
        this.artist = artist;
        this.songs = new SongList();
    }
    public boolean addSong(String titleOfSong, double durationOfSong){
        return this.songs.add(new Song(titleOfSong,durationOfSong));
    }
    public boolean addToPlaylist(int trackNumberOfSongInAlbum, LinkedList<Song> thePlaylist){
       Song checkedSong = this.songs.findSong(trackNumberOfSongInAlbum);
        if(checkedSong!=null){
            thePlaylist.add(checkedSong);
            return true;
        }
        System.out.println("This album does not have a track "+ trackNumberOfSongInAlbum);
        return false;
    }
    public boolean addToPlaylist(String titleOfSong, LinkedList<Song> thePlaylist){
        Song checkedSong = this.songs.findSong(titleOfSong);
        if(checkedSong!=null){
            thePlaylist.add(checkedSong);
            return true;
        }
        System.out.println("The song "+ titleOfSong + " is not in the album");
        return false;
    }
    private class SongList{
        List<Song> listOfSongs;

        public SongList() {
            this.listOfSongs = new ArrayList<Song>();
        }
        public boolean add(Song song){
            if(listOfSongs.contains(song)){
                return false;
            }
            this.listOfSongs.add(song);
            return true;
        }
        private Song findSong(String titleOfSong){
            for(int i=0; i<this.listOfSongs.size();i++){
                Song checkedSong = this.listOfSongs.get(i);
                if(checkedSong.getTitle().equals(titleOfSong)){
                    return checkedSong;
                }
            }
            return null;
        }
        public Song findSong(int trackNumber){
            int index = trackNumber-1;
            if((index>0) && (index<listOfSongs.size())){
                return listOfSongs.get(index);
            }
            return null;
        }
    }
}

