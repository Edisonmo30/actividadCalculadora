package com.example.calculadora;

public class Calculadora {
    //Método sobrecargado para sumas dos números enteros
    public float sumar(float a, float b){

        return a + b;
    }

    //Método sobrecargado para sumar tres números enteros
    public float sumar(float a, float b, float c){

        return a + b + c;
    }

    //Método sobrecargado para sumar una lista de números enteros
    public float sumar(float[] numeros){
        int sumaTotal = 0;
        for(float numero: numeros) {
                sumaTotal += numero;
        }
        return sumaTotal;
    }

    //Método sobrecargado para restar dos números enteros
    public float restar(float a, float b){

        return a - b;
    }

    //Método sobrecargado para restar tres números enteros
    public float restar(float a, float b, float c){

        return a - b - c;
    }

    //Método sobrecargado para restar una lista de números enteros
    public float restar(float[] numeros){
        float restaTotal = 0;
        for(float numero: numeros) {
            restaTotal += numero;
        }
        return restaTotal;
    }

    //Método sobrecargado para multiplicar dos números enteros
    public float multiplicar(float a, float b){

        return a * b;
    }

    //Método sobrecargado para multiplicar tres números enteros
    public float multiplicar(float a, float b, float c){

        return a * b * c;
    }

    //Método sobrecargado para multiplicar una lista de números enteros
    public float multiplicar(float[] numeros){
        float multiplicacionTotal = 0;
        for(float numero: numeros) {
            multiplicacionTotal += numero;
        }
        return multiplicacionTotal;
    }

    //Método sobrecargado para dividir dos números enteros
    public float dividir(float a, float b){

        return a / b;
    }

    //Método sobrecargado para dividir una lista de números enteros
    public float dividir(float[] numeros){
        float divisionTotal = 0;
        for(float numero: numeros) {
            divisionTotal += numero;
        }
        return divisionTotal;
    }

    }
