package portalfilme;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import org.junit.Test;

public class UsuarioTeste {
	
	@Test
	public void CadastrarUsuario(){
		
		Usuario usuario = new Usuario();
		
		usuario.setEmail("xxxx@yyy.com");
		usuario.setEndereco("endereco");
		usuario.setNome("nome");
		usuario.setNomeUsuario("nome_usuario");
		usuario.setSenha("senha");
		usuario.setTelefone("45454545");
		
				
		UsuarioDAO usuarioDAO = new UsuarioDAO();
		
		usuarioDAO.salvar(usuario);
		
		if (usuario.getCodigo()==0)
		{
			fail("Erro ao incluir novo usuario ");
		}
		
		assertTrue("Usuario incluído com sucesso!", true);
		
		
	}

}
