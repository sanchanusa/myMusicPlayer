/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.test;

import com.titan.bll.Library;
import com.titan.bll.Song;
import java.util.List;

import org.junit.*;
import static org.junit.Assert.*;


/**
 *
 * @author Brandon
 */
public class LibraryTest {
    
    public LibraryTest() {
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
    public void emptyLibraryTest(){
        Library emptyLibrary = new Library();       
        assertEquals(0, emptyLibrary.songCount());
    }
    
    @Test
    public void addSongTest(){
        Library addLibrary = new Library();
        addLibrary.addSong(new Song("Rock Star", "John Smith", "5.32", "/Test.mp3"));
        addLibrary.addSong(new Song("Rock On", "Randy Smith", "5.32", "/Test.mp3"));
        assertEquals(2, addLibrary.songCount());        
    }
    
    @Test
    public void removeSongTest(){
       Library removeLibrary = new Library();
        removeLibrary.addSong(new Song("Rock Star", "John Smith", "5.32", "/Test.mp3"));
        removeLibrary.addSong(new Song("Rock On", "Randy Smith", "5.32", "/Test.mp3"));
        Song songToRemove = new Song("Rock On", "Randy Smith", "5.32", "/Test.mp3");
        removeLibrary.deleteSong(songToRemove);
        List<Song> remainingSongs = removeLibrary.getAllSongs();
        assertEquals(1, removeLibrary.songCount());
        assertFalse(remainingSongs.contains(songToRemove)); 

    }
    
    @Test
    public void songNotExsistAfterRemoveTest(){
        Library removeLibrary = new Library();
        removeLibrary.addSong(new Song("Rock Star", "John Smith", "5.32", "/Test.mp3"));
        removeLibrary.addSong(new Song("Rock On", "Randy Smith", "5.32", "/Test.mp3"));
        removeLibrary.deleteSong(new Song("Rock Star", "John Smith", "5.32", "/Test.mp3"));
        removeLibrary.deleteSong(new Song("Rock On", "Randy Smith", "5.32", "/Test.mp3"));
        assertEquals(0, removeLibrary.songCount());   
    }
    

}
