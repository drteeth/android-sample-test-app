package com.sample.donut.test;

import android.support.v4.app.FragmentActivity;
import android.test.ActivityInstrumentationTestCase2;

import com.sample.donut.SingleAppActivity;

public class TehTests extends ActivityInstrumentationTestCase2<SingleAppActivity> {

    public TehTests() {
        super("com.sample.donut", SingleAppActivity.class);
    }

    public void testWinning() {
        assertTrue(true);
    }

    public void testActivity() {
        final FragmentActivity activity = getActivity();
        assertNotNull(activity);
    }
}
