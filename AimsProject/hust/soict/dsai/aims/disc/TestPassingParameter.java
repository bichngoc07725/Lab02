package hust.soict.dsai.aims.disc;

public class TestPassingParameter {
	public static void main(String[] args) {
	
		DigitalVideoDisc jungleDVD = new DigitalVideoDisc("Jungle");
		DigitalVideoDisc cinderellaDVD = new DigitalVideoDisc("Cinderella");
		swap(jungleDVD, cinderellaDVD);
		System.out.printf("jungle dvd title: " + jungleDVD.getTitle()+"\n");
		System.out.printf("cinderella dvd title: " + cinderellaDVD.getTitle()+"\n");
		
		changeTitle(jungleDVD,cinderellaDVD.getTitle());
		System.out.printf("jungle dvd title: "+ jungleDVD.getTitle()+"\n");
	}
	
	
	public static void swap(DigitalVideoDisc dvd1,DigitalVideoDisc dvd2) {
		Object tmp=o1;
		o1=o2;
		o2=tmp;
		
	}
	public static void changeTitle(DigitalVideoDisc dvd, String title) {
		String oldTitle = dvd.getTitle();
		dvd.setTitle(title);
		dvd = new DigitalVideoDisc(oldTitle);
	}
}
