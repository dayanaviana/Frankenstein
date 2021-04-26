package com.b29.frankenstein.ui.common

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import io.reactivex.rxjava3.disposables.CompositeDisposable

class BaseViewModel : ViewModel() {
    val errorText = MutableLiveData<String>("")
    val disposables = CompositeDisposable()
}