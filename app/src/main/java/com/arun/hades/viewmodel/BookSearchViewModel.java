package com.arun.hades.viewmodel;


import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import org.jetbrains.annotations.NotNull;


public class BookSearchViewModel extends ViewModel implements Observable {
    @Bindable
    @NotNull
    public MutableLiveData<String> bookName;
    @Bindable
    @NotNull
    public   MutableLiveData<String> authorName;

    @Bindable
    @NotNull
    public   MutableLiveData<String> searchButtonText;

    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }
    public BookSearchViewModel(){
        this.searchButtonText=new  MutableLiveData<>();

        this.searchButtonText.setValue("Search");
    }
    // TODO: Implement the ViewModel

    public final void  doSearch(){
        System.out.println("#######################################" );

    }
}