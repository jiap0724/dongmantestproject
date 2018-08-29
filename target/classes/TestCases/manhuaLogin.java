package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.manhua.base.TestUnit;
import com.manhua.service.AndroidXmlParseService;
import com.manhua.service.RunUnitService;

public class manhuaLogin {

	private static RunUnitService runService;

	@BeforeTest
	private void stup() throws Exception {
		TestUnit testunit = AndroidXmlParseService.parse("src/test/java/TestCaseXml/manhuaLogin.xml");
		runService = new RunUnitService(testunit);
		System.out.println("-----------------------------------【微博漫画登录测试】-----------------------------------");
	}

	@Test
	public void Login() throws Exception {
		runService.runCase("Login");
		runService.TestReportRemarks("验证在Android系统中，首次启动APP，点击登录按钮后，可以正常进入登录界面");
	}

	@AfterTest
	public void TearDown() {
		runService.closeApp();
	}
}
