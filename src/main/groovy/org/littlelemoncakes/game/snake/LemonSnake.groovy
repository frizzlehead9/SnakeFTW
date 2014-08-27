package org.littlelemoncakes.game.snake

import org.littlelemoncakes.game.snake.displays.SnakeFrame

/**
 * @author Brandon Nesterenko
 */

def newGame() {
    new SnakeFrame().createFrame()
}

newGame()