package com.kalyzee.framework.servicelocator;

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
