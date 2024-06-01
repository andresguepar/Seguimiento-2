Diagrama UML - State Pattern
![image](https://github.com/andresguepar/Seguimiento-2/assets/34109816/d0b93f38-7195-450f-903e-ced2e25c5ec1)

Diagrama UML - Visitor Pattern
![Visitor Pattern drawio](https://github.com/andresguepar/Seguimiento-2/assets/34109816/676f0876-5d67-4f30-aff6-4cfdb9346060)

Double Dispatch: es un patrón de diseño que permite tomar decisiones basadas en los tipos de varios objetos en lugar de solo uno. En muchos lenguajes de programación orientados a objetos, la selección del método a ejecutar se realiza principalmente en función del objeto receptor del mensaje. Sin embargo, en ciertos casos, esto puede no ser suficiente.Uno de los principales usos se encuentra en los patrones de diseño de objetos como el visitor e interpreter. Por ejemplo, el patrón visitor se utiliza para hacer extensible una estructura de datos al modelar operaciones sobre ella como objetos "visitantes". Los usuarios pueden definir nuevos visitantes, y cada visitante sabe cómo manipular cada objeto en la estructura de datos utilizando el "double dispatch". De esta manera, se logra una flexibilidad y extensibilidad significativas en el diseño del software.
