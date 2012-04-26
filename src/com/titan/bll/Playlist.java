/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;

import java.util.*;

/**
 *
 * @author Brandon
 */
public class Playlist {
    
    List<Song> songList;
    protected String playlistTitle;
    
    // public Playlist(String playlistTitle) {

    public Playlist() {
        // this.playlistTitle = playlistTitle;
        songList = new ArrayList<Song>();
       }
    
    public int songCount(){
        return songList.size();
    }
    
    public void sortByTitle(){
       Collections.sort(this.songList,new Comparator(){
         @Override
         public int compare(Object a, Object b) { 
             Song song1 = (Song) a;
             Song song2 = (Song) b;
                return song1.title.compareToIgnoreCase(song2.title); 
            } 
       });
    }
        public void sortByArtist() {
         Collections.sort(this.songList,new Comparator(){
         @Override
         public int compare(Object a, Object b) { 
             Song song1 = (Song) a;
             Song song2 = (Song) b;
                return song1.artist.compareToIgnoreCase(song2.artist); 
            } 
       });
    }

    public String getPlaylistTitle() {
        return playlistTitle;
    }

    public void setPlaylistTitle(String playlistTitle) {
        this.playlistTitle = playlistTitle;
    }

    public void addSong(Song songToAdd) {
        songList.add(songToAdd);
    }
    
    public void deleteSong(Song songToDelete) {

     Iterator<Song> iterator = songList.iterator();
         
     if(iterator.hasNext()){
        if(songToDelete.equals(songToDelete)){
          songList.remove(songToDelete);
          }
       }
     }
    
    public Object getSongTitle(int i) {
        return songList.get(i).title;
    }
    
    public Object getSongArtist(int i) {
        return songList.get(i).artist;
    }
    
    
    
    public Object getSongDuration(int i){
        return songList.get(i).dutation;
    }
    
    

    public String getSongPath(int i) {
        return songList.get(i).songPath;
    }

    
        public List<Song> getAllSongs() {
        return songList;
    }
        
        
        
    
}
