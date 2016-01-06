package com.coherence.extend.client;

import java.util.ArrayList;
import java.util.Random;

import com.coherence.extend.data.CustomerGenerator;
import com.coherence.extend.pojo.Customer;
import com.coherence.extend.pojo.Person;
import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;

public class ExtendClient {

	static NamedCache cache = null;

	public static void main(String[] asArgs) throws Throwable {

		cache = CacheFactory.getCache("customers");
		System.out.println("Connected to the cache server.");

		Random randomGenerator = new Random();


		CustomerGenerator pg = new CustomerGenerator();
		ArrayList<Customer> persons =(ArrayList<Customer>) pg.getCustomers(2000);
		putToCache(persons);
		System.out.println("2000 elements were put into the cache.");


	}

	private static void putToCache(ArrayList<Customer> customers) {

		for (int i = 0; i < customers.size(); i++) {
			cache.put(customers.get(i).getId(), customers.get(i));
		}

	}
}