package ar.edu.unju.edm.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import ar.edu.unju.edm.model.Producto;
import ar.edu.unju.edm.service.ProductoService;

@Controller

public class ProductoController {
	
	@Autowired
	ProductoService iProductoService;

 @GetMapping("/productoo")
 public String cargarProducto(Model model) {
	model.addAttribute("unProducto", iProductoService.obtenerProductoNuevo());
	return ("productoo");
}
@PostMapping("/nuevoProducto")
public String cargarNuevoProducto(@ModelAttribute("unProducto") Producto nuevoProducto, Model model ) {
	iProductoService.guardarProducto(nuevoProducto);
	return ("productoo");
	
}
}