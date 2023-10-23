package com.example.evaluacion2;


import com.example.evaluacion2.entities.Categoria;
import com.example.evaluacion2.entities.ItemFactura;
import com.example.evaluacion2.entities.Producto;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.Arrays;
import java.util.List;

@Configuration
public class AppConfig {
	
	@Bean("itemsFactura")
	public List<ItemFactura> registrarItems(){
		Producto producto1 = new Producto("Pasta dental", 100, Categoria.CUIDADO_BUCAL);
		Producto producto2 = new Producto("Enjuague", 200,Categoria.CUIDADO_BUCAL);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 4);
		
		return Arrays.asList(linea1, linea2);
	}

	@Bean("itemsFacturaOficina")
	@Primary
	public List<ItemFactura> registrarItemsOficina(){
		Producto producto1 = new Producto("Pasta dental", 5,Categoria.CUIDADO_BUCAL);
		Producto producto2 = new Producto("Enjuague", 5,Categoria.CUIDADO_BUCAL);
		Producto producto3 = new Producto("Crema", 80,Categoria.CUIDADO_CORPORAL);
		Producto producto4 = new Producto("Desodorante", 300,Categoria.CUIDADO_CORPORAL);
		
		ItemFactura linea1 = new ItemFactura(producto1, 2);
		ItemFactura linea2 = new ItemFactura(producto2, 1);
		ItemFactura linea3 = new ItemFactura(producto3, 1);
		ItemFactura linea4 = new ItemFactura(producto4, 1);
		
		return Arrays.asList(linea1, linea2, linea3, linea4);
	}
	
}
