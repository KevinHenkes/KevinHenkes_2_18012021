package com.hemebiotech.analytics;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

/**
 * Simple brute force implementation
 *
 */
public class WriteSymptomDataToFile implements ISymptomWriter {

	private String filepath;
	
	/**
	 * 
	 * @param filepath a full or partial path to file with symptom strings in it, one per line
	 */
	public WriteSymptomDataToFile (String filepath) {
		this.filepath = filepath;
	}

	@Override
	public void WriteSymptoms(HashMap<String, Integer> symptomsOccurences) {
		if (filepath != null) {
			try {
				BufferedWriter writer = new BufferedWriter(new FileWriter(filepath));
				
				for (String symptom : symptomsOccurences.keySet()) {
					writer.write(symptom + " " + symptomsOccurences.get(symptom));
					writer.newLine();
				}
				
				writer.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}

}
