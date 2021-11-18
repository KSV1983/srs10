package ksv.stud.srs10

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomMenu = findViewById(R.id.bottomNavigationView)
        bottomMenu.setOnItemSelectedListener {item->
            var fragment:Fragment?=null
            when (item.itemId) {
                R.id.menu-> {
                    fragment = contacts_Fragment()
                }
                R.id.about-> {
                    fragment = about_Fragment()
                }
            }
            replaceFragment(fragment!!)
            true
        }


        val contacts_fragment = contacts_Fragment()
        supportFragmentManager
            .beginTransaction()
            .add(R.id.fragment_container_view, contacts_fragment)
            .commit()
    }

    private fun replaceFragment(fragmnt: Fragment) {
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.fragment_container_view, fragmnt)
            .addToBackStack(null)
            .commit()
    }
}