package com.dao;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class openExcel {
	
	//PUT THE PATH OF FOLDER HERE WHERE ALL THE SHEETS ARE AVAILABLE
	private String path = "C:\\Users\\TMOBILE STORE\\Desktop\\Fullstack Web Task\\Data\\";

	public List<Object> openTATA() throws Exception {
		
		String filePath = path + "TATASTEEL.NS.csv";
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(filePath));
		reader.readLine();
		
		String line;
		List<String> dates = new ArrayList<String>();
		List<Double> volumes = new ArrayList<Double>();
		while((line = reader.readLine()) != null) {
			String[] fields = line.split(",");
			if(fields[6].equals("null")){
				continue;
			}
			Double d = Double.parseDouble(fields[6]);
			// (d);
			volumes.add(Double.parseDouble(fields[6]));
			dates.add(fields[0]);
		}
		List<Object> list = new ArrayList<Object>();
		list.add(volumes);
		list.add(dates);
		
		return list;

	}
	
	public List<Object> openReliance() throws Exception {
		
		String filePath = path + "RELIANCE.NS.csv";
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(filePath));
		reader.readLine();
		
		String line;
		List<String> dates = new ArrayList<String>();
		List<Double> volumes = new ArrayList<Double>();
		while((line = reader.readLine()) != null) {
			String[] fields = line.split(",");
			if(fields[6].equals("null")){
				continue;
			}
			Double d = Double.parseDouble(fields[6]);
			// (d);
			volumes.add(Double.parseDouble(fields[6]));
			dates.add(fields[0]);
		}
		List<Object> list = new ArrayList<Object>();
		list.add(volumes);
		list.add(dates);
		
		return list;

	}

	public List<Object> openEichermot() throws Exception {
	
		String filePath = path+  "EICHERMOT.NS.csv";
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(filePath));
		reader.readLine();
		
		String line;
		List<String> dates = new ArrayList<String>();
		List<Double> volumes = new ArrayList<Double>();
		while((line = reader.readLine()) != null) {
			String[] fields = line.split(",");
			if(fields[6].equals("null")){
				continue;
			}
			Double d = Double.parseDouble(fields[6]);
			// (d);
			volumes.add(Double.parseDouble(fields[6]));
			dates.add(fields[0]);
		}
		List<Object> list = new ArrayList<Object>();
		list.add(volumes);
		list.add(dates);
		
		return list;
	
	}

	public List<Object> openCipla() throws Exception {
		
		String filePath = path + "CIPLA.NS.csv";
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(filePath));
		reader.readLine();
		
		String line;
		List<String> dates = new ArrayList<String>();
		List<Double> volumes = new ArrayList<Double>();
		while((line = reader.readLine()) != null) {
			String[] fields = line.split(",");
			if(fields[6].equals("null")){
				continue;
			}
			Double d = Double.parseDouble(fields[6]);
			// (d);
			volumes.add(Double.parseDouble(fields[6]));
			dates.add(fields[0]);
		}
		List<Object> list = new ArrayList<Object>();
		list.add(volumes);
		list.add(dates);
		
		return list;
	
	}

	public List<Object> openAshokLeyland() throws Exception {
			
			String filePath = path + "ASHOKLEY.NS.csv";
			BufferedReader reader = null;
			reader = new BufferedReader(new FileReader(filePath));
			reader.readLine();
			
			String line;
			List<String> dates = new ArrayList<String>();
			List<Double> volumes = new ArrayList<Double>();
			while((line = reader.readLine()) != null) {
				String[] fields = line.split(",");
				if(fields[6].equals("null")){
					continue;
				}
								
				volumes.add(Double.parseDouble(fields[6]));
				dates.add(fields[0]);
			}
			List<Object> list = new ArrayList<Object>();
			list.add(volumes);
			list.add(dates);
			openNSE();
			return list;
		
		}
	
	public List<Object> openNSE() throws Exception {
		
		String filePath = path + "NSE (Nifty).csv";
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(filePath));
		reader.readLine();
		int i = 0;
		String line, date;		
		String[] fields = new String[20];		
		double open, close, high, low, whigh = 0, wlow = 0;
		
		while((line = reader.readLine()) != null) {
			fields = line.split(",");
			if(fields[6].equals("null")){
				continue;
			}
			
			whigh += Double.parseDouble(fields[2]);
			wlow += Double.parseDouble(fields[3]);
			i++;
			
		}
		date = fields[0];
		open = Double.parseDouble(fields[1]);
		high = Double.parseDouble(fields[2]);
		low = Double.parseDouble(fields[3]);
		close = Double.parseDouble(fields[4]);
	
		whigh = whigh/i;
		wlow = wlow/i;
		List<Object> list = new ArrayList<Object>();
		list.add(date);
		list.add(open);
		list.add(close);
		list.add(high);
		list.add(low);
		list.add(whigh);
		list.add(wlow);
		
		return list;
	
	}
	
	
	public List<Object> openBSE() throws Exception {
		
		String filePath = path + "BSE (Sensex).csv";
		BufferedReader reader = null;
		reader = new BufferedReader(new FileReader(filePath));
		reader.readLine();
		int i = 0;
		String line, date;		
		String[] fields = new String[20];		
		double open, close, high, low, whigh = 0, wlow = 0;
		
		while((line = reader.readLine()) != null) {
			fields = line.split(",");
			if(fields[6].equals("null")){
				continue;
			}
			
			whigh += Double.parseDouble(fields[2]);
			wlow += Double.parseDouble(fields[3]);
			i++;
			
		}
		date = fields[0];
		open = Double.parseDouble(fields[1]);
		high = Double.parseDouble(fields[2]);
		low = Double.parseDouble(fields[3]);
		close = Double.parseDouble(fields[4]);
		whigh = whigh/i;
		wlow = wlow/i;
		List<Object> list = new ArrayList<Object>();
		list.add(date);
		list.add(open);
		list.add(close);
		list.add(high);
		list.add(low);
		list.add(whigh);
		list.add(wlow);
		
		return list;
	
	}


}
