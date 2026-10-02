package com.example.modifierdemo

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.modifierdemo.ui.theme.ModifierDemoTheme
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Compose UI tests for composable components in [MainActivity].
 */
@RunWith(AndroidJUnit4::class)
class DemoScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun demoScreen_rendersHelloComposeText() {
        composeTestRule.setContent {
            ModifierDemoTheme {
                DemoScreen()
            }
        }

        composeTestRule.onNodeWithText("Hello Compose").assertIsDisplayed()
    }

    @Test
    fun customImage_rendersWithoutErrors() {
        composeTestRule.setContent {
            ModifierDemoTheme {
                CustomImage(image = R.drawable.vacation)
            }
        }

        composeTestRule.waitForIdle()
    }
}
