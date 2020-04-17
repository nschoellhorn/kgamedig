package eu.dreamcode.kgamedig.configuration

import java.lang.NumberFormatException
import java.net.InetAddress

data class QueryOptions(
        val host: InetAddress,
        val port: Int?
) {
    companion object {
        @JvmStatic
        fun createFromString(hostString: String) =
            QueryOptions(
                InetAddress.getByName(
                    extractHostname(
                        hostString
                    )
                ),
                extractPort(hostString)
            )

        private fun extractHostname(hostString: String) = if (hostString.contains(":")) {
            hostString.split(":").first()
        } else {
            hostString
        }

        private fun extractPort(hostString: String): Int? {
            if (!hostString.contains(":")) {
                return null
            }

            return try {
                hostString.split(":").last().toInt()
            } catch (exception: NumberFormatException) {
                null
            }
        }
    }
}
