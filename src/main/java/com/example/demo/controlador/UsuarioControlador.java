package com.example.demo.controlador;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelo.Usuario;
import com.example.demo.servicio.UsuarioServicio;


@RestController
public class UsuarioControlador 
{
	@PostMapping(value = "/usuario")
	public long agregarUsuarios(@RequestBody Usuario usuarioObjeto) 
	{
		UsuarioServicio servicio = new UsuarioServicio();
		
		return servicio.agregarUsuarios(usuarioObjeto);
	}
	
	@GetMapping("/usuario")
	public List<Usuario> mostrarUsuario()
	{
		UsuarioServicio servicio = new UsuarioServicio();
		
		return servicio.mostrarUsuarios();
	}
	
	@GetMapping("/usuario/{id}")
	public Usuario monstrarUnicoUsuario(@PathVariable ("id") long id)
	{
		UsuarioServicio servicio = new UsuarioServicio();
		
		return servicio.mostrarUnicoUsuario(id);
	}
	
	@PutMapping("/usuario/{id}")
	public Usuario modificarUsuario(@PathVariable ("id") long id)
	{
		UsuarioServicio servicio = new UsuarioServicio();
		
		return servicio.modificarUsuarioPredeterminado(id);
	}
	
	@PutMapping("/usuariom/{id}")
	public long UsuarioModificado(@PathVariable ("id") long id, @RequestBody Usuario usuarioModificado)
	{
		UsuarioServicio servicio = new UsuarioServicio();
		
		return servicio.modificarUsuario(id, usuarioModificado);
	}
	
	@DeleteMapping("/usuario/{id}")
	public int eliminarUsuario(@PathVariable ("id") long id)
	{
		UsuarioServicio servicio = new UsuarioServicio();
		
		return servicio.eliminarUsuario(id);
	}
	
	@DeleteMapping("/usuario")
	public List<Usuario> eliminarUsuario()
	{
		UsuarioServicio servicio = new UsuarioServicio();
		
		return servicio.eliminarTodosUsuarios();
	}
}
