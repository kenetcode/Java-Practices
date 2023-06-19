/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author kenetcode
 */
public class Fecha {

    private int mes; // 1-12
    private int dia; // 1-31 con base en el mes
    private int anio; // cualquier año
    private static final int[] diasPorMes
            = // días en cada mes
            {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    // constructor: llama a comprobarMes para confirmar el valor apropiado
    // para el mes; 
    // llama a comprobarDia para confirmar el valor apropiado para el día
    public Fecha(int mes, int dia, int anio) {

        this.mes = comprobarMes(mes); //comprobarMes( elMes ); // valida el mes
        this.anio = anio; // pudo validar el año
        this.dia = comprobarDia(dia); //comprobarDia( elDia ); // valida el día
        System.out.printf("Constructor de objeto Fecha para la fecha %s/%s/%s\n", mes, dia, anio);

    } // fin del constructor de Fecha

    // método utilitario para confirmar el valor apropiado del mes
    private int comprobarMes(int mesPrueba) {

        if (mesPrueba > 0 && mesPrueba <= 12) // valida el mes
        {
            return mesPrueba;
        } else // mes es inválido
        {
            throw new IllegalArgumentException("el mes debe ser 1 a 12");
        }

    } // fin del método comprobarMes

    // método utilitario para confirmar el valor apropiado del día, con base
    // en el mes y el año
    private int comprobarDia(int diaPrueba) {

        // comprueba si el día está dentro del rango para el mes
        if (diaPrueba > 0 && diaPrueba <= diasPorMes[mes]) {
            return diaPrueba;
        }

        // comprueba si es año bisiesto
        if (mes == 2 && diaPrueba == 29 && (anio % 400 == 0 || (anio % 4 == 0 && anio % 100 != 0))) {
            return diaPrueba;
        } else {
            throw new IllegalArgumentException("dia fuera de rango para el mes y anio especificados");
        }
    } // fin del método comprobarDia

    public int siguienteDia(int mes, int dia) {

        this.dia = dia;

        switch (mes) {
            case 1:
                if (dia > 0 && dia <= 31) {
                    if (dia < 31 && dia >= 1) {
                        dia += 1;
                    } else if (dia == 31) {
                        dia = 1;
                    }
                }
                break;

            case 2:
                if (dia == 29 && dia >= 1) {
                    dia = 1;
                } else if (dia < 28 && dia >= 1) {
                    dia += 1;
                }

                break;

            case 3:
                if (dia < 31 && dia >= 1) {
                    dia += 1;
                } else if (dia == 31) {
                    dia = 1;
                }
                break;

            case 4:
                if (dia < 30 && dia >= 1) {
                    dia += 1;
                } else if (dia == 30) {
                    dia = 1;
                }
                break;

            case 5:
                if (dia < 31 && dia >= 1) {
                    dia += 1;
                } else if (dia == 31) {
                    dia = 1;
                }
                break;

            case 6:
                if (dia < 30 && dia >= 1) {
                    dia += 1;
                } else if (dia == 30) {
                    dia = 1;
                }
                break;

            case 7:
                if (dia < 31 && dia >= 1) {
                    dia += 1;
                } else if (dia == 31) {
                    dia = 1;
                }
                break;

            case 8:
                if (dia < 31 && dia >= 1) {
                    dia += 1;
                } else if (dia == 31) {
                    dia = 1;
                }
                break;

            case 9:
                if (dia < 30 && dia >= 1) {
                    dia += 1;
                } else if (dia == 30) {
                    dia = 1;
                }
                break;

            case 10:
                if (dia < 31 && dia >= 1) {
                    dia += 1;
                } else if (dia == 31) {
                    dia = 1;
                }
                break;

            case 11:
                if (dia < 30 && dia >= 1) {
                    dia += 1;
                } else if (dia == 30) {
                    dia = 1;
                }
                break;

            case 12:
                if (dia <= 31 && dia >= 1) {
                    dia = 1;
                } else if (dia == 31) {
                    dia = 1;
                }
                break;

            default:
                System.out.println("error");
                break;

        }

        return dia;
    }

    public int siguienteMes(int mes, int dia) {

        this.mes = mes;

        switch (mes) {
            case 1:
                if (dia == 31) {
                    mes = 2;
                }
                break;

            case 2:
                if (dia == 28 || dia == 29) {
                    mes = 3;
                }
                break;

            case 3:
                if (dia == 31) {
                    mes = 4;
                }
                break;

            case 4:
                if (dia == 30) {
                    mes = 5;
                }
                break;

            case 5:
                if (dia == 31) {
                    mes = 6;
                }
                break;

            case 6:
                if (dia == 30) {
                    mes = 7;
                }
                break;

            case 7:
                if (dia == 31) {
                    mes = 8;
                }
                break;

            case 8:
                if (dia == 31) {
                    mes = 9;
                }
                break;

            case 9:
                if (dia == 30) {
                    mes = 10;
                }
                break;

            case 10:
                if (dia == 31) {
                    mes = 11;
                }
                break;

            case 11:
                if (dia == 30) {
                    mes = 12;
                }
                break;

            case 12:
                if (dia == 31) {
                    mes = 1;
                }
                break;

            default:
                System.out.println("fuera del rango de valores (1-12)");

        }
        return mes;

    }

    public int siguienteAnio(int mes, int dia, int anio) {

        this.anio = anio;
        if ((mes >= 1 && mes <= 12) && (dia >= 1 && dia <= 31)) {

            if (mes == 12 && dia == 31) {
                anio += 1;
            } else {
                anio = anio;

            }
        } else {
            System.out.println("error en los datos para siguiente año");
        }
        return anio;
    }

    // devuelve un objeto String de la forma mes/dia/anio
    public String toString() {

        return String.format("%d/%d/%d", mes, dia, anio);

    }
}
