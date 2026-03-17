package com.mycompany.iteratorbasics1;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyMarvelCollection implements Iterable<Film> {
    private Film[] films;
    private int size;

    public MyMarvelCollection(Film[] initialArray) {
        // Si el arreglo viene con peliculas, se usa para inicializar la coleccion
        if (initialArray !=null && initialArray.length > 0){
            //Se crea un nuevo arreglo del mismo tamaño que el arreglo recibido
            films = new Film[initialArray.length];
            
             // Se copian manualmente los elementos del arreglo recibido al nuevo arreglo interno de la colección
            for (int i =0; i<initialArray.length; i++) {
                films[i] = initialArray[i];
            }
            size=initialArray.length; //tam igual a los elementos
        } else {
            films=new Film[10]; //si no hay pelisb se crea este arreglo con capcidad de 10 para agregar 
            size=0; //aun no hay nada
        }
    }

    public void add(Film film) {
 // Verifica si el arreglo ya esta lleno
        if (size==films.length) {
            resize(); //se crea uno mas grande
        }
        films[size]=film; //guardamos una nueva en la posicion disponible
        size++;
    }

    private void resize() {
//se crea un arreglo con el doble de capacidad
        Film[] newArray = new Film[films.length * 2];
//copiar las pelis del arreglo original a este que es mas grande
        for (int i =0; i <films.length; i++) {
            newArray[i]=films[i];
        }
//El arreglo interno ahora apunta al nuevo arreglo ampliado
        films=newArray;
    }

    @Override
    public Iterator<Film> iterator() {
        return new MyIterator(); // Devuelve un objeto Iterator que permitirá recorrer la coleccion
    }

    private class MyIterator implements Iterator<Film> {
        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < size; // Verifica si todavia hay elementos por recorrer
        }

        @Override
        public Film next() {
            if (!hasNext()) {
                throw new NoSuchElementException(); // se lanza una excepcion para indicar que ya no existe otro elemento
            }

            Film film = films[index]; // Se obtiene la pelicula en la posición actual del arreglo
            index++;
            return film; //Se devuelve la película encontrada
        }
    }
}