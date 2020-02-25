package org.d3if4048.myapplication


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import org.d3if4048.myapplication.databinding.FragmentPersegiPanjangBinding


/**
 * A simple [Fragment] subclass.
 *
 */
class PersegiPanjangFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentPersegiPanjangBinding>(inflater,R.layout.fragment_persegi_panjang,container,false)




            binding.btnHitung.setOnClickListener {
                if (binding.etPanjang.text.isNotEmpty() and binding.etLebar.text.isNotEmpty() ){
                    var panjang = binding.etPanjang.text.toString()
                    var lebar = binding.etLebar.text.toString()


                    var luas = panjang.toInt() * lebar.toInt()
                    var keliling = 2 * (panjang.toInt() + lebar.toInt())
                    Log.i("Test",luas.toString())

                binding.tvLuas.text = luas.toString()
                binding.tvKeliling.text = keliling.toString()
            }
        }

        return binding.root

        

    }


}
