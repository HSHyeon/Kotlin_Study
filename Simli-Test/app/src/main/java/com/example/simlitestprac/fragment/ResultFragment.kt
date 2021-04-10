package com.example.simlitestprac.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.example.simlitestprac.R
import kotlinx.android.synthetic.main.fragment_result.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [ResultFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class ResultFragment : Fragment() {

    var option = -1

    lateinit var navController: NavController

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        option = arguments?.getInt("index")?:-1

        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        navController= Navigation.findNavController(view)

        setResult(option)
        btn_home.setOnClickListener {
            navController.navigate(R.id.action_resultFragment_to_mainFragment)
        }
    }
    fun setResult(option:Int){
        when(option){
            1->{
                tv_main.text="빨간 단풍잎"
                iv_result.setImageResource(R.drawable.maple)
                tv_sub.text="에너지 넘치고 열정적인 사람"
            }
            2->{
                tv_main.text="노란 은행잎"
                iv_result.setImageResource(R.drawable.ginko)
                tv_sub.text="강한 의지의 노력형 인간"
            }
            3->{
                tv_main.text="나뭇잎 가지"
                iv_result.setImageResource(R.drawable.branch)
                tv_sub.text="부드러운 마음의 소유자"
            }
            4->{
                tv_main.text="플라타너스 잎"
                iv_result.setImageResource(R.drawable.plata)
                tv_sub.text="섬세한 성격의 소유자"
            }
        }
    }

}