package ca.kwisses.everyday.checkbox_list;

import android.view.View;
import android.widget.CheckBox;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertNotNull;
import static junit.framework.Assert.assertNull;
import static junit.framework.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class CheckBoxListHandlerTest {

    private CheckBoxListHandler checkBoxListHandler;

    @Before
    public void setup() {
        View view = mock(View.class);
        checkBoxListHandler = new CheckBoxListHandler(view);
    }

    // initCheckBoxList() Test Methods

    @Test
    public void initCheckBoxList_CallMethod_AssertThatCheckBoxListSizeIsFive() {
        checkBoxListHandler.initCheckBoxList();
        assertTrue(checkBoxListHandler.getCheckBoxList().size() == 5);
    }

    @Test
    public void initCheckBoxList_CallMethod_AssertThatCheckBoxListSizeIsNotFive() {
        assertFalse(checkBoxListHandler.getCheckBoxList().size() == 5);
    }

    @Test (expected = NullPointerException.class) // because view is null
    public void initCheckBoxList_CallMethod_ThrowNullPointerException() {
        checkBoxListHandler = new CheckBoxListHandler(null);
        checkBoxListHandler.initCheckBoxList();
    }

    // setCheckBox() Test Methods

    @Test
    public void setCheckBox_CallMethod_VerifyCheckBoxSetTextMethodCalled() {
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxListHandler.setCheckBox(checkBox, "test");
        verify(checkBox).setText("test");
    }

    @Test
    public void setCheckBox_CallMethod_VerifyCheckBoxSetCheckedMethodCalled() {
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxListHandler.setCheckBox(checkBox, "");
        verify(checkBox).setChecked(false);
    }

    @Test
    public void setCheckBox_CallMethod_VerifyCheckBoxSetVisibilityMethodCalled() {
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxListHandler.setCheckBox(checkBox, null);
        verify(checkBox).setVisibility(View.VISIBLE);
    }

    // resetCheckbox() Test Methods

    @Test
    public void resetCheckBox_CallMethod_VerifyCheckBoxSetTextMethodCalled() {
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxListHandler.resetCheckbox(checkBox);
        verify(checkBox).setText(null);
    }

    @Test
    public void resetCheckBox_CallMethod_VerifyCheckBoxSetCheckedMethodCalled() {
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxListHandler.resetCheckbox(checkBox);
        verify(checkBox).setChecked(false);
    }

    @Test
    public void resetCheckBox_CallMethod_VerifyCheckBoxSetVisibilityMethodCalled() {
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxListHandler.resetCheckbox(checkBox);
        verify(checkBox).setVisibility(View.INVISIBLE);
    }

    // getNextInvisibleCheckBox() Test Methods

    @Test
    public void getNextInvisibleCheckBox_CallMethod_VerifyCheckBoxGetVisibilityMethodCalled() {
        List<CheckBox> checkBoxList = new ArrayList<>();
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxList.add(checkBox);

        checkBoxListHandler.setCheckBoxList(checkBoxList);
        checkBoxListHandler.getNextInvisibleCheckBox();

        verify(checkBox).getVisibility();
    }

    @Test
    public void getNextInvisibleCheckBox_CallMethod_AssertCheckBoxIsNull() {
        CheckBox checkBox = checkBoxListHandler.getNextInvisibleCheckBox();
        assertNull(checkBox); // checkbox not set
    }

    // taskExists() Test Methods

    @Test
    public void taskExists_PopulateNewCheckBoxListAndCallMethod_AssertResultIsTrue() {
        List<CheckBox> checkBoxList = new ArrayList<>();
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxList.add(checkBox);
        checkBoxListHandler.setCheckBoxList(checkBoxList);

        when(checkBox.getText()).thenReturn("task");
        boolean result = checkBoxListHandler.taskExists("task");

        assertTrue(result);
    }

    @Test
    public void taskExists_PopulateNewCheckBoxListAndCallMethod_AssertResultIsFalse() {
        List<CheckBox> checkBoxList = new ArrayList<>();
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxList.add(checkBox);
        checkBoxListHandler.setCheckBoxList(checkBoxList);

        when(checkBox.getText()).thenReturn("task");
        boolean result = checkBoxListHandler.taskExists("no task");

        assertFalse(result);
    }

    @Test (expected = NullPointerException.class) // checkbox was not set
    public void taskExists_CallMethodWithoutProperSetup_ThrowNullPointerException() {
        checkBoxListHandler.setCheckBoxList(null);
        checkBoxListHandler.taskExists("checkbox is null");
    }

    // addTaskItemToList() Test Methods

    @Test
    public void addTaskItemToList_CallMethod_ResultIsTrue() {
        checkBoxListHandler = mock(CheckBoxListHandler.class);

        when(checkBoxListHandler.addTaskItemToList("add")).thenReturn(true);
        boolean result = checkBoxListHandler.addTaskItemToList("add");

        assertTrue(result);
    }

    @Test
    public void addTaskItemToList_CallMethod_ResultIsFalse() { // checkbox is null
        boolean result = checkBoxListHandler.addTaskItemToList("task");
        assertFalse(result);
    }

    // deleteTaskItemFromList() Test Methods

    @Test
    public void deleteTaskItemFromList__CallMethod_ResultIsTrue() {
        checkBoxListHandler = mock(CheckBoxListHandler.class);

        when(checkBoxListHandler.deleteTaskItemFromList("delete")).thenReturn(true);
        boolean result = checkBoxListHandler.deleteTaskItemFromList("delete");

        assertTrue(result);
    }

    @Test
    public void deleteTaskItemFromList_CallMethod_ResultIsFalse() { // checkbox is null
        boolean result = checkBoxListHandler.deleteTaskItemFromList("another task");
        assertFalse(result);
    }

    // getCheckbox() Test Methods

    @Test
    public void getCheckbox_PopulateNewCheckBoxListAndCallMethod_ResultCheckboxNotNull() {
        List<CheckBox> checkBoxList = new ArrayList<>();
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxList.add(checkBox);
        checkBoxListHandler.setCheckBoxList(checkBoxList);

        when(checkBox.getText()).thenReturn("task");
        CheckBox resultCheckbox = checkBoxListHandler.getCheckbox("task");

        assertNotNull(resultCheckbox);
    }

    @Test
    public void getCheckbox_PopulateNewCheckBoxListAndCallMethod_ResultCheckboxNull() {
        List<CheckBox> checkBoxList = new ArrayList<>();
        CheckBox checkBox = mock(CheckBox.class);
        checkBoxList.add(checkBox);
        checkBoxListHandler.setCheckBoxList(checkBoxList);

        when(checkBox.getText()).thenReturn("task");
        CheckBox resultCheckbox = checkBoxListHandler.getCheckbox("no task");

        assertNull(resultCheckbox);
    }
}
