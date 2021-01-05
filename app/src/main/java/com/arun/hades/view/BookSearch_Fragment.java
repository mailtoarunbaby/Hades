package com.arun.hades.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.arun.hades.viewmodel.BookSearchViewModel;
import com.arun.hades.R;

public  class BookSearch_Fragment extends Fragment {


    private BookSearchViewModel mViewModel;

    //public static BookSearch_Fragment newInstance() { return new BookSearch_Fragment(); }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
        mViewModel = new ViewModelProvider(this).get(BookSearchViewModel.class);
        ViewDataBinding  binding = DataBindingUtil.inflate(inflater, R.layout.booksearch__fragment, container, false);
        binding.set(mViewModel);


        binding.setLifecycleOwner(this);


        return binding.getRoot();

    }


}