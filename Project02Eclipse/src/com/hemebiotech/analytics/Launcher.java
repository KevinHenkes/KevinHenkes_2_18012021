package com.hemebiotech.analytics;

public class Launcher {

	public static void main(String[] args) {
		String inputFilePath = "symptoms.txt";
		String outputFilePath = "results.out";
		AnalyticsCounter analyticsCounter = new AnalyticsCounter(inputFilePath, outputFilePath);
		analyticsCounter.proceed();
	}

}
