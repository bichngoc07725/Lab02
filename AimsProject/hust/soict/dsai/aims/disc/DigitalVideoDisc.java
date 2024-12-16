package hust.soict.dsai.aims.disc;


public class DigitalVideoDisc {
    private String title; 
    private String category; 
    private String director; 
    private int length; 
    private float cost;
    
    public int getId() {
    	return id;
    }

    public String getTitle() {
        return title;
    }

    public String getCategory() {
        return category;
    }

    public String getDirector() {
        return director;
    }

    public int getLength() {
        return length;
    }

    public float getCost() {
        return cost;
    }

    public DigitalVideoDisc(String title) {
    	nbDigitalVideoDisc++;
    	this.id=ndDigitalVideoDisc;
        this.title = title;
    }

    public DigitalVideoDisc(String title, String category, float cost) {
        this.title = title;
        this.category = category;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.cost = cost;
    }

    public DigitalVideoDisc(String title, String category, String director, int length, float cost) {
        this.title = title;
        this.category = category;
        this.director = director;
        this.length = length;
        this.cost = cost;
    }
    public boolean isMatch(String title) {
    	return this.title.equalsIgnoreCase(title);
    }
    
    void printDetail() {
    	System.out.format("Disc detail:\n"
    			 + "Title: %s\n"
                 + "Category: %s\n"
                 + "Director: %s\n"
                 + "Length: %d page(s)\n"
                 + "Cost: %.2f$\n\n", title, category, director, length, cost);)
    }
    
}