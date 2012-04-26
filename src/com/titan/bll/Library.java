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
public class Library{
    
    public List<Song> songs;
    
    public Library(){
        songs = new ArrayList<Song>();
    }

    
    public void addSong(Song songToAdd){
       
       songs.add(songToAdd);
       
    }
   

     public void deleteSong(Song songToDelete) {

         Iterator<Song> iterator = songs.iterator();
         
         if(iterator.hasNext()){
             if(songToDelete.equals(songToDelete)){
              songs.remove(songToDelete);
             }
         }
     }



     
    public int songCount(){
        return songs.size();
    }

    public List<Song> getAllSongs() {
        return songs;
    }
 
    
}
