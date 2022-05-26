public class Main {
    public static void main(String[] args) {
        System.out.println("ejercicio tema 4");
        System.out.println("comparando con 'if'");
        int numeroIf = 0;
        if (numeroIf < 0){
            System.out.println("numeroIf es menor que cero");
        } else if (numeroIf == 0) {
            System.out.println("numeroIf es cero");
        }else {
            System.out.println("numeroIf es mayor que cero");
        }
        System.out.println("-- while --");
        int numeroWhile=0;
        while (numeroWhile < 3){
            System.out.println("numeroWhile: "+numeroWhile);
            numeroWhile++;
        }
        System.out.println("-- Do while --");
        do {
            System.out.println("numeroWhile: "+numeroWhile);
            numeroWhile++;
        }while (numeroWhile<3);
        System.out.println("-- for --");
        for (int numeroFor = 0; numeroFor <=3; numeroFor++){
            System.out.println("numeroFor: "+numeroFor);
        }
        System.out.println("-- switch --");
        String estacion="invio";
        switch (estacion){
            case  "primavera":
                System.out.println("primavera");
                break;
            case "verano":
                System.out.println("verano");
                break;
            case "otoño":
                System.out.println("otoño");
                break;
            case "invierno":
                System.out.println("invierno");
                break;
            default:
                System.out.println("el valor ingresado no es una estación");
                break;
        }
    }

}