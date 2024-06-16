package app;

import entidades.Comment;
import entidades.Post;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Principal {
    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Comment c1 = new Comment("Fazer boa viagem!");
        Comment c2 = new Comment("Irei ir para outra ciadade!");

        Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"), "Viajando para Nova Zelandia",
                "Vou visitar esse páis maravilhoso", 12);

        p1.addComment(c1);
        p1.addComment(c2);

        Comment c3 = new Comment("Boa noite!");
        Comment c4 = new Comment("May estarei esperando voce");

        Post p2 = new Post(sdf.parse("28/07/2018 23:15:19"), "Boa noite a todos",
                "See you tomorrow", 12);

        p2.addComment(c3);
        p2.addComment(c4);

        System.out.println(p1);
        System.out.println(p2);
    }
}
