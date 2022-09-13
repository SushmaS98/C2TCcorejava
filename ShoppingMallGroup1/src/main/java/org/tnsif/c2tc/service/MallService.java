package org.tnsif.c2tc.service;

import java.util.List;

import org.tnsif.c2tc.entities.Mall;

public interface MallService {

	

	Mall UpdateMall(Mall mall);

	boolean DeleteMall(int id);

	List<Mall> GetMalls();

	Mall GetMall(int id);

	int addMall(Mall mall);


}
