package gaur.himanshu.august.databindingplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import gaur.himanshu.august.databindingplayground.databinding.ActivityMainBinding
import gaur.himanshu.august.databindingplayground.recycler.DataBindingRecyclerAdapter


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    private val recyclerAdapter = DataBindingRecyclerAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val list = mutableListOf<String>()

        init(list)

        recyclerAdapter.setContentList(list)


        binding.recycler.apply {
            this.layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = recyclerAdapter
        }

    }

    fun init(list: MutableList<String>) {
        list.add("First")
        list.add("Second")
        list.add("Third")
        list.add("Fourth")
        list.add("Fifth")
        list.add("Sixth")

        list.add("First")
        list.add("Second")
        list.add("Third")
        list.add("Fourth")
        list.add("Fifth")
        list.add("Sixth")

        list.add("First")
        list.add("Second")
        list.add("Third")
        list.add("Fourth")
        list.add("Fifth")
        list.add("Sixth")

    }
}