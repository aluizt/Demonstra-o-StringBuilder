package Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Posts {

	private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss"); // static para ter apenas um sdf para toda a aplicação
	
	private Date moment;
	private String title;
	private String content;
	private Integer likes;
	private List<Comentarios> comentarios = new ArrayList<Comentarios>();
	
	public Posts() {
		
	}


	public Posts(Date moment, String title, String content, Integer likes ) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
		
	}


	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comentarios> getComentarios() {
		return comentarios;
	}

	public void addComentario(Comentarios comentario01) {
		this.comentarios.add(comentario01);
	}

	public void removeComentario(Comentarios comentario01) {
		this.comentarios.remove(comentario01);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment)+"\n");
		sb.append(content+"\n");
		sb.append("Comentarios :"+"\n");
		for (Comentarios c :comentarios ) {
			sb.append(c.getText()+"\n");
		}
		sb.append(" ");
		
		return sb.toString(); // converte o stringBuild para string e retorna o mesmo
	}
	
	
}
