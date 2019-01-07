package Posts;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import Entities.Comentarios;
import Entities.Posts;

public class Post {

	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");

		Comentarios comentario01 = new Comentarios("Have a nice trip");
		Comentarios comentario02 = new Comentarios("Wow that awsome");
		Comentarios comentario03 = new Comentarios("Good night	");
		Comentarios comentario04 = new Comentarios("May the force be with you");
		Comentarios comentario05 = new Comentarios("Uoo its very good");

		Posts post01 = new Posts(sdf.parse("18/05/2018 13:05:44"),"Traveling to USA","I´m going to visit this woderfull contry",2);
		Posts post02 = new Posts(sdf.parse("25/06/2018 13:05:44"),"Good night guys","I´m going to visit this woderfull contry",3);
		
		post01.addComentario(comentario01);
		post01.addComentario(comentario02);		
		post02.addComentario(comentario03);
		post02.addComentario(comentario04);
		post02.addComentario(comentario05);
		
		System.out.println(post01.toString());
		System.out.println(post02.toString());
		
	}

}
