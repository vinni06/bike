package com.mindtree.departmentemployee.service;

import javax.sql.rowset.serial.SerialException;

import com.mindtree.departmentemployee.entity.Bike;
import com.mindtree.departmentemployee.exception.ServiceException;

public interface BikesAppService {

	Object getBrands();

	Object getDealers();

	Object assignBrandToDealer(int dealerId, int brandId);

	Object addBikeToBrand(Bike bike, int brandId);

	Object getBikesOfaBrand(String dealerName) throws ServiceException;

	Object getInvestment();

}
