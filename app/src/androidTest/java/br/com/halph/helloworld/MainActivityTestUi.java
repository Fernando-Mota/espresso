package br.com.halph.helloworld;

import android.support.test.espresso.ViewAction;
import android.support.test.espresso.ViewInteraction;
import android.support.test.filters.LargeTest;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static android.support.test.espresso.Espresso.closeSoftKeyboard;
import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.assertion.ViewAssertions.matches;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static android.support.test.espresso.matcher.ViewMatchers.withText;
import static java.lang.Thread.sleep;

/**
 * Created by Android on 01/02/2017.
 */
@RunWith(AndroidJUnit4.class)
@LargeTest
public class MainActivityTestUi {

    private String stringToBeTyped;

    @Rule
    public ActivityTestRule<MainActivity> mainActivityRule = new ActivityTestRule<MainActivity>(MainActivity.class);

    @Before
    public void initValidString() {
        // Specify a valid string.
        stringToBeTyped = "Fernando";
    }

    @Test
    public void executarTesteDoTexto() {

        onView(withId(R.id.textNome))
                .perform(typeText(stringToBeTyped));

        onView(withId(R.id.buttonClick))
                .perform(click());


        onView(withId(R.id.textResultado))
                .check(matches(withText("Hello Fernando")));

    }
}
