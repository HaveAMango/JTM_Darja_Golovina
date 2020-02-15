package jtm.activity10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

/*
TODO Necessary imports commented
 */
//import com.fasterxml.jackson.databind.ObjectMapper;

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
import java.util.*;

import com.fasterxml.jackson.databind.ObjectMapper;

public class PersonRepo {

	private List<Person> personList;

	public PersonRepo() {
		init();
	}

	public void init() {
		File data = new File("src/main/resources/data.json");
		ArrayList<String> text = new ArrayList<String>();
		String s = null;
		try {
			BufferedReader in = new BufferedReader(new FileReader(data));
			s = in.readLine();
			while (s != null) {
				text.add(s);
				s = in.readLine();
			}
			in.close(); // close reader
		} catch (IOException e) {
			e.printStackTrace(); // handle exceptions
		}

		s = String.join("\n", text);
		try {
			ObjectMapper mapper = new ObjectMapper();

			Person[] personArray = mapper.readValue(s, Person[].class);
			personList = Arrays.asList(personArray);

			// 1. Read file data.json from resources folder into String
			// 2. Use ObjectMapper to convert String to List of Persons and
			// store in personList field
			// Hint: Correct way how to use ObjectMapper to convert String to List below
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public Person oldestPerson() {
		Person oldestPerson = personList.get(0);
		for (int i = 1; i < personList.size(); i++) {
			if (oldestPerson.getBirthDate().compareTo(personList.get(i).getBirthDate()) > 0) {
				oldestPerson = personList.get(i);
			}

		}
		// Find oldest person in personList field and return it
		return oldestPerson;
	}

	public Person youngestPerson() {
		Person youngest = personList.get(0);
		for (int i = 1; i < personList.size(); i++) {
			if (youngest.getBirthDate().compareTo(personList.get(i).getBirthDate()) < 0) {
				youngest = personList.get(i);
			}
		}
		return youngest;
	}

	public String largestPopulation() {
		int population=0;
		ArrayList <String> country = null;
		for (int i = 1; i < personList.size(); i++) {
			country.add(personList.get(i).getCountry());
		}
		
		// Find country with largest population and return it's name
		return null;
	}

}

/*
 * collections.frieqwency
 * Hint: ObjectMapper mapper = new ObjectMapper(); Person[] personArray =
 * mapper.readValue(data, Person[].class); List<Person> personList =
 * Arrays.asList(personArray);
 */
