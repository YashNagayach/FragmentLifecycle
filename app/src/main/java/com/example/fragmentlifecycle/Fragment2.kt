package com.example.fragmentlifecycle

import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentlifecycle.MainActivity.Companion.TAG

class Fragment2 : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "Fragment2 onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        Log.d(TAG, "Fragment2 onCreateView")
        return inflater.inflate(R.layout.fragment2, container, false)
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "Fragment2 onAttach")

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "Fragment2 onViewCreated")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "Fragment2 onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "Fragment2 onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "Fragment2 onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "Fragment2 onStop")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "Fragment2 onDestroyView")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "Fragment2 onDetach")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "Fragment2 onDestroy")
    }
}