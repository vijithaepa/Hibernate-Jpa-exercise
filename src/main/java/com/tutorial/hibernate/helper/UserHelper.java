package com.tutorial.hibernate.helper;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.tutorial.hibernate.embedded.entity.EmbeddedAddress;
import com.tutorial.hibernate.embedded.entity.EmbeddedlUser;
import com.tutorial.hibernate.manytomany.entity.Site;
import com.tutorial.hibernate.manytomany.entity.Worker;
import com.tutorial.hibernate.relationship.entity.Country;
import com.tutorial.hibernate.relationship.entity.Home;
import com.tutorial.hibernate.relationship.entity.RelationalAddress;
import com.tutorial.hibernate.relationship.entity.RelationalUser;
import com.tutorial.hibernate.simple.entity.UserDetails;

/**
 * Helper class to create User instances/
 * 
 * @author Vijitha Epa
 * 
 */
public class UserHelper {

	/**
	 * Utility method to Return {@link UserDetails} for the purpose of Simple
	 * practice in JPA.
	 * 
	 * @param index
	 * @return {@link UserDetails}.
	 */
	public static UserDetails getUser(int index) {
		UserDetails userDetails = new UserDetails();

		userDetails.setName("User : " + String.valueOf(index));
		userDetails.setDescription("Description : " + String.valueOf(index));
		userDetails.setCreatedDate(new Date());
		userDetails.setUserCount(10);

		return userDetails;
	}

	/**
	 * Utility method to Return {@link EmbeddedlUser} for the purpose of
	 * Embedded practice in JPA.
	 * 
	 * @param index
	 * @return {@link EmbeddedlUser}.
	 */
	public static EmbeddedlUser getUserWithEmbeddedAddress(int index) {
		EmbeddedlUser userDetails = new EmbeddedlUser();
		userDetails.setName("User : " + String.valueOf(index));
		userDetails.setDescription("Description : " + String.valueOf(index));
		userDetails.setCreatedDate(new Date());

		EmbeddedAddress address1 = new EmbeddedAddress("Street " + String.valueOf(index), "City " + String.valueOf(index), "State "
		                + String.valueOf(index), "Pin Code " + String.valueOf(index));
		EmbeddedAddress address2 = new EmbeddedAddress("Street " + String.valueOf(index + 1), "City " + String.valueOf(index + 1), "State "
		                + String.valueOf(index + 1), "Pin Code " + String.valueOf(index + 1));
		userDetails.getAddress().add(address1);
		userDetails.getAddress().add(address2);

		return userDetails;
	}

	/**
	 * Utility method to Return {@link RelationalUser} for the purpose of
	 * Relational practice in JPA.
	 * 
	 * @param index
	 * @return {@link RelationalUser}.
	 */
	public static RelationalUser getUserWithRelationalAddress(int index) {
		RelationalUser userDetails = new RelationalUser();
		userDetails.setName("User : " + String.valueOf(index));
		userDetails.setDescription("Description : " + String.valueOf(index));
		userDetails.setCreatedDate(new Date());

		Home home = new Home("Home " + index, 4);
		userDetails.setHome(home);

		RelationalAddress address1 = new RelationalAddress("Street " + String.valueOf(index), "City " + String.valueOf(index), "State "
		                + String.valueOf(index), "Pin Code " + String.valueOf(index));
		RelationalAddress address2 = new RelationalAddress("Street " + String.valueOf(index + 1), "City " + String.valueOf(index + 1),
		                "State " + String.valueOf(index + 1), "Pin Code " + String.valueOf(index + 1));
		userDetails.getAddress().add(address1);
		userDetails.getAddress().add(address2);

		Country country = new Country("Australia");
		userDetails.setCountry(country);

		return userDetails;
	}

	/**
	 * Utility method to Return {@link Worker} as many to many Relational
	 * practice with {@link Site} in JPA.
	 * 
	 * @return {@link Worker}
	 */
	public static Worker getWorker() {

		Worker worker1 = new Worker("worker 1");
		Worker worker2 = new Worker("worker 2");
		Set<Worker> workerSet = new HashSet<Worker>();
		workerSet.add(worker1);
		workerSet.add(worker2);

		Site site1 = new Site("Site 1");
		Site site2 = new Site("Site 2");
		Set<Site> siteSet = new HashSet<Site>();
		siteSet.add(site1);
		siteSet.add(site2);

		site1.setWorkers(workerSet);
		worker1.setSites(siteSet);

		return worker1;
	}
}
