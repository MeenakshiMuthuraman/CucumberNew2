package testrunners;

import io.cucumber.testng.AbstractTestNGCucumberTests;


@io.cucumber.testng.CucumberOptions(
		plugin = {"pretty"}, //reporting purpose
monochrome=false,  //console output color
		features = {"src/test/resources/AppFeatures"},
tags = " ",//tags from feature file,	
glue= {"stepdefinition","AppHooks"})//location of  step definition files

public class MyTestRunner  extends AbstractTestNGCucumberTests{
	
	
}

//@RunWith(Cucumber.class)
//@CucumberOptions(
//		features= {"src/test/resources/AppFeatures"},
//		glue= {"stepdefinition","AppHooks"},
//		plugin= {"pretty"}
//		
//		)
	
//	@Override
//    @DataProvider(parallel = false)
//    public Object[][] scenarios() {
//				
//		return super.scenarios();
//    }
	
//	 public final static ThreadLocal<String> BROWSER = new ThreadLocal<>();
//	@BeforeTest
//	@Parameters({"browser"})
//	public void browserType(String browser) throws Throwable
//	{ 
//		MyTestRunner.BROWSER.set(browser);
//	//LoggerLoad.info("setting the browser type from test runner class "+browser);
//	}
		


