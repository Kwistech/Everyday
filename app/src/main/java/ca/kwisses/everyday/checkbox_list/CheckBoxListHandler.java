package ca.kwisses.everyday.checkbox_list;

import android.view.View;
import android.widget.CheckBox;

import java.util.ArrayList;
import java.util.List;

import ca.kwisses.everyday.R;

import static android.view.View.INVISIBLE;
import static android.view.View.VISIBLE;

public class CheckBoxListHandler implements CheckBoxListContract.Handler {

    private View view;
    private List<CheckBox> checkBoxList;

    public CheckBoxListHandler(View view) {
        this.checkBoxList = new ArrayList<>();
        this.view = view;
    }

    @Override
    public void initCheckBoxList() {
        checkBoxList.add( (CheckBox) view.findViewById(R.id.checkBox1));
        checkBoxList.add( (CheckBox) view.findViewById(R.id.checkBox2));
        checkBoxList.add( (CheckBox) view.findViewById(R.id.checkBox3));
        checkBoxList.add( (CheckBox) view.findViewById(R.id.checkBox4));
        checkBoxList.add( (CheckBox) view.findViewById(R.id.checkBox5));
    }

    @Override
    public void setCheckBox(CheckBox checkBox, String text) {
        checkBox.setText(text);
        checkBox.setChecked(false);
        checkBox.setVisibility(VISIBLE);
    }

    @Override
    public void resetCheckbox(CheckBox checkBox) {
        checkBox.setText(null);
        checkBox.setChecked(false);
        checkBox.setVisibility(INVISIBLE);
    }

    @Override
    public CheckBox getNextInvisibleCheckBox() {
        for (CheckBox checkBox: checkBoxList) {
            if(checkBox.getVisibility() == INVISIBLE) {
                return checkBox;
            }
        }
        return null;
    }

    @Override
    public boolean taskExists(String task) {
        for (CheckBox checkBox: checkBoxList) {
            if(checkBox.getText().equals(task)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public boolean addTaskItemToList(String task) {
        CheckBox checkBox = getNextInvisibleCheckBox();
        if(checkBox != null) {
            setCheckBox(checkBox, task);
            return true;
        }
        return false;
    }

    @Override
    public boolean deleteTaskItemFromList(String task) {
        CheckBox checkBox = getCheckbox(task);
        if(checkBox != null) {
            resetCheckbox(checkBox);
            return true;
        }
        return false;
    }

    @Override
    public CheckBox getCheckbox(String task) {
        for (CheckBox checkBox: checkBoxList) {
            if(checkBox.getText().equals(task)) {
                return checkBox;
            }
        }
        return null;
    }

    @Override
    public List<CheckBox> getCheckBoxList() {
        return checkBoxList;
    }

    @Override
    public void setCheckBoxList(List<CheckBox> checkBoxList) {
        this.checkBoxList = checkBoxList;
    }

}
