package be.pxl.ja.streamingservice.model;

public interface Playable {

    int getDuration();
    void play();
    void pause();

    //om een interface te implementeren
    //public class Movie implements Playable {}
    //public class Movie extends Content implments Playable {}
}
