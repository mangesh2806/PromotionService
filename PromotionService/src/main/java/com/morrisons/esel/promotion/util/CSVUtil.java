package com.morrisons.esel.promotion.util;

import java.io.IOException;
import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.morrisons.esel.promotion.model.Promotion;
import com.opencsv.CSVWriter;

public class CSVUtil 
{
	private static void writeCSVData(List<Promotion> emps) throws IOException {
		StringWriter writer = new StringWriter();
		CSVWriter csvWriter = new CSVWriter(writer,'#');
		List<String[]> data  = toStringArray(emps);
		csvWriter.writeAll(data);
		csvWriter.close();
		System.out.println(writer);
	}
	
	private static List<String[]> toStringArray(List<Promotion> emps) {
		List<String[]> records = new ArrayList<String[]>();
		//add header record
		records.add(new String[]{"ID","Name","Role","Salary"});
		Iterator<Promotion> it = emps.iterator();
		while(it.hasNext()){
			Promotion price = it.next();
			//records.add(new String[]{emp.getId(),emp.getName(),emp.getRole(),emp.getSalary()});
		}
		return records;
	

}
}
