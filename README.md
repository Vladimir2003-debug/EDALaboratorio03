## Laboratorio 03 EDA
<div align="center">
<table>
    <theader>
        <tr>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/epis.png?raw=true" alt="EPIS" style="width:50%; height:auto"/></td>
            <th>
                <span style="font-weight:bold;">UNIVERSIDAD NACIONAL DE SAN AGUSTIN</span><br />
                <span style="font-weight:bold;">FACULTAD DE INGENIERÍA DE PRODUCCIÓN Y SERVICIOS</span><br />
                <span style="font-weight:bold;">DEPARTAMENTO ACADÉMICO DE INGENIERÍA DE SISTEMAS E INFORMÁTICA</span><br />
                <span style="font-weight:bold;">ESCUELA PROFESIONAL DE INGENIERÍA DE SISTEMAS</span>
            </th>
            <td><img src="https://github.com/rescobedoq/pw2/blob/main/abet.png?raw=true" alt="ABET" style="width:50%; height:auto"/></td>
        </tr>
    </theader>
    <tbody>
        <tr><td colspan="3"><span style="font-weight:bold;">Formato</span>: Informe de Práctica de Laboratorio</td></tr>
        <tr><td><span style="font-weight:bold;">Aprobación</span>:  2022/03/01</td><td><span style="font-weight:bold;">Código</span>: INFORME-PRLD-001</td><td><span style="font-weight:bold;">Página</span>: 1</td></tr>
    </tbody>
</table>
</div>

<div align="center">
<span style="font-weight:bold;">INFORME DE LABORATORIO</span><br />
</div>


<table>
<theader>
<tr><th colspan="6">INFORMACIÓN BÁSICA</th></tr>
</theader>
<tbody>
<tr><td>ASIGNATURA:</td><td colspan="5">Estructura de Datos y Algoritmos</td></tr>
<tr><td>TÍTULO DEL INFORME:</td><td colspan="5">Pilas y Colas</td></tr>
<tr>
<td>NÚMERO DE PRACTICA:</td><td>03</td><td>AÑO LECTIVO:</td><td>2022 A</td><td>NRO. SEMESTRE:</td><td>III</td>
</tr>
<tr>
<td>FECHA INICIO::</td><td>16-May-2022</td><td>FECHA FIN:</td><td>20-May-2022</td><td>DURACIÓN:</td><td>02 horas</td>
</tr>
<tr><td colspan="6">RECURSOS INICIALES:
    <ul>
        <li>https://www.w3schools.com/java/</li>
        <li>https://www.eclipse.org/downloads/packages/release/2022-03/r/eclipse-ide-enterprise-java-and-web-developers</li>
        <li>https://docs.oracle.com/javase/8/docs/api/java/util/Stack.html</li>
        <li>https://docs.oracle.com/javase/8/docs/api/java/util/Queue.html</li>
    </ul>
</td>
</<tr>

<tr><td colspan="4">Alumnos:
<ul>
<li>Vladimir Arturo Sulla Quispe - vsullaq@unsa.edu.pe</li>
</ul>
</td>
<td><td>NOTA:
</td>
<td colspan="1"></td>
</<tr>

<tr><td colspan="6">DOCENTES:
<ul>
<li>Richart Smith Escobedo Quispe - rescobedoq@unsa.edu.pe</li>
</ul>
</td>
</<tr>
</tdbody>
</table>

## Solucion y Resultados
# Organizacion
Las carpetas y archivos estan organizados de la siguiente manera
```
├─EDALABORATORIO03
│   .classpath
│   .gitignore
│   .project
│   README.md
│   
├───bin
│   └───TDA
│           Node.class
│           QueueArray.class
│           QueueLink.class
│           StackArray.class
│           StackLink.class
│           TDAQueue.class
│           TDAStack.class
│           Test.class
│           
├───imagenes
└───src
    └───TDA
            Node.java
            QueueArray.java
            QueueLink.java
            StackArray.java
            StackLink.java
            TDAQueue.java
            TDAStack.java
            Test.java
   
```
En donde, Ejercicios contendra desarrollado el ejercicio 1, y TDA los ejercicios 2 y 3.
Para realizar el ejercicio 1 se tuvo que desarrollar primero las estructuras de datos (Ejercicio 1 y 2) para trabajar con estas mismas

# Solucion Ejercicio 1

# Soluciones Ejercicio 2 y 3
Para realizar las estructuras de datos se tomo en cuenta la codumentacion en oracle, y la velocidad ideal propuesta en https://www.bigocheatsheet.com/ que indica lo siguiente:


| Promedio  | ARRAY | STACK | QUEUE |
|-----------|-------|-------|-------|
| Access    | O(1)  | O(n)  | O(n)  |
| Search    | O(n)  | O(n)  | O(n)  |
| Insertion | O(n)  | O(1)  | O(1)  |
| Deletion  | O(n)  | O(1)  | O(1)  |
| Peor                              |
| Access    | O(1)  | O(n)  | O(n)  |
| Search    | O(n)  | O(n)  | O(n)  |
| Insertion | O(n)  | O(1)  | O(1)  |
| Deletion  | O(n)  | O(1)  | O(1)  |
| Peor Caso | O(n)  | O(n)  | O(n)  |

# Ejercicio 2 - STACKS
Se desarrollaron las siguientes clases:
- TDAStack - interfaz 
- StackArray - Stack a base de arreglos estandar
- StackLink - Stack a base de nodos enlazados

TDAStack.- Posee los metodos principales de stack vistos en la documentacion stack con sus respectivas descripciones.
los metodos que posee son:
-empty()
-peek()
-pop()
-push()
-search()

StackArray 
Esta clase implementa los metodos en la interfaz TDAStack. Los atributos de esta clase son:
- Elements(Arreglo generico estandar)
- top(dato generico)
- default_size(tamaño inicial de elements)
Los metodos son como realizados de acuerdo al cuadro comparativo y la descripcion en la interfaz.

StackLink 
Esta clase posee similitudes con LinkedList. Por lo que sus unicos atributos son 
- top(Nodo que contiene un dato generico) este nodo es el Nodo root de LinkedList
Al igual que con StackList los metodos son realizados de acuerdo al cuadro y la interfaz.

# Ejercicio 3 - Queue
Se crearon las siguientes clases:
- TDAQueue
- QueueArray
- QueueLink

TDAQueue
Metodos:
- add()
- element()
- offer()
- peek()
- poll()
- remove()

Las clases QueueArray y QueueLink se dearrollaron casi como las clases Stack con algunas diferencias:
- Los metodos offer y add son lo mismo con la diferencia de que add lleva un IllegalStateException por lo que add primero comprueba esta excepcion y luego llama a offer, al igual que element() y peek() donde element lleva el NoSuchElementException().


## Solucion del cuestionario
- ¿Qué similitudes hay entre una Lista Enlazada y una Pila?
Las diferencias y similitudes se muestran en el siguiente cuadro:

| Operacion              | LinkedList | STACK |
|------------------------|------------|-------|
| Access                 | O(k)       | O(k)  |
| Search                 | O(k)       | O(k)  |
| Insert/Remove Comienzo | O(1)       | N/A   |
| Insert/Remove Final    | O(n)       | O(1)  |
| Insert/Remove Medio    | O(k)       | N/A   | 
| Deletion               | O(n)       | O(1)  |

```
k: pocicion del elemento en la lista
n: tamaño completo de la lista
```
Donde para acceder y buscar tanto en Listas Enlazadas como en Pilas poseen el mismo big(O)

Si comparamos LinkedList con StackLink, StackLink
    - Ambos poseen nodos enlazados
    - Para acceder y buscar tiene la misma complejidad

- ¿En que casos seria favorable/desfavorable utilizar Pila/Cola?
    Una pila podria usar en estos casos:
    - Pilas atrás/adelante en navegadores.
    - Deshacer/Rehacer pilas en Excel o Word.
    - Registros de activación de llamadas a métodos.
    Cola
    - Una cola de impresion;
    - Un flujo de entrada;

    Casos desfavorables:
    - Busqueda de datos
    - Diccionarios
    - Pattern Machine
## Conclusiones



## Retroalimentacion

## Referencias
- https://www.bigocheatsheet.com/
- https://medium.com/@mckenziefiege/arrays-linked-lists-and-big-o-notation-486727b6259b
- https://cse.buffalo.edu/~shapiro/Courses/CSE116/notes10.html
- Mark Allen Weiss-Data Structures & Problem Solving Using Java. Fourth Edition  -Addison-Wesley (2010)

