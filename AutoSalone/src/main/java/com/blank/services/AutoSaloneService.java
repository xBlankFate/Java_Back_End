package com.blank.services;

import java.util.List;

import com.blank.entitys.AutoMobile;

public interface AutoSaloneService {
	
	List<AutoMobile> getAutoMobili();
	List<AutoMobile> getAutoMobiliByMarca(String marca);
	List<AutoMobile> getAutoMobiliByPrezzo(double prezzoMin,double prezzoMax);

	AutoMobile getAutoMobileById(Long id);
	AutoMobile addAutoMobile(AutoMobile a);
	AutoMobile updateAutoMobile(AutoMobile a);
	
	void deleteAutoMobile(AutoMobile a);
	
}
