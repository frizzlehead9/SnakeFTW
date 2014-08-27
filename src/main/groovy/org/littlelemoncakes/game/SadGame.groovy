package org.littlelemoncakes.game

/**
 * A Sad Game is a game you can't win :(
 *
 * @author Brandon Nesterenko
 */
public interface SadGame {
    void start()
    void restart()
    void onLose()
}