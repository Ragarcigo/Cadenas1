import java.util.Scanner;

/**
 * Cadenas, son textos que su primer índice como en las tablas es 0....length
 *
 *Character.isLetterOrDigit -> alfanuméricos...
 * Character.isLowerCase -> verifica que es una letra y además que está en minúscula
 * Character.isUpperCase -> verifica que es una letra y además que está en mayúscula
 * Character.isSpaceChar -> verifica que el caracter sea un espacio
 * Character.isWhitespace -> verifica que el caracter sea un espacio, \n,\t,\r
 * Character.isLetter -> verifica que el caracter sea una letra
 * Character.isDigit -> verifica que el caracter es un número
 *
 * String.charArt(posicion)-> nos devuelve un caracter de la cadena que está en la posicion que se indica
 *
 *
 *
 */

public class Main {
    public static void main(String[] args) {
        String miCadena = "En lugar de la Mancha, de la que no quiero acordarme";
        int longitudCadena = miCadena.length();
        System.out.println("La longitud de la cadena: " + longitudCadena);
        //metodo para traer una posición o caracter de una cadena charAt(posicion)
        char letra = miCadena.charAt(0);
        System.out.println("La letra: " + letra);
        String palindroma = "Amad a la dama";
        String comprobar = "";
        for (int i = palindroma.length() - 1; i >= 0; i--) {
            comprobar += palindroma.charAt(i);
            System.out.println(comprobar);
        }
        System.out.println(comprobar.toUpperCase()); //salida de un String en mayúscula
        //toma 2 teléfonos en String y comprueba que sean correctos -> comience con 6-7-8-9
        //comprueba un nombre...no puede tener números
        //mas adelante veremos las expresiones regulares ExP
        String movil, nombre;
        Scanner sc = new Scanner(System.in);
        System.out.println("Indique su nombre");
        nombre = sc.nextLine();
        System.out.println("Indique su móvil");
        movil = sc.nextLine();
        System.out.println("Indique su email");
        boolean esValido = validarTexto(nombre);
        System.out.println("El nombre es valido: " + esValido);
        boolean esValido2 = validarNumero(movil);
        System.out.println("El movil es valido porque es solo número: " + esValido2);
        boolean esValido3 = validarTelefono(movil);
        System.out.println("El movil es valido porque comienza con 6-7-8-9: " + esValido3);
        String email = sc.nextLine();
        System.out.println("El email es valido: " + validarEmail(email));
    }

    /**
     * Función que valida que sea solo letra
     *
     * @param texto lhk
     * @return resultado
     */
    static boolean validarTexto(String texto) {
        boolean resultado = true; //
        //Segun un metoso que es de tipo char... primitivo.... Character... puede tener metodos en api
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (!Character.isLetter(letra) && !Character.isDigit(letra)) { //a - z
                resultado = false;  //ha encontrado un número....
                break;
            }
        }
        return resultado;
    }

    /**
     * Funcion que valida que el texto recibido sean solo numéricos.
     *
     * @param cadena kjkj
     * @return resultado
     */

    static boolean validarNumero(String cadena) {
        boolean resultado = true;
        for (int i = 0; i < cadena.length(); i++) {
            char letra = cadena.charAt(i);
            if (!Character.isDigit(letra)) { //is Digit verifiva que sea numérico el caracter que se ha pasado
                resultado = false;
                break; //se interrumpe la ejecucion
            }
        }
        return resultado; //devolvemos el resultado de la validacion
    }

    static boolean validarTelefono(String cadena) {
        boolean resultado = true;
        char numero = cadena.charAt(0);
        //validamos que el numero comience con 6 -7 -8 -9    y tambien validamos que la longitud del numero debe ser de 9 numeros
        if (numero != '6' && numero != '7' && numero != '8' && numero != '9' || cadena.length() != 9) {
            resultado = false;
        }
        return resultado;

    }

    /**
     * Validar un email: @ .
     */
    static boolean validarEmail(String texto) {
        boolean resultado = false;
        int indiceArroba = -1;
        int indicePunto = -1;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == '@') {
                indiceArroba = i;
            } else if (letra == '.') {
                indicePunto = i;
            }
        }
        if (indiceArroba<indicePunto && indicePunto!=-1 && indiceArroba!=-1){
            resultado = true;
        }
        }



}


