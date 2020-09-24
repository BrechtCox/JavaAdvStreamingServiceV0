package be.pxl.ja.streamingservice.model;

public final class TVShow extends Content {

    private int numberOfSeasons;

    public TVShow(String title, Rating maturityRating, int numberOfSeasons) {
        super(title, maturityRating);
        this.numberOfSeasons = numberOfSeasons;
    }

    public int getNumberOfSeasons () {
        return numberOfSeasons;
    }

    /*@Override
    public String toString () {
        if (numberOfSeasons != 0) {
            return "Title: " + getTitle() + "\nRating: " + getMaturerityRating() + "\nNumber of seasons: " + getNumberOfSeasons();
        } else {
            return "Title: " + getTitle();
        }
    }*/
}
