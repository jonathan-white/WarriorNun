package com.example.android.warriornun;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;


public class NunViewModel extends ViewModel {
    private MutableLiveData<Nun> selected = new MutableLiveData<Nun>();

    public void select(Nun nun) {
        selected.setValue(nun);
    }

    /**
     * Use this to return the selected nun.
     * @return the selected Nun
     */
    public LiveData<Nun> getSelected() { return selected; }

    /**
     *
     * @return the resource ID for the nun's name
     */
    public int getName() {
        return selected.getValue().getName();
    }

    /**
     *
     * @return the resource ID for the nun's poster image
     */
    public int getPosterImage() {
        return selected.getValue().getMainImage();
    }

    /**
     * The Header Image appears on the Nun's bio page
     *
     * @return the resource ID for the nun's header image
     */
    public int getHeaderImage() {
        return selected.getValue().getHeaderImage();
    }

    /**
     *
     * @return the resource ID for the nun's summary text
     */
    public int getBio() {
        return selected.getValue().getSummary();
    }
}
