/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mp3;

// import MusicTest.NameOfList; 

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Sandro
 */
public class PlayList {

    
    List<PlayList> lista;
    
    public PlayList(){
        lista = new ArrayList<PlayList>();
        
    }

    public PlayList(String name) {
        
    }
    
    public int PlayListCount(){
        return lista.size();
        
    }

    public void addPlayList(PlayList playList) {
        lista.add(playList);
        
    }

    
    
    

/************************************************************************************************
    public boolean nameForThePlayList() {
        
        // Here I prepare the program to create a file, which will hold
        // the list of songs

        File f;
        
        // Here I call the method that will handle the name of the file (PlayList)
        f = new File(nameOfThePlayList());
        // Here we check if the file was/is created
        if(!f.exists()){
            try {
                f.createNewFile();
                
            } catch (IOException ex) {
                Logger.getLogger(PlayList.class.getName()).log(Level.SEVERE, null, ex);
                
            }
            //I added this line (but set up as a comment because this line will erase the file
            //after creating it, so I can get false for the test class :)
            // f.delete();
        }
        
        if(f.exists()){
        
        return true;
        
        }
     
        return false;
    }

    private String nameOfThePlayList() {
        // right now I just create this method, which create a file named myFile.txt
        // but eventually I will put some code here to get the name of the file (PlayList)
        // from the user, is it right?
        return "myFile.txt";
    }
***************************************************************************************************/
   
}
