package es.cursogetafe.springxml.negocio;

import es.cursogetafe.springxml.persistencia.ClienteDao;

public class NegocioImpl implements Negocio1{

	private ClienteDao cDao;
	
	public NegocioImpl() {
		System.out.println("constructor de NegocioImple");
	}

	@Override
	public void metodoNegocio() {
		System.out.println("metodo Negocio de NegocioImple");
		cDao.metodoDao();
	}

	
	
	public ClienteDao getcDao() {
		return cDao;
	}

	public void setcDao(ClienteDao cDao) {
		System.out.println("se ha inyectado el dao");
		this.cDao = cDao;
	}
	
	
}
