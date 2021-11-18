package ksv.stud.srs10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class contacts_Fragment : Fragment() {
private lateinit var aboutBtn : Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
       val view = inflater.inflate(R.layout.fragment_contacts_, container, false)
        aboutBtn = view.findViewById(R.id.about_btn)
        val aboutFragment= about_Fragment()
        aboutBtn.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container_view,aboutFragment)
                ?.commit()
        }
        return view
    }


}