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
	@Test(priority = 1)
	public void case1_登录() throws Exception {
		runService.runCase("登录流程");
		runService.TestReportRemarks("验证在Android系统中，首次启动APP，点击登录按钮后，可以正常进入登录界面");
		runService.TestReportRemarks("登录测试完成");
	}

	// 签到case
	@Test(priority = 2)
	public void case2_签到() throws Exception {
		runService.runCase("签到流程");
			runService.TestReportRemarks("验证在Android系统中，我的页面，点击签到小女孩，跳转到签到页面");
			runService.TestReportRemarks("签到测试完成");
		}

	// 墨币明细case
	@Test(priority = 3)
	public void case3_墨币明细() throws Exception {
		runService.runCase("墨币明细");
		runService.TestReportRemarks("验证在Android系统中，我的页面，点击墨币进入到墨币查看墨币明细页面");
		runService.TestReportRemarks("墨币明细测试完成");
	}

	// 喵饼明细case
	@Test(priority = 4)
	public void case4_喵饼明细() throws Exception {
		runService.runCase("喵饼明细");
		runService.TestReportRemarks("验证在Android系统中，我的页面，点击喵饼进入到喵饼查看喵饼明细页面");
		runService.TestReportRemarks("喵饼明细测试完成");
	}

	// 切换男女case
	@Test(priority = 5)
	public void case5_切换男女() throws Exception {
		runService.runCase("切换男女");
		runService.TestReportRemarks("验证在Android系统中，漫画首页，点击男女切换男版女版");
		runService.TestReportRemarks("男女切换测试完成");
	}

	// 查询作品case
	@Test(priority = 6)
	public void case6_查询作品() throws Exception {
		runService.runCase("查询作品");
		runService.TestReportRemarks("验证在Android系统中，漫画首页，点击男女切换男版女版");
		runService.TestReportRemarks("查询作品测试完成");
	}

	// 放送表case
	@Test(priority = 7)
	public void case7_放送表() throws Exception {
		runService.runCase("放送表");
		runService.TestReportRemarks("验证在Android系统中，漫画首页，查看放送表明细和浏览作品列表");
		runService.TestReportRemarks("放送表测试完成");
	}

	// 分类case
	@Test(priority = 8)
	public void case8_分类表() throws Exception {
		runService.runCase("分类");
		runService.TestReportRemarks("验证在Android系统中，漫画首页，查看分类晒帅选和作品列表");
		runService.TestReportRemarks("分类测试完成");
	}

	// 榜单case
	@Test(priority = 9)
	public void case9_榜单() throws Exception {
		runService.runCase("榜单");
		runService.TestReportRemarks("验证在Android系统中，漫画首页，查看榜单作品列表");
		runService.TestReportRemarks("榜单测试完成");
	}

	// 完结case
	@Test(priority = 10)
	public void case10_完结() throws Exception {
		runService.runCase("完结");
		runService.TestReportRemarks("验证在Android系统中，漫画首页，查看榜单作品列表");
		runService.TestReportRemarks("榜单测试完成");
	}

	// 漫画关注case
	@Test(priority = 11)
	public void case11_漫画关注() throws Exception {
		runService.runCase("漫画关注");
		runService.TestReportRemarks("验证在Android系统中，漫画首页点击轮播图，进入到作品详情，关注");
		runService.TestReportRemarks("漫画关注测试完成");
	}

	// 漫画下载case
	@Test(priority = 12)
	public void case12_漫画下载() throws Exception {
		runService.runCase("漫画下载");
		runService.TestReportRemarks("验证在Android系统中，漫画首页点击轮播图，进入到作品详情，关注");
		runService.TestReportRemarks("漫画下载测试完成");
	}

	// 漫画评论case
	@Test(priority = 13)
	public void case13_漫画评论() throws Exception {
		runService.runCase("漫画评论");
		runService.TestReportRemarks("验证在Android系统中，漫画首页点击轮播图，进入到作品详情，发表评论");
		runService.TestReportRemarks("漫画评论测试完成");
	}

	// 漫画目录case
	@Test(priority = 14)
	public void case14_漫画目录() throws Exception {
		runService.runCase("漫画目录");
		runService.TestReportRemarks("验证在Android系统中，漫画首页点击轮播图，进入到作品详情，查看漫画目录");
		runService.TestReportRemarks("漫画目录测试完成");
	}

	// 漫画阅读case
	@Test(priority = 15)
	public void case15_漫画阅读() throws Exception {
		runService.runCase("漫画阅读");
		runService.TestReportRemarks("验证在Android系统中，漫画首页点击轮播图，进入到作品详情，点击阅读，进入阅读页");
		runService.TestReportRemarks("漫画阅读测试完成");
	}

	// 漫画阅读case
	@Test(priority = 16)
	public void case16_漫画章节() throws Exception {
		runService.runCase("漫画章节");
		runService.TestReportRemarks("验证在Android系统中，漫画首页点击轮播图，进入到作品详情，点击阅读，进入阅读页切换章节阅读");
		runService.TestReportRemarks("漫画阅读测试完成");
	}


	@Test(priority = 17)
	public void case17_退出登录() throws Exception {
		runService.runCase("退出登录流程");
		runService.TestReportRemarks("测试用户是否可以正常推出登录");
		runService.TestReportRemarks("退出登录测试完成");
	}

	@AfterTest
	public void TearDown() {
		runService.closeApp();
	}
}
