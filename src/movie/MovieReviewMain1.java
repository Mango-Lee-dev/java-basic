package movie;

public class MovieReviewMain1 {
    public static void main(String[] args) {
        MovieReview inception = new MovieReview();
        inception.title = "Inception";
        inception.review = "인생은 무한루프";

        MovieReview aboutTime = new MovieReview();
        aboutTime.title = "어바웃 타임";
        aboutTime.review="인생 시간 영화";

        System.out.println("영화 제목: " + inception.title + " " + inception.review);
        System.out.println("영화 제목: " + aboutTime.title + " " + aboutTime.review);
    }
}
