/**
 * Representa uma barca no jogo.
 */
package iscteiul.ista.battleship;

/**
 * Representa um navio do tipo barca.
 *
 * <p>Uma barca ocupa apenas uma posição no tabuleiro.</p>
 */
public class Barge extends Ship {
    private static final Integer SIZE = 1;
    private static final String NAME = "Barca";

    /**
     * Cria uma nova barca.
     *
     * @param bearing direcção para a qual a barca está orientada
     * @param pos posição inicial da barca
     */
    public Barge(Compass bearing, IPosition pos) {
        super(Barge.NAME, bearing, pos);
        getPositions().add(new Position(pos.getRow(), pos.getColumn()));
    }

    /**
     * Obtém o tamanho da barca.
     *
     * @return número de posições ocupadas pela barca
     */
    @Override
    public Integer getSize() {
        return SIZE;
    }

}
