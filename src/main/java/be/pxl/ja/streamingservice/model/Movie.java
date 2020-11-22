package be.pxl.ja.streamingservice.model;
import java.time.LocalDate;

public class Movie extends Content implements Playable {

    private String director;
    private LocalDate releaseDate;
    private int duration;
    private Genre genre;
    public static final int LONG_PLAYING_TIME = 135;

    public Movie (String title, Rating maturityRating) {
        super(title, maturityRating);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public LocalDate getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDate releaseDate) {
        this.releaseDate = releaseDate;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public Genre getGenre() {
        return genre;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

   public boolean isLongPlayingTime() {
        return duration > LONG_PLAYING_TIME;
    }

    public String getPlayingTime() {
        // TODO: implement this method correctly
        StringBuilder builder = new StringBuilder();
        int hours;
        int minutes;

        if (duration == 0) {
            return "?";
        }
        else if (duration < 60 && duration > 0) {
            builder.append(duration).append(" min");
            return builder.toString();
        }
        else if (duration % 60 == 0) {
            hours = duration / 60;
            builder.append(hours).append(" h");
            return builder.toString();
        }
        else {
            hours = duration / 60;
            minutes = duration % 60;
            builder.append(hours).append(" h ").append(minutes).append(" min");
            return builder.toString();
        }
    }

    @Override
    public void play() {
        System.out.println("Playing " + this + " " + genre);
    }

    @Override
    public void pause() {
        System.out.println("Pausing " + this + " " + genre);
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder(super.toString());
        if(releaseDate !=null) {
            builder.append(" (").append(releaseDate.getYear()).append(")");
        }
        return builder.toString();
    }
}
