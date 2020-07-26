package com.example.android.warriornun;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class SharedViewModel extends ViewModel {
    private MutableLiveData<Nun> selected = new MutableLiveData<Nun>();

    public void select(Nun nun) {
        selected.setValue(nun);
    }

    /**
     * Use this to return the selected nun.
     * @return the selected Nun
     */
    public LiveData<Nun> getSelected() { return selected; }
}
