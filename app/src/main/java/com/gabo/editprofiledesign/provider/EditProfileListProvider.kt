package com.gabo.editprofiledesign.provider

import com.gabo.editprofiledesign.R
import com.gabo.editprofiledesign.model.EditProfileItem

object EditProfileListProvider {
    fun getList(): List<EditProfileItem> {
        return listOf(
            EditProfileItem(
                R.drawable.ic_baseline_person_24, "Edit Profile",
                R.color.white, false, false, true),
            EditProfileItem(
                R.drawable.ic_arrow_forward, "Address",
                R.color.white, false, false, true),
            EditProfileItem(
                R.drawable.ic_baseline_notifications_none_24, "Notification",
                R.color.white, false, false, true),
            EditProfileItem(
                R.drawable.ic_arrow_forward, "Payment",
                R.color.white, false, false, true),
            EditProfileItem(
                R.drawable.ic_arrow_forward, "Security",
                R.color.white, false, false, true),
            EditProfileItem(
                R.drawable.ic_arrow_forward, "Language",
                R.color.white, true, false, true),
            EditProfileItem(
                R.drawable.ic_arrow_forward, "Dark Mode",
                R.color.white, false, true, false),
            EditProfileItem(
                R.drawable.ic_arrow_forward, "Privacy Policy",
                R.color.white, false, false, true),
            EditProfileItem(
                R.drawable.ic_arrow_forward, "Help Center",
                R.color.white, false, false, true),
            EditProfileItem(
                R.drawable.ic_arrow_forward, "Invite Friends",
                R.color.white, false, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "log out", R.color.red, false, false, true)
        )
    }
}