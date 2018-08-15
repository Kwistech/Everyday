package ca.kwisses.everyday.dbhandler;

import android.content.ContentValues;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DBHandlerTest {

    private DBHandler dbHandler;

    @Before
    public void setup() {
        dbHandler = new DBHandler(null, null);
    }

    // initQuery Test Methods

    @Test
    public void initQuery_CallMethodInConstructor_QueryNotNull() {
        String query = dbHandler.getQuery();
        assertNotNull(query);
    }

    @Test
    public void initQuery_CallMethodInConstructor_QueryIsValid() {
        DBHandlerPresenter dbHandlerPresenter = new DBHandlerPresenter(dbHandler);
        String query = dbHandler.getQuery();
        boolean valid = dbHandlerPresenter.isValidQuery(query);
        assertTrue(valid);
    }

    // parseIDs() Test Methods

    @Test
    public void parseItems_SetMethodWithMock_GetNotNull() {
        ContentValues mockContentValues = mock(ContentValues.class);

        dbHandler.setContentValues(mockContentValues);
        ContentValues contentValues = dbHandler.getContentValues();

        when(mockContentValues.get("_id")).thenReturn(1);
        assertNotNull(contentValues.get("_id"));
    }

}
