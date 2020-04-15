-- Eliminar todos los registros
DELETE FROM nombre_tabla;

-- Eliminación registros que cumplan una condición
DELETE FROM nombre_tabla WHERE condición;							-- Condición lógica
DELETE FROM nombre_tabla WHERE condición_1 AND condición_2;			-- Condición lógica con "y"
DELETE FROM nombre_tabla WHERE condición_1 OR condición_2;			-- Condición lógica con "o"
DELETE FROM nombre_tabla WHERE NOT condición;						-- Condición lógica con negación
DELETE FROM nombre_tabla WHERE campo_i = valor;						-- Campo igual a un valor
DELETE FROM nombre_tabla WHERE campo_i > valor;						-- Campo mayor a un valor
DELETE FROM nombre_tabla WHERE campo_i >= valor;  					-- Campo mayor o igual a un valor
DELETE FROM nombre_tabla WHERE campo_i < valor;						-- Campo menor a un valor
DELETE FROM nombre_tabla WHERE campo_i <= valor;					-- Campo menor o igual a un valor
DELETE FROM nombre_tabla WHERE campo_i BETWEEN inicial AND final;	-- Campo entre dos valores
DELETE FROM nombre_tabla WHERE campo_i IN(valor_1,valo_2,valor_N);	-- Campo igual a alguno de los valores especificados
DELETE FROM nombre_tabla WHERE campo_i LIKE '%patron%';				-- Campo que contenga un patrón
DELETE FROM nombre_tabla WHERE campo_i LIKE 'patron%';				-- Campo que comience con un patrón
DELETE FROM nombre_tabla WHERE campo_i LIKE '%patron';				-- Campo que termine con un patrón
DELETE FROM nombre_tabla WHERE campo_i LIKE 'patron';				-- Campo que sea iguial a un patrón
DELETE FROM nombre_tabla WHERE campo_i LIKE '%patron1_patron2%';	-- Campo que contenga un patrón omitiendo caracteres con "_"

-- Eliminar registros con limite
DELETE FROM nombre_tabla LIMIT cantidad_maxima;										-- Eliminar un numero determinado de registros
DELETE FROM nombre_tabla ORDER BY cols_ord LIMIT cantidad_maxima;					-- Eliminar un numero determinado de registros ordenados
DELETE FROM nombre_tabla WHERE condición LIMIT cantidad_maxima;						-- Eliminar un numero determinado de registros con condición
DELETE FROM nombre_tabla WHERE condición ORDER BY cols_ord LIMIT cantidad_maxima;	-- Eliminar un numero determinado de registros ordenados con condición