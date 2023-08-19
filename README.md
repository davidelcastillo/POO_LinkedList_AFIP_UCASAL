# POO_LinkedList_AFIP_UCASAL
Resolución problema básico con uso de LinkedList y nodos.

Coloquio lista enlazada 

*Ejercicio*:
AFIP, genera una lista 1 de contribuyentes para luego generar otra lista 2 con la recategorización e importe a abonar por el contribuyente.
La lista 1 posee N elementos, donde cada uno tiene el siguiente formato:

nro cuit (sin guiones) + mes y año de inicio actividad (mm/aaaa) +recaudación fiscal (###. ###,##)


‘20221115556-08/1985-70.500,00’		

La lista 2 posee estructura de nodo de 3 elementos, donde el 1er elemento es el Cuit, el 2do es nueva categoría y el 3er es nuevo monto de obligación mensual a pagar.

¿Cómo se recategoriza? 
Si el contribuyente posee
1.	menos de 5 años es categoría A → $ 350
2.	entre 5 y 10 años es categoría B → $ 750
3.	más de 10 años categoría C → $ 1250

Nota: Programe en Java. Utilice el Tad lista enlazada

