
% Llamado
'Contexto' funcion(valor1, valor2, valorN) 'Contexto'

% Llamado en asignaci�n
variable = funcion(valor1, valor2, valorN)

% Creaci�n con parametros limitados
function retorno = funcion(var1, var2, varN)
    % Contenido
    retorno = valor
end

% Creaci�n con parametros ilimitados
function retorno = funcion(varargin)
    % Contenido
    'Contexto' varargin{3} 'Contexto'    % Obtener parametro en la posici�n especificada
    % Contenido
    retorno = valor
end

% Eliminaci�n
NO SOPORTADO
