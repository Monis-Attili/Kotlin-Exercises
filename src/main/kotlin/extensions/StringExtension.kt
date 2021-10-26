import models.Data
import java.math.BigDecimal
import java.math.RoundingMode

fun String.removeWhitespaces(): String {
    return this.filter { !it.isWhitespace() }
}

fun String.findFrequencyChar(character: Char, enableIgnoreCase: Boolean, enableDigits: Boolean): Int {
    if (this.isNullOrEmpty()) {
        return 0
    }

    if (enableDigits) {
        return this.count {
            it.equals(character, ignoreCase = enableIgnoreCase) && !it.isWhitespace()
        }
    }
    return this.count {
        it.equals(character, ignoreCase = enableIgnoreCase) && !it.isWhitespace() && !it.isDigit()
    }
}

fun Char.isAlphabet(): Boolean {
    return ((this in 'a'..'z') || (this in 'A'..'Z'))
}


fun Char.isVowelOrConsonant(): String? {
    if (this == null) {
        return null
    }

    return if (Data.vowelsList.any { it.lowercase() == this.lowercase() }) "Vowel" else "Consonant"

}
