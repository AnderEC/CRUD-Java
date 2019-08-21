package com.example.demo.servicio;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.modelo.Usuario;

public class UsuarioServicio 
{
	static List<Usuario> listaUsuarios = new ArrayList<Usuario>();
	
	static
	{
		listaUsuarios.add(new Usuario("Ana", 20 , 1l));
		listaUsuarios.add(new Usuario("Juan", 25, 2l));
		listaUsuarios.add(new Usuario("Jose", 30, 3l));
	}
	
	public long agregarUsuarios(Usuario ObjetoUsuarios)
	{
		ObjetoUsuarios.setId(listaUsuarios.size() +1);
		listaUsuarios.add(ObjetoUsuarios);
		
		return ObjetoUsuarios.getId();
	}
	
	public List<Usuario> mostrarUsuarios()
	{
		return listaUsuarios;
	}
	
	public Usuario mostrarUnicoUsuario(long id)
	{
		Usuario usuarioUnico;
		
		if (listaUsuarios.get((int) id) != null)
			{
				usuarioUnico = listaUsuarios.get((int) id);
				return usuarioUnico;
			}
		
		else
			return null;
	}
	
	public Usuario modificarUsuarioPredeterminado(long id)
	{
		if (listaUsuarios.get((int) id) != null)
		{
			listaUsuarios.set((int) id, new Usuario("Lucia", 40, id));
			
			return listaUsuarios.get((int) id);
		}
		else
			return null;
	}
	
	public long modificarUsuario(long id, Usuario usuarioModificado)
	{
		if (listaUsuarios.get((int) id) != null)
		{
			usuarioModificado = listaUsuarios.set((int) id, usuarioModificado);
			
			return usuarioModificado.getId();
		}
		else
			return 0;
	}
	
	public int eliminarUsuario(long id)
	{
		if (listaUsuarios.get((int) id) != null)
		{
			listaUsuarios.remove((int)id);
			
			return listaUsuarios.size();
		}
		else
			return 0;
	}
	
	public List<Usuario> eliminarTodosUsuarios()
	{
		listaUsuarios.clear();
		return listaUsuarios;
	}

}
