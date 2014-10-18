package com.tarsusdata.ieport.impl;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;

import au.com.bytecode.opencsv.CSVReader;

import com.tarsusdata.common.exception.TDFileNotFoundException;
import com.tarsusdata.domain.ImportData;
import com.tarsusdata.domain.StudentChief;
import com.tarsusdata.ieport.Ieport;

public class IeportImpl implements Ieport {
	@Autowired
	private com.tarsusdata.mongo.MongoDAO<StudentChief> importDataMongoDAO;

	@Override
	public void importData(String className, String filePath) {
		File file = new File(filePath);
		if (file.isDirectory()) {
			importDataFromDir(className, file);
		} else {
			importDataFromFile(className, filePath);
		}
	}
	@Override
	public void exportData(String filePath) {
		// TODO Auto-generated method stub
		
	}
	
	private void importDataFromFile(String className, String filePath) {
	    CSVReader reader;
		try {
			reader = new CSVReader(new FileReader(filePath));
		} catch (FileNotFoundException e) {
			throw new TDFileNotFoundException("File not found: " + filePath);
		}
		//skip first line;

		try {
			reader.readNext();
		} catch (IOException e) {
			throw new TDFileNotFoundException("File not found: " + filePath);
		}
		while (true) {
			String[] stringArr = null;
			try {
				stringArr = reader.readNext();
			} catch (IOException e) {
				throw new TDFileNotFoundException("File not found: " + filePath);
			}
			if (stringArr == null) {
				break;
			}
			if (stringArr[0].isEmpty()) {
				continue;
			}
			
			if (className.equals(StudentChief.class.getSimpleName())) {			
				StudentChief importData = StudentChief.convert(stringArr);
				importDataMongoDAO.create(importData);
			} else if (className.equals(ImportData.class.getSimpleName())) {
				ImportData importData = ImportData.convert(stringArr);
			}

		}
	}
	
	private void importDataFromDir(String className, File dirFile) {
		File [] files = dirFile.listFiles();
		for (File file : files) {
			if (file.isFile() && file.getPath().endsWith(".csv")) {
				importDataFromFile(className, file.getAbsolutePath());
			}	
		}
	}
}
