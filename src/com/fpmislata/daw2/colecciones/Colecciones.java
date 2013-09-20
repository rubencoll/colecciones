/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fpmislata.daw2.colecciones;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author alumno
 */
public class Colecciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        List<Coche> listaCoches = new ArrayList<Coche>(); //Declaramos una arrayList de coches
        Map<String, Coche> mapCoches = new HashMap<>();  //Declaramos el Map de personas, similar a una lista pero una un valor indice

        Scanner sc = new Scanner(System.in);

        int seleccionMenu = -1;

        while (seleccionMenu != 0) {

            System.out.println("");
            System.out.println("##############@ MENU ################");
            System.out.println("");
            System.out.println("1- Insertar Coche por Consola");
            System.out.println("2- Ver número Coches");
            System.out.println("3- Ver todos los coches");
            System.out.println("4- Buscar coche por DNI del propietario");
            System.out.println("5- Buscar coche por DNI del propietario, usando MAP");
            System.out.println("6- Mostrar el coche en Segunda posicion");
            System.out.println("7- Imprimir Coches FORD");
            System.out.println("8- Mostrar todos los coches por MAP");
            System.out.println("9- Imprimir Coches FORD con MAP");
            System.out.println("");
            System.out.println("0- Salir");
            System.out.println("");
            System.out.println("#######################################");
            seleccionMenu = sc.nextInt();

            if (seleccionMenu == 1) {   // Insertar Coche por Consola

                insertarConsolaCoches(listaCoches, mapCoches);

            } else if (seleccionMenu == 2) { // Ver número Coches

                imprimirNumeroDeCoches(listaCoches);

            } else if (seleccionMenu == 3) {    // Ver todos los coches

                imprimirListaCoches(listaCoches);

            } else if (seleccionMenu == 4) {    // Buscar coche por DNI del propietario

                Scanner scb = new Scanner(System.in);

                System.out.println("Dime el DNI del propietario del coche: ");
                String dniBuscar = scb.next();
                buscarCochesDNI(listaCoches, dniBuscar);

            } else if (seleccionMenu == 5) {  // Buscar coche por DNI del propietario, usando MAP

                Scanner scbm = new Scanner(System.in);

                System.out.println("Dime el DNI del propietario del coche: ");
                String dniBuscar = scbm.next();
                buscarCochesMapDNI(mapCoches, dniBuscar);

            } else if (seleccionMenu == 6) { //Mostrar el coche en Segunda posicion

                imprimirCocheSegundaPosicion(listaCoches);

            } else if (seleccionMenu == 7) {    //Imprimir Coches FORD

                imprimirCochesFord(listaCoches);

            } else if (seleccionMenu == 8) {    //Mostrar todos los coches por MAP

                imprimirListaCochesMap(mapCoches);

            } else if (seleccionMenu == 9) { //Imprimir Coches FORD con MAP
                
                imprimirCochesFordMap(mapCoches);
                
            } else if (seleccionMenu == 0) {    //Salir

                break;
            }
        }
    }

    //Insertar un coche nuevo por consola
    
    private static void insertarConsolaCoches(List<Coche> coches, Map<String, Coche> mapCoches) {

        Coche coche = new Coche();

        Scanner sc = new Scanner(System.in);

        System.out.println("Dime la marca del coche: ");

        System.out.println("1- SEAT");
        System.out.println("2- RENAULT");
        System.out.println("3- FORD");
        System.out.println("4- CITROEN");

        int marca = sc.nextInt();

        Marca mar = null;

        if (marca == 1) {

            mar = coche.getMarca().SEAT;

        } else if (marca == 2) {

            mar = coche.getMarca().RENAULT;

        } else if (marca == 3) {

            mar = coche.getMarca().FORD;

        } else if (marca == 4) {
            mar = coche.getMarca().CITROEN;
        }

        coche.setMarca(mar);

        System.out.println("Cual es el modelo del " + coche.getMarca() + ": ");
        String modelo = sc.next();
        coche.setModelo(modelo);

        System.out.println("Que cilindrada tiene el " + coche.getMarca() + ", " + coche.getModelo() + " :");
        int cilindrada = sc.nextInt();
        coche.setCilindrada(cilindrada);

        System.out.println("Dime el DNI del propietario: ");
        String dni = sc.next();

        coche.setDNI(dni);

        mapCoches.put(dni, coche);  //Insertamos un map, indicando el Objeto y un indice (DNI)
        coches.add(coche);    //añadimos a la lista
    }

    //Imprimir el numero de coches que hay en el arrayList
    
    private static void imprimirNumeroDeCoches(List<Coche> coches) {

        System.out.println("El numero de coches de la lista es: " + coches.size());
        System.out.println("");
    }

    //Imprimir todo la lista de coches que hay en el arrayList
    
    private static void imprimirListaCoches(List<Coche> coches) {

        System.out.println("########### LISTA ############");

        for (Coche coche : coches) {
            System.out.println("-------------------------------------------------");
            System.out.println(coche.getInformacionCoche());
            System.out.println("-------------------------------------------------");
        }

        System.out.println("##############################");

        System.out.println("");
    }

    //Buscar coches por el DNI del propietario
    
    private static void buscarCochesDNI(List<Coche> coches, String dnibuscar) {

        System.out.println("########### LISTA ############");

        for (Coche coche : coches) {

            if (coche.getDNI().equalsIgnoreCase(dnibuscar)) {
                System.out.println("-------------------------------------------------");
                System.out.println(coche.getInformacionCoche());
                System.out.println("-------------------------------------------------");
            }
        }

        System.out.println("##############################");

        System.out.println("");
    }

    //Buscar coche pasando DNI propietario con MAP
    
    private static void buscarCochesMapDNI(Map<String, Coche> mapCoches, String dnibuscar) {

        System.out.println("########### LISTA ############");

        Coche coche = mapCoches.get(dnibuscar);

        System.out.println("-------------------------------------------------");
        System.out.println(coche.getInformacionCoche());
        System.out.println("-------------------------------------------------");

        System.out.println("##############################");

        System.out.println("");
    }

    private static void imprimirCocheSegundaPosicion(List<Coche> coches) {

        Coche coche = coches.get(1);

        System.out.println("########### LISTA ############");

        System.out.println("-------------------------------------------------");
        System.out.println(coche.getInformacionCoche());
        System.out.println("-------------------------------------------------");

        System.out.println("##############################");

        System.out.println("");
    }

    private static void imprimirCochesFord(List<Coche> coches) {

        System.out.println("########### LISTA ############");

        for (Coche coche : coches) {

            if (coche.getMarca() == Marca.FORD) {
                System.out.println("-------------------------------------------------");
                System.out.println(coche.getInformacionCoche());
                System.out.println("-------------------------------------------------");
            }
        }

        System.out.println("##############################");

        System.out.println("");


    }

    //Imprimir todos los coches con MAP
    private static void imprimirListaCochesMap(Map<String, Coche> mapCoches) {

        //Declaramos un Set de tipo String para los DNIs y le pasamos el mapPersonas asignandole el set

        Set<String> setDnis = mapCoches.keySet();

        System.out.println("########### LISTA ############");

        for (String dni : setDnis) {  //recorregmos por el dni el setPersonas

            Coche coche = mapCoches.get(dni);   //Creamos un coche asignandole el get DNI

            System.out.println("-------------------------------------------------");
            System.out.println(coche.getInformacionCoche());
            System.out.println("-------------------------------------------------");
        }

        System.out.println("##############################");

        System.out.println("");
    }

    //Imprimir todos los coches con MAP
    private static void imprimirCochesFordMap(Map<String, Coche> mapCoches) {

        //Declaramos un Set de tipo String para los DNIs y le pasamos el mapPersonas asignandole el set

        Set<String> setMarcaFord = mapCoches.keySet();

        System.out.println("########### LISTA ############");

        for (String marca : setMarcaFord) {  //recorregmos por el dni el setPersonas

            Coche coche = mapCoches.get(marca);   //Creamos un coche asignandole el get DNI

            if (coche.getMarca() == Marca.FORD) {
                System.out.println("-------------------------------------------------");
                System.out.println(coche.getInformacionCoche());
                System.out.println("-------------------------------------------------");
            }
        }

        System.out.println("##############################");

        System.out.println("");
    }
}
