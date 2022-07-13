package com.gabo.editprofiledesign.adapter


import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.view.isVisible
import androidx.recyclerview.widget.RecyclerView
import com.gabo.editprofiledesign.databinding.EditProfileItemBinding
import com.gabo.editprofiledesign.model.EditProfileItem

class EditProfileAdapter() :
    RecyclerView.Adapter<EditProfileAdapter.EditProfileVH>() {
    private var list: List<EditProfileItem> = emptyList()

    @SuppressLint("NotifyDataSetChanged")
    fun submitList(list: List<EditProfileItem>) {
        this.list = list
        notifyDataSetChanged()
    }

    inner class EditProfileVH(binding: EditProfileItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        private val img = binding.ivProfileMenuItemIcon
        private val txtItem = binding.tvProfileMenuItemText
        private val arrowForward = binding.ivArrowForward
        private val switch = binding.swtch
        private val txtLanguage = binding.tvLanguage
        fun bind(model: EditProfileItem) {
            img.setImageResource(model.img)
            txtItem.text = model.itemName
            if(model.isArrowForwardVisible){arrowForward.isVisible =true }
            if (model.isSwitchVisible){switch.isVisible = true}
            if (model.isLanguageVisible){txtLanguage.isVisible = true}
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): EditProfileVH {
        val binding =
            EditProfileItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return EditProfileVH(binding)
    }

    override fun onBindViewHolder(holder: EditProfileVH, position: Int) {
        val item = list[position]
        holder.bind(item)
    }

    override fun getItemCount(): Int = list.size
}