package prueba;

// Creaci�n de la clase
class Clase {
    
    // Atributos
    tipo atributo;

    // Metodos constructores
    Clase(tipo param1, tipo param2, tipo paramN) {
        // Contenido
        /* Contexto */ this.atributo /* Contexto */             // Referencia a atributo
        /* Contexto */ this(val1, val2, val3) /* Contexto */    // Referencia a otro metodo constructor
        /* Contexto */ metodo(val1, val2, val3) /* Contexto */  // Referencia a metodo
        // Contenido
    }

     // Metodos
    tipo metodo(tipo param1, tipo param2, tipo paramN) {
        // Contenido
    }
    
}

public class Prueba {

    public static void main(String[] args) {

        // Creaci�n e instanciaci�n
        Clase objeto;                               // Creaci�n del objeto
        objeto = new Clase(val1, val2, valN);       // Instanciaci�n
        Clase objeto = new Clase(val1, val2, valN); // Creaci�n e instanciaci�n

        // Llamado 
        /* Contexto */ objeto /* Contexto */                            // Llamado al objeto
        /* Contexto */ objeto.metodo(val1, val2, valN) /* Contexto */   // Llamado a un metodo
        /* Contexto */ objeto.atributo /* Contexto */                   // Llamado a un atributo

        // Eliminaci�n
        NO SOPORTADO (EL GARBAGE COLLECTOR ELIMINA ELEMENTOS AUTOMATICAMENTE CUANDO YA SON INACCESIBLES)

    }
    
}
