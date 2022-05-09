package main;

import main.modulo.InputForm;
import main.modulo.Opcion;
import main.modulo.SelectForm;
import main.modulo.TextAreaForm;

public class EjemploForm {

    public static void main(String[] args) {
        // creacion de objetos
        InputForm obj = new InputForm("hola","chau","InputForm");
        TextAreaForm obj2 = new TextAreaForm("nombre","TextAreaForm",5,6);
        SelectForm obajetoSelect = new SelectForm("OPCIONES");
        //asignacion de valores
        Opcion java = new Opcion ("1", "Java");
        obajetoSelect.addOpcion (java);
        obajetoSelect.addOpcion (new Opcion("2","python"));
        obajetoSelect.addOpcion (new Opcion("3","JavaScript"));
        obajetoSelect.addOpcion (new Opcion("4","TypeScript"));
        obajetoSelect.addOpcion (new Opcion("5","Php"));
        obajetoSelect.addOpcion (new Opcion("6","C++"));




        // Impresion de datos
        System.out.println(obj.renderizarHTML());
        System.out.println(obj2.renderizarHTML());
        System.out.println(obajetoSelect.renderizarHTML());



    }



}
