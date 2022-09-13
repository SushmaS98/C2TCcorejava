package org.tnsif.c2tc.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.MallAdmin;
import org.tnsif.c2tc.repo.MallAdminRepository;

@Service
public class MallAdminServiceImpl implements MallAdminService
{
	@Autowired
	MallAdminRepository repo;

	@Override
	public int addMallAdmin(MallAdmin mallAdmin) {
		MallAdmin ma= repo.save(mallAdmin);
		if(ma!=null)
			return 1;
		else
			return 0;
	}

	@Override
	public MallAdmin UpdateMallAdmin(MallAdmin mallAdmin) {
		MallAdmin ma=repo.save(mallAdmin);
		return ma;
	}

	@Override
	public boolean DeleteMallAdmin(int id) {
		MallAdmin ma=GetMallAdmin(id);
		if(ma!=null)
		{
			repo.delete(ma);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<MallAdmin> GetMallAdmins() {
		List<MallAdmin> MallAdmins=repo.findAll();
		return MallAdmins;
	}

	@Override
	public MallAdmin GetMallAdmin(int id) {
		MallAdmin ma=(MallAdmin) repo.findById(id).get();
		return ma;
	}

}
