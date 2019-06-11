package com.adress;

import java.util.List;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;

public class Better {
	List<City> cities = new ArrayList<>();
	BufferedReader in = new BufferedReader(new FileReader("postcode.txt"));
	String line = in.readLine();
	City lastCity = new City("";)

}
