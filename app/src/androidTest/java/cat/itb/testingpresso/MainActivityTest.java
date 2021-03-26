package cat.itb.testingpresso;

import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.isClickable;
import static androidx.test.espresso.matcher.ViewMatchers.isDisplayed;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;

@RunWith(AndroidJUnit4.class)
public class MainActivityTest {
    private String USER_TO_BE_TYPED = "Daidis";
    private String PASS_TO_BE_TYPED = "Ekisde";

    @Rule
    public ActivityScenarioRule<MainActivity> activityScenarioRule = new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void elements_on_MainActivity_are_displayed_correctly() {

        onView(withId(R.id.titletext)).check(matches(isDisplayed()));
        onView(withId(R.id.button)).check(matches(isDisplayed()));
    }

    @Test
    public void texts_on_MainActivity_are_correct() {
        onView(withId(R.id.titletext)).check(matches(withText(R.string.main_activity_title)));
        onView(withId(R.id.button)).check(matches(withText(R.string.next)));
    }

    @Test
    public void button_on_MainActivity_is_clickable_and_changes() {
        onView(withId(R.id.button)).check(matches(isClickable()));
        onView(withId(R.id.button)).perform(click()).check(matches(withText("Back")));
    }

    @Test
    public void texts_entered_as_expected() {
        onView(withId(R.id.et1)).perform(typeText(USER_TO_BE_TYPED));
        // todo
    }
}
