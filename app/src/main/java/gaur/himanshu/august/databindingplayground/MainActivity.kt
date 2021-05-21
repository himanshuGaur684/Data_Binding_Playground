package gaur.himanshu.august.databindingplayground

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import gaur.himanshu.august.databindingplayground.databinding.ActivityMainBinding
import gaur.himanshu.august.databindingplayground.dynamicbinding.adapter.DynamicAdapter
import gaur.himanshu.august.databindingplayground.dynamicbinding.model.PatchEnum
import gaur.himanshu.august.databindingplayground.dynamicbinding.model.PatchModel


class MainActivity : AppCompatActivity() {


    lateinit var binding: ActivityMainBinding

    private val recyclerAdapter = DynamicAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)


        val list = mutableListOf<PatchModel>()

        initPatchModel(list)

        recyclerAdapter.setContentList(list)


        binding.recycler.apply {
            this.layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = recyclerAdapter
        }

    }

    fun initPatchModel(list: MutableList<PatchModel>) {
        list.add(PatchModel(PatchEnum.BLUE.name, PatchEnum.BLUE))
        list.add(PatchModel(PatchEnum.ORANGE.name, PatchEnum.ORANGE))
        list.add(PatchModel(PatchEnum.GREEN.name, PatchEnum.GREEN))
        list.add(PatchModel(PatchEnum.BLUE.name, PatchEnum.BLUE))
        list.add(PatchModel(PatchEnum.ORANGE.name, PatchEnum.ORANGE))
        list.add(PatchModel(PatchEnum.BLUE.name, PatchEnum.BLUE))
        list.add(PatchModel(PatchEnum.GREEN.name, PatchEnum.GREEN))
        list.add(PatchModel(PatchEnum.BLUE.name, PatchEnum.BLUE))

        list.add(PatchModel(PatchEnum.BLUE.name, PatchEnum.BLUE))
        list.add(PatchModel(PatchEnum.ORANGE.name, PatchEnum.ORANGE))
        list.add(PatchModel(PatchEnum.GREEN.name, PatchEnum.GREEN))
        list.add(PatchModel(PatchEnum.BLUE.name, PatchEnum.BLUE))
        list.add(PatchModel(PatchEnum.ORANGE.name, PatchEnum.ORANGE))
        list.add(PatchModel(PatchEnum.BLUE.name, PatchEnum.BLUE))
        list.add(PatchModel(PatchEnum.GREEN.name, PatchEnum.GREEN))
        list.add(PatchModel(PatchEnum.BLUE.name, PatchEnum.BLUE))


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