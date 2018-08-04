package com.customer;

import org.hibernate.*;

public class ClientLab1A 
{
	public static void main(String[] args)
	{
		Transaction transaction=null;
		try 
		{
			SessionFactory factory=HibernateUtil.geSessionFactory();
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			Customer customer=new Customer("AHmad", "t.ahmad@kka@gmail.com", 123, "Bang", 1222.25);
			session.save(customer);
			transaction.commit();
			session.close();
			System.out.println("Record inserted.....");
		} catch (Exception e)
		{
			e.printStackTrace();
			if (transaction!=null) 
				transaction.rollback();
		}
	}
}
