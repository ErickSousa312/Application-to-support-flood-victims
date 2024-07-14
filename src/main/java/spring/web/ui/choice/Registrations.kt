package spring.web.ui.choice

import org.springframework.boot.actuate.autoconfigure.wavefront.WavefrontProperties
import spring.utils.ConsoleUI
import spring.web.ui.MainUi
import spring.web.ui.MainUi.Companion
import spring.web.ui.item.Item

class Registrations {
    companion object {
        fun run() {
            while (true){
                showGUI()
                when(ConsoleUI.getInputInteger()){
                    1-> Item.screen()
                    5-> break
                    else-> ConsoleUI.invalidChoice()
                }
            }
        }
        private fun showGUI() {
            ConsoleUI.clear()
            println("||============================||")
            println("||     Edicao de Entidades    ||")
            println("||                            ||")
            println("|| 1 - Item                   ||")
            println("|| 2 - Item Doado             ||")
            println("|| 3 - Abrigo                 ||")
            println("|| 4 - Abrigo                 ||")
            println("||                            ||")
            println("|| 5 - EXIT                   ||")
            println("||============================||")
            print(">> ")
        }

    }
}