package service;

import javax.inject.Inject;

import dao.IDao;
import metier.Client;

public class Service implements Iservice {
	
	@Inject
	private IDao idao;
	
	@Override
	public long addClient(Client c) {
		// TODO Auto-generated method stub
		return idao.addClient(c);
	}

}
