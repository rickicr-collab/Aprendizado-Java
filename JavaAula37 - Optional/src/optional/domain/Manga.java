package optional.domain;

public class Manga {
	private Integer id;
	private String title;
	private int chapters;
	
	
	public Manga(Integer id, String title, int chapters) {
		super();
		this.id = id;
		this.title = title;
		this.chapters = chapters;
	}


	public Integer getId() {
		return id;
	}


	public String getTitle() {
		return title;
	}


	public int getChapters() {
		return chapters;
	}
	

	public void setTitle(String title) {
		this.title = title;
	}


	public void setChapters(int chapters) {
		this.chapters = chapters;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Manga [id=");
		builder.append(id);
		builder.append(", title=");
		builder.append(title);
		builder.append(", chapters=");
		builder.append(chapters);
		builder.append("]");
		return builder.toString();
	}
	
	
	

}
