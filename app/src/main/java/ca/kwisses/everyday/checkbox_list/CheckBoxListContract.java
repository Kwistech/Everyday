package ca.kwisses.everyday.checkbox_list;

import android.view.View;
import android.widget.CheckBox;

import java.util.List;

public interface CheckBoxListContract {

    interface Handler {

        void initCheckBoxList();

        void setCheckBox(CheckBox checkBox, String text);

        void resetCheckbox(CheckBox checkBox);

        CheckBox getNextInvisibleCheckBox();

        boolean taskExists(String task);

        boolean addTaskItemToList(String text);

        boolean deleteTaskItemFromList(String task);

        CheckBox getCheckbox(String task);

        List<CheckBox> getCheckBoxList();

        void setCheckBoxList(List<CheckBox> checkBoxList);

    }
}
