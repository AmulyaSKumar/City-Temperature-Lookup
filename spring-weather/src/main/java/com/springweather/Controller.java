package com.springweather;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin("*")
@RestController
public class Controller {

	@GetMapping("/{place}")
	  public TemperatureResponse getTemperature(@PathVariable String place) throws IOException {
	    BufferedReader reader = new BufferedReader(new FileReader("Path of weather details file"));
	    List<Integer> temperatures = new ArrayList<>();
	    String line = null;
	    while ((line = reader.readLine()) != null) {
	      String[] parts = line.split(",");
	      if (parts[0].equals(place)) { 
	        temperatures.add(Integer.parseInt(parts[1]));
	        temperatures.add(Integer.parseInt(parts[2]));
	      }
	    }
	    
	    int minTemp = temperatures.stream().mapToInt(Integer::intValue).min().orElse(0);
	    int maxTemp = temperatures.stream().mapToInt(Integer::intValue).max().orElse(0);
	    reader.close();
	    return new TemperatureResponse(minTemp, maxTemp);
	    
	    
	  }
	}

	class TemperatureResponse {
	  public int minTemp;
	  public int maxTemp;

	  public TemperatureResponse(int minTemp, int maxTemp) {
	    this.minTemp = minTemp;
	    this.maxTemp = maxTemp;
	  }
}
