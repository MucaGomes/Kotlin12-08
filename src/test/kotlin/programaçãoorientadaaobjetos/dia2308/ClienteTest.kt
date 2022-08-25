package programaçãoorientadaaobjetos.dia2308

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.BeforeEach


internal class ClienteTest {

    val cliente1 = Cliente("Marcio","Travesa Alguma Coisa","1195868545")

    @BeforeEach
    fun addProdutosTest() {

        cliente1.addProduto("Maionese")
        cliente1.addProduto("Jujubas")
        cliente1.addProduto("Coca - Cola")
        cliente1.addProduto("Vinagre")
        cliente1.addProduto("Tomates")

    }

    @Test
    fun addProduto() {
        assertEquals(5,cliente1.listaExibirTest.size)
    }

    @Test
    fun removerProduto() {
        cliente1.removerProduto("Vinagre")

        assertEquals(4, cliente1.listaExibirTest.size)
    }

    @Test
    fun seiLa() {

        assertEquals("Tomates",cliente1.listaExibirTest.elementAt(4))
    }
}