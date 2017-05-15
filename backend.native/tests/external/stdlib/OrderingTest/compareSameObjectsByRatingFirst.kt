import kotlin.test.*

import kotlin.comparisons.*

data class Item(val name: String, val rating: Int) : Comparable<Item> {
    public override fun compareTo(other: Item): Int {
        return compareValuesBy(this, other, { it.rating }, { it.name })
    }
}

val v1 = Item("wine", 9)
fun box() {
    val diff = compareValuesBy(v1, v1, { it.rating }, { it.name })
    assertTrue(diff == 0)
}
