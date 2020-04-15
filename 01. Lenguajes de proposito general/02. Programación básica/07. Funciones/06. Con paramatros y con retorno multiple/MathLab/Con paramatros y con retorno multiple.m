
% Llamado
'Contexto' funcion(valor1, valor2, valorN) 'Contexto'

% Llamado en asignaci�n
[var1,var2, varN] = funcion(valor1, valor2, valorN)

% Creaci�n con parametros limitados
function [ret1,ret2, retN] = funcion(var1, var2, varN)
    % Contenido
    ret1 = val1;
    ret2 = val2;
    retN = valN;
end

% Creaci�n con parametros ilimitados
function [ret1,ret2, retN] = funcion(varargin)
    % Contenido
    'Contexto' varargin{3} 'Contexto'    % Obtener parametro en la posici�n especificada
    % Contenido
    ret1 = val1;
    ret2 = val2;
    retN = valN; 
end

% Eliminaci�n
NO SOPORTADO
