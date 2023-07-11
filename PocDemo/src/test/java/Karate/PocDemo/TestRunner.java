package Karate.PocDemo;

import com.intuit.karate.junit5.Karate;
//import com.intuit.karate.KarateOptions;
//import com.intuit.karate.Runner;

//@KarateOptions(tags = {"@start"})
public class TestRunner 
{
	@Karate.Test
    Karate testSample() {
        return Karate.run("userDetails").relativeTo(getClass());
    }
	
	@Karate.Test
	Karate testFullPath() {
		return Karate.run("classpath:Karate/PocDemo/userDetails2.feature");
	}
	
}
