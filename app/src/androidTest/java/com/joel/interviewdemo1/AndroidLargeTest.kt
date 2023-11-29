package com.joel.interviewdemo1

import androidx.compose.ui.test.assertCountEquals
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onAllNodesWithTag
import androidx.compose.ui.test.onNodeWithTag
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class AndroidLargeTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testAndroidLarge(){
        composeTestRule.setContent {
            AndroidLarge()
        }


        // test text is visible
        composeTestRule.onNodeWithTag("upcoming_trips").assertIsDisplayed()

        // test to ensure screenCard component is displayed/re-used twice
        composeTestRule.onAllNodesWithTag("screen_card")
            .assertCountEquals(2)

    }

    @Test
    fun testTextOnCard(){

        composeTestRule.setContent {
            ScreenCard(cardValue = "Ski")
        }

        // test textValue parameter used in ScreenCard Composable
        composeTestRule.onNodeWithText("Ski")
            .assertIsDisplayed()

    }


}