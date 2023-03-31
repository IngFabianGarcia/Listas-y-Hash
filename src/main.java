
import Controller.paisController;
import Model.modeloPaises;
import View.frmAgregaryEliminar;
import View.frmPrincipal;
import java.util.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author umg
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*List MiLista = new ArrayList();
        MiLista.add(10);
        MiLista.add(10.50);
        MiLista.add("Hola Mundo");
        MiLista.add(true);
        System.out.println(MiLista);
        System.out.println("");
        System.out.println("2da forma de mostrarlo");
        MiLista.forEach(dato->{
            System.out.println(dato);
        });
        System.out.println("");
        System.out.println("3ra forma de mostrarlo");
        for(Object ListaDatos: MiLista){
            System.out.println(ListaDatos);
        }*/
        
       /* HashSet ListaNormal = new HashSet();
        ListaNormal.add("lunes");
        ListaNormal.add("martes");
        ListaNormal.add("miercoles");
        ListaNormal.add("jueves");
        ListaNormal.add("viernes");
        ListaNormal.add("viernes");
        ListaNormal.add("viernes");
        System.out.println(ListaNormal);
        System.out.println("");
        System.out.println("Usando Lambda");
        ListaNormal.forEach(dato->{
            System.out.println(ListaNormal);
        });

        System.out.println("");
        ListaNormal.remove("martes");
        ListaNormal.clear();
        System.out.println("Imprimir for abreviado");
        for(Object MisDatos: ListaNormal){
            System.out.println(MisDatos);
        }
        */
       /*
       
       HashMap MiLista2 = new HashMap();
       MiLista2.put(502, "Guatemala");
       MiLista2.put(503, "El salvador");
       MiLista2.put(504, "Honduras");
       MiLista2.put(505, "Nicaragua");
       MiLista2.put(506, "Costa Rica");
       MiLista2.put(507, "Panama");
       
        System.out.println(MiLista2);
        /*MiLista2.put(507, "otro pais kkakajajsd");
        MiLista2.remove(507);
        System.out.println("");
        System.out.println(MiLista2);           
        System.out.println("");
        System.out.println("2da forma con hash");
        MiLista2.forEach((clave,valor)->{
            System.out.println(clave + " " +valor);
        });
          */  
       
        frmPrincipal ventanaPrincipal = new frmPrincipal();
        modeloPaises modeloPais = new modeloPaises();
        frmAgregaryEliminar ventanaAgregar = new frmAgregaryEliminar(ventanaPrincipal, true);
        
        paisController controlador = new paisController(ventanaAgregar, ventanaPrincipal, modeloPais);
        
        
        
        }
       
       
    }
    

