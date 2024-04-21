package ex13_JavaCodingInterview.JukeBox;

public interface Selector {
    public void nextSongBtn();
    public void preSongBtn();
    public void addSongToPlaylistBtn(Song song);
    public void removeSongFromPlaylistBtn(Song song);
    public void shuffleBtn();
}
