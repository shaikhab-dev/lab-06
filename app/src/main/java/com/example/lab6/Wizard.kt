
package com.example.lab6

/**
 * Represents a wizard that can cast spells using mana.
 *
 * Each wizard has a name, mana, and spell power.
 * Mana is used when casting spells, and spell power
 * determines how much damage each spell does.
 *
 * @property name the wizard's name
 * @property mana the amount of mana the wizard has
 * @property spellPower the wizard's base spell power
 */
class Wizard(val name: String, var mana: Int, var spellPower: Int) {

    /**
     * Casts a spell and returns the damage dealt.
     *
     * Explosion uses 10 mana and deals 3 times spell power.
     * Frostbite uses 5 mana and deals 2 times spell power.
     *
     * If there is not enough mana or the spell is invalid,
     * the function returns 0.
     *
     * @param spell the name of the spell being cast
     * @return the damage dealt, or 0 if the spell fails
     */
    fun castSpell(spell: String): Int {
        when (spell) {
            "Explosion" -> {
                if (mana >= 10) {
                    mana -= 10
                    return spellPower * 3
                } else {
                    return 0
                }
            }

            "Frostbite" -> {
                if (mana >= 5) {
                    mana -= 5
                    return spellPower * 2
                } else {
                    return 0
                }
            }

            else -> {
                return 0
            }
        }
    }
}
