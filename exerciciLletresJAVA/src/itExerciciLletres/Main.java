package itExerciciLletres;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		//fase 1
		System.out.println("fase1");
		String n1 = "eloi";
		char[] name1 = n1.toCharArray();
		
		for (int i = 0; i < name1.length; i++) {
			System.out.println(name1[i]);
		}
		
		//fase 2
		System.out.println("\nfase2");
		String n = "iraida";
		List<Character> name = new ArrayList<Character>();
		
		for (int i = 0; i < n.length(); i++) {
			char c = n.charAt(i);
			name.add(c);
		}
		
		for (int i = 0; i < name.size(); i++) {
			if(Character.isDigit(name.get(i))) {
				System.out.println("Els noms de persones no contenen números!");
			} else {
				System.out.println(name.get(i));
				switch (name.get(i)) {
				case 'a':
					System.out.println("VOCAL");
					break;
				
				case 'A':
					System.out.println("VOCAL");
					break;
					
				case 'e':
					System.out.println("VOCAL");
					break;
					
				case 'E':
					System.out.println("VOCAL");
					break;
	
				case 'i':
					System.out.println("VOCAL");
					break;
					
				case 'I':
					System.out.println("VOCAL");
					break;
					
				case 'o':
					System.out.println("VOCAL");
					break;
					
				case 'O':
					System.out.println("VOCAL");
					break;
					
				case 'u':
					System.out.println("VOCAL");
					break;
					
				case 'U':
					System.out.println("VOCAL");
					break;
					
				default:
					System.out.println("CONSONANT");
					break;
				}
			}
		}
		
		//fase 3
		System.out.println("\nfase3");
		Map<Character, Integer> numeroLletres = new HashMap<Character, Integer>();
		
		for (int i = 0; i < name.size(); i++) {
			int num = 0;
			for (int j = 0; j < name.size(); j++) {
				if (name.get(i).equals(name.get(j))) {
					num++;
				}
			}
			numeroLletres.put(name.get(i), num);
		}
		System.out.println(numeroLletres);
		
		//fase 4
		System.out.println("\nfase4");
		List<Character> surname = new ArrayList<Character>();
		String snm = "Fernandez";
		for (int i = 0; i < snm.length(); i++) {
			char c = snm.charAt(i);
			surname.add(c);
		}
		
		List<Character> fullName = new ArrayList<Character>();
		
		for (int i = 0; i < name.size(); i++) {
			if(i<name.size()) {
				char c = name.get(i);
				fullName.add(c);
			}
		}
		
		fullName.add(' ');
		
		for (int i = 0; i < surname.size(); i++) {
			char c = surname.get(i);
			fullName.add(c);
		}
		
		System.out.println("FullName: " + fullName);
	}

}
