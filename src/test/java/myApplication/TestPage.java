package myApplication;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestPage {
	Basepage bp;
	HomePage obj;
	DressPageObject dp;
	public TestPage()
	
	{
		bp=new Basepage();
		obj=new HomePage();
		dp=new DressPageObject();
	}
	
	@Test
	public void verifyWomen()
	{
		Assert.assertTrue(obj.getWomen().isDisplayed());
	}

	
	@Test
	public void verifydresses()
		{
	Assert.assertTrue(obj.getDresses().isDisplayed());
	}
	
	
	@Test
	public void verfiytshirts()
	{
		Assert.assertTrue(obj.getTshirts().isDisplayed());
	}

	@Test
	public void verifyDressesClick()
	{
	obj.ClickDress();
	String Title=bp.getTile1();
	Assert.assertTrue(Title.contains("Dresses - My Store"));
	}
	
	
	@Test
	public void verifyTshirtsClick()
	{
		obj.ClickTshirt();
		String Title=bp.getTile1();
		Assert.assertTrue(Title.contains("T-shirts - My Store"));
		
		
	}
	
	@Test
	public void verifySize()
	{
		obj.ClickDress();
		Assert.assertTrue(dp.getSmall().isDisplayed());
		Assert.assertTrue(dp.getMedium().isDisplayed());
		Assert.assertTrue(dp.getLarge().isDisplayed());
	}
	@Test
	public void productListCount()
	{
		obj.ClickDress();


		Assert.assertTrue(dp.getProductNumberHeader()==dp.productCount(),"Failed:Count Mismatch");
	}

		
		
	}
	
	

