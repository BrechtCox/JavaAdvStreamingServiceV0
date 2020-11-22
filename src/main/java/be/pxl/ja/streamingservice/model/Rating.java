package be.pxl.ja.streamingservice.model;

public enum Rating {

    LITTLE_KIDS,
    OLDER_KIDS("Vanaf 7 jaar"),
    TEENS("Vanaf 12 jaar"),
    MATURE("Vanaf 16 jaar");

    private String leeftijd;

    Rating() {
    }

    Rating(String leeftijd) {
        this.leeftijd = leeftijd;
    }

    public String getLeeftijd()
    {
        return leeftijd;
    }
}
