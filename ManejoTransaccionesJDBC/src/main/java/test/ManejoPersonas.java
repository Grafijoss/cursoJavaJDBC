package test;

import datos.Conexion;
import datos.PersonaJDBC;
import domain.Persona;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {
       
        Connection conexion = null;
        try {
            conexion = Conexion.getConnection();
            if(conexion.getAutoCommit()){ // al finalizar una sentencia se guarda automaticamente
                conexion.setAutoCommit(false);
            }
            
            PersonaJDBC personaJDBC = new PersonaJDBC(conexion);
            
            Persona cambioPersona = new Persona();
            cambioPersona.setId_persona(4);
            cambioPersona.setNombre("Negro");
            cambioPersona.setApellido("Montenegro");
            cambioPersona.setEmail("negro@gmail.com");
            cambioPersona.setTelefono("3008980651");
            // 1. Update
            personaJDBC.update(cambioPersona);
            
            Persona nuevaPersona = new Persona();
            nuevaPersona.setNombre("Claudia");
            nuevaPersona.setApellido("Rios");
            nuevaPersona.setEmail("claudiaeriosd@gmail.com");
            nuevaPersona.setTelefono("3002452467");
            // 2. Insert
            personaJDBC.insert(nuevaPersona);
            
            // 3. Commit
            conexion.commit();
            
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
            System.out.println("Entramos al rollback");
            try {
                conexion.rollback();
            } catch (SQLException ex1) {
                ex1.printStackTrace(System.out);
            }
        }
          
    }

}
