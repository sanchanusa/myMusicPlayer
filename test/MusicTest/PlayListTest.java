/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicTest;

import java.io.IOException;
import mp3.PlayList;
import mp3.Song;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Sandro
 */
public class PlayListTest {
    
    public PlayListTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    // Here I check if there is any PlayList. My idea in this test is that
    // I can create few Play List from the user, but I am not sure if this
    // has to be in a List or a File. The other day I create a File so I can
    // put in there as many data I want, but now I am using a List.
    // I got the idea for this test from your video :) when you added Library
    @Test
    public void emptyPlayList() {
        PlayList emptyPlayList = new PlayList();
        assertEquals(0, emptyPlayList.PlayListCount());
    }
    
    // Here I added two play list to PlayList, I am using the same way that 
    // creates the list of songs, eventually I will modify this to be able to add
    // songs for each Play List :)
    @Test
    public void createPlayList() {
        PlayList myPlayList = new PlayList();
        myPlayList.addPlayList(new PlayList("SoftRock"));
        myPlayList.addPlayList(new PlayList("Classical"));
        assertEquals(2, myPlayList.PlayListCount());
    }

       
    /*************************************************************************
     * I removed this until I need it, maybe it will help me to save a file that 
     * holds all the play list with their songs that the user created/selected.
    @Test
    public void createPlayList() throws IOException{
        PlayList createPlayList = new PlayList();
        // Here I call the class and method that creates the PlayList file
        // that will hold all the songs for that particular file (PlayList)
        createPlayList.nameForThePlayList();
        // Here I verify if the file was created
        assertEquals(true, createPlayList.nameForThePlayList());
        }
    *************************************************************************/
    
    // Here I test an empty PlayList, which holds all the play list that the 
    // user creates
    
}
