package iscteiul.ista.battleship;

/**
 * Enumeração que representa as direcções possíveis no jogo.
 *
 * <p>Cada direcção está associada a um carácter utilizado
 * para a sua representação.</p>
 *
 * @author fba
 */

public enum Compass {
    NORTH('n'), SOUTH('s'), EAST('e'), WEST('o'), UNKNOWN('u');

    private final char c;

    /**
     * Cria uma direcção com o caracter correspondente.
     *
     * @param c caracter que representa a direcção
     */
    Compass(char c) {
        this.c = c;
    }

    /**
     * Obtém o caracter associado à direcção.
     *
     * @return caracter que representa a direcção
     */
    public char getDirection() {
        return c;
    }

    /**
     * Obtém a representação textual da direcção.
     *
     * @return caracter da direcção convertido para texto
     */
    @Override
    public String toString() {
        return "" + c;
    }

    /**
     * Converte um caracter numa direcção da bússola.
     *
     * @param ch caracter que representa a direcção
     * @return direcção correspondente ao caracter ou
     *         {@code UNKNOWN} caso não seja reconhecido
     */
    static Compass charToCompass(char ch) {
        Compass bearing;
        switch (ch) {
            case 'n':
                bearing = NORTH;
                break;
            case 's':
                bearing = SOUTH;
                break;
            case 'e':
                bearing = EAST;
                break;
            case 'o':
                bearing = WEST;
                break;
            default:
                bearing = UNKNOWN;
        }

        return bearing;
    }
}
