package com.customer;

import org.hibernate.*;
import org.hibernate.boot.registry.*;
import org.hibernate.cfg.*;

public class HibernateUtil 
{
	static SessionFactory  factory;
	static{
		Configuration configuration=new Configuration();
		configuration=configuration.configure();
		StandardServiceRegistryBuilder builder=new StandardServiceRegistryBuilder();
		StandardServiceRegistry registry=builder.applySettings(configuration.getProperties()).build();
		factory=configuration.buildSessionFactory(registry);
	}
	public static SessionFactory geSessionFactory()
	{
		return factory;
		
	}
}
