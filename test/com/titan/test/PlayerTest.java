/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.test;

import com.titan.bll.Player;
import com.titan.bll.Playlist;
import com.titan.bll.Song;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Brandon
 */
public class PlayerTest {
    
    public PlayerTest() {
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
   
    @Test
    public void createPlayer(){
        Player createPlayer = new Player();
        assertEquals(true , createPlayer.isPlayerCreated());
    }
    
    @Test
    public void addPlaylistWithSongsToPlayer(){
        // Playlist myPlaylist = new Playlist("80 Music");
        Playlist myPlaylist = new Playlist();
        Player createPlayer = new Player();
        myPlaylist.addSong(new Song("Three Kings", "Allen Smith", "5.32", "/Test.mp3"));     
        createPlayer.loadPlaylist(myPlaylist);
        assertEquals("80 Music" , createPlayer.isPlaylistLoaded("80 Music"));
        assertEquals("Three Kings", createPlayer.getCurrentSong()); 
    }
    
    @Test
    public void playSong(){
        // Playlist myPlaylist = new Playlist("80 Music");
        Playlist myPlaylist = new Playlist();
        Player myPlayer = new Player();
        myPlaylist.addSong(new Song("Three Kings", "Allen Smith", "5.32", "/Test.mp3"));     
        myPlayer.loadPlaylist(myPlaylist);
        myPlayer.playSong();
        assertTrue(myPlayer.isPlaying());
    }
    
    @Test
    public void pauseSong() throws InterruptedException{
        // Playlist myPlaylist = new Playlist("80 Music");
        Playlist myPlaylist = new Playlist();
        Player myPlayer = new Player();
        myPlaylist.addSong(new Song("Three Kings", "Allen Smith", "5.32", "/Test.mp3"));     
        myPlayer.loadPlaylist(myPlaylist);
        myPlayer.playSong();
        myPlayer.pauseSong();
        assertTrue(myPlayer.isPaused());
        
    }
    
    @Test
    public void resumeSong() throws InterruptedException{
        // Playlist myPlaylist = new Playlist("80 Music");
        Playlist myPlaylist = new Playlist();
        Player myPlayer = new Player();
        myPlaylist.addSong(new Song("Three Kings", "Allen Smith", "5.32", "/Test.mp3"));     
        myPlayer.loadPlaylist(myPlaylist);
        myPlayer.playSong();
        myPlayer.pauseSong();
        assertTrue(myPlayer.isPaused());
        myPlayer.resumeSong();
        assertFalse(myPlayer.isPaused());
        
    }
    
    @Test
    public void skipSong(){
        // Playlist myPlaylist = new Playlist("80 Music");
        Playlist myPlaylist = new Playlist();
        Player myPlayer = new Player();
        myPlaylist.addSong(new Song("Three Kings", "Allen Smith", "5.32", "/Test.mp3"));
        myPlaylist.addSong(new Song("Rock On", "Allen Smith", "5.32", "/Test.mp3"));
        myPlaylist.addSong(new Song("Blank Stare", "Allen Smith", "5.32", "/Test.mp3"));
        myPlayer.loadPlaylist(myPlaylist);
        assertEquals("Three Kings", myPlayer.getCurrentSong());
        myPlayer.skipSong();
        assertEquals("Rock On", myPlayer.getCurrentSong());
        myPlayer.skipSong();
        assertEquals("Blank Stare", myPlayer.getCurrentSong());
        
    }
    
    @Test
    public void backSong(){
        // Playlist myPlaylist = new Playlist("80 Music");
        Playlist myPlaylist = new Playlist();
        Player myPlayer = new Player();
        myPlaylist.addSong(new Song("Three Kings", "Allen Smith", "5.32", "/Test.mp3"));
        myPlaylist.addSong(new Song("Rock On", "Allen Smith", "5.32", "/Test.mp3"));
        myPlaylist.addSong(new Song("Blank Stare", "Allen Smith", "5.32", "/Test.mp3"));
        myPlayer.loadPlaylist(myPlaylist);
        assertEquals("Three Kings", myPlayer.getCurrentSong());
        myPlayer.skipSong();
        assertEquals("Rock On", myPlayer.getCurrentSong());
        myPlayer.backSong();
        assertEquals("Three Kings", myPlayer.getCurrentSong());
        
    }
    
  
    
    
}
