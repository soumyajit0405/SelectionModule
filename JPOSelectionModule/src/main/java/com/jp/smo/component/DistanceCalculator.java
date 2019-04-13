package com.jp.smo.component;

import org.postgresql.geometric.PGpoint;
import org.springframework.stereotype.Component;
import com.jp.smo.dto.Location;

/**
 * 
 * @author Ehtu
 *  This is a utility class 
 */

@Component
public class DistanceCalculator {

	/**
	 * 
	 * @param requestLocation
	 * @param chefLocation
	 * @param unit distnace calculation in kilometer,miles etc
	 * @return
	 */
	public boolean distanceFinder(PGpoint currentLocation, PGpoint chefLocation, String unit) {
		double requestLatitude = currentLocation.x;
		double requestLongitude = currentLocation.y;
		double chefLatitude = chefLocation.y;
		double chefLongitude = chefLocation.y;
		if ((requestLatitude == chefLatitude) 
				&& (requestLongitude == chefLongitude)) {
			return true;
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
			
			if(dist >= 4) {
				return false;
			}
			return true;
		}
	}
}
