package eu.dreamcode.kgamedig

import eu.dreamcode.kgamedig.configuration.QueryOptions
import java.net.InetAddress
import kotlin.test.Test
import kotlin.test.assertEquals

class QueryOptionsTest {
    @Test
    fun `it creates a full query options object from input string`() {
        // Given an input string "test.de:1337"
        // Then I want to get an QueryOptions object containing
        // - an InetAddress object with "test.de" as the target host
        // - a port number of 1337
        val sourceHostString = "test.de:1337"

        val result = QueryOptions.createFromString(sourceHostString)

        assertEquals(1337, result.port)
        assertEquals(InetAddress.getByName("test.de"), result.host)
    }
}
