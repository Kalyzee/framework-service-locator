package com.kalyzee.framework.servicelocator.impl;

import com.kalyzee.framework.servicelocator.api.IServiceLocator;
import com.kalyzee.framework.servicelocator.api.IServiceLocatorFactory;
import com.kalyzee.framework.servicelocator.api.ServiceLocatorException;

public class ServiceLocatorFactory implements IServiceLocatorFactory{
	private static IServiceLocatorFactory instance;
	
	private ServiceLocatorFactory(){
		
	}
	
	public static IServiceLocatorFactory getInstance(){
		if(instance == null){
			instance = new ServiceLocatorFactory();
		}
		return instance;
	}

	public IServiceLocator getServiceLocator() throws ServiceLocatorException {
		return ServiceLocator.getInstance();
	}
}
