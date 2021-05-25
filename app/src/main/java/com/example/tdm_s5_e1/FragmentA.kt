package com.example.tdm_s5_e1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.td4_exo4.DataProvider
import com.example.td4_exo4.LessonAdapter


class FragmentA : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val rootView = inflater.inflate(R.layout.fragment_a, container, false)

        setupRecyclerView(rootView)

        return rootView
    }

    private fun setupRecyclerView(rootView: View?) {
        val recyclerView = rootView!!.findViewById(R.id.lessonList) as RecyclerView

        val adapter = LessonAdapter(context, DataProvider.data)
        recyclerView.adapter = adapter

        val manager = GridLayoutManager(activity,

            resources.getInteger(R.integer.num))
        manager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = manager
    }
}