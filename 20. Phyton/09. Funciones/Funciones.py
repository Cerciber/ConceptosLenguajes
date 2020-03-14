
# Funci�n sin parametros y retorno vacio
def funcion():
    # Contenido no vacio
# LLamar funci�n
funcion()

# Funci�n con parametros y retorno vacio
def funcion(par1, par2, parN):
    # Contenido no vacio
# LLamar funci�n 
funcion(val1, val2, valN)

# Funci�n sin parametros y retorno simple
def funcion():
    # Contenido
    return resultado
# LLamar funci�n 
variable = funcion()

# Funci�n con parametros y retorno simple
def funcion(par1, par2, parN):
    # Contenido
    return resultado
# LLamar funci�n por posici�n
variable = funcion(val1, val2, valN)
# LLamar funci�n por nombre
variable = funcion(par1 = val1, par2 = val2, parN = valN)

# Funci�n con retorno multiple
def funcion(par1, par2, parN):
    # Contenido
    return resultado1, resultado2, resultadoN
# LLamar funci�n por posici�n
variable = funcion(val1, val2, valN)
variable1 = variable4[pos1]
variable2 = variable4[pos2]
variableN = variable4[posN]
# LLamar funci�n por nombre
variable = funcion(par1 = val1, par2 = val2, parN = valN)
variable1 = variable4[pos1]
variable2 = variable4[pos2]
variableN = variable4[posN]

# Funci�n con parametros por defecto
def funcion(par1 = def1, par2 = def2, parN = defN):
    # Contenido
    return resultado1, resultado2, resultadoN
# LLamar funci�n por posici�n
funcion()
funcion(val1)
funcion(val1, val2)
funcion(val1, val2, valN)
# LLamar funci�n por nombre
funcion(par1 = val1)
funcion(par1 = val1, parN = valN)
funcion(par1 = val1, parN = valN, par2 = val2)

# Funci�n con numero de parametros indefinidos
def funcion(*args):
    # Contenido
    for arg in args:
        # Contenido por argumento
    # Contenido
    return args
# LLamar funci�n
variable = funcion(val1, val2, valN)

# Funci�n lambda (Funci�n de una linea) (nombre = lambda parametros : expresi�n de retorno)
function = lambda par1, par2, parN : expresi�n
# LLamar funci�n
function(val1, val2, valN)

# Funci�n recursiva
def funcion(par1, par2, parN):
    # Acciones
    funcion(val1, val2, valN)    # LLamada a la misma funci�n recurisvamente
    # Acciones
# LLamar funci�n
function(val1, val2, valN)
    
# Funciones predefinidas
print(dato)                     # Imprimir dato
sum(lista)                      # Sumar elementos de una lista o tupla
len(lista)                      # Obtener la longitud de una lista o tupla
dir(objeto)                     # Obtener una lista de los atributos del objeto
max(lista)                      # Obtener el maximo valor de una lista o tupla
min(lista)                      # Obtener el minimo valor de una lista o tupla
all(lista)                      # Verificar si todos los valores de una lista o tupla son verdaderos
isinstance(objeto, tiposDeDato) # Verificar si el objeto es de alguno de los tipos de datos especficados
map(funcion, [val11, val12, val1M], [val21, val22, val2M], [valN1, valN2, valNM])   # Pasar listas por parametros a una funci�n
