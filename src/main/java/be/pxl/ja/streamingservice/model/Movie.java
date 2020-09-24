package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;

public class Movie extends Content implements be.pxl.h1.opdracht1.Playable {

    public static final int LONG_PLAYING_TIME = 2 * 60 + 15;

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;

    public Movie (String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector () {
        return director;
    }

    public void setDirector (String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate () {
        return releaseDate;
    }

    public void setReleaseDate (LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration () {
        return duration;
    }

    @Override
    public void play() {
        System.out.println("Playing\n" + this);
    }

    @Override
    public void pause() {
        System.out.println("Pausing\n" + this);
    }

    public void setDuration (int duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public boolean isLongPlayingTime () {
        return duration >= LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        if (duration == 0) {
            return "?";
        }
        else if (duration < 60) {
            return duration + " min";
        } else if (duration % 60 == 0) {
            int result = duration / 60;
            return result + " h";
        } else {
            int resultMin = duration % 60;
            int resultHours = (duration - resultMin) / 60;
            return resultHours + " h " + resultMin + " min";
        }

    }

    @Override
    public String toString () {
        if (releaseDate != null) {
            return "Title: " + getTitle()+ "\nRelease date: " + getReleaseDate();
            //return "Title: " + getTitle() + "\nRating: " + getMaturerityRating() + "\nRelease date: " + releaseDate;
        } else {
            return "Title: " + getTitle() + "\nRating: " + getMaturerityRating();
        }
    }
}
