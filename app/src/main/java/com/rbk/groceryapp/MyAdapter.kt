package com.rbk.groceryapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView

/* adapter acts like bridge between data source and recycler UI component */
class MyAdapter(val itemsList:ArrayList<ItemModel>):RecyclerView.Adapter<MyAdapter.MyVievHolder>()  {



    /* ViewHolder hold references to the view for single item in the recyclerview */
    /* itemView represents root view for single item in RV        */

    inner class MyVievHolder(itemView: View):RecyclerView.ViewHolder(itemView) {

        var itemImg:ImageView
        var itemTitle:TextView
        var itemDesc:TextView
        init {
            itemImg=itemView.findViewById(R.id.imageView)
            itemTitle=itemView.findViewById(R.id.title_text)
            itemDesc=itemView.findViewById(R.id.description_text)

            itemView.setOnClickListener {
                Toast.makeText(itemView.context,"You Chosen ${itemsList[position].name}",Toast.LENGTH_LONG).show()
            }
        }
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyVievHolder {
        /*called when RV Needs a new viewholder Instance*/
        /*inflating the layout for single item and returning a new ViewHolder*/
        /*ViewGroup is the parent view that the new view will be attached to after its bound to it's data*/
        /*viewType:in many cases you might have only one type of view used to distinguish between view types*/

/*        instantiating layout file */
        val v =LayoutInflater.from(parent.context)
            .inflate(R.layout.recylerview_item,parent,false)

        return MyVievHolder(v)
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    override fun onBindViewHolder(holder: MyVievHolder, position: Int) {
 /*       TODO("Bind data to the ViewHolder to the specific position")*/

        holder.itemTitle.setText(itemsList[position].name)
        holder.itemDesc.setText(itemsList[position].desc)
        holder.itemImg.setImageResource(itemsList[position].img)
    }
}