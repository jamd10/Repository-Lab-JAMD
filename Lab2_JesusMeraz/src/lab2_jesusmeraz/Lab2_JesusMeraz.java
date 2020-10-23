package lab2_jesusmeraz;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2_JesusMeraz {

    public static void main(String[] args) {
        int opcion = 0;
        int o = 0;
        int p;
        Scanner leer = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        ArrayList agg_detectives = new ArrayList();
        ArrayList agg_casos = new ArrayList();
        ArrayList agg_homicidio = new ArrayList();
        ArrayList agg_secuestros = new ArrayList();
        ArrayList agg_robos = new ArrayList();
        ArrayList agg_resueltos = new ArrayList();
        ArrayList agg_pendientes = new ArrayList();
        while (opcion != 10) {
            System.out.println("********************|MENU|********************");
            System.out.println("* 1.    Agregar detectives                   *");
            System.out.println("* 2.    Eliminar detectives                  *");
            System.out.println("* 3.    Modificar detectives                 *");
            System.out.println("* 4.    Listar detectives                    *");
            System.out.println("* 5.    Registrar casos                      *");
            System.out.println("* 6.    Modificar casos                      *");
            System.out.println("* 7.    Listar casos                         *");
            System.out.println("* 8.    Listar casos resueltos               *");
            System.out.println("* 9.    Listar casos pendientes              *");
            System.out.println("* 10.   Salir                                *");
            System.out.println("**********************************************");
            System.out.print("ingrese una opcion: ");
            opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Agregar detectives");
                    System.out.println("Ingrese nombre: ");
                    String name = sc.nextLine();
                    System.out.println("Ingrese edad: ");
                    int edad = leer.nextInt();
                    System.out.println("Ingrese nacionalidad: ");
                    String nacionalidad = leer.next();
                    System.out.println("Ingrese años laborales: ");
                    int a_laborales = leer.nextInt();
                    System.out.println("Ingrese su nivel [1-10]: ");
                    int nivel = leer.nextInt();
                    while (nivel > 10 || nivel < 1) {
                        System.out.println("Por favor ingrese su nivel del 1 al 10, intente de nuevo:");
                        System.out.println("Ingrese su nivel [1-10]: ");
                        nivel = leer.nextInt();
                    }// fin while
                    agg_detectives.add(new AgregarDetectives(name, edad, nacionalidad, a_laborales, nivel));
                    break;
                case 2:
                    System.out.println("Eliminar detective");
                    System.out.println("Ingrese la posicion del detective a eliminar: ");
                    p = leer.nextInt();
                    if (p >= 0 && p < agg_detectives.size()) {
                        agg_detectives.remove(p);
                        System.out.println("Detective eliminado exitosamente");
                    } else {
                        System.out.println("Fuera de rango, la posicion que eligio es incorrecta");
                    }// fin if
                    break;
                case 3:
                    System.out.println("Modificar Detective");
                    System.out.println("Ingrese la posicion del detective a modificar: ");
                    p = leer.nextInt();
                    String modName = "";
                    int modEdad;
                    String modNacionalidad;
                    int modA_laborales;
                    int modNivel;
                    if (p >= 0 && p < agg_detectives.size()) {
                        if (agg_detectives.get(p) instanceof AgregarDetectives) {
                            System.out.println("Modifique nombre: ");
                            modName = sc.nextLine();
                            ((AgregarDetectives) agg_detectives.get(p)).setName(modName);
                            System.out.println("Modifique edad: ");
                            modEdad = leer.nextInt();
                            ((AgregarDetectives) agg_detectives.get(p)).setEdad(modEdad);
                            System.out.println("Modifique nacionalidad: ");
                            modNacionalidad = leer.next();
                            ((AgregarDetectives) agg_detectives.get(p)).setNacionalidad(modNacionalidad);
                            System.out.println("Modifique años laborales: ");
                            modA_laborales = leer.nextInt();
                            ((AgregarDetectives) agg_detectives.get(p)).setA_laborales(modA_laborales);
                            System.out.println("Modifique nivel: ");
                            modNivel = leer.nextInt();
                            while (modNivel > 10 || modNivel < 1) {
                                System.out.println("Por favor ingrese su nivel del 1 al 10, intente de nuevo:");
                                System.out.println("Ingrese su nivel [1-10]: ");
                                modNivel = leer.nextInt();
                            }
                            ((AgregarDetectives) agg_detectives.get(p)).setNivel(modNivel);
                        }
                    }
                    break;
                case 4:
                    System.out.println("Listar detectives");
                    for (Object t : agg_detectives) {
                        System.out.println(agg_detectives.indexOf(t) + " = " + t);
                    }
                    break;
                case 5:
                    System.out.println("Registrar casos");
                    System.out.println("Ingrese lugar: ");
                    String lugar = sc.nextLine();
                    System.out.println("Ingrese descripcion: ");
                    String desc = sc.nextLine();
                    System.out.println("Ingrese tipo");
                    System.out.println("********************|MENU|********************");
                    System.out.println("* 1.    Homicidio                            *");
                    System.out.println("* 2.    Secuestro                            *");
                    System.out.println("* 3.    Robo                                 *");
                    System.out.println("**********************************************");
                    System.out.println("Ingrese opcion: ");
                    int pos = leer.nextInt();
                    String tipo = "";
                    while (pos > 3 || pos < 1) {
                        System.out.println("Opciones no validad, solo 1, 2 o 3");
                        System.out.println("Ingrese opcion nuevamente: ");
                        pos = leer.nextInt();
                    }
                    switch (pos) {
                        case 1:
                            tipo = "Homicidio";
                            break;
                        case 2:
                            tipo = "Robo";
                            break;
                        case 3:
                            tipo = "Secuestro";
                            break;
                        default:
                            System.out.println("Opciones no validad, solo 1, 2 y/o 3");
                            break;
                    }// fin swicth
                    System.out.println("Ingrese detective a cargo: ");
                    int ps = leer.nextInt();
                    String detec = "";
                    if (ps >= 0 && ps < agg_detectives.size()) {
                        if (agg_detectives.get(ps) instanceof AgregarDetectives) {
                            detec = ((AgregarDetectives) agg_detectives.get(ps)).getName();
                        }
                    }
                    System.out.println("Estado");
                    System.out.println("********************|MENU|********************");
                    System.out.println("* 1.   Resuelto                              *");
                    System.out.println("* 2.   En proceso                            *");
                    System.out.println("**********************************************");
                    System.out.println("Ingrese opcion: ");
                    int pp = leer.nextInt();
                    while (pp > 2 || pp < 1) {
                        System.out.println("Opciones no validad, solo 1 o 2");
                        System.out.println("Ingrese opcion nuevamente: ");
                        pp = leer.nextInt();
                    }
                    String estado = "";
                    switch (pp) {
                        case 1:
                            tipo = "Resuelto";
                            break;
                        case 2:
                            tipo = "En proceso";
                            break;
                        default:
                            System.out.println("Opciones no validad, solo 1 y/o 2");
                            break;
                    }// fin swicth
                    if (pos == 1) {
                        agg_homicidio.add(new Homicidio(lugar, desc, tipo, detec, estado));
                    } else if (pos == 2) {
                        agg_secuestros.add(new Secuestros(lugar, desc, tipo, detec, estado));
                    } else if (pos == 2) {
                        agg_robos.add(new Robos(lugar, desc, tipo, detec, estado));
                    }

                    if (pp == 1) {
                        agg_resueltos.add(new Homicidio(lugar, desc, tipo, detec, estado));
                        agg_resueltos.add(new Secuestros(lugar, desc, tipo, detec, estado));
                        agg_resueltos.add(new Robos(lugar, desc, tipo, detec, estado));
                    } else if (pp == 2) {
                        agg_pendientes.add(new Homicidio(lugar, desc, tipo, detec, estado));
                        agg_pendientes.add(new Secuestros(lugar, desc, tipo, detec, estado));
                        agg_pendientes.add(new Robos(lugar, desc, tipo, detec, estado));
                    }
                    break;
                case 6:
                    System.out.println("Modificar");
                    System.out.println("********************|MENU|********************");
                    System.out.println("* 1.    Homicidio                            *");
                    System.out.println("* 2.    Secuestro                            *");
                    System.out.println("* 3.    Robo                                 *");
                    System.out.println("**********************************************");
                    int posi = leer.nextInt();
                    int ppp;
                    String modlugar = "";
                    String moddesc = "";
                    String modtipo = "";
                    String moddetec = "";
                    String modestado = "";
                    int po = 0;
                    int pp1 = 0;
                    switch (posi) {
                        case 1:
                            System.out.println("Modificar casos");
                            System.out.println("Ingrese la posicion a modificar: ");
                            ppp = leer.nextInt();

                            if (ppp >= 0 && ppp < agg_homicidio.size()) {
                                if (agg_homicidio.get(ppp) instanceof Homicidio) {
                                    // lugar
                                    System.out.println("Modifique lugar: ");
                                    modlugar = sc.nextLine();
                                    ((Homicidio) agg_homicidio.get(ppp)).setLugar(modlugar);
                                    // descripcion
                                    System.out.println("Modifique descripcion: ");
                                    moddesc = sc.nextLine();
                                    ((Homicidio) agg_homicidio.get(ppp)).setDesc(moddesc);
                                    //tipo
                                    System.out.println("Modifique tipo: ");
                                    modtipo = sc.nextLine();
                                    System.out.println("********************|MENU|********************");
                                    System.out.println("* 1.    Homicidio                            *");
                                    System.out.println("* 2.    Secuestro                            *");
                                    System.out.println("* 3.    Robo                                 *");
                                    System.out.println("**********************************************");
                                    System.out.println("Ingrese opcion: ");
                                    po = leer.nextInt();
                                    while (po > 3 || po < 1) {
                                        System.out.println("Opciones no validad, solo 1, 2 o 3");
                                        System.out.println("Ingrese opcion nuevamente: ");
                                        pos = leer.nextInt();
                                    }
                                    switch (po) {
                                        case 1:
                                            modtipo = "Homicidio";
                                            break;
                                        case 2:
                                            modtipo = "Robo";
                                            break;
                                        case 3:
                                            modtipo = "Secuestro";
                                            break;
                                        default:
                                            System.out.println("Opciones no validad, solo 1, 2 y/o 3");
                                            break;
                                    }// fin swicth
                                    ((Homicidio) agg_homicidio.get(ppp)).setTipo(modtipo);
                                    //detective
                                    System.out.println("Modifique detective: ");
                                    moddetec = leer.nextLine();
                                    System.out.println("Ingrese posicion de detective a cargo: ");
                                    int p1 = leer.nextInt();
                                    if (p1 >= 0 && p1 < agg_detectives.size()) {
                                        if (agg_detectives.get(p1) instanceof AgregarDetectives) {
                                            moddetec = ((AgregarDetectives) agg_detectives.get(p1)).getName();
                                        }
                                    }
                                    ((Homicidio) agg_homicidio.get(ppp)).setDetec(moddetec);
                                    //Estado
                                    System.out.println("Modifique Estado: ");
                                    modestado = leer.nextLine();
                                    System.out.println("********************|MENU|********************");
                                    System.out.println("* 1.   Resuelto                              *");
                                    System.out.println("* 2.   En proceso                            *");
                                    System.out.println("**********************************************");
                                    System.out.println("Ingrese opcion: ");
                                    pp1 = leer.nextInt();
                                    while (pp1 > 2 || pp1 < 1) {
                                        System.out.println("Opciones no validad, solo 1 o 2");
                                        System.out.println("Ingrese opcion nuevamente: ");
                                        pos = leer.nextInt();
                                    }

                                    switch (pp1) {
                                        case 1:
                                            modestado = "Resuelto";
                                            break;
                                        case 2:
                                            modestado = "En proceso";
                                            break;
                                        default:
                                            System.out.println("Opciones no validad, solo 1 y/o 2");
                                            break;
                                    }// fin swicth
                                    ((Homicidio) agg_homicidio.get(ppp)).setEstado(modestado);
                                }
                            }

                            break;
                        case 2:
                            System.out.println("Modificar casos");
                            System.out.println("Ingrese la posicion a modificar: ");
                            ppp = leer.nextInt();
                            if (ppp >= 0 && ppp < agg_secuestros.size()) {
                                if (agg_secuestros.get(ppp) instanceof Secuestros) {
                                    // lugar
                                    System.out.println("Modifique lugar: ");
                                    modlugar = sc.nextLine();
                                    ((Secuestros) agg_secuestros.get(ppp)).setLugar(modlugar);
                                    // descripcion
                                    System.out.println("Modifique descripcion: ");
                                    moddesc = sc.nextLine();
                                    ((Secuestros) agg_secuestros.get(ppp)).setDesc(moddesc);
                                    //tipo
                                    System.out.println("Modifique tipo: ");
                                    modtipo = sc.nextLine();
                                    System.out.println("********************|MENU|********************");
                                    System.out.println("* 1.    Homicidio                            *");
                                    System.out.println("* 2.    Secuestro                            *");
                                    System.out.println("* 3.    Robo                                 *");
                                    System.out.println("**********************************************");
                                    System.out.println("Ingrese opcion: ");
                                    po = leer.nextInt();
                                    while (po > 3 || po < 1) {
                                        System.out.println("Opciones no validad, solo 1, 2 o 3");
                                        System.out.println("Ingrese opcion nuevamente: ");
                                        pos = leer.nextInt();
                                    }
                                    switch (po) {
                                        case 1:
                                            modtipo = "Homicidio";
                                            break;
                                        case 2:
                                            modtipo = "Robo";
                                            break;
                                        case 3:
                                            modtipo = "Secuestro";
                                            break;
                                        default:
                                            System.out.println("Opciones no validad, solo 1, 2 y/o 3");
                                            break;
                                    }// fin swicth
                                    ((Secuestros) agg_secuestros.get(ppp)).setTipo(modtipo);
                                    //detective
                                    System.out.println("Modifique detective: ");
                                    moddetec = leer.nextLine();
                                    System.out.println("Ingrese posicion de detective a cargo: ");
                                    pp1 = leer.nextInt();
                                    if (pp1 >= 0 && pp1 < agg_detectives.size()) {
                                        if (agg_detectives.get(pp1) instanceof AgregarDetectives) {
                                            moddetec = ((AgregarDetectives) agg_detectives.get(pp1)).getName();
                                        }
                                    }
                                    ((Secuestros) agg_secuestros.get(ppp)).setDetec(moddetec);
                                    //Estado
                                    System.out.println("Modifique Estado: ");
                                    modestado = leer.nextLine();
                                    ((Secuestros) agg_secuestros.get(ppp)).setEstado(modestado);
                                }
                            }
                            break;
                        case 3:
                            System.out.println("Modificar casos");
                            System.out.println("Ingrese la posicion a modificar: ");
                            ppp = leer.nextInt();
                            if (ppp >= 0 && ppp < agg_robos.size()) {
                                if (agg_robos.get(ppp) instanceof Robos) {
                                    // lugar
                                    System.out.println("Modifique lugar: ");
                                    modlugar = sc.nextLine();
                                    ((Robos) agg_robos.get(ppp)).setLugar(modlugar);
                                    // descripcion
                                    System.out.println("Modifique descripcion: ");
                                    moddesc = sc.nextLine();
                                    ((Robos) agg_robos.get(ppp)).setDesc(moddesc);
                                    //tipo
                                    System.out.println("Modifique tipo: ");
                                    modtipo = sc.nextLine();
                                    System.out.println("********************|MENU|********************");
                                    System.out.println("* 1.    Homicidio                            *");
                                    System.out.println("* 2.    Secuestro                            *");
                                    System.out.println("* 3.    Robo                                 *");
                                    System.out.println("**********************************************");
                                    System.out.println("Ingrese opcion: ");
                                    po = leer.nextInt();
                                    while (po > 3 || po < 1) {
                                        System.out.println("Opciones no validad, solo 1, 2 o 3");
                                        System.out.println("Ingrese opcion nuevamente: ");
                                        po = leer.nextInt();
                                    }
                                    switch (po) {
                                        case 1:
                                            modtipo = "Homicidio";
                                            break;
                                        case 2:
                                            modtipo = "Robo";
                                            break;
                                        case 3:
                                            modtipo = "Secuestro";
                                            break;
                                        default:
                                            System.out.println("Opciones no validad, solo 1, 2 y/o 3");
                                            break;
                                    }// fin swicth
                                    ((Robos) agg_robos.get(ppp)).setTipo(modtipo);
                                    //detective
                                    System.out.println("Modifique detective: ");
                                    moddetec = leer.nextLine();
                                    System.out.println("Ingrese posicion de detective a cargo: ");
                                    int p1 = leer.nextInt();
                                    if (p1 >= 0 && p1 < agg_detectives.size()) {
                                        if (agg_detectives.get(p1) instanceof AgregarDetectives) {
                                            moddetec = ((AgregarDetectives) agg_detectives.get(p1)).getName();
                                        }
                                    }
                                    ((Robos) agg_robos.get(ppp)).setDetec(moddetec);
                                    //Estado
                                    System.out.println("Modifique Estado: ");
                                    modestado = leer.nextLine();
                                    System.out.println("********************|MENU|********************");
                                    System.out.println("* 1.   Resuelto                              *");
                                    System.out.println("* 2.   En proceso                            *");
                                    System.out.println("**********************************************");
                                    System.out.println("Ingrese opcion: ");
                                    pp1 = leer.nextInt();
                                    while (pp1 > 2 || pp1 < 1) {
                                        System.out.println("Opciones no validad, solo 1 o 2");
                                        System.out.println("Ingrese opcion nuevamente: ");
                                        pos = leer.nextInt();
                                    }

                                    switch (pp1) {
                                        case 1:
                                            modestado = "Resuelto";
                                            break;
                                        case 2:
                                            modestado = "En proceso";
                                            break;
                                        default:
                                            System.out.println("Opciones no validad, solo 1 y/o 2");
                                            break;
                                    }// fin swicth
                                    ((Robos) agg_robos.get(ppp)).setEstado(modestado);
                                }

                            }

                            break;
                        default:
                            System.out.println("Opciones no validad, solo 1, 2 y/o 3");
                            break;
                    }// fin swicth
                    if (po == 1) {
                        agg_homicidio.add(new Homicidio(modlugar, moddesc, modtipo, moddetec, modestado));
                    } else if (po == 2) {
                        agg_secuestros.add(new Secuestros(modlugar, moddesc, modtipo, moddetec, modestado));
                    } else if (po == 2) {
                        agg_robos.add(new Robos(modlugar, moddesc, modtipo, moddetec, modestado));
                    }

                    if (pp1 == 1) {
                        agg_resueltos.add(new Homicidio(modlugar, moddesc, modtipo, moddetec, modestado));
                        agg_resueltos.add(new Secuestros(modlugar, moddesc, modtipo, moddetec, modestado));
                        agg_resueltos.add(new Robos(modlugar, moddesc, modtipo, moddetec, modestado));
                    } else if (pp1 == 2) {
                        agg_pendientes.add(new Homicidio(modlugar, moddesc, modtipo, moddetec, modestado));
                        agg_pendientes.add(new Secuestros(modlugar, moddesc, modtipo, moddetec, modestado));
                        agg_pendientes.add(new Robos(modlugar, moddesc, modtipo, moddetec, modestado));
                    }
                    break;
                case 7:
                    System.out.println("Listar");
                    System.out.println("Listar casos");
                    System.out.println("Homicidio: ");
                    for (Object t : agg_homicidio) {
                        System.out.println(agg_homicidio.indexOf(t) + " = " + t);
                    }
                    System.out.println("Secuestros: ");
                    for (Object t : agg_secuestros) {
                        System.out.println(agg_secuestros.indexOf(t) + " = " + t);
                    }
                    System.out.println("Robos: ");
                    for (Object t : agg_robos) {
                        System.out.println(agg_robos.indexOf(t) + " = " + t);
                    }
                    break;
                case 8:
                    System.out.println("Listar casos resueltos");
                    for (Object t : agg_resueltos) {
                        System.out.println(agg_resueltos.indexOf(t) + " = " + t);
                    }
                    break;
                case 9:
                    System.out.println("Listar casos pendientes");
                    for (Object t : agg_pendientes) {
                        System.out.println(agg_pendientes.indexOf(t) + " = " + t);
                    }
                    break;
                case 10:
                    System.out.println("Salir...");
                    break;
                default:
                    System.out.println("Fuera de rango, intente nuevamente");
            }// fin switch
        }// fin while
    }// fin main
}// fin class
