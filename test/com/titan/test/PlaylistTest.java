/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.titan.test;


import com.titan.bll.Playlist;
import com.titan.bll.Song;
import java.util.List;
import static org.junit.Assert.*;
import org.junit.*;

/**
 *
 * @author Brandon
 */
public class PlaylistTest {
    
    public PlaylistTest() {
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
    public void emptyPlaylistTest(){
        // Playlist emptyPlaylist = new Playlist("My Playlist");
        Playlist emptyPlaylist = new Playlist();
        assertEquals(0, emptyPlaylist.songCount());
        
    }
    /*
    @Test
    public void verifyNamePlaylistTest(){
        Playlist namePlaylist = new Playlist("Brandon Country Songs");
        assertEquals("Brandon Country Songs", namePlaylist.getPlaylistTitle());
    }
    */
    
    
    @Test
    public void addSongToPlaylistTest(){
        // Playlist addSongToPlaylist = new Playlist("Brandon Rock Songs");
        Playlist addSongToPlaylist = new Playlist();
        addSongToPlaylist.addSong(new Song("Rock of Love", "Queen", "5.32", "/Test.mp3"));
        assertEquals("Brandon Rock Songs", addSongToPlaylist.getPlaylistTitle());
        assertEquals(1, addSongToPlaylist.songCount());
    }
    
    @Test
    public void removeSongFromPlaylistTest(){
        // Playlist myPlaylist = new Playlist("90 Songs");
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(new Song("C", "C", "5.32", "/Test.mp3"));
        myPlaylist.addSong(new Song("B", "B", "5.32", "/Test.mp3"));
        myPlaylist.addSong(new Song("A", "A", "5.32", "/Test.mp3"));
        Song songToRemove = new Song("B", "B", "5.32", "/Test.mp3");
        myPlaylist.deleteSong(songToRemove);
        List<Song> remainingSongs = myPlaylist.getAllSongs();
        assertEquals(2, myPlaylist.songCount());
        assertFalse(remainingSongs.contains(songToRemove));
    }
    
    @Test
    public void sortPlaylistByTitle(){
        // Playlist myPlaylist = new Playlist("90 Songs");
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong(new Song("C", "C", "5.32", "/Test.mp3"));
        myPlaylist.addSong(new Song("B", "B", "5.32", "/Test.mp3"));
        myPlaylist.addSong(new Song("A", "A", "5.32", "/Test.mp3"));
        myPlaylist.sortByTitle();
        assertEquals(myPlaylist.getSongTitle(0), "A" );
    }
    
    @Test
    public void sortPlaylistByArtist(){
    // Playlist myPlaylist = new Playlist("90 Songs");
    Playlist myPlaylist = new Playlist();
    myPlaylist.addSong(new Song("C", "C", "5.32", "/Test.mp3"));
    myPlaylist.addSong(new Song("B", "B", "5.32", "/Test.mp3"));
    myPlaylist.addSong(new Song("A", "A", "5.32", "/Test.mp3"));
    myPlaylist.sortByArtist();
    assertEquals(myPlaylist.getSongArtist(0), "A" );
    }
    
    
}
