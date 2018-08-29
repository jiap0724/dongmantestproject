package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.manhua.base.TestUnit;
import com.manhua.service.AndroidXmlParseService;
import com.manhua.service.RunUnitService;

public class manhuaDetail {
	
	private static RunUnitService runService;
		
	@BeforeTest
	private void stup() throws Exception{
		TestUnit testunit = AndroidXmlParseService.parse("src/test/java/TestCaseXml/manhuaDetail.xml");
		runService = new RunUnitService(testunit);
		System.out.println("-----------------------------------【作品详情页相关测试】-----------------------------------");
	}
	
	@Test
	public void case1() throws Exception{
		runService.runCase("case1");
		runService.TestReportRemarks("测试作品详情页，关注作品是否成功");
	}

	@Test
	public void case2() throws Exception{
		runService.runCase("case2");
		runService.TestReportRemarks("测试作品详情页，下载作品是否成功");
	}

	@Test
	public void case3() throws Exception {
		runService.runCase("case3");
		runService.TestReportRemarks("测试作品详情页，分享作品是否成功");

	}

	@Test
	public void case4() throws Exception {
		runService.runCase("case4");
		runService.TestReportRemarks("测试作品详情页，能否查看目录，并验证排序是否正常");
	}

	@Test
	public void case5() throws Exception {
		runService.runCase("case5");
		runService.TestReportRemarks("测试作品详情页，是否可以正常添加评论");
	}

	@Test
	public void case6() throws Exception {
		runService.runCase("case6");
		runService.TestReportRemarks("测试作品详情页，点击开始阅读，是否能进入作品阅读页");
	}

	@Test
	public void case7() throws Exception {
		runService.runCase("case7");
		runService.TestReportRemarks("测试作品阅读页上下滑动");
	}
	
	@AfterTest
	public void TearDown(){
		runService.closeApp();
	}
}
