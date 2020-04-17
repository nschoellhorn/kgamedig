package eu.dreamcode.kgamedig

import eu.dreamcode.kgamedig.configuration.QueryOptions

class QueryRunner(
        private val udpSocket: GlobalUdpSocket = GlobalUdpSocket(),
        private val gameResolver: GameResolver = GameResolver(),
        private val protocolResolver: ProtocolResolver = ProtocolResolver()
) {
    fun run(options: QueryOptions) {

    }
}
