[![logoUniversidad](Edissongithub "logoUniversidad")](https://es.m.wikipedia.org/wiki/Archivo:Logo_Universidad_Polit%C3%A9cnica_Salesiana_del_Ecuador.png "logoUniversidad")

**PROYECTO FIN DE CICLO**

Edisson Diaz, Sofia Peña

Universidad Politécnica Salesiana

Estructura de Datos
Ing. Pablo Torres.
31 de julio del 2023

**DESCRIPCION DEL PROYECTO**
El proyecto consiste en desarrollar un programa que permita gestionar una lista de contactos telefónicos, donde cada contacto está compuesto por un nombre, un número de teléfono, una colección de correos y un diccionario de redes sociales.
1.  El nombre del contacto puede ser cualquier cadena de texto que represente el nombre y apellido, mientras que el número de teléfono puede ser de cualquier longitud y formato, incluyendo números fijos, móviles o con código de país.
2.  La colección de correos contendrá las direcciones de correo electrónico asociadas al contacto, pudiendo haber cero o varias direcciones almacenadas en esta colección.
3. El diccionario de redes sociales almacenará la información de las redes sociales asociadas al contacto, donde la clave del diccionario será el nombre de la red social y el valor será el usuario o perfil del contacto en esa red.

**FUNCIONALIDAD**
Este proyecto ofrece una herramienta para la gestión de contactos que permite agregar nuevos contactos con información como su nombre, número de teléfono, correos electrónicos y perfiles de redes sociales asociados. También se puede eliminar un contacto existente a partir de su nombre o número de teléfono. Además, se pueden agregar correos electrónicos y perfiles de redes sociales a un contacto existente. El programa también permite imprimir el árbol de contactos según el recorrido, como preorder, inorder, postorder y achura. Otras funciones incluyen la capacidad de buscar un contacto por su nombre o número de teléfono y mostrar toda su información, incluyendo correos electrónicos y redes sociales asociadas, y obtener el número total de contactos almacenados. En resumen, este proyecto proporciona una herramienta útil para que los usuarios puedan almacenar y administrar sus contactos de manera organizada, con la flexibilidad de agregar información sobre correos electrónicos y perfiles de redes sociales asociados a cada contacto.

**DOCUMENTACION DE CADA UNA DE LAS CLASES DEL PROYECTO:**
**Arbol Binario Contactos**
La clase ArbolContactos es un árbol de búsqueda binaria que tiene una variable miembro privada raíz de tipo Node que sirve como raíz del árbol. El constructor inicializa el árbol estableciendo la raíz raíz en null. El método Agregar se utiliza para agregar un nuevo contacto al árbol. Si el árbol está vacío, crea directamente un nuevo nodo raíz. De lo contrario, llama al método recursivo privado agregarRecursivo para encontrar la posición adecuada para insertar el nuevo contacto en el árbol. El método buscarContacto le permite buscar un contacto proporcionando su nombre. El método eliminarse se utiliza para eliminar un contacto del árbol. Los métodos agregarCorreo y agregarRedSocial permiten agregar direcciones de correo electrónico e información de redes sociales a un contacto, respectivamente. Los métodos Preorder, inorderRecursivo, poserRecursivoy Achurase se utilizan para diferentes tipos de recorridos de árboles. El método getRoot devuelve el nodo raíz del árbol. El método estaBalanceado comprueba si el árbol está equilibrado o no. El método pesoArbol calcula el número total de nodos en el árbol. En resumen, la clase ArbolContactos es una herramienta útil para administrar contactos, permitiendo agregar, buscar y eliminar contactos, así como agregar información adicional como direcciones de correo electrónico y enlaces de redes sociales. Además, proporciona varios métodos transversales de árboles y métodos para verificar el saldo y calcular el número total de nodos en el árbol.

**CLASE CONTACTO**
La clase Contacto tiene varios atributos, incluyendo un atributo público de tipo String llamado Nombre que almacena el nombre del contacto, un atributo privado de tipo String llamado Teléfono que almacena el número de teléfono del contacto, una colección de tipo List llamada Emails que almacena los correos electrónicos asociados al contacto, y un diccionario de tipo Map llamado RedesSociales que almacena las redes sociales del contacto, con las llaves siendo el nombre de la red social y los valores siendo los nombres de usuario asociados.
La clase tiene un constructor público que acepta dos parámetros: nombre y teléfono. Al crear un objeto Contacto, se deben proporcionar estos valores, y la colección de correos electrónicos y el diccionario de redes sociales se inicializarán como listas vacías.
La clase también tiene varios métodos públicos, como getNombre() y getTelefono() para obtener el nombre y el teléfono del contacto, respectivamente, y setNombre() y setTelefono() para establecer el nombre y el teléfono del contacto.
Además, hay métodos como getEmails() y getRedesSociales() para obtener las listas de correos electrónicos y redes sociales del contacto, y setEmails() y setRedesSociales() para establecer la lista de correos electrónicos y el diccionario de redes sociales del contacto.
También hay métodos específicos para agregar, eliminar y modificar redes sociales en el diccionario RedesSociales, como agregarRedSocial(), eliminarRedSocial() y modificarRedSocial().
En resumen, la clase Contacto tiene atributos para almacenar información como el nombre, teléfono, correos electrónicos y redes sociales de un contacto. Proporciona métodos para acceder y modificar estos atributos, así como para agregar, eliminar y modificar redes sociales en el diccionario de redes sociales.
**CLASE NODO**
La clase Node o Nodo representa un nodo en un árbol binario y tiene varios atributos. El atributo Contacto contiene un objeto de tipo Contacto y representa los datos asociados con este nodo en el árbol binario. Los atributos Left y Right contienen referencias a los nodos secundarios izquierdo y derecho del nodo actual, respectivamente.
La clase Node tiene un constructor que toma un objeto Contacto como parámetro. Al crear un nuevo objeto Node, se inicializa el atributo Contacto con el objeto Contacto dado y se establecen las referencias Left y Right como null.
La clase también proporciona métodos getter para acceder a los atributos de instancia de la clase. Estos métodos permiten que el código externo recupere los valores de Left, Right y Contacto.
En resumen, la clase Node representa un nodo básico en un árbol binario, donde cada nodo contiene un objeto Contacto y tiene referencias a sus nodos secundarios izquierdo y derecho. Esta clase se puede utilizar para construir una estructura de datos de árbol binario para administrar y organizar objetos Contacto.
En resumen, la clase Node representa un nodo básico en un árbol binario, donde cada nodo contiene un objeto Contacto y tiene referencias a sus nodos secundarios izquierdo y derecho. Esta clase se puede utilizar para construir una estructura de datos de árbol binario para administrar y organizar objetos de Contacto.

