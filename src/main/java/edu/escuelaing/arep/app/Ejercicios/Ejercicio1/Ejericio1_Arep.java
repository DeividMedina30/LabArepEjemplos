package edu.escuelaing.arep.app.Ejercicios.Ejercicio1;
import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.net.*;
import java.lang.System.*;


/**
 * Funciones Java
 * Curso: Arquitectura Empresarial
 * @version 1.1
 * @author Deivid Medina
 */
public class Ejericio1_Arep {

    /**
     * Clase main que ejecuta el ejercicio 1.
     * @param args - Argumento por defecto que contiene el main.
     * @throws Exception - Excepción para controlar posibles errores por URL.
     */
    public static void main(String[] args) throws Exception {
        printMembers("Hola".getClass().getDeclaredMethods(),"Methods");
    }

    private static void printMembers(Method[] mbrs, String s) {
        System.out.format("%s:%n", s);
        for (Member mbr : mbrs) {
            if (mbr instanceof Field)
                System.out.format(" %s%n", ((Field) mbr).toGenericString());
            else if (mbr instanceof Constructor)
                System.out.format(" %s%n", ((Constructor) mbr).toGenericString());
            else if (mbr instanceof Method)
                System.out.format(" %s%n", ((Method) mbr).toGenericString());
        }
        if (mbrs.length == 0)
            System.out.format(" -- No %s --%n", s);
        System.out.format("%n");
    }
}
