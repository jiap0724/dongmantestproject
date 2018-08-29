package TestCases;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.manhua.base.TestUnit;
import com.manhua.service.AndroidXmlParseService;
import com.manhua.service.RunUnitService;

public class manhuaTest {
	private static RunUnitService runService;

	@BeforeTest
	private void stup() throws Exception {
		TestUnit testunit = AndroidXmlParseService.parse("src/test/java/TestCaseXml/manhuaTest.xml");
		runService = new RunUnitService(testunit);
		System.out.println("-----------------------------------【微博漫画整体流程测试】-----------------------------------");
	}

	// 登录case
	@Test
	public void case1() throws Exception {
		runService.runCase("login");
		runService.TestReportRemarks("验证在Android系统中，首次启动APP，点击登录按钮后，可以正常进入登录界面");
		runService.TestReportRemarks("case1测试完成");
	}

	// 查询case
	@Test
	public void case2() throws Exception {
		runService.runCase("query");
		runService.TestReportRemarks("验证在Android系统中，顶部搜索框是否可以搜索出现有作品，没有搜索到作品");
		runService.TestReportRemarks("case2测试完成");
	}

	@Test
	public void case3() throws Exception {
		runService.runCase("query1");
		runService.TestReportRemarks("验证在Android系统中，顶部搜索框是否可以搜索出现有作品，搜索到作品");
		runService.TestReportRemarks("case3测试完成");
	}

	@Test
	public void case4() throws Exception {
		runService.runCase("zhuifan");
		runService.TestReportRemarks("测试作品详情页，作品追番是否成功");
		runService.TestReportRemarks("case4测试完成");
	}

	@Test
	public void case5() throws Exception {
		runService.runCase("download");
		runService.TestReportRemarks("测试作品详情页，下载作品是否成功");
		runService.TestReportRemarks("case5测试完成");
	}

	@Test
	public void case6() throws Exception {
		runService.runCase("share");
		runService.TestReportRemarks("测试作品详情页，分享作品是否成功");
		runService.TestReportRemarks("case6测试完成");

	}

	@Test
	public void case7() throws Exception {
		runService.runCase("paixu");
		runService.TestReportRemarks("测试作品详情页，能否查看目录，并验证排序是否正常");
		runService.TestReportRemarks("case7测试完成");
	}

	@Test
	public void case8() throws Exception {
		runService.runCase("pinglun");
		runService.TestReportRemarks("测试作品详情页，是否可以正常添加评论");
		runService.TestReportRemarks("case8测试完成");
	}

	@Test
	public void case9() throws Exception {
		runService.runCase("read");
		runService.TestReportRemarks("测试作品详情页，点击开始阅读，是否能进入作品阅读页");
		runService.TestReportRemarks("case9测试完成");
	}

	@Test
	public void case11() throws Exception {
		runService.runCase("huadong");
		runService.TestReportRemarks("测试作品阅读页浏览滑动");
		runService.TestReportRemarks("case11测试完成");
	}

	@Test
	public void case12() throws Exception {
		runService.runCase("logout");
		runService.TestReportRemarks("测试用户是否可以正常推出登录");
		runService.TestReportRemarks("case12测试完成");
	}

	@AfterTest
	public void TearDown() {
		runService.closeApp();
	}
}
