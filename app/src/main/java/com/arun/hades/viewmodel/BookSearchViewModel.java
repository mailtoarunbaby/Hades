package com.arun.hades.viewmodel;


import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.jetbrains.annotations.NotNull;


public class BookSearchViewModel extends ViewModel implements Observable {
    @Bindable
    @NotNull
    public MutableLiveData<String> inputName;
    @Bindable
    @NotNull
    public   MutableLiveData<String> inputEmail;

    @Bindable
    @NotNull
    public   MutableLiveData<String> saveButtonText;

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }
    // TODO: Implement the ViewModel
}