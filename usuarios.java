package com.mycompany.farmacia;
import javax.swing.JOptionPane;

public class usuarios {


    public static void main(String[] args) {
        Usuarios();
    }

    public static void Usuarios() {
        String usuarios = "";
        int contadorUsuarios = 0;

        while (true) {
            String opcionStr = JOptionPane.showInputDialog(null,
                              "===== Men� =====\n"
                            + "1. Agregar un usuario\n"
                            + "2. Eliminar un usuario\n"
                            + "3. Modificar un usuario\n"
                            + "4. Mostrar usuarios\n"
                            + "5. Salir\n\n"
                            + "Ingrese el n�mero de la opci�n deseada:");

            int opcion = Integer.parseInt(opcionStr);

            switch (opcion) {
                case 1:
                    usuarios = agregarUsuario(usuarios, contadorUsuarios);
                    contadorUsuarios++;
                    break;
                case 2:
                    usuarios = eliminarUsuario(usuarios);
                    contadorUsuarios--;
                    break;
                case 3:
                    usuarios = modificarUsuario(usuarios);
                    break;
                case 4:
                    mostrarUsuarios(usuarios);
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias. Hasta luego.");
                    return;
                default:
                    JOptionPane.showMessageDialog(null, "Opci�n inv�lida.");
            }
        }
    }

    public static String agregarUsuario(String usuarios, int contadorUsuarios) {
        String nuevoUsuario = JOptionPane.showInputDialog(null, "Ingrese el nombre del nuevo usuario:");

        if (usuarios.contains(nuevoUsuario + "|")) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe.");
        } else {
            usuarios += nuevoUsuario + "|";
            JOptionPane.showMessageDialog(null, "Usuario agregado.");
        }
        return usuarios;
    }

    public static String eliminarUsuario(String usuarios) {
        String usuarioEliminar = JOptionPane.showInputDialog(null, "Ingrese el nombre del usuario que desea eliminar:");

        if (usuarios.contains(usuarioEliminar + "|")) {
            usuarios = usuarios.replace(usuarioEliminar + "|", "");
            JOptionPane.showMessageDialog(null, "Usuario eliminado.");
        } else {
            JOptionPane.showMessageDialog(null, "El usuario no se encontro.");
        }
        return usuarios;
    }

    public static String modificarUsuario(String usuarios) {
        
        JOptionPane.showMessageDialog(null, "Todavia no srive esto :v");
        return usuarios;
    }

    public static void mostrarUsuarios(String usuarios) {
        String listaUsuarios = "===== Usuarios =====\n";
        int start = 0;
        int index = usuarios.indexOf('|');

        while (index != -1) {
            String usuario = usuarios.substring(start, index);
            if (!usuario.isEmpty()) {
                listaUsuarios += usuario + "\n";
            }
            start = index + 1;
            index = usuarios.indexOf('|', start);
        }

        JOptionPane.showMessageDialog(null, listaUsuarios);
    }
}