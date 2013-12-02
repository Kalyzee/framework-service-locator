package com.kalyzee.framework.servicelocator;

public interface IServiceLocatorFactory {
	
	IServiceLocator getServiceLocator() throws ServiceLocatorException;
	
}
