package p10;

public class Book {
	private String title;
	private String author;
	private int pageCount;
	
	// methods: Constructor, setters, getters, toString
	public Book(String title, String author, int pageCount) {
		this.title = title;
		this.author = author;
		this.pageCount = pageCount;
	}
	
	public String shortDescription() {
		return title + " by " + author;
	}
	
	public boolean isLongBook() {
		return pageCount > 500;
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public int getPageCount() {
		return pageCount;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setPageCount(int pageCount) {
		this.pageCount = pageCount;
	}
	
	public String toString() {
		return "Title: " + title + ", Author: " + author + ", PageCount: " + pageCount;
	}
}
