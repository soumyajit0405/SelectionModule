package com.jp.smo.component;

import org.springframework.stereotype.Component;

import com.jp.smo.dto.Location;
/**
 * 
 * @author Ehtu
 *  This is a utility class 
 */
@Component
public class DistanceCalculator {

	public static double distanceFinder(Location requestLocation, Location chefLocation, String unit) {
		double requestLatitude = requestLocation.getLatitude();
		double requestLongitude = requestLocation.getLongitude();
		double chefLatitude = chefLocation.getLatitude();
		double chefLongitude = chefLocation.getLongitude();
		if ((requestLatitude == chefLatitude) 
				&& (requestLongitude == chefLongitude)) {
			return 0;
		}
		else {
			double theta = chefLongitude - requestLongitude;
			double dist = Math.sin(Math.toRadians(chefLatitude)) * Math.sin(Math.toRadians(requestLatitude)) + 
					Math.cos(Math.toRadians(chefLatitude)) * Math.cos(Math.toRadians(requestLatitude)) * Math.cos(Math.toRadians(theta));
			dist = Math.acos(dist);
			dist = Math.toDegrees(dist);
			dist = dist * 60 * 1.1515;
			if (unit == "K") {
				dist = dist * 1.609344;
			} else if (unit == "N") {
				dist = dist * 0.8684;
			}
			return (dist);
		}
	}
}
