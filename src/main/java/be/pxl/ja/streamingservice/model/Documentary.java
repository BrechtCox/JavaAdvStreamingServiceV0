package be.pxl.ja.streamingservice.model;

public class Documentary extends Movie implements Playable {

    private String topic;
    private static final Genre DEFAULT_GENRE = Genre.DOCUMENTARY;

    public Documentary(String title, Rating maturityRating) {
        super(title, maturityRating);
        this.topic = topic;
        setGenre(DEFAULT_GENRE);
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    @Override
    public void play() {
        StringBuilder result = new StringBuilder();
        result.append("Playing documentary ").append(this);

        if (topic != null) {
            result.append(" on ").append(topic);
        }

        System.out.println(toString());;
    }

    @Override
    public void pause() {
        System.out.println("Pause documentary about " + topic);
    }
}
