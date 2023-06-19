/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package utilidades;

/**
 *
 * @author kenetcode
 */
public class UtilidadesCadenas {

    String cadena;

    public String inicioMayuscula() {

        String primeraLetra = cadena.substring(0, 1).toUpperCase();
        String restoDeLaCadena = cadena.substring(1).toLowerCase();
        return primeraLetra + restoDeLaCadena;
    }

    public String inicioTodasMayusculas() {
        char[] caracteres = cadena.toCharArray();
        caracteres[0] = Character.toUpperCase(caracteres[0]);
        for (int i = 0; i < cadena.length() - 2; i++) {
            if (caracteres[i] == ' ' || caracteres[i] == '.' || caracteres[i] == ',') {
                caracteres[i + 1] = Character.toUpperCase(caracteres[i + 1]);
            }
        }
        return new String(caracteres);
    }

    public String palabrasInversa() {
        String[] str = cadena.split("||s +");
        String cad = " ";
        for (int i = str.length - 1; i >= 0; i--) {
            cad += str[i] + " ";
        }
        return cad;

    }
}
