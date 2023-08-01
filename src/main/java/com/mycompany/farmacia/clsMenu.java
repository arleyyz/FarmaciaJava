/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.farmacia;

/**
 *
 * @author jgonz
 */
public class clsMenu {

    public void MenuCliente() {
        clsHelper clsH = new clsHelper();
        clsUsuario clsC = new clsUsuario();
        clsUsuario clientes[] = new clsUsuario[0];
        int poscCliente = 0;
        boolean listaCliente = false;
        char opcion = 'S';
        do {
            opcion = clsH.recibeChar("Seleccione una opcion:\n"
                    + " A. Generar lista de Clientes\n"
                    + " B. Agregar Cliente\n"
                    + " C. Modificar Cliente\n"
                    + " D. Eliminar Cliente\n"
                    + " E. Buscar Cliente\n"
                    + " F. Listar Cliente\n"
                    + " S. Salir");
            switch (opcion) {
                case 'A':
                    if (listaCliente) {
                        char nueva = 'N';
                        do {
                            nueva = clsH.recibeChar("Desea generar una nueva lista?\nSi\nNo");
                        } while (nueva != 'S' && nueva != 'N');
                        if (nueva == 'S') {
                            clientes = clsC.generarListaUsuario();
                            poscCliente = 0;
                            listaCliente = true;
                        }
                    } else {
                        clientes = clsC.generarListaUsuario();
                        listaCliente = true;
                    }
                    break;
                case 'B':
                    if (listaCliente) {
                        if (poscCliente < clientes.length) {
                            poscCliente = clsC.agregarCliente(clientes, poscCliente);
                            clsH.imprimeMensaje("Cliente agregado satisfactoriamente.");
                        } else {
                            clsH.imprimeMensaje("La lista clientes se encuentra llena, ya no puede agregar más!");
                        }
                    } else {
                        clsH.imprimeMensaje("Debe generar primero la lista de clientes");
                    }
                    break;
                case 'C':

                    break;
                case 'D':

                    break;
                case 'E':

                    break;
                case 'F':
                    if (poscCliente == 0) {
                        clsH.imprimeMensaje("Debe agregar un cliente primero");
                    }
                    else{
                        clsC.listarClientes(clientes, poscCliente);
                    }
                    break;
                case 'S':
                    break;
                default:
                    clsH.imprimeMensaje("La opción seleccionada no es válida");
            }

        } while (opcion != 'S');

    }
}