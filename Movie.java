package task1;

public class Movie {
    String title;
    String genre;
    String leadactor;
    String director;
    int release_year;
    float rating;
    String review;

    void display() {
        System.out.println("Title: " + title);
        System.out.println("Genre: " + genre);
        System.out.println("Lead Actor: " + leadactor);
        System.out.println("Director: " + director);
        System.out.println("Release Year: " + release_year);
        System.out.println("Rating: " + rating);
        System.out.println("Review: " + review);
    }

    void setReview() {
        if (rating < 5) {
            review = "Not Good";
        } else {
            review = "Good";
        }
    }

    public static void main(String[] args) {
        Movie m1 = new Movie();
        Movie m2 = new Movie();

        m1.title = "ABCD";
        m1.genre = "Comedy";
        m1.leadactor = "SRK";
        m1.director = "Rohit";
        m1.release_year = 2011;
        m1.rating = 8.5f;
        m1.setReview();

        m2.title = "DDLJ";
        m2.genre = "Romantic";
        m2.leadactor = "SRK";
        m2.director = "Rohit";
        m2.release_year = 2009;
        m2.rating = 4.0f;
        m2.setReview();

        m1.display();
        System.out.println(" ");
        m2.display();
    }
}
