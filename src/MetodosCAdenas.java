import java.util.Arrays;

public class MetodosCAdenas {
    public static void main(String[] args) {
        //si dos cadenas, puedes compararlas y verificar que sean iguales.
        String cadena1="En un lugar de la Mancha, de cuyo nombre no quiero acordarme";
        String cadena2="En un lugar de la Mancha";
        boolean comparar=cadena1.equals(cadena2);
        System.out.println("Las cadenas son iguales: "+comparar);
        int compararN=cadena1.compareTo(cadena2); //dev 0 si son iguales
        if(compararN==0){
            System.out.println("La cadena son iguales: "+compararN);
        }else {
            System.out.println("La cadena no son iguales: "+compararN);
        }
        compararN=cadena1.compareToIgnoreCase(cadena2); //ignorando mayuscula o minuscula
            String nombre1="maria";
            String nombre2="MARIA";
            compararN=nombre1.compareToIgnoreCase(nombre2);
            if(compararN==0){
                System.out.println("Los nombres son iguales: "+compararN);
            }else {
                System.out.println("Los nombres no son iguales: "+compararN);
            }
            nombre1=nombre1.toUpperCase(); //pasa el nombre a mayuscula
            nombre2=nombre2.toLowerCase(); //pasa el nombre a minuscula
            comparar=cadena1.startsWith(cadena2); //comienza por
            System.out.println("Las cadenas comienzan iguales: "+comparar);
            comparar=cadena1.endsWith("acordarme");
            System.out.println("La cadena1 termina con acordarme: "+comparar);
            String dni="06330231X";
            comparar=dni.startsWith("Z");
            System.out.println("El DNI termina con Z: "+comparar);
            char letra=dni.charAt(dni.length()-1);
            System.out.println("La letra del DNI escrita es: "+letra);
            comparar=nombre1.equalsIgnoreCase(nombre2); //true o false
            String passWord="CEAT1234@";
            int pass=passWord.hashCode();
            System.out.println("El password es: " + passWord + " en hashCode es " + pass);
            int indice=cadena1.toUpperCase().indexOf("u".toUpperCase());
            System.out.println("El indice es: " + indice);
            cadena1=cadena1.replace('u','a'); //para char
            System.out.println(cadena1);
            cadena1=cadena1.replaceAll("Mancha","Marcha");
            System.out.println(cadena1);
            char[] letras=cadena1.toCharArray();
            System.out.println(Arrays.toString(letras));
            String[] arrayCadena1=cadena1.split(",");//si no se indica el separado, crea un array por cada posicion
            System.out.println(Arrays.toString(arrayCadena1));
            //Ejercicio escribe un nombre y apellido, ye extraemos el apellido...supuesto que el nombre no es compuesto
            String nombre="Raúl García";
            String[] nombreArray=nombre.split(" ");
            int longNombre=nombreArray.length;
            String apellido=nombreArray[1];
            System.out.println("El apellido es: " + apellido);
            //como convertir cualquier valor primitivo en String
            int numero=456456464;
            String numero1=String.valueOf(numero); //me devuelve el numero pero en tipo String
            String booleano1=String.valueOf(true);
            String double1=String.valueOf(45225.44);
            char ultimo=numero1.charAt(numero1.length()-1);
            //si validar telefono necesita saber que tienen 9 números....y lo pides numéricos...
            int telefono=923545854;
            String telefono1=String.valueOf(telefono);
            //si quieres extraer de una cadena, sabiendo el indice...
            String temporal=telefono1.substring(0,2); //0 es la posición inicial
            System.out.println("El temporal es: " + temporal);
            nombre2=nombre2.toUpperCase().substring(0,1).toUpperCase();
        }
    }
