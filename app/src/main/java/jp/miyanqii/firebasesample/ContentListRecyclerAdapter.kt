package jp.miyanqii.firebasesample

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import jp.miyanqii.firebasesample.model.entity.Content

class ContentListRecyclerAdapter(var contents: List<Content>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        
        val v = LayoutInflater
                .from(parent.context)
                .inflate(R.layout.card_contents, parent, false)

        return ContentViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {

        val content = contents.get(position)
        val contentViewHolder = viewHolder as ContentViewHolder

        contentViewHolder.apply {
            title.text = content.title
            date.text = content.created.toStringForDisplay()

            //TODO Set thumbnail

        }

    }

    override fun getItemCount(): Int = contents.size


    class ContentViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        val thumbnail: ImageView = itemView.findViewById(R.id.thumbnail)
        val title: TextView = itemView.findViewById(R.id.title)
        val date: TextView = itemView.findViewById(R.id.date)
    }
}