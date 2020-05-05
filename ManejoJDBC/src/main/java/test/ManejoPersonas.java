package test;

import datos.PersonaJDBC;
import domain.Persona;
import java.util.List;

public class ManejoPersonas {

    public static void main(String[] args) {

        PersonaJDBC personaJDBC = new PersonaJDBC();
        
        // Paso0. Prueba select
        List<Persona> personas = personaJDBC.select();

        for (Persona persona : personas) {
            System.out.println("persona: " + persona);
        }

        // Paso1. Prueba insert
//        Persona persona = new Persona();
//        persona.setNombre("Claudia");
//        persona.setApellido("Rios");
//        persona.setEmail("claudiaeriosdgmail.com");
//        persona.setTelefono("3002452467");
//        
//        personaJDBC.insert(persona);

        // Paso2. Prueba update
//        Persona persona = new Persona();
//        persona.setId_persona(7);
//        persona.setNombre("Evenide");
//        persona.setApellido("Rios");
//        persona.setEmail("claudiaeriosd@gmail.com");
//        persona.setTelefono("3002452467");
//        
//        personaJDBC.update(persona);

        // Paso3. Prueba delete
        
        Persona persona = new Persona();
        persona.setId_persona(7);
        
        personaJDBC.delete(persona);
          
    }

}
