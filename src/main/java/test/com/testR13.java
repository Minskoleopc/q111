package test.com;

import org.junit.Assert;
import org.testng.annotations.Test;

public class testR13 {

	
	@Test(groups = {"login"})
	public void TestCaseOne() {
		System.out.println("testcase one executed");
		
	}
	
	@Test(groups = {"login"})
	public void TestCaseTwo() {
		System.out.println("testcase two executed");
		Assert.assertEquals(true, false);
	}
	
	@Test(dependsOnGroups = {"login"},groups = {"logout"})
	public void TestCaseThree() {
		System.out.println("testxase three executed ");
	}
	
}
