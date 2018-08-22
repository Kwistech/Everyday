package ca.kwisses.everyday.checkbox_list;

import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

public class CheckBoxListHandler implements CheckBoxListContract.Handler {

    private List<CheckBox> checkBoxList;

    public CheckBoxListHandler() {
        checkBoxList = new ArrayList<>();
    }

    public List<CheckBox> getCheckBoxList() {
        return checkBoxList;
    }

    public void setCheckBoxList(List<CheckBox> checkBoxList) {
        this.checkBoxList = checkBoxList;
    }
}
