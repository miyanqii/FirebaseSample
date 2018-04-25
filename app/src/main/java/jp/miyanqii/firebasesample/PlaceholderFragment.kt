package jp.miyanqii.firebasesample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.LinearLayoutManager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import jp.miyanqii.firebasesample.model.entity.Content
import jp.miyanqii.firebasesample.model.entity.ContentCategory
import kotlinx.android.synthetic.main.fragment_main2.view.*
import org.threeten.bp.LocalDateTime

class PlaceholderFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater,
                              container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {

        val rootView = inflater.inflate(R.layout.fragment_main2, container, false)

        val contents = listOf(
                Content(
                        id = "1",
                        title = "Title1",
                        description = "Description1",
                        order = 1,
                        author = "miyaki",
                        created = LocalDateTime.now(),
                        images = emptyList(),
                        category = ContentCategory(
                                id = "1",
                                name = "cat1",
                                order = 1)
                )
        )

        rootView.recycler.adapter = ContentListRecyclerAdapter(contents)
        rootView.recycler.layoutManager = LinearLayoutManager(rootView.context)


        //TODO SETUP RECYCLER


        return rootView
    }

    companion object {
        private val ARG_SECTION_NUMBER = "section_number"

        fun newInstance(sectionNumber: Int): PlaceholderFragment {
            val fragment = PlaceholderFragment()
            val args = Bundle()
            args.putInt(ARG_SECTION_NUMBER, sectionNumber)
            fragment.arguments = args
            return fragment
        }
    }
}