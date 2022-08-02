public class Main {
    public static void main(String[] args)
    {
        int numeroif = 0;
        if (numeroif > 0)
        {
            System.out.println("el numero es positivo");
        } else if (numeroif<0)
        {
            System.out.println("el numero es negativo");
        } else if (numeroif==0)
    {
        System.out.println("el numero es es igaul a cero");
    } else {
        System.out.println("no se");
    }
        //while
        int numerowhile = 0;
        {
        System.out.println("numerowhile:"+ numerowhile);
        numerowhile++;

    } do {
         System.out.println("numerowhile:"+ numerowhile);
         numerowhile++;
    } while(numerowhile<3);
     //for
    for (int numerofor = 0; numerofor<=3; numerofor = numerofor+1)
    {
        System.out.println("numerofor"+ numerofor);

    }
    //SWITCH
       var estacion = "VERANO";

        switch (estacion){
        case "VERANO":
            System.out.println("Es verano");
            break;
        case "OTONIO":
            System.out.println("Es otonio");
            break;
        case "INVIERNO":
            System.out.println("Es INVIERNO");
            break;
        case "PRIMAVERA":
            System.out.println("Es primavera");
            break;
        default:
            System.out.println("No es una estacion");
        }
    }
}