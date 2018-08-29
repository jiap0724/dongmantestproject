package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.manhua.base.TestUnit;
import com.manhua.service.AndroidXmlParseService;
import com.manhua.service.RunUnitService;

public class manhuaQuery {
	private static RunUnitService runService;
	@BeforeTest
	private void stup() throws Exception {
		TestUnit testunit = AndroidXmlParseService.parse("src/test/java/TestCaseXml/Querymanhua.xml");
		runService = new RunUnitService(testunit);
		System.out.println("-----------------------------------【微博漫画搜索测试】-----------------------------------");
	}

	@Test
	public void case2() throws Exception {
		runService.runCase("case2");
		runService.TestReportRemarks("验证在Android系统中，顶部搜索框是否可以搜索出现有作品，没有搜索到作品");
	}

	@Test
	public void case3() throws Exception {
		runService.runCase("case3");
		runService.TestReportRemarks("验证在Android系统中，顶部搜索框是否可以搜索出现有作品，搜索到作品");
	}

	@AfterTest
	public void TearDown() {
		runService.closeApp();
	}
}
