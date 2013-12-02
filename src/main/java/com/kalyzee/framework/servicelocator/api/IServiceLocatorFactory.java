package com.kalyzee.framework.servicelocator.api;


public interface IServiceLocatorFactory {
	
	IServiceLocator getServiceLocator() throws ServiceLocatorException;
	
}
