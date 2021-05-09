package com.example.loginactivity.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Fact(@StringRes val titleStringResourceId: Int, @StringRes val factStringResourceId: Int, @DrawableRes val imageResourceId: Int ) {
}