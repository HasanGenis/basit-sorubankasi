import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;



public class sorubankasi {

	public static void main(String[] args) {
		

		while(true) {
			
			secim();
		}
	
	}

	static ArrayList<String>sorular = new ArrayList<>(Arrays.asList("Türkiyenin baþkenti neresidir? A)Ýstanbul B)Ankara C)Bursa D)Ýzmir (kolay)","Türkiyenin en kalabalýk þehri hangisidir? A)Ýzmir B)Bursa C)Ankara D)Ýstanbul (kolay)","10 + 25 = ? A)19 B)28 C)34 D)35 (kolay)","10 * 8 = ? A)80 B)8 C)800 D)88 (kolay)","Hangisi meyve sýnýfýna girer? A)Domates B)Biber C)Patlýcan D)Kayýsý (kolay)","Savaþ alanýnda ölen ilk padiþah kimdir? A)IV.Mehmed B)IV.Murad C)I.Murad D)Yavuz Sultan Selim (normal)","Hangi hayvan memeli deðildir? A)Yarasa B)Yunus C)Penguen D)Kurt (normal)","Hangisi kuvvet birimidir? A)Pascal B)Newton C)Joule D)Kelvin (normal)","Çanakkale Zaferi hangi savaþa dahildir? A)I.Dünya Savaþý B)II.Dünya Savaþý C)Kurtuluþ Savaþý D)II.Balkan Savaþý (normal)","Türkiye'nin uluslararasý telefon kodu kaçtýr? A)+23 B)+45 C)+90 D)+453","Son Akþam Yemeði Tablosunun ressamý kimdir? A)Leonardo da Vinci B)Michelangelo C)Pablo Picasso D)Van Gogh (normal)"," angisi Yunanistan'ýn Yedi Bilgesi olarak adlandýrýlan filozoflardan biri deðildir? A)Aristoteles B)Thales C)Atinalý Solon D)Prieneli Bias (zor)","ABD baþkanlarýndan John Fitzgerald Kennedy’e suikast düzenleyerek öldüren kimdir? A)Jack Ruby B)Lee Harvey Oswald C)Dennis Ritchie D)Clay Shaw (zor)"));
	static ArrayList<String>dogrucevaplar = new ArrayList<>(Arrays.asList("B","D","D","A","D","C","C","B","A","C","A","A","B"));
	
	static Scanner girdi = new Scanner(System.in);
	
	//Seçim yapma ekraný
	private static void secim() {
		
		System.out.println("*************************");
		System.out.println("*                       *");
		System.out.println("* 1. Soru Ekle          *");
		System.out.println("* 2. Soru Sil           *");
		System.out.println("* 3. Sorularý Listele   *");
		System.out.println("* 4. Sinav              *");
		System.out.println("* 5. Cikis              *");
		System.out.println("*************************");
		System.out.print("* Seçiminiz: ");
		
		int secim = girdi.nextInt();
		
		switch(secim) {
		
			case 1:
				soruekle();
				break;
			case 2:
				sorusil();
				break;
			case 3:
				sorularýlistele();
				break;
			case 4:
				randomsoru();
				break;
			case 5:
				System.exit(0);
				break;
		
			}
		
	}
	//soru listeleme methodu
	private  static void sorularýlistele() {
		
		
		
		System.out.println("* 1. Normal Listeleme                     *");
		System.out.println("* 2. Zorluða Göre Listeleme               *");
		System.out.println("* 3. Doðru Þýklara göre Listeleme         *");
		System.out.println("* 4. Soru Metninde Aramaya Göre Listeleme *");
		System.out.println("* 5. Puana Göre Listeleme                 *");
		
		Scanner girdi4 = new Scanner(System.in);
		int listeno = girdi4.nextInt();
		
		switch(listeno) {
		
		//normal listeleme
		case 1:
			System.out.println("\n--------SORULAR-------\n\n");
			int i =1;
			for(String soru : sorular) {
				System.out.println(i+"SORU ->"+soru);
				i++;
				}
			break;
			//zorluða göre listeleme
		case 2:
			arama();
			break;
			//doðru þýklarý listeleme
		case 3:	
			
			Scanner girdi8 = new Scanner(System.in);
			System.out.println("Aranacak þýkký giriniz: ");
			String kelime = girdi8.nextLine();
			
			String aranankelime = kelime;
	
			for(int k=0; k<sorular.size();k++) {
				
				if(dogrucevaplar.get(k).contains(aranankelime)) {
					
					System.out.println("Aranan kelimenin indexi "+ k +"   aranan kelime "+aranankelime);
				}}
			break;
		//soru metninde arama
		case 4:
			arama();
			break;
		default:
			break;
			
		}
		
	
	}
	//soru silme methodu
	private static void sorusil() {
		
		arama();
		
		System.out.print("Silinecek sorunun indeksini giriniz: ");
		int index = girdi.nextInt();
		
		if(index > sorular.size() || index > dogrucevaplar.size()) {
			System.out.println("Soru silinirken hata oluþtu.");
			}
		else {
			String s = sorular.get(index-1);
			sorular.remove(index-1);
			dogrucevaplar.remove(index-1);
			System.out.println(" Soru silindi."+s);
			}
		}
	
	//soru ekleme methodu
	private static void soruekle() {
		
		Scanner girdi1 = new Scanner(System.in);
		Scanner girdi2 = new Scanner(System.in);
		
		System.out.print("Soruyu Cevap þýklarýný ve zorluðunu giriniz: (Soru  A)53 B)54    zor þeklinde  )");
		
		String s =girdi1.nextLine();
		
		sorular.add(s);
	
		
		
		System.out.println("Doðru cevabý giriniz (A B C D ÞEKLÝNDE): ");
		String dc = girdi2.nextLine();
		
		dogrucevaplar.add(dc);
	
	
			
	}
	//Arama yapmayý saðlayan method
	private static void arama() {
	
		Scanner girdi8 = new Scanner(System.in);
		
		System.out.println("Aranacak kelimeyi giriniz: ");
		String kelime = girdi8.nextLine();
		
		
		String aranankelime = kelime;
		
		
		for(int k=0; k<sorular.size();k++) {
			
			if(sorular.get(k).contains(aranankelime)) {
				
				System.out.println("Aranan kelimenin indexi "+ k +"aranan kelime "+aranankelime);
			}
		}
	}
	//sýnav için random soru üreten method
	public static void randomsoru()
    {
		Scanner girdi6 = new Scanner(System.in);
		int puan = 0;
		int i = 0;
		
		for(i=0;i<8;i++) {
		
			int sayi = (int)(Math.random()*13);
	
			System.out.println(sorular.get(sayi));
	

		if(dogrucevaplar.get(sayi).equals(girdi6.nextLine())) {
			
			System.out.println("Doðru cevap");
		
			
				if(sorular.get(sayi).contains("kolay")) {
				
					puan +=10;
				}
				else if(sorular.get(sayi).contains("normal")){
			
					puan +=15;
				}
				else {
				
					puan +=25;
				}	
			
			System.out.println("Puan= "+puan);
		}
		else {
			System.out.println("Yanlýþ cevap");
		}
    }
	

}
	
}
