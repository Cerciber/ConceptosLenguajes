
package prueba;

public class Prueba {

    // Creaci�n con parametros limitados
    public static Object[] funcion(tipo var1, tipo var2, tipo varN) {
        // Contenido
        return new Object[]{valor1, valor2, valorN};
    }

    // Creaci�n con parametros ilimitados
    public static Object[] funcion(tipo ...variables) {
        // Contenido
        return new Object[]{valor1, valor2, valorN};
    }

    // Creaci�n con parametros por defecto (Los valores por defecto de pueden omitir en el llamado)
    NO SOPORTADO

    public static void main(String[] args) {
        
        // Llamado
        /*Contexto*/ funcion(valor1, valor2, valorN) /*Contexto*/

        // Llamado con asignaci�n
        Object[] variables = funcion(valor1, valor2, valorN);
        tipo varible1 = (tipo) variables[0];
        tipo varible2 = (tipo) variables[1];
        tipo varibleN = (tipo) variables[2];

        // Eliminaci�n
        NO SOPORTADO (EL GARBAGE COLLECTOR LA ELIMINA AUTOMATICAMENTE CUANDO YA ES INACCESIBLE)

    }
    
}