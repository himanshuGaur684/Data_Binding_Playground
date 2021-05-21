package gaur.himanshu.august.databindingplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import gaur.himanshu.august.databindingplayground.databinding.ActivityMainBinding
import gaur.himanshu.august.databindingplayground.dynamicbinding.adapter.DynamicAdapter
import gaur.himanshu.august.databindingplayground.viewmodel.CarViewModel


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding


    private val recyclerAdapter = DynamicAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val viewModel: CarViewModel = ViewModelProvider(this).get(CarViewModel::class.java)

        binding.viewModel = viewModel


    }


}