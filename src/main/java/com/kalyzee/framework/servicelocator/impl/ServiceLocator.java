package com.kalyzee.framework.servicelocator.impl;

import java.util.HashMap;

import com.kalyzee.framework.servicelocator.api.IServiceLocator;
import com.kalyzee.framework.servicelocator.api.ServiceLocatorException;

public class ServiceLocator implements IServiceLocator{
	private static IServiceLocator instance;
	
	private HashMap<String, Object> ctx;
	
	private ServiceLocator() throws ServiceLocatorException{
			ctx = new HashMap<String, Object>();
	}
	
	public void createSubContext(String subcontext) throws ServiceLocatorException{

	}

	public void bind(String name, Object object) throws ServiceLocatorException {
		ctx.put(name, object);
	}



	public Object lookup(String name) throws ServiceLocatorException {
		if (ctx.containsKey(name)){
			return ctx.get(name);
		}else{
			throw new ServiceLocatorException(name+" doesn't exist");
		}
	}
	
	public static IServiceLocator getInstance() throws ServiceLocatorException{
		if (instance == null){
			instance = new ServiceLocator();
		}
		return instance;
	}

	public void close() throws ServiceLocatorException {

		
	}
}
