package clases;

import javax.swing.JOptionPane;

public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0;
        int nodo_informacion = 0;

        Cola cola = new Cola();

        do {
            try {
                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1.Insertar un nodo\n"
                        + "2. Extraer un nodo\n"
                        + "3. Mostrar contenido de la cola\n"
                        + "4. Salir\n\n"
                ));

                switch (opcion) {
                    case 1:
                        nodo_informacion = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Porfavor ingrese el valor a guardar en el nodo."
                        ));
                        cola.insertar(nodo_informacion);
                        break;
                    case 2:
                        if (!cola.colaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se extrajo un nodo con el valor: "
                                    + cola.extraer()
                            );
                        } else {
                            JOptionPane.showMessageDialog(null, "La cola esta vacía");
                        }
                        break;
                    case 3:
                        cola.mostrarContenido();
                        break;
                    case 4:
                        opcion = 4;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opcion no disponible.");
                        break;
                }
            } catch (NumberFormatException e) {
            }
        } while (opcion != 4);
    }
}
