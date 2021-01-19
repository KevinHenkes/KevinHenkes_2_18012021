package com.hemebiotech.analytics;

import java.util.HashMap;

/**
 * Anything that will write symptom data to a file
 * The important part is, the return value from the operation, which is file from an HashMap,
 * 
 * The implementation does not need to order the list
 * 
 */
public interface ISymptomWriter {
	/**
	 * If no data is available, return an empty File
	 * 
	 * @return a file of all Symptoms obtained from a data source with count of occurences
	 */
	void WriteSymptoms (HashMap<String, Integer> symptomsOccurences);
}
