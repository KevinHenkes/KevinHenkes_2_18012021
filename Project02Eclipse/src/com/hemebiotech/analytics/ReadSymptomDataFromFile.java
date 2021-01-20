package com.hemebiotech.analytics;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

/**
 * Simple brute force implementation
 *
 */
public class ReadSymptomDataFromFile implements ISymptomReader {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public ReadSymptomDataFromFile (String filepath) {
		this.filepath = filepath;
	}
	
	@Override
	public HashMap<String, Integer> getSymptomsAndOccurencesFromFile() {
		HashMap<String, Integer> symptomsOccurences = new HashMap<>();
		
		if (filepath != null) {
			try (BufferedReader reader = new BufferedReader (new FileReader(filepath))) {
				String line = reader.readLine();
				while (line != null) {
					if (!symptomsOccurences.containsKey(line)) {
						symptomsOccurences.put(line, 1);
					} else {
						symptomsOccurences.put(line, symptomsOccurences.get(line) + 1);
					}
					line = reader.readLine();
				}
			} catch (IOException e) {
				System.out.println(e.getMessage());
			}
		}
		
		return symptomsOccurences;
	}

}
