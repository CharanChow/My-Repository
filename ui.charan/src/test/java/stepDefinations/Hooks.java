package stepDefinations;

import java.io.IOException;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import utils.TestContexSetup;


public class Hooks {
	TestContexSetup testContexSetup;
	public Hooks(TestContexSetup testContexSetup) {
		this.testContexSetup = testContexSetup;
	}
	@After
public void after() throws IOException {
	testContexSetup.testbase.WebDriverManager().quit();
		
		
	}
	}
	
	

