package com.example.expmdmfebrero4.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero.presentation.adapter.SetaAdapter
import com.example.expmdmfebrero4.R
import com.example.expmdmfebrero4.data.MockSetas

class FragmentSetas : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_seta, container, false)
        val mockSetas = MockSetas()
        val setas = mockSetas.invoke()
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = SetaAdapter(setas)


        return view
    }
}