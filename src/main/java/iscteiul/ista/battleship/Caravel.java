package iscteiul.ista.battleship;
/**
 * Representa um navio do tipo caravela.
 *
 * <p>Uma caravela ocupa duas posições no tabuleiro,
 * dependendo da sua direção.</p>
 */
public class Caravel extends Ship {
    private static final Integer SIZE = 2;
    private static final String NAME = "Caravela";

    /**
     * Cria uma nova caravela.
     *
     * @param bearing direcção para a qual a caravela está orientada
     * @param pos posição inicial da caravela
     * @throws NullPointerException se a direcção fornecida for {@code null}
     * @throws IllegalArgumentException se a direcção não for válida
     */
    public Caravel(Compass bearing, IPosition pos) throws NullPointerException, IllegalArgumentException {
        super(Caravel.NAME, bearing, pos);

        if (bearing == null)
            throw new NullPointerException("ERROR! invalid bearing for the caravel");

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
                throw new IllegalArgumentException("ERROR! invalid bearing for the caravel");
        }

    }

    /*
     * Obtém o tamanho da caravela.
     *
     * @return número de posições ocupadas pela caravela
     */
    @Override
    public Integer getSize() {
        return SIZE;
    }

}
