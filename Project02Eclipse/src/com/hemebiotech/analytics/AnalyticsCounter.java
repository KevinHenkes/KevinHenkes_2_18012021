package com.hemebiotech.analytics;

public class AnalyticsCounter {
	
	private String inputFilePath;
	private String outputFilePath;
	
	public AnalyticsCounter(String inputFilePath, String outputFilePath) {
		this.inputFilePath = inputFilePath;
		this.outputFilePath = outputFilePath;
	}
	
	public void proceed() {
		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(this.inputFilePath);
		WriteSymptomDataToFile writer = new WriteSymptomDataToFile(this.outputFilePath);
		writer.writeSymptoms(reader.getSymptomsAndOccurencesFromFile());
	}
}
