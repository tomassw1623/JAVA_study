package class1.ex;

public class MovieReviewMain1 {

    public static void main(String[] args) {

        MoviewReview inception = new MoviewReview();
        inception.title = "인셉션";
        inception.review = "인생은 무한루프";

        MoviewReview aboutTime = new MoviewReview();
        aboutTime.title = "어바웃타임";
        aboutTime.review = "인생 시간 영화";

        System.out.println("영화 제목 : " + inception.title + ", 리뷰 : " + inception.review );
        System.out.println("영화 제목 : " + aboutTime.title + ", 리뷰 : " + aboutTime.review );
    }
}
