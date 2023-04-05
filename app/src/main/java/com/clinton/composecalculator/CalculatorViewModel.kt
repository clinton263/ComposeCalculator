package com.clinton.composecalculator

import androidx.lifecycle.ViewModel

class CalculatorViewModel:ViewModel() {
    var state by mutableSetOf(CalculatorState())
    private set

    fun onAction(action: CalculatorAction){
        when(action){
            is  CalculatorAction.Number -> enterNumber(action.number)
            is  CalculatorAction.Decimal -> enterDecimal()
            is  CalculatorAction.Clear -> state = CalculatorState()
            is  CalculatorAction.Operation -> enterOperation(action.operation)
            is CalculatorAction.Calculate -> performCalculation()
            is CalculatorAction.Delete -> performDeletion()

        }

    }  private  fun performDeletion(){

    }
    private  fun performCalculation(){

    }
    private  fun enterOperation(operation: CalculatorOperation)


    }
    private  fun enterDecimal(){

    }

    private  fun enterNumber(number: Int){

    }

}