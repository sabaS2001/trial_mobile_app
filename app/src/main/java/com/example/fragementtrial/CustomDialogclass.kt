package com.example.fragementtrial

import android.os.Bundle
import android.view.View
import android.widget.RadioGroup
import android.widget.Toast
import android.widget.*
import androidx.fragment.app.DialogFragment

class CustomDialogclass: DialogFragment(R.layout.fragment_custom_dialog) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val cancel :Button = view.findViewById(R.id.cancelBT)
        val submit: Button = view.findViewById(R.id.sumbitBT)
        val radioGroup = view.findViewById<RadioGroup>(R.id.RatingRadioGroup)
        cancel.setOnClickListener{
            dismiss()
        }
        submit.setOnClickListener{
            val selectedOption:Int = radioGroup.checkedRadioButtonId
            val radioButton = view.findViewById<RadioButton>(selectedOption)
            Toast.makeText(context,radioButton.text, Toast.LENGTH_SHORT).show()
            val m1:MainActivity = getActivity() as MainActivity
            m1.receiveFeedback(radioButton.text.toString())
            dismiss()
        }
    }
}