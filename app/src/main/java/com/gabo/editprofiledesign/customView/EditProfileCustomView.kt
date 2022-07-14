package com.gabo.editprofiledesign.customView

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import androidx.annotation.Nullable
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import androidx.core.view.isVisible
import com.gabo.editprofiledesign.R
import com.gabo.editprofiledesign.databinding.CustomViewEditProfileBinding

class EditProfileCustomView(context: Context, @Nullable attrs: AttributeSet) :
    ConstraintLayout(context, attrs) {

    private val binding =
        CustomViewEditProfileBinding.inflate(LayoutInflater.from(context), this, true)

    init {
        with(binding) {
            val imageView = ivProfileMenuItemIcon
            val nameText = tvProfileMenuItemText
            val languageText = tvLanguage
            val switch = swtch
            val arrowForward = ivArrowForward

            val typedArray =
                context.theme.obtainStyledAttributes(attrs, R.styleable.EditProfileItem, 0, 0)

            try{
                with(typedArray){
                    val imageDrawable = getDrawable(R.styleable.EditProfileItem_setImageDrawable)
                    val name = getText(R.styleable.EditProfileItem_setName)
                    val nameColor = getColor(R.styleable.EditProfileItem_setNameColor,ContextCompat.getColor(this@EditProfileCustomView.context,R.color.white))
                    val languageTextVisibility = getBoolean(R.styleable.EditProfileItem_setLanguageTextVisible,false)
                    val switchVisibility = getBoolean(R.styleable.EditProfileItem_setSwitchVisible,false)
                    val arrowVisibility = getBoolean(R.styleable.EditProfileItem_setArrowForwardVisible,false)

                    imageView.setImageDrawable(imageDrawable)
                    nameText.text = name
                    nameText.setTextColor(nameColor)
                    languageText.isVisible = languageTextVisibility
                    switch.isVisible = switchVisibility
                    arrowForward.isVisible = arrowVisibility
                }
            } finally {
                typedArray.recycle()
            }

        }
    }
}