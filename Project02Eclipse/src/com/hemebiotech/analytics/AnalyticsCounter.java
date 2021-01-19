package com.hemebiotech.analytics;

public class AnalyticsCounter {
	
	public static void main(String args[]) throws Exception {
		// first get input
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile("symptoms.txt");
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile("results.txt");

		writer.WriteSymptoms(reader.CountSymptoms(reader.GetSymptoms()));
	}
}
