package be.pxl.ja.streamingservice.model;

public abstract class Content {

    private String title;
    private be.pxl.h1.opdracht1.Rating maturityRating;
    private String imageUrl;

    public Content (String title, be.pxl.h1.opdracht1.Rating maturityRating) {
        this.title = title;
        this.maturityRating = maturityRating;
    }

    public String getTitle() {
        return title;
    }

    public be.pxl.h1.opdracht1.Rating getMaturerityRating() {
        return maturityRating;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @Override
    public String toString () {
        return title;
    }
}
