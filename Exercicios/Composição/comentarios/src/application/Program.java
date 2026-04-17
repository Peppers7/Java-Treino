package application;

import entities.Comment;
import entities.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdm1 = new SimpleDateFormat();
        Post p1 = new Post(sdm1.parse("13/04/2026 13:05:44"), "Traveling to New Zealand",
                "i´m going to visit this wonderful contry!", 12);
        Comment c1 = new Comment("Have a nice trip");
        Comment c2 = new Comment("Wow that´s awesome!");

        Post p2 = new Post(sdm1.parse("13/04/2026 23:14:19"), "Goog night guys",
                "See you tomorrow", 5);

        Comment c3 = new Comment("Good night");
        Comment c4 = new Comment("May the Force be with you");

        p1.addComments(c1);
        p1.addComments(c2);

        p2.addComments(c3);
        p2.addComments(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
