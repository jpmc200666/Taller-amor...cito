package Control;

import Modelo.Juegos;
import Modelo.Maquina;
import Modelo.Persona;
import Vista.Vista;

public class Control {

    Maquina maquina;
    Persona comprador;
    Juegos juego;
    Vista vista;

    public Control() {
        vista = new Vista();
        maquina = new Maquina();
        comprador = new Persona();
        validacionMenuInicial(vista.menuInicial());
    }

    public void validacionMenuInicial(String rta) {
        try {
            int respuestaMenuInicial = Integer.parseInt(rta);
            if (respuestaMenuInicial == 0) {
                System.out.println("\nByeee \n");
                System.exit(0);

            } else {
                if (respuestaMenuInicial == 1) {
                    validacionMenuMaterial(vista.menuMaterial());
                } else {
                    throw new Exception();
                }
            }
        } catch (NumberFormatException Ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser un numero \n");
            validacionMenuInicial(vista.menuInicial());
        } catch (Exception ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser 1 o 0 \n");
            validacionMenuInicial(vista.menuInicial());
        }
    }

    public void validacionMenuMaterial(String rta) {
        try {
            int respuestaMenuMaterial = Integer.parseInt(rta);
            if (respuestaMenuMaterial == 0) {
                vista.mostrarMensaje("\nVolviendo... \n");
                validacionMenuInicial(vista.menuInicial());
            } else {
                if (respuestaMenuMaterial == 1) {
                    maquina.setMaterial("Madera");
                } else {
                    if (respuestaMenuMaterial == 2) {
                        maquina.setMaterial("Aluminio");
                    } else {
                        if (respuestaMenuMaterial == 3) {
                            maquina.setMaterial("Fibra de carbono");
                        } else {
                            throw new Exception();
                        }
                    }
                }
            }
            validacionMenuJuegos(vista.menuJuego());
        } catch (NumberFormatException Ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser un numero \n");
            validacionMenuMaterial(vista.menuMaterial());
        } catch (Exception e) {
            vista.mostrarMensaje("\nLa respuesta debe ser un entero entero entre 0 y 3 \n");
            validacionMenuMaterial(vista.menuMaterial());
        }
    }

    public void validacionMenuJuegos(String rta) {
        try {
            int respuestaMenuJuego = Integer.parseInt(rta);
            switch (respuestaMenuJuego) {
                case 1:
                    maquina.anadirJuegos(juego.PAC_MAN);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 2:
                    maquina.anadirJuegos(juego.SPACE_INVADERS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 3:
                    maquina.anadirJuegos(juego.DONKEY_KONG);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 4:
                    maquina.anadirJuegos(juego.STREET_FIGHTER_II);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 5:
                    maquina.anadirJuegos(juego.GALAGA);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 6:
                    maquina.anadirJuegos(juego.MORTAL_KOMBAT);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 7:
                    maquina.anadirJuegos(juego.ASTEROIDS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 8:
                    maquina.anadirJuegos(juego.FROGGER);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 9:
                    maquina.anadirJuegos(juego.TETRIS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 10:
                    maquina.anadirJuegos(juego.CENTIPEDE);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 11:
                    maquina.anadirJuegos(juego.DOUBLE_DRAGON);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 12:
                    maquina.anadirJuegos(juego.DEFENDER);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 13:
                    maquina.anadirJuegos(juego.OUT_RUN);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 14:
                    maquina.anadirJuegos(juego.NBA_JAM);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 15:
                    maquina.anadirJuegos(juego.METAL_SLUG);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 16:
                    maquina.anadirJuegos(juego.TEENAGE_MUTANT_NINJA_TURTLES);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 17:
                    maquina.anadirJuegos(juego.X_MEN);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 18:
                    maquina.anadirJuegos(juego.THE_SIMPSONS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;
                case 19:
                    maquina.anadirJuegos(juego.TIME_CRISIS);
                    validacionMenuJuegos(vista.menuJuego());
                    break;

                case 20:
                    setNombreComprador(vista.nombrePersona());
                    break;
                case 21:
                    maquina.reiniciarListaDeJuegos();
                    vista.mostrarMensaje("\nVolviendo... \n");
                    validacionMenuMaterial(vista.menuMaterial());
                    break;
            }
        } catch (NumberFormatException Ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser un numero \n");
            validacionMenuJuegos(vista.menuJuego());
        } catch (Exception e) {
            vista.mostrarMensaje("\nLa respuesta debe ser un entero entero entre 0 y 21 \n");
            validacionMenuJuegos(vista.menuJuego());
        }
    }

    public void setNombreComprador(String nombrePersona) {
        comprador.setNombre(nombrePersona);
        setApellidoComprador(vista.apellidoPersona());
    }

    public void setApellidoComprador(String apellidoPersona) {
        comprador.setApellido(apellidoPersona);
        setDireccion(vista.direccionPersona());
    }

    public void setDireccion(String direccion) {
        comprador.setDireccion(direccion);
        vista.mostrarMensaje(
                "\nVerifique la informacion de su pedido y digite 1 para confirmar y acabar la ejecucion del programa\n");
        mostrarPedido();
    }

    public void imprimirJuegos() {
        for (int i = 0; i < maquina.getJuegos().size(); i++) {
            vista.mostrarJuegos(maquina.getJuegos().get(i));
        }
    }

    public void mostrarPedido() {
        maquina.setComprador(comprador);
        vista.mostrarMensaje(maquina.getMaterial());
        imprimirJuegos();
        vista.mostrarMensaje(maquina.getComprador().getNombre());
        vista.mostrarMensaje(maquina.getComprador().getApellido());
        vista.mostrarMensaje(maquina.getComprador().getDireccion() + "\n");
        confirmacionPedido(vista.confirmacionPedido());
    }

    public void confirmacionPedido(String confirmacion) {
        try {
            int rta = Integer.parseInt(confirmacion);
            if (rta == 1) {
                vista.mostrarMensaje("\nPedido confirmado");
                System.exit(0);
            } else {
                throw new Exception();
            }
        } catch (NumberFormatException Ex) {
            vista.mostrarMensaje("\nLa respuesta debe ser un numero \n");
            confirmacionPedido(vista.confirmacionPedido());
        } catch (Exception e) {
            vista.mostrarMensaje("\nLa respuesta debe ser 1 \n");
            confirmacionPedido(vista.confirmacionPedido());
        }
    }
}
