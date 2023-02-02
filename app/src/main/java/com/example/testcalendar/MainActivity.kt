package com.example.testcalendar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.applandeo.materialcalendarview.EventDay
import com.applandeo.materialcalendarview.listeners.OnDayClickListener
import com.applandeo.materialcalendarview.listeners.OnSelectDateListener
import com.example.testcalendar.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity(), OnDayClickListener, OnSelectDateListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.calendarView.setOnDayClickListener(this)
    }

    override fun onDayClick(eventDay: EventDay) {
        val event = eventDay.calendar.time.toString()
        val toast: Toast = Toast.makeText(applicationContext, event, Toast.LENGTH_SHORT)
        toast.show()

    }

    override fun onSelect(calendar: List<Calendar>) {
        TODO("Not yet implemented")
    }
}