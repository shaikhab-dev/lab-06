
package com.example.lab6

import org.junit.Before
import org.junit.Test
import org.junit.Assert.assertEquals

class WizardTest {

    private lateinit var evilWizard: Wizard

    // Make a new wizard before every test
    @Before
    fun setUp() {
        evilWizard = Wizard("Evil Wizard", 30, 10)
    }

    @Test
    fun castSpell_explosion_successful() {
        val damage = evilWizard.castSpell("Explosion")

        assertEquals(30, damage)
        assertEquals(20, evilWizard.mana)
    }

    @Test
    fun castSpell_explosion_unsuccessful() {
        evilWizard.mana = 5

        val damage = evilWizard.castSpell("Explosion")

        assertEquals(0, damage)
        assertEquals(5, evilWizard.mana)
    }

    @Test
    fun castSpell_frostbite_successful() {
        val damage = evilWizard.castSpell("Frostbite")

        assertEquals(20, damage)
        assertEquals(25, evilWizard.mana)
    }

    @Test
    fun castSpell_frostbite_unsuccessful() {
        evilWizard.mana = 2

        val damage = evilWizard.castSpell("Frostbite")

        assertEquals(0, damage)
        assertEquals(2, evilWizard.mana)
    }
}
