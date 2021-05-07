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


        binding.placeholder = R.drawable.ic_placeholder
        binding.error = R.drawable.ic_error

        binding.url =
            "http://1.bp.blogspot.com/-B0WT_f1kqL8/Ub0pQUt9h7I/AAAAAAAAAn8/byzZbyzOyQ8/s1600/nexussamsungkindlefire.jpg"

    }
}