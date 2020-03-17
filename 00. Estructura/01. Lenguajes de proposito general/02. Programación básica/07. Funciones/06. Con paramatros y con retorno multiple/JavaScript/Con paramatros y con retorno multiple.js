
// Creaci�n con parametros limitados
function funcion(var1, var2, varN) {
    // Contenido
    return [valor1, valor2, valorN];
}

// Creaci�n con parametros ilimitados
function funcion(...variables) {
    // Contenido
    return [valor1, valor2, valorN];
}

// Creaci�n con parametros por defecto (Los valores por defecto de pueden omitir en el llamado)
function funcion(var1 = val1, var2 = val2, varN = valN) {
    // Contenido
    return [valor1, valor2, valorN];
}
 
// Llamado
/*Contexto*/ funcion(valor1, valor2, valorN) /*Contexto*/

// Llamado con asignaci�n
variables = funcion(valor1, valor2, valorN);
varible1 = variables[0];
varible2 = variables[1];
varibleN = variables[2];

// Eliminaci�n
NO SOPORTADO (EL GARBAGE COLLECTOR LA ELIMINA AUTOMATICAMENTE CUANDO YA ES INACCESIBLE)
