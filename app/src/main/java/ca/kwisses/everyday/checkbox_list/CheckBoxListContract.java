package ca.kwisses.everyday.checkbox_list;

import android.view.View;
import android.widget.CheckBox;

import java.util.List;

public interface CheckBoxListContract {

    interface Handler {

        void initCheckBoxList(View view);

        void setInvisible();

        boolean hasInvisibleCheckBox();

        CheckBox getNextInvisibleCheckBox();

        void setNextInvisibleCheckBox(String text);

        boolean taskExists(String task);

        boolean addTaskItemToList(String text);

        boolean deleteTaskItemFromList();

        List<CheckBox> getCheckBoxList();

    }
}
