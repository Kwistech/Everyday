package ca.kwisses.everyday.listeners;

import android.view.View;

import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class HeaderListenerTest {

    private HeaderListener headerListener;

    @Before
    public void setup() {
        headerListener = mock(HeaderListener.class);
    }

    @Test
    public void onClick_CallMethod_CallsMethod() {
        View view = new View(null);
        headerListener.onClick(view);
        verify(headerListener).onClick(view);
    }
}
