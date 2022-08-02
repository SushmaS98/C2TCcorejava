package org.tns.c2tc.application;

import org.tns.c2tc.framework.NormalAcc;
import org.tns.c2tc.framework.PrimeAcc;
import org.tns.c2tc.framework.ShopFactory;

public class GSShopFactory implements ShopFactory
{

	@Override
	public PrimeAcc getNewPrimeAccount(int accno, String accname, float charges)
	{
		PrimeAcc pa=new PrimeAcc(accno,accname,charges);
		return pa;
	}

	@Override
	public NormalAcc getNewNormalAccount(int accno, String accname, float charges)
	{
		NormalAcc na =new NormalAcc(accno,accname,charges);
		return na;
	}

	
}
