package org.tnsif.c2tc.service;

import java.util.List;
import org.tnsif.c2tc.entities.MallAdmin;

public interface MallAdminService {

	int addMallAdmin(MallAdmin mallAdmin);

	MallAdmin UpdateMallAdmin(MallAdmin mallAdmin);

	boolean DeleteMallAdmin(int id);

	List<MallAdmin> GetMallAdmins();

	MallAdmin GetMallAdmin(int id);



}
