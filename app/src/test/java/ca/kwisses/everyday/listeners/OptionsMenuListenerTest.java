package ca.kwisses.everyday.listeners;

import android.view.MenuItem;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class OptionsMenuListenerTest {

    private OptionsMenuListener optionsMenuListener;

    @Before
    public void setup() {
        optionsMenuListener = mock(OptionsMenuListener.class);
    }

    @Test
    public void onClick_CallMethod_CallsMethod() {
        MenuItem menuItem = mock(MenuItem.class);
        optionsMenuListener.onMenuItemClick(menuItem);
        verify(optionsMenuListener).onMenuItemClick(menuItem);
    }
}
