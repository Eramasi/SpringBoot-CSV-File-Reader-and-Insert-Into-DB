package com.app.CSVFileReader.csvreader;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.app.CSVFileReader.Model.Product;

@Component
public class CSVReader {

@Autowired
private Product product;


public void ProductDetails()
{
	try {
		BufferedReader br=new BufferedReader(new FileReader("src/main/resources/Product.csv"));
		
		
		
		
		
		
	
	}

}
}
