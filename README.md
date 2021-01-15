# deposit
Reto #2

Para hacer el programa hice uso de SpringToolSuite4. 
Para correr el programa solo se necesita de mysql y mysql workbench. Para hacer las pruebas del api-rest utilice la extension de google chrome llamada "Talend API tester".

Dentro de deposit se encuentra el archivo "export.sql".
Para efectos del programa -> en mysql hay una sola tabla llamada 'cuentas', la misma contiene todas las cuentas sin distincion si son cuentas de ahorro o cuentas corrientes. A la hora de presentarlas, las cuentas que empiezan con '04' son las cuentas de ahorro, mientras que las cuentas que empiezan con '03' serían las cuentas corrientes. 
Esto se ve con más claridad en el stored procedure. 


En la carpeta "src" se encuentra otra carpeta llamada "main", en esta es donde estan ubicados todos los paquetes con las clases.
