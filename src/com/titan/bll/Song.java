/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.bll;

/**
 *
 * @author Brandon
 */
public class Song {
    
    protected String title;
    protected String artist;
    protected String dutation;
    protected String songPath;
    
    public Song(){
    }
    
    public Song(String title, String artist, String duration, String songPath) {
        this.title = title;
        this.artist = artist;
        this.dutation = duration;
        this.songPath = songPath;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getSongDuration(){
        return dutation;
    }
    
    public void setSongDuration(String duration){
        this.dutation = duration;
    }

    public String getSongPath() {
        return songPath;
    }

    public void setSongPath(String songPath) {
        this.songPath = songPath;
    }
    
     @Override
     public boolean equals(Object songToDelete){

     Song ourSong = (Song) songToDelete;
     if(songToDelete instanceof Song){
     return (ourSong.title == null ? this.title == null : ourSong.title.equals(this.title));
     }
     return false;
     }
    

}
