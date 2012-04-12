/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

/**
 *
 * @author Sandro
 */
public class Song {

    
    private String title;
    private String artist;

    public String getArtist() {
        return artist;
    }

    public String getTitle() {
        return title;
    }
    
    
    
    public Song(String title, String artist) {
        
        this.title = title;
        this.artist = artist;
                
    }
    
    @Override
    public String toString(){
        return title + ", " + artist;
        
    }
    
}
