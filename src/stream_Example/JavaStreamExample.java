package stream_Example;
 
import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;



class Personel {
	
	private void calculate() {
		
		System.out.println("deneme");
		
	}

	private int id;
	private String name;
	private String number;
	private double salary;	

	public Personel(int id, String name, String number, double salary) {
		this.id = id;
		this.name = name;
		this.number = number;
		this.salary = salary;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}


public class JavaStreamExample {
	public static void main(String[] args) {
		List<Personel> personelList = new ArrayList<Personel>();
		// Adding Products
		personelList.add(new Personel(1, "ahmet", "5300123", 120.0));
		personelList.add(new Personel(2, "mehmet", "5310124", 125.5));
		personelList.add(new Personel(3, "ayse", "53200125", 123.4));
		personelList.add(new Personel(4, "veli", "5330126", 121.8));
		personelList.add(new Personel(5, "mustafa", "5340127", 123.3));
		personelList.add(new Personel(6, "ibrahim", "5350128", 129.9));
		personelList.add(new Personel(7, "suleyman", "5360129", 127.2));
		personelList.add(new Personel(8, "goktug", "5370129", 120.6));
		personelList.add(new Personel(9, "husrev", "5380130", 126.7));
		personelList.add(new Personel(10, "okan", "5390131", 128.9));

// 123 liradan fazla maas alan kişilerin isimleri ve maaşlarının küçükten büyüğe ekrana bastırma
/*		personelList.stream()
				.filter(p -> p.getSalary() > 123)// filtering data
				.sorted(Comparator.comparingDouble(Personel::getSalary)) //sorted by a value
				.map(p -> p.getName() + " " + p.getSalary()) // fetching price
				.collect(Collectors.toList()).forEach(System.out::println);// collecting as list
*/
		
		

		
		
// kucukten buyuge siralayip ekrana bastırma.
/*		personelList.stream().sorted(Comparator.comparingDouble(Personel::getSalary)).collect(Collectors.toList())
				.forEach(p -> System.out.println(p.getId() + " - " + p.getName() + " - " + p.getNumber()+ " - "+p.getSalary()));
*/
		
		

		
		
// kucukten buyuge siralayip yeni bir listeye atma
/*		List<Personel>personelNewList;
		personelNewList=personelList.stream().sorted(Comparator.comparingDouble(Personel::getId)).collect(Collectors.toList());
		personelNewList.forEach(p -> System.out.println(p.getId() + " - " + p.getName() + " - " + p.getNumber()+ " - "+p.getSalary()));
*/		

		
		
		
		
// .filter ozelligi farklı case'ler için kullanma.
/*		personelList.stream()
				.filter(s -> (s.getName().startsWith("a")) && (s.getNumber().contains("532")))
				.map(p->p.getName() +" "+ p.getNumber())
				.collect(Collectors.toList())
				.forEach(System.out::println);
*/
		
		
		
		
		
// .filter ozelligi farklı case'ler için kullanma 2
/*		List<String>personelListNewList= personelList.stream()
				.filter(s -> (s.getName().startsWith("a")) && (s.getNumber().contains("532")))
				.map(p->p.getName() +" "+ p.getNumber())
				.collect(Collectors.toList());
				
		personelListNewList.forEach(System.out::println);
*/

		
		
		

// distinct kullanımı.
/*		List<String> names= Arrays.asList("muhammed","enes","enes","enes","enes","enes");
		names.stream().distinct().forEach(System.out::println);
*/


		
		
		
// limit belirleme
/*			personelList.stream()
						.filter(s -> (s.getSalary()>125))
						.limit(3)
						.map(p->p.getId() + " "+ p.getName()+" "+p.getSalary())
						.collect(Collectors.toList())
						.forEach(System.out::println);
*/

		
		
		

/* list içindeki tüm string'leri uppercase yapma
 * 
		List names = Arrays.asList("Ali", "Veli", "Selami", "Cem");
		Stream stream = names.stream();

		Stream upperStream= stream.map(name -> ((String) name).toUpperCase());
		List upperNames = (List) upperStream.collect(Collectors.toList());
		System.out.println(upperNames);
*/
	
		
		
		
/*		 // creating a list of Strings
        List<String> words = Arrays.asList("GFG", "Geeks", "for",
                                           "GeeksQuiz", "GeeksforGeeks");
 
        Optional<String> longestString = words.stream()
                                   .reduce((word1, word2)
                             -> word1.length() > word2.length()
                                           ? word1 : word2);
  
        // Displaying the longest String
        longestString.ifPresent(System.out::println);
        
*/
	
		
		
		
		
/*		
		 String[] array = { "Geeks", "for", "Geeks","husrev","nida","aras","osman","emine","elif","yusuf"};
         Optional<String> String_combine = Arrays.stream(array)
	                                           .reduce((str1, str2)
	                                           -> str1 + "-" + str2);
	  

	        if (String_combine.isPresent()) {
	            System.out.println(String_combine.get());
	        }
	       
*/
		
		
	

	/*
		double totalPrice3 = personelList.stream()  
                .collect(Collectors.summingDouble(Personel::getSalary)); 
        System.out.println(totalPrice3);
		
      */  		
        
        
  
	/*
        Personel personelA = personelList.stream().max((personel1, personel2)->personel1.getSalary() > personel2.getSalary() ? 1: -1).get();    
        System.out.println(personelA.getName()+ " "+personelA.getSalary());   
      
        */
		
		Integer a=100;
		Integer b=100;
		
		System.out.println(a==b);

		a=1000;
		b=1000;
     
		System.out.println(a==b);


	}
	
}





