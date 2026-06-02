# Simulador de Batallas RPG - Arena de Héroes

## Arquitectura y Diseño de Software

El sistema está completamente desacoplado por capas mediante el uso de paquetes específicos, garantizando que la interfaz gráfica no dependa de la lógica de almacenamiento interna:

* **`modelo`**: Contiene la lógica del dominio del juego. Implementa una clase abstracta `Personaje` de la cual heredan `Guerrero` y `Mago`, polimorfizando el método `atacar()`.
* **`datos`**: Capa encargada del ciclo de vida y persistencia de la información. Define el contrato abstracto `IRegistroBatallas` y su implementación temporal en memoria `RegistroEnMemoria`.
* **`vista`**: Contiene la interfaz gráfica `VentanaBatalla` construida en Java Swing.
* **`test`**: Aloja las pruebas unitarias automatizadas del sistema.

### Principio de Inversión de Dependencias (DIP)
La ventana del juego (`VentanaBatalla`) no conoce si el historial se guarda en la memoria RAM, en un archivo de texto o en una base de datos remota.Únicamente interactúa con el contrato definido por la interfaz `IRegistroBatallas`, la cual es provista externamente en su constructor mediante **Inyección de Dependencias** desde la clase de inicio `Main`.

---

