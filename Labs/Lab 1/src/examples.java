import static org.junit.Assert.*;
import org.junit.Test;

public class examples {
	
	Album album1 = new Album("Max", "Rock");
    Album album2 = new Album("Max", "Jazz");
    Album album3 = new Album("Sam", "Jazz");
    Album album4 = new Album("Max", "Rock");
    Song song1 = new Song("RandomSong1", 18, album1);
    Song song2 = new Song("RandomSong2", 27, album2);
    Song song3 = new Song("RandomSong3", 64, album1);
    
    
 
    @Test
    public void SongTest() {
       assertEquals(18, song1.leninSeconds);
     }
    
    @Test
    public void AlbumTest1() {
    	assertEquals("Rock", album1.genre);
    }
    
    @Test
    public void AlbumTest2() {
    	assertEquals(album2.genre, album3.genre);
    }
    
    @Test
    public void AlbumTest3() {
    	assertEquals(album1.NameOfArtist, album2.NameOfArtist);
    }
    
    @Test
    public void AlbumTest4() {
    	assertEquals(song1.onAlbum, song3.onAlbum);
    }
    
}
