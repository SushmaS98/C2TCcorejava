package org.tnsif.c2tc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.tnsif.c2tc.entities.Mall;
import org.tnsif.c2tc.repo.MallRepository;

@Service
public class MallServiceImpl implements MallService 
{
	@Autowired
	MallRepository repo;

	@Override
	public int addMall(Mall mall) {
		Mall m= repo.save(mall);
		if(m!=null)
			return 1;
		else
			return 0;
	}

	@Override
	public Mall UpdateMall(Mall mall) {
		Mall m=repo.save(mall);
		return m;
	}

	@Override
	public boolean DeleteMall(int id) {
		Mall m=GetMall(id);
		if(m!=null)
		{
			repo.delete(m);
			return true;
		}
		else
		return false;
	}

	@Override
	public List<Mall> GetMalls() {
		List<Mall> Malls=repo.findAll();
		return Malls;
	}

	@Override
	public Mall GetMall(int id) {
		Mall m=(Mall) repo.findById(id).get();
		return m;
	}

	

}
