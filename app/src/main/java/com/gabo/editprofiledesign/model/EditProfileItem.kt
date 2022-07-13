package com.gabo.editprofiledesign.model

data class EditProfileItem(
    val img: Int,
    val itemName: String,
    val itemNameColor: Int,
    val isLanguageVisible: Boolean ,
    val isSwitchVisible: Boolean,
    val isArrowForwardVisible: Boolean
)