package org.d3if4048.myapplication



import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.NavDirections
import androidx.navigation.findNavController
import androidx.navigation.ui.NavigationUI
import org.d3if4048.myapplication.databinding.FragmentMainBinding


/**
 * A simple [Fragment] subclass.
 *
 */
class MainFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val binding: FragmentMainBinding = DataBindingUtil.inflate(inflater,R.layout.fragment_main,container,false)
        binding.btnPersegiP.setOnClickListener {v: View -> v.findNavController().navigate(R.id.action_mainFragment_to_persegiPanjangFragment)
        }
        binding.btnSegitiga.setOnClickListener { v: View -> v.findNavController().navigate(R.id.action_mainFragment_to_segitigaFragment) }


        return binding.root
    }


}
