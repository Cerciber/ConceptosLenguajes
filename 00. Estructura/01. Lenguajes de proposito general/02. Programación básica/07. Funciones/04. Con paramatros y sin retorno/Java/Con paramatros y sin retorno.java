
package prueba;

public class Prueba {

    // Creaci�n con parametros limitados
    public static void funcion(tipo var1, tipo var2, tipo varN) {
        // Contenido
    }

    // Creaci�n con parametros ilimitados
    public static void funcion(tipo ...variables) {
        // Contenido
    }

    public static void main(String[] args) {
        
        // Llamado
        /*Contexto*/ funcion(valor1, valor2, valorN) /*Contexto*/

        // Eliminaci�n
        NO SOPORTADO (EL GARBAGE COLLECTOR LA ELIMINA AUTOMATICAMENTE CUANDO YA ES INACCESIBLE)

    }
    
}
