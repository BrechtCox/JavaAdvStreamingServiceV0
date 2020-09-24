package be.pxl.ja.streamingservice.model;

public class Documentary extends be.pxl.h1.opdracht1.Movie {

    private String topic;

    public Documentary(String title, Rating maturatyRating) {
        super(title, maturatyRating);
        setGenre(Genre.DOCUMENTARY);
    }

    public void setTopic (String topic) {
        this.topic = topic;
    }

    public String getTopic () {
        return topic;
    }

    @Override
    public void play() {
        StringBuilder result = new StringBuilder();
        result.append("Playing documentary ").append(this);
        if (topic != null) {
            result.append(" on ").append(topic);
        }
        System.out.println(toString());
    }

    @Override
    public void pause() {
        System.out.println("Pausing documentary " + this );
    }
}
