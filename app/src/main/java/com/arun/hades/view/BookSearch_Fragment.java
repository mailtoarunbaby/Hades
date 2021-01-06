package com.arun.hades.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.databinding.BindingAdapter;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.ViewModelProvider;

import com.arun.hades.viewmodel.BookSearchViewModel;
import com.arun.hades.R;

public  class BookSearch_Fragment extends Fragment {


    private BookSearchViewModel mViewModel;
    private ViewDataBinding binding;

    public static BookSearch_Fragment newInstance() { return new BookSearch_Fragment(); }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        mViewModel = new ViewModelProvider(this).get(BookSearchViewModel.class);
        super.onCreate(savedInstanceState);


    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
         super.onCreateView(inflater, container, savedInstanceState);
         binding = DataBindingUtil.inflate(inflater, R.layout.booksearch__fragment, container, false);
        //binding.setLifecycleOwner(this);
        binding.bookSearchViewmodel=mViewModel;

        return binding.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


    }
}