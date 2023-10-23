package com.example.springbootdi.models.service;

//import org.springframework.stereotype.Component;

import org.springframework.stereotype.Component;

//@Component("miServicioComplejo")
public class MiServicioComplejo implements IServicio{

	@Override
	public String operacion() {
		return "ejecutando algún proceso importante complicado...";
	}
	
}
