
# Creaci�n con parametros limitados
def funcion(var1, var2, varN) 
    # Contenido
    return valor

# Creaci�n con parametros ilimitados
def funcion(*variables) 
    # Contenido
    return valor

# Creaci�n con parametros por defecto (Los valores por defecto de pueden omitir en el llamado)
def funcion(var1 = def1, var2 = def2, varN = defN) 
    # Contenido
    return valor

# Llamado
''' Contexto ''' funcion(valor1, valor2, valorN) # Contexto

# Llamado en asignaci�n
variable = funcion(valor1, valor2, valorN)

# Eliminaci�n
del funcion