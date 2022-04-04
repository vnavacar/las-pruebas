class ClaseCadena{



    public static String DevuelveIniciales(String nombre){

        String Iniciales = "";

        if (nombre.length() == 0)
            return "";
        if (nombre.contains("0")||nombre.contains("1")||nombre.contains("2")||nombre.contains("3")||nombre.contains("4")||nombre.contains("5")||nombre.contains("6")||nombre.contains("7")||nombre.contains("8")||nombre.contains("9"))
            return "";

            //System.out.print(Character.toUpperCase(nombre.charAt(0)));
            Iniciales= Iniciales + nombre.charAt(0)+".";

            for (int i = 1; i < nombre.length() - 1; i++){
                if (nombre.charAt(i) == ' '){
                //System.out.print(" " + Character.toUpperCase(nombre.charAt(i + 1)));
                Iniciales = Iniciales + nombre.charAt(i+1)+".";
            }
        }
        System.out.println("");
        return Iniciales;
    }

    }
    

