package com.technource.android.ui.loginModule

import androidx.lifecycle.MutableLiveData
import com.technource.android.base.BaseViewModel
import com.technource.android.network.ApiService
import com.technource.android.utils.ValidationStatus
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor() :
    BaseViewModel<LoginNavigator>() {

    var restaurantCodeValidationStatus = MutableLiveData<ValidationStatus>()
    var identifierValidationStatus = MutableLiveData<ValidationStatus>()
    var pinCodeValidationStatus = MutableLiveData<ValidationStatus>()

    fun onLoginClicked() {
        getNavigator()!!.login()
    }
}