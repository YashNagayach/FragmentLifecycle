package com.example.fragmentlifecycle

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction

class MainActivity : AppCompatActivity() {
    companion object {
        val TAG = "Taskkk"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(TAG, "MainActivity onCreate")

        val addFragmentButton1 = findViewById<Button>(R.id.addFragmentButton1)
        val addFragmentButton2 = findViewById<Button>(R.id.addFragmentButton2)
        val addFragmentButton3 = findViewById<Button>(R.id.addFragmentButton3)

        addFragmentButton1.setOnClickListener {
            // Add a new instance of Fragment1 to the fragment_container
            val fragment1: Fragment = Fragment1() // Import the correct Fragment class
            val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment1)
            transaction.addToBackStack(null) // Add to back stack
            transaction.commit()
        }

        addFragmentButton2.setOnClickListener {
            // Add a new instance of Fragment1 to the fragment_container
            val fragment2: Fragment = Fragment2() // Import the correct Fragment class
            val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment2)
            transaction.addToBackStack(null) // Add to back stack
            transaction.commit()
        }

        addFragmentButton3.setOnClickListener {
            // Add a new instance of Fragment1 to the fragment_container
            val fragment3: Fragment = Fragment3() // Import the correct Fragment class
            val transaction: FragmentTransaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment3)
            transaction.addToBackStack(null) // Add to back stack
            transaction.commit()
        }
    }

    override fun onBackPressed() {
        if (fragmentManager.backStackEntryCount > 0) {
            fragmentManager.popBackStack()
        } else {
            super.onBackPressed()
        }
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "MainActivity onRestart")
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "MainActivity onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "MainActivity onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "MainActivity onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "MainActivity onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "MainActivity onDestroy")
    }
}