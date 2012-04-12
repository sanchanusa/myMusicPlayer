/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package MusicTest;

import mp3.Song;
import mp3.MusicList;
import org.junit.*;
import static org.junit.Assert.*;

/**
 *
 * @author Sandro
 */
public class MusicListTest {
    
    public MusicListTest() {
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
    public void emptyListTest() {
        MusicList emptyList = new MusicList();
        assertEquals(0, emptyList.songCount());
    }
    
    @Test
    public void addSong(){
        MusicList myMusicList = new MusicList();
        myMusicList.addSong(new Song("title of the 1st song", "artist of the 1st song"));
        myMusicList.addSong(new Song("title of the 2nd song", "artist of the 2nd song"));
        assertEquals(2, myMusicList.songCount());
    }
    
    // Here I create the list with three songs, so I am going to remove one of them,
    // I will remove the second one
    @Test
    public void removeSong(){
        MusicList myMusicList = new MusicList();
        myMusicList.addSong(new Song("title of the 1st song", "artist of the 1st song"));
        myMusicList.addSong(new Song("title of the 2nd song", "artist of the 2nd song"));
        myMusicList.addSong(new Song("title of the 3rd song", "artist of the 3rd song"));
        // Here I erase the song that user "selected"
        myMusicList.removeSong(new Song("title of the 2nd song", "artist of the 2nd song"));
        // I create three songs to perform this test, and erased the second one, so there 
        // is only two now.
        assertEquals(2, myMusicList.songCount());
    }
    
    // Here I create a list of 5 songs in order to do the following test
    @Test
    public void skipSong() {
        MusicList myMusicList = new MusicList();
        myMusicList.addSong(new Song("title of the 1st song", "artist of the 1st song"));
        myMusicList.addSong(new Song("title of the 2nd song", "artist of the 2nd song"));
        myMusicList.addSong(new Song("title of the 3rd song", "artist of the 3rd song"));
        myMusicList.addSong(new Song("title of the 4th song", "artist of the 4th song"));
        myMusicList.addSong(new Song("title of the 5th song", "artist of the 5th song"));
        // Let's say that the user select the 2nd song to be play, so I want to skip this
        // 2nd song and move to the next song, which is the 3rd song.
        myMusicList.selectSongToSkip(new Song("title of the 2nd song", "artist of the 2nd song"));
        // So, I already know that the 2nd song is located in index 1, so the next song is 
        // index 2. Therefore, the test is using the assertEquals to 2. 
        assertEquals(2, myMusicList.indexForNewSong());
    }
    
    // Here I create a list of 5 songs in order to do the following test
    @Test
    public void stopSong(){
        MusicList myMusicList = new MusicList();
        myMusicList.addSong(new Song("title of the 1st song", "artist of the 1st song"));
        myMusicList.addSong(new Song("title of the 2nd song", "artist of the 2nd song"));
        myMusicList.addSong(new Song("title of the 3rd song", "artist of the 3rd song"));
        myMusicList.addSong(new Song("title of the 4th song", "artist of the 4th song"));
        myMusicList.addSong(new Song("title of the 5th song", "artist of the 5th song"));
        // Let's say that the user is listening the list of song, and decide to stop it
        // at any time. For this example test the song being played is the 3rd song,
        // so the index for that song being played must be 2.
        myMusicList.selectSongToStop(new Song("title of the 3rd song", "artist of the 3rd song"));
        // Well, at least it is my idea how to stop a song, because after stopping the song
        // the user can re-play the same song, and we can do that because we know where
        // is the current song...
        assertEquals(2, myMusicList.indexForCurrentSong());
                
    }
}
