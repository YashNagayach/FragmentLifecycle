package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentlifecycle.MainActivity.Companion.TAG

class Fragment3 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Fragment3 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "Fragment3 onCreateView")
        return inflater.inflate(R.layout.fragment3, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "Fragment3 onAttach")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "Fragment3 onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Fragment3 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Fragment3 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Fragment3 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Fragment3 onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "Fragment3 onDestroyView")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "Fragment3 onDetach")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Fragment3 onDestroy")
    }
}