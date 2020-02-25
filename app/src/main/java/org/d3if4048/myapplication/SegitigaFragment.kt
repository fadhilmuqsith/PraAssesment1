package org.d3if4048.myapplication


import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import kotlinx.android.synthetic.main.fragment_persegi_panjang.*
import org.d3if4048.myapplication.databinding.FragmentPersegiPanjangBinding
import org.d3if4048.myapplication.databinding.FragmentSegitigaBinding
import kotlin.math.sqrt


/**
 * A simple [Fragment] subclass.
 *
 */
class SegitigaFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding = DataBindingUtil.inflate<FragmentSegitigaBinding>(inflater,R.layout.fragment_segitiga,container,false)

        binding.btnHitung.setOnClickListener {
            if (binding.etTinggi.text.isNotEmpty() and binding.etAlas.text.isNotEmpty() ){
                var alas = binding.etAlas.text.toString()
                var tinggi = binding.etTinggi.text.toString()


                var luas = alas.toInt() * tinggi.toInt() / 2
                var sisiMiring1 = (alas.toInt() * alas.toInt()) + (tinggi.toInt()  * tinggi.toInt())
                var sisiMiring = sqrt(sisiMiring1.toDouble())
                var keliling = alas.toInt() + tinggi.toInt() + sisiMiring.toInt()
                Log.i("Test",luas.toString())

                binding.tvLuas.text = luas.toString()
                binding.tvKeliling.text = keliling.toString()
            }

        }

        if (savedInstanceState != null){
            binding.tvKeliling.text =savedInstanceState.getString("keliling").toString()
            binding.tvLuas.text =savedInstanceState.getString("luas").toString()

        }
        return binding.root

    }

    override fun onSaveInstanceState(outState: Bundle) {

        outState.putString("keliling",tv_keliling.text.toString())
        outState.putString("luas",tv_luas.text.toString())
        super.onSaveInstanceState(outState)
    }
}
