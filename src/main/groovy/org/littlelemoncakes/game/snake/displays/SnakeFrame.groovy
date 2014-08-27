package org.littlelemoncakes.game.snake.displays

import groovy.swing.SwingBuilder

import java.awt.BorderLayout

/**
 * @author Brandon Nesterenko
 */
class SnakeFrame {

    @Newify([SwingBuilder]) //  <-- Allows "SwingBuilder()" or "SwingBuilder.new() instead of "new StringBuilder()"
    def createFrame() {
        SwingBuilder().edt {
            frame(title:'Lemon Snake', size:[300,300], show: true) {
                bLayout = borderLayout()
                textLabel = label(text:"Welcome to Snake, Jake.", constraints: BorderLayout.NORTH)
                menuBar({
                    menu(text: "File", mnemonic: "F") {
                        menuItem(text: "Win", mnemonic: "W", actionPerformed: {
                            textLabel.text = "Soz you lost"
                        })
                        menuItem(text: "Quit", mnemonic: "Q", actionPerformed: {dispose()})
                    }
                })
            }
        }
    }
}
