package eu.dreamcode.kgamedig.configuration

data class Game(
    val tag: String,
    val name: String,
    val protocol: Protocol,
    val ports: GamePortDefinition
)
