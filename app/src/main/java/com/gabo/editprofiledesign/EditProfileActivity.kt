package com.gabo.editprofiledesign

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.gabo.editprofiledesign.adapter.EditProfileAdapter
import com.gabo.editprofiledesign.databinding.ActivityEditProfileBinding
import com.gabo.editprofiledesign.model.EditProfileItem
import com.gabo.editprofiledesign.provider.EditProfileListProvider.getList

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
}