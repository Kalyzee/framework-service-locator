package com.kalyzee.framework.servicelocator;

import junit.framework.Assert;

import org.junit.Before;
import org.junit.Test;

import com.kalyzee.framework.servicelocator.api.IServiceLocator;
import com.kalyzee.framework.servicelocator.api.ServiceLocatorException;
import com.kalyzee.framework.servicelocator.impl.ServiceLocatorFactory;

public class ServiceLocatorTest {
	
	private IServiceLocator serviceLocator;
	
	@Before
	@Test
	public void initServiceLocator() throws ServiceLocatorException{
		serviceLocator = ServiceLocatorFactory.getInstance().getServiceLocator();
		Assert.assertEquals(serviceLocator, ServiceLocatorFactory.getInstance().getServiceLocator());
	}
	
	@Test
	public void testBind() throws ServiceLocatorException{
		Object o = new Object();
		serviceLocator.bind("test", o);
		Assert.assertEquals(o, serviceLocator.lookup("test"));
	}
}
