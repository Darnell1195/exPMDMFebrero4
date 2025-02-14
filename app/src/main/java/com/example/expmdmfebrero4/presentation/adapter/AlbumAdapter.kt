package com.example.expmdmfebrero4.presentation.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.expmdmfebrero4.R
import com.example.expmdmfebrero4.domain.Album

class AlbumAdapter(private val albums: List<Album>) : RecyclerView.Adapter<AlbumAdapter.AlbumViewHolder>() {

    private val favoriteAlbums = mutableListOf<Album>()

    class AlbumViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val nameTextView: TextView = view.findViewById(R.id.name_album)
        val dateTextView: TextView = view.findViewById(R.id.date_album)
        val descriptionTextView: TextView = view.findViewById(R.id.description_album)
        val bookmarkButton: View = view.findViewById(R.id.bookmark_button)
        val imageAlbum: View = view.findViewById(R.id.image_album)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlbumViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.view_item_album, parent, false)
        return AlbumViewHolder(view)
    }

    override fun onBindViewHolder(holder: AlbumViewHolder, position: Int) {
        val album = albums[position]
        holder.nameTextView.text = album.name
        holder.dateTextView.text = album.date
        holder.descriptionTextView.text = album.description

        holder.bookmarkButton.setOnClickListener {
            if (favoriteAlbums.contains(album)) {
                favoriteAlbums.remove(album)
                Log.d("AlbumAdapter", "Removed from favorites: ${album.name}")
            } else {
                favoriteAlbums.add(album)
                Log.d("AlbumAdapter", "Added to favorites: ${album.name}")
            }
            Log.d("AlbumAdapter", "Current favorites: ${favoriteAlbums.map { it.name }}")
        }
    }

    override fun getItemCount(): Int = albums.size
}