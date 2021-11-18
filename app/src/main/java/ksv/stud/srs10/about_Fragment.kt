package ksv.stud.srs10

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button

class about_Fragment : Fragment() {
    private lateinit var backBtn:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_about, container, false)
        backBtn = view.findViewById(R.id.go_back)
        val contactsFragment= contacts_Fragment()
        backBtn.setOnClickListener {
            activity?.supportFragmentManager
                ?.beginTransaction()
                ?.replace(R.id.fragment_container_view,contactsFragment)
                ?.commit()
        }
        return view
    }


}