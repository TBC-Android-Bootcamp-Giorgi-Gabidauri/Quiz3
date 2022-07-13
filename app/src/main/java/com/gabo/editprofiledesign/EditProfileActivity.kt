package com.gabo.editprofiledesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gabo.editprofiledesign.adapter.EditProfileAdapter
import com.gabo.editprofiledesign.databinding.ActivityEditProfileBinding
import com.gabo.editprofiledesign.model.EditProfileItem

class EditProfileActivity : AppCompatActivity() {
    private lateinit var binding: ActivityEditProfileBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityEditProfileBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val editProfileAdapter = EditProfileAdapter()
        binding.rv.adapter = editProfileAdapter
        binding.rv.layoutManager = LinearLayoutManager(this)

        editProfileAdapter.submitList(getList())

    }

    private fun getList(): List<EditProfileItem> {
        return listOf(
            EditProfileItem(R.drawable.ic_arrow_forward, "Edit Profile",R.color.white, false, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "Address",R.color.white, false, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "Notification",R.color.white, false, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "Payment",R.color.white, false, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "Security",R.color.white, false, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "Language",R.color.white, true, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "Dark Mode",R.color.white, false, true, false),
            EditProfileItem(R.drawable.ic_arrow_forward, "Privacy Policy",R.color.white, false, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "Help Center",R.color.white, false, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "Invite Friends",R.color.white, false, false, true),
            EditProfileItem(R.drawable.ic_arrow_forward, "log out",R.color.red, false, false, true)
        )
    }

}