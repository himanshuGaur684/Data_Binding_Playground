package gaur.himanshu.august.databindingplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import gaur.himanshu.august.databindingplayground.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        binding.url =
            "http://3.bp.blogspot.com/-7-KmADvPxkY/UgitVrQvgiI/AAAAAAAAASo/lgZiaL6RfnY/s1600/Android+OS+for+Smartphone+Download+Free.jpg"

    }
}