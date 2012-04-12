/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

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
}
