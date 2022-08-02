package org.tns.c2tc.b18;

import org.tns.c2tc.application.GSNormalAcc;
import org.tns.c2tc.application.GSPrimeAcc;
import org.tns.c2tc.application.GSShopFactory;
import org.tns.c2tc.framework.NormalAcc;
import org.tns.c2tc.framework.PrimeAcc;
import org.tns.c2tc.framework.ShopFactory;

public class Client {

	public static void main(String[] args)
	{
		ShopFactory sf= new GSShopFactory();
		PrimeAcc pa= new GSPrimeAcc(123,"Sushma",1000);
		pa.bookProducts(500);
		NormalAcc na=new GSNormalAcc(456,"Sanjana",0);
		na.bookProducts(500);
	}
}
