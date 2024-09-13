package Vista;


import java.util.Scanner;

import Modelo.Juegos;

public class Vista {
    
    Scanner sc = new Scanner(System.in);

    public Vista(){   
    }
    
    public void mostrarJuegos(Juegos juegos){
        System.out.println(juegos);
    }
    public void mostrarMensaje(String mensaje){
        System.out.println(mensaje);
    }
    public String menuInicial(){
        System.out.println("Bienvenido al programa de compra de maquinas, presione 1 para continuar o 0 para acabar con la ejecucion \n");
        return sc.nextLine();
    }

    public String menuMaterial(){
        System.out.println("\nEscoja el material que quiere para la maquina: \n 1) Madera \n 2) Aluminio \n 3) Fibra de carbono \n 0) Para devolverse al menu anterior \n");
        return sc.nextLine();  
    }

    public String menuJuego(){
        System.out.println("\nEscoja el juego que quiere para instalar a la maquina: \n\n1) Pac-Man (1980)\r\n" + //
                        "2) Space Invaders (1978)\r\n" + //
                        "3) Donkey Kong (1981)\r\n" + //
                        "4) Street Fighter II (1991)\r\n" + //
                        "5) Galaga (1981)\r\n" + //
                        "6) Mortal Kombat (1992)\r\n" + //
                        "7) Asteroids (1979)\r\n" + //
                        "8) Frogger (1981)\r\n" + //
                        "9) Tetris (1984)\r\n" + //
                        "10) Centipede (1980)\r\n" + //
                        "11) Double Dragon (1987)\r\n" + //
                        "12) Defender (1981)\r\n" + //
                        "13) Out Run (1986)\r\n" + //
                        "14) NBA Jam (1993)\r\n" + //
                        "15) Metal Slug (1996)\r\n" + //
                        "16) Teenage Mutant Ninja Turtles (1989)\r\n" + //
                        "17) X-Men (1992)\r\n" + //
                        "18) The Simpsons (1991)\r\n" + //
                        "19) Time Crisis (1995)\r\n" + //
                        "20) Dejar de agregar juegos\r\n" + //
                        "21) Volver al menu anterior\n");
                        return sc.nextLine();
    }

    public String nombrePersona(){
        System.out.println("\nEscriba el nombre de la persona que va a realizar el pedido\n");
        return sc.nextLine();
    }

    public String apellidoPersona(){
        System.out.println("\nEscriba el apellido de la persona que va a realizar el pedido\n");
        return sc.nextLine();
    }

    public String direccionPersona(){
        System.out.println("\nEscriba la direccion a la cual debe llegar el pedido\n");
        return sc.nextLine();
    }

    public String confirmacionPedido(){
        return sc.nextLine();
    }
    
}
