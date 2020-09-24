package be.pxl.ja.streamingservice.model;

public enum Rating {

    LITTLE_KIDS,
    OLDER_KIDS("vanaf 7 jaar"),
    TEENS("vanaf 12 jaar"),
    MATURE("vanaf 16 jaar");

    private String commentLeeftijd;

    Rating () {

    }

    Rating (String commentLeeftijd) {
        this.commentLeeftijd = commentLeeftijd;
    }

    public String getCommentLeeftijd () {
        return commentLeeftijd;
    }
}
