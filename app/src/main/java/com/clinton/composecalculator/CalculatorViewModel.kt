package com.clinton.composecalculator

import androidx.lifecycle.ViewModel

class CalculatorViewModel:ViewModel() {
    var state by mutableSetOf(CalculatorState())
    private set

}