package com.betweentwobits.androidlibtemplate

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class MainTest {
    private val main = Main()

    @Test
    fun `library name is correct`() {
        assertEquals("Android Library Template", main.getLibraryName())
    }
}