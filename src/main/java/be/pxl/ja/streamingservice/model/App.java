package be.pxl.ja.streamingservice.model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {

        /*
        Movie movie1 = new Movie("Lord of the Rings: The Fellowship of the Ring", Rating.TEENS);
        Movie movie2 = new Movie("Inception", Rating.TEENS);
        LocalDate releaseDateOfMovie2 = LocalDate.of(2010, Month.JULY, 21);

        movie1.setDirector("Peter Jackson");
        System.out.println(movie1.toString());

        movie2.setReleaseDate(releaseDateOfMovie2);
        System.out.println(movie2.toString());
        */

        List<Content> contentList = new ArrayList<>();

        Movie the_incredibles = new Movie("The Incredibles", Rating.LITTLE_KIDS);
        the_incredibles.setReleaseDate(LocalDate.of(2004, 10, 27));
        contentList.add(the_incredibles);

        Movie iron_fist = new Movie("Iron Fist", Rating.MATURE);
        contentList.add(iron_fist);

        TVShow eigen_kweek = new TVShow("Eigen kweek", Rating.TEENS, 3);
        contentList.add(eigen_kweek);

        Documentary american_murder = new Documentary("American murder", Rating.MATURE);
        contentList.add(american_murder);

        for (Content content : contentList) {
            if (content instanceof Playable) {
                ((Playable) content).play();
            }
            if (content instanceof Movie) {
                ((Movie) content).pause();
            }
            if (content instanceof Documentary) {
                System.out.println(((Documentary) content).getTopic());
            }
        }
    }
}
