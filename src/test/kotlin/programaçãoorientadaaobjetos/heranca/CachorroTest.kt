package programaçãoorientadaaobjetos.heranca

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertIs

internal class CachorroTest {

    val cachorro1 = Cachorro("Jake", 2 , "Amarelo")

    @Test
    fun emitirSom() {

        val som = cachorro1.emitirSom()

        assertTrue(true,"dasdsamkdkmasd")


    }
}