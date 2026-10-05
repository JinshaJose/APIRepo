package user.java;

import java.util.List;

public class UserDemoAPI {
	private int bookId;
	private String title;
	private String author;
	private int isbn;
	private double price;
	private boolean inStock;
	private int publishedYear;
	//private String[] genres;
	private List<String>genres;
	private double rating;
	
	
	
	
	/*public User(String name,String job) {
		this.name = name;
		this.job = job;*/
	public void setTitle(String title) {
		this.title = title;
		
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getIsbn() {
		return isbn;
	}
	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isInStock() {
		return inStock;
	}
	public void setInStock(boolean inStock) {
		this.inStock = inStock;
	}
	public int getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(int publishedYear) {
		this.publishedYear = publishedYear;
	}
	/*public String[] getGenres() {
		return genres;
	}*/
	public void setGenres(List<String>genres)
	{
		this.genres = genres;
	}
	
	/*public void setGenres(String[] genres) {
		this.genres = genres;
	}*/
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public String getTitle() {
		return title;
	}

public String getTtitle() {
	return title;
}


}
