package com.curso.springboot.web.app.controllers;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;


import com.curso.springboot.web.app.models.entity.Cliente;
import com.curso.springboot.web.app.models.service.IClienteService;

@Controller
@SessionAttributes("cliente")
public class ClienteController {

	@Autowired
	private IClienteService clienteService; //Inyección de interfaz cliente service
	
	@RequestMapping(value="/listar", method=RequestMethod.GET)
	public String listar(Model model) {
		model.addAttribute("titulo", "Listado de clientes");
		model.addAttribute("clientes", clienteService.findAll());
		
		return "listar";
	}
	
	@RequestMapping(value="/form")
	public String create(Map<String, Object> model) {
		Cliente cliente = new Cliente();
		model.put("cliente", cliente);
		model.put("titulo", "Formulario cliente");
		
		
		return "form";
	}
	
	@RequestMapping(value="/form/{id}")
	public String edit(@PathVariable(value="id") Long id,Map<String, Object> model) {
		Cliente cliente =  null;
		
		if(id > 0) {
			cliente = clienteService.findOne(id);
		}else {
			return "redirect:listar";
		}
		model.put("cliente",cliente);
		model.put("titulo", "Editar Cliente");
		return "form";
	}
	
	//eliminar cliente 
	@RequestMapping(value="/eliminar/{id}")
	public String eliminar(@PathVariable(value="id") Long id) {
		if(id > 0) {
			clienteService.delete(id);
		}
		return "redirect:/listar";
	}
	
	@RequestMapping(value="/form", method=RequestMethod.POST)
	public String guardar(Cliente cliente, SessionStatus status) {
		
		clienteService.save(cliente);
		status.setComplete();
		return "redirect:listar";
	}
	
	@RequestMapping(value="/ver/{id}")
	public String ver(@PathVariable Long id,Map<String, Object> model) {
		Cliente cliente = null;
		if(id > 0) {
			cliente = clienteService.findOne(id);
		}
		model.put("cliente", cliente);
		model.put("titulo", "Detalles Cliente");
		return "ver";
	}
}
