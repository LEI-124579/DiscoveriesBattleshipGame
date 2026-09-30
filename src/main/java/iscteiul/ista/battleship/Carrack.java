package iscteiul.ista.battleship;

/**
 * Representa um navio do tipo nau.
 *
 * <p>Uma nau ocupa três posições no tabuleiro,
 * dependendo da sua direcção.</p>
 */
public class Carrack extends Ship {
    private static final Integer SIZE = 3;
    private static final String NAME = "Nau";

    /**
     * Cria uma nova nau.
     *
     * @param bearing direcção para a qual a nau está orientada
     * @param pos posição inicial da nau
     * @throws IllegalArgumentException se a direcção não for válida
     */
    public Carrack(Compass bearing, IPosition pos) throws IllegalArgumentException {
        super(Carrack.NAME, bearing, pos);
        switch (bearing) {
            case NORTH:
            case SOUTH:
                for (int r = 0; r < SIZE; r++)
                    getPositions().add(new Position(pos.getRow() + r, pos.getColumn()));
                break;
            case EAST:
            case WEST:
                for (int c = 0; c < SIZE; c++)
                    getPositions().add(new Position(pos.getRow(), pos.getColumn() + c));
                break;
            default:
                throw new IllegalArgumentException("ERROR! invalid bearing for the carrack");
        }
    }

    /**
     * Obtém o tamanho da nau.
     *
     * @return número de posições ocupadas pela nau
     */
    @Override
    public Integer getSize() {
        return Carrack.SIZE;
    }

}
