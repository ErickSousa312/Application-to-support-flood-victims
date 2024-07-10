package spring.web.controller

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test
import spring.commons.itemConstains.item


class ItemControllerTest {
    @Test
    fun testCreateItem_whenCreated_thenReturnItem() {
        val item = ItemController.insert(item)
        assertThat(item.id).isNotNull()
    }
}