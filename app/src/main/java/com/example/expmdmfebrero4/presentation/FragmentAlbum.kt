package com.example.expmdmfebrero4.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero4.R
import com.example.expmdmfebrero4.data.Mockalbum
import com.example.expmdmfebrero4.presentation.adapter.AlbumAdapter

class AlbumFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_album, container, false)
        val mockAlbums = Mockalbum()
        val albums = mockAlbums.invoke()
        val recyclerView: RecyclerView = view.findViewById(R.id.recyclerView)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())
        recyclerView.adapter = AlbumAdapter(albums)

        return view
    }
}