package com.arun.hades.viewmodel;


import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.arun.hades.repository.BookRepository;
import com.arun.hades.response.VolumesResponse;

import org.jetbrains.annotations.NotNull;


public class BookSearchViewModel extends ViewModel {
    private BookRepository bookRepository;
    private LiveData<VolumesResponse> volumesResponseLiveData;

//    public BookSearchViewModel(@NonNull Application application) {
//        super(application);
//    }

    public void init() {
        bookRepository = new BookRepository();
        volumesResponseLiveData = bookRepository.getVolumesResponseLiveData();
    }

    public void searchVolumes(String keyword, String author) {
        bookRepository.searchVolumes(keyword, author);
    }

    public LiveData<VolumesResponse> getVolumesResponseLiveData() {
        return volumesResponseLiveData;
    }
}