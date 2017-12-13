package br.com.spring.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import br.com.spring.model.Cliente;
import br.com.spring.repository.ClienteRepository;

@Controller
public class ClienteController {

	@Autowired
	private ClienteRepository cr;

	@RequestMapping(value = "/cliente", method = RequestMethod.GET)
	public String cliente() {
		return "cliente";
	}

	@RequestMapping(value = "/addCliente", method = RequestMethod.POST)
	public String adicionarCliente(Cliente cliente) {

		cr.save(cliente);
		return "exibeCliente";
	}

	@RequestMapping(value = "/listaClientes", method = RequestMethod.GET)
	public String listarClientes(@ModelAttribute("SpringWeb") ModelMap model, HttpServletRequest request) {

		List<Cliente> clientes = (List<Cliente>) request.getAttribute("clientes");

		model.addAttribute("clientes", clientes);

		return "listaClientes";
	}
}
