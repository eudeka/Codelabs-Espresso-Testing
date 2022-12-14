package com.acd.espressouitesting

import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.withId
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.runners.AndroidJUnit4
import org.junit.Rule
import org.junit.Test
import org.junit.runner.RunWith

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class ExampleInstrumentedTest {

    // buat skenario Rule di sini dengan mendefine activity terlebih dahulu
    @get:Rule
    var activityScenarioRule = ActivityScenarioRule(
        MainActivity::class.java
    )

    // buat apa yang akan di testing, contoh disini yaitu Button Kuda
    // silahkan dicoba selain Kuda
    @Test
    fun selectLanguageAndCheck() {
        onView(withId(R.id.kuda)).perform(click())
        onView(withId(R.id.hasil))
            .check(matches(withText("Kuda")))
    }
}