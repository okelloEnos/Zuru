package com.okellosoftwarez.zurutest.ui.host;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class HostViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public HostViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is host fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}

