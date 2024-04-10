package ufg.edu.sv.fis.amb0.angieespinoza

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.google.android.material.bottomnavigation.BottomNavigationItemView
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    lateinit var navegacion : BottomNavigationView
    private val opcionMenuSeleccionado = BottomNavigationView.OnNavigationItemSelectedListener{
        item -> when(item.itemId){
            R.id.fragmento->{
                supportFragmentManager.commit {
                    replace<primer_fragmento>(R.id.fragment_container_view)
                    setReorderingAllowed(true)
                    addToBackStack("replacement")
                }
                return@OnNavigationItemSelectedListener true
            }
             R.id.fragmento2->{
            supportFragmentManager.commit {
                replace<segundo_fragmento>(R.id.fragment_container_view)
                setReorderingAllowed(true)
                addToBackStack("replacement")
            }
            return@OnNavigationItemSelectedListener true
        }
             R.id.fragmento3->{
            supportFragmentManager.commit {
                replace<tercer_fragmento>(R.id.fragment_container_view)
                setReorderingAllowed(true)
                addToBackStack("replacement")
            }
            return@OnNavigationItemSelectedListener true
        }
            R.id.fragmento4->{
            supportFragmentManager.commit {
                replace<cuarto_fragmento>(R.id.fragment_container_view)
                setReorderingAllowed(true)
                addToBackStack("replacement")
            }
            return@OnNavigationItemSelectedListener true
        }
    }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.commit {
            replace<primer_fragmento>(R.id.fragment_container_view)
            setReorderingAllowed(true)
            addToBackStack("replacement")
        }

        navegacion = findViewById(R.id.nav_menu)
        navegacion.setOnNavigationItemSelectedListener(opcionMenuSeleccionado)

    }
}