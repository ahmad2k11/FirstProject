package com.customer;

import org.hibernate.*;

public class ClientLab1B 
{
	public static void main(String[] args)
	{
		Transaction transaction=null;
		try 
		{
			SessionFactory factory=HibernateUtil.geSessionFactory();
			Session session=factory.openSession();
			transaction=session.beginTransaction();
			Customer cust=(Customer) session.load(Customer.class,2);
			//using toString in customer class so no need to write sop with cust.getname
          System.out.println(cust.getCid()+"---"+cust.getCname()+"---"+cust.getEmail()+"---"+cust.getPhone()+"---"+cust.getCity()+"---"+cust.getBal());
                System.out.println(cust);  
			transaction.commit();
			session.close();
			
		} catch (Exception e)
		{
			e.printStackTrace();
			if (transaction!=null) 
				transaction.rollback();
		}
	}
}
