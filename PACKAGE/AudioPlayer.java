package song;

import sad.SadSong;

public class AudioPlayer {

  public static void main(String[] args) {

	SadSong s1 = new SadSong();

	s1.setSong("Ankiya Gulab");

	s1.setSingerName("Arijit Sing");

	System.out.println(s1.getSingerName());

	System.out.println(s1.getSong());
  }
}