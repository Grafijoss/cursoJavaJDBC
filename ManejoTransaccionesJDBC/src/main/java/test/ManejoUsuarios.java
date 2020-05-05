package test;

import datos.UsuarioJDBC;
import domain.Usuario;
import java.util.List;

public class ManejoUsuarios {

    public static void main(String[] args) {

        UsuarioJDBC usuarioJDBC = new UsuarioJDBC();

        // Ejecutamos el lsitado de uausrio
        List<Usuario> usuarios = usuarioJDBC.select();

        for (Usuario usuario : usuarios) {
            System.out.println("Usuario: " + usuario);
        }

        // Insertamos un nuevo usuario
//        Usuario usuario = new Usuario("carlos.juearez", "1234");
//        usuarioJDBC.insert(usuario);
        // Modificamos un usario existent
//        Usuario usuario = new Usuario(3, "carlos.juearez", "456");
//        usuarioJDBC.update(usuario);
        // Modificamos un usario existent
        Usuario usuario = new Usuario(2);
        usuarioJDBC.delete(usuario);

    }
}
