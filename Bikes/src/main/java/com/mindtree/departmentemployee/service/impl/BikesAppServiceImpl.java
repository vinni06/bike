package com.mindtree.departmentemployee.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindtree.departmentemployee.entity.Bike;
import com.mindtree.departmentemployee.entity.Brand;
import com.mindtree.departmentemployee.entity.Dealer;
import com.mindtree.departmentemployee.exception.ServiceException;
import com.mindtree.departmentemployee.repository.BikeRepository;
import com.mindtree.departmentemployee.repository.BrandRepository;
import com.mindtree.departmentemployee.repository.DealerRepository;
import com.mindtree.departmentemployee.service.BikesAppService;

@Service
public class BikesAppServiceImpl implements BikesAppService {

	@Autowired
	BrandRepository brandRepo;

	@Autowired
	DealerRepository dealerRepo;

	@Autowired
	BikeRepository bikeRepo;

	@Override
	public List<Brand> getBrands() {

		return brandRepo.findAll().stream().sorted((a,b)->a.getBrandName().compareToIgnoreCase(b.getBrandName())).collect(Collectors.toList());
	}

	@Override
	public List<Dealer> getDealers() {
		// TODO Auto-generated method stub
		return dealerRepo.findAll();
	}

	@Override
	public Object assignBrandToDealer(int dealerId, int brandId) {

		Dealer dealerEntity = dealerRepo.getOne(brandId);

		List<Brand> brandsList = new ArrayList<Brand>();

		brandsList.add(brandRepo.getOne(brandId));

		dealerEntity.setBrands(brandsList);

		dealerRepo.save(dealerEntity);

		return "brand is assigned to dealer";
	}

	@Override
	public Object addBikeToBrand(Bike bike, int brandId) {

		Brand brand = brandRepo.getOne(brandId);
		List<Bike> bikes = new ArrayList<Bike>();
		// bikes.add(bike);
		// brand.setBikes(bikes);
		bikeRepo.save(bike);
		brand.getBikes().add(bike);
		brandRepo.save(brand);
		return "bike added to brand sucessfully";
	}

	@Override
	public Object getBikesOfaBrand(String dealerName) throws ServiceException {

		List<Bike> bikesList = new ArrayList<Bike>();
		int cnt=0;

		for (Dealer dealer : dealerRepo.findAll()) {
			if (dealer.getDealerName().equalsIgnoreCase(dealerName)) {
				cnt=1;
				for (Brand brand : dealer.getBrands()) {

					bikesList.addAll(brand.getBikes());
					
				}
			}
		

		}
		
		if(cnt==0)
		{
			throw new ServiceException("no such dealer please check the name and search again");
		}
		System.out.println(bikesList);
		return bikesList;
	}

	@Override
	public Object getInvestment() {
		/*
		 * int sum=0; Map<String, Object> ibikes=new LinkedHashMap<String, Object>();
		 * for (Brand brand :brandRepo.findAll() ) { for (Bike bike : brand.getBikes())
		 * { sum=sum+bike.getBikeId(); } ibikes.put(brand.getBrandName(), sum); sum=0;
		 * 
		 * }
		 */
		
		
		return brandRepo.findAll();
	}

}
