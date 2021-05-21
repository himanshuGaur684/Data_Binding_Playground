package gaur.himanshu.august.databindingplayground.dynamicbinding.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.ViewDataBinding
import androidx.recyclerview.widget.RecyclerView
import gaur.himanshu.august.databindingplayground.databinding.ViewHolderBlueBinding
import gaur.himanshu.august.databindingplayground.databinding.ViewHolderGreenBinding
import gaur.himanshu.august.databindingplayground.databinding.ViewHolderOrangeBinding
import gaur.himanshu.august.databindingplayground.dynamicbinding.model.PatchEnum
import gaur.himanshu.august.databindingplayground.dynamicbinding.model.PatchModel


const val BLUE = 0
const val GREEN = 1
const val ORANGE = 2

class DynamicAdapter : RecyclerView.Adapter<DynamicAdapter.MyViewHolder>() {


    var list = mutableListOf<PatchModel>()

    fun setContentList(list: List<PatchModel>) {
        this.list = list.toMutableList()
        notifyDataSetChanged()
    }

    inner class MyViewHolder(val viewDataBinding: ViewDataBinding?) :
        RecyclerView.ViewHolder(viewDataBinding?.root!!)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DynamicAdapter.MyViewHolder {

        return when (viewType) {
            BLUE -> {
                val binding = ViewHolderBlueBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                MyViewHolder(binding)

            }
            GREEN -> {
                val binding = ViewHolderGreenBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                MyViewHolder(binding)
            }
            ORANGE -> {
                val binding = ViewHolderOrangeBinding.inflate(
                    LayoutInflater.from(parent.context),
                    parent,
                    false
                )
                MyViewHolder(binding)
            }
            else -> {
                MyViewHolder(null)
            }
        }

    }

    override fun getItemCount(): Int {
        return this.list.size
    }

    override fun onBindViewHolder(holder: DynamicAdapter.MyViewHolder, position: Int) {

        if (list[position].patchEnum == PatchEnum.ORANGE) {
            (holder.viewDataBinding as ViewHolderOrangeBinding).text = list[position].text
        }
        if (list[position].patchEnum == PatchEnum.GREEN) {
            (holder.viewDataBinding as ViewHolderGreenBinding).text = list[position].text
        }
        if (list[position].patchEnum == PatchEnum.BLUE) {
            (holder.viewDataBinding as ViewHolderBlueBinding).text = list[position].text

        }

    }

    override fun getItemViewType(position: Int): Int {

        return when (list[position].patchEnum) {
            PatchEnum.BLUE -> {
                BLUE
            }
            PatchEnum.GREEN -> {
                GREEN
            }
            PatchEnum.ORANGE -> {
                ORANGE
            }
            else -> {
                super.getItemViewType(position)
            }
        }
    }
}