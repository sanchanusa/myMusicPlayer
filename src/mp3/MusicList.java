/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.util.*;

/**
 *
 * @author Sandro
 */
public class MusicList {
    
    List<Song> songs;

    // Here I declare a variable to hold the index of the song to be play
    int indexForCurrentSong;
    
    
    public MusicList(){
        songs = new ArrayList<>();
        
    }
    
    public int songCount(){
        return songs.size();
        
    }
    
    public int indexForNewSong(){
        return (indexForCurrentSong + 1);
    }
    
    public int indexForCurrentSong(){
        return (indexForCurrentSong);
    }
    
    public int verifyIndexFirstTitle(){
        if (songs.get(0).getTitle().toString().equals("title of the 1st song")){
            return 0;
        }
        else {
            return -1;
        }
    }
    
    public int verifyIndexFirstArtist(){
        if (songs.get(0).getArtist().toString().equals("artist of the 1st song")){
            return 0;
        }
        else {
            return -1;
        }
    }
    
    public void addSong(Song songToAdd){
        songs.add(songToAdd);
        
    }

    public void removeSong(Song songToRemove) {
        // Here I had to create an String to holds the name of the song passed from the user
        String temporal1 = songToRemove.toString();
        // Here I had no more option that use an FOR Loop
        // I couldn't find another way :(
        for(int i=0; i < songs.size(); i++){
            // System.out.println(songs.get(i));
            // Here I create another String in order to do the comparasion
            String temporal2 = songs.get(i).toString();
            // Here I compare              
            if (temporal1.equals(temporal2)) {
                songs.remove(i);
            }
        }
    
    }

    public void selectSongToSkip(Song songToSelect) {
        // Here I create a variable to hold the name of the song that the user
        // wants to play
        String songSelected = songToSelect.toString();
        // Here I find the song to be played
        for(int i=0; i < songs.size(); i++){
            // Here I create another String in order to do the comparasion
            String temporal = songs.get(i).toString();
            // Here I compare              
            if (songSelected.equals(temporal)) {
                indexForCurrentSong = i;
                // System.out.println("The index is: " + indexForCurrentSong);
            }
        }
    }

    public void stopSong(Song song) {
        
    }

    public void selectSongToStop(Song songToStop) {
        // Here I create a variable to hold the name of the song that the user
        // is listening now.
        String songBeingPlayed = songToStop.toString();
        // Here I look for the song being played
        for(int i=0; i < songs.size(); i++){
            // Here I create another String in order to do the comparasion
            String temporal = songs.get(i).toString();
            // Here I compare and save the current song (index)              
            if (songBeingPlayed.equals(temporal)) {
                indexForCurrentSong = i;
            }
        }
    }
    
    // I coundn't find a better way to sort the list :(
    // but this way works :)
    public void sortByName(Song songsToSort) {
        // This list will get the titles from the list of songs
        List<String> byName;
        byName = new ArrayList<>();
        
        // Here I get the titles
        for (int i = 0; i < songs.size(); i++)
            byName.add(i, songs.get(i).getTitle());
        
        // Here I sort the titles inside my temporary list (byName)
        Collections.sort(byName);
        
        // This variable will help me to control the loops
        int sentinela = 0;
        
        // Here I compare the lists, so I can swap/sort correctly
        for (int t = 0; t < songs.size(); t++){ 
            for (int i = 0; i < songs.size(); i++){
                if (songs.get(i).getTitle().toString().equals(byName.get(sentinela).toString())){
                Collections.swap(songs, i, t);
                sentinela++;
                i = songs.size();
                }
            }
        }
        // This loop is here just to help me to verify if the sort is correct or not :)
        System.out.println("Sort by Title");
        for (int i = 0; i < songs.size(); i++){
            System.out.println("index " + i + " is: " + songs.get(i).toString());
        }
    }
    
    
    
    // I coundn't find a better way to sort the list :(
    // but this way works :)
    public void sortByArtist(Song songsToSort) {
        // This list will get the titles from the list of songs
        List<String> byArtist;
        byArtist = new ArrayList<>();
        
        // Here I get the artist
        for (int i = 0; i < songs.size(); i++)
            byArtist.add(i, songs.get(i).getArtist());
        
        // Here I sort the titles inside my temporary list (byName)
        Collections.sort(byArtist);
        
        // This variable will help me to control the loops
        int sentinela = 0;
        
        // Here I compare the lists, so I can swap/sort correctly
        for (int t = 0; t < songs.size(); t++){ 
            for (int i = 0; i < songs.size(); i++){
                if (songs.get(i).getArtist().toString().equals(byArtist.get(sentinela).toString())){
                Collections.swap(songs, i, t);
                sentinela++;
                i = songs.size();
                }
            }
        }
        // This loop is here just to help me to verify if the sort is correct or not :)
        System.out.println("Sort by Artist");
        for (int i = 0; i < songs.size(); i++){
            System.out.println("index " + i + " is: " + songs.get(i).toString());
        }
    }
    
    
}
