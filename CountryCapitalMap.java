package hello;
	import java.util.Map;
	import java.util.TreeMap;

	public class CountryCapitalMap {
	    public static void main(String[] args) {
	        TreeMap<String, String> countryCapitalMap = new TreeMap<>();
	        countryCapitalMap.put("India", "New Delhi");
	        countryCapitalMap.put("USA", "Washington");
	        countryCapitalMap.put("Japan", "Tokyo");
	        countryCapitalMap.put("Germany", "Berlin");
	        countryCapitalMap.put("India", "Delhi");
	        System.out.println("Country-Capital pairs in sorted order:");
	        for (Map.Entry<String, String> entry : countryCapitalMap.entrySet()) {
	            System.out.println(entry.getKey() + " -> " + entry.getValue());
	        }
	        System.out.println("\nDemonstrating TreeMap methods:");
	        String firstCountry = countryCapitalMap.firstKey();
	        System.out.println("First country (alphabetically): " + firstCountry);
	        String lastCountry = countryCapitalMap.lastKey();
	        System.out.println("Last country (alphabetically): " + lastCountry);
	        String higherThanGermany = countryCapitalMap.higherKey("Germany");
	        System.out.println("Country after 'Germany': " + higherThanGermany);
	        String lowerThanJapan = countryCapitalMap.lowerKey("Japan");
	        System.out.println("Country before 'Japan': " + lowerThanJapan);
	    }
	}
