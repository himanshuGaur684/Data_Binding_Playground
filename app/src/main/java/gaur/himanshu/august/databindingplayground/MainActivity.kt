package gaur.himanshu.august.databindingplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import gaur.himanshu.august.databindingplayground.databinding.ActivityMainBinding
import gaur.himanshu.august.databindingplayground.model.Car


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.tv1Text = "Data Binding Play"


        val car = Car("Ford", 123)

        binding.car = car


    }


}