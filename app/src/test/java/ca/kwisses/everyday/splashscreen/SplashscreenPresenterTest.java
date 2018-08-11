package ca.kwisses.everyday.splashscreen;

import android.content.Context;
import android.content.Intent;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import ca.kwisses.everyday.R;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class SplashscreenPresenterTest {

    @Mock
    private Context context;

    private SplashScreenPresenter splashScreenPresenter;

    @Before
    public void setup() {
        context = mock(Context.class);
        splashScreenPresenter = new SplashScreenPresenter(context);
    }

    // Thread Test Method

    @Test
    public void IsThreadAlive_ThreadIsAlive() {
        assertTrue(splashScreenPresenter.isAlive());
    }

    // getContentView() Test Methods

    @Test
    public void getContentView_ViewIsSplashcreen_ViewIsSplashscreen() {
        int view = splashScreenPresenter.getContentView();
        assertEquals(R.layout.activity_splashscreen, view);
    }

    @Test
    public void getContentView_ViewGreaterThanZero_ViewGreaterThanZero() {
        int view = splashScreenPresenter.getContentView();
        assertTrue(view > 0);
    }

    //getIntent() Test Methods

    @Test
    public void getIntent_IntentSetToNull_IntentIsNull() {
        SplashScreenPresenter splashScreenPresenter = mock(SplashScreenPresenter.class);
        when(splashScreenPresenter.getIntent()).thenReturn(null);
        Intent intent = splashScreenPresenter.getIntent();
        assertEquals(null, intent);
    }

    @Test
    public void getIntent_SetIntentToNotNull_IntentNotNull() {
        SplashScreenPresenter splashScreenPresenter = mock(SplashScreenPresenter.class);
        Intent testIntent = new Intent();
        when(splashScreenPresenter.getIntent()).thenReturn(testIntent);
        Intent intent = splashScreenPresenter.getIntent();
        assertNotNull(intent);
    }

    // run() Test Methods

    @Test
    public void run_CallMethod_CallsMethod() {
        splashScreenPresenter = mock(SplashScreenPresenter.class);
        splashScreenPresenter.run();
        verify(splashScreenPresenter).run();
    }

    @Test (expected = NullPointerException.class)
    public void run_ContextIsNull_ThrowNullPointerException() {
        splashScreenPresenter = new SplashScreenPresenter(null);
        splashScreenPresenter.run();
    }

    @Test (expected = ClassCastException.class)
    public void run_TryToCastInvalidContext_ThrowClassCastException() {
        splashScreenPresenter.run(); // context is a mock object.
    }

}
