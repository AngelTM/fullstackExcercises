package com.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Hello world!
 */
public final class App {
    private App() {
    }

    private static List<String> lista;
    private static List<String> numero;
    public static void main(String[] args) {
        lista = new ArrayList<>();
        lista.add("Angel");
        lista.add("Fernando");
        lista.add("Omar");
        lista.add("Luz");
        lista.add("Aldo");
        lista.add("Luz");
        lista.add("itzel");
        lista.add("Gayathri");
        

        System.out.println(lista);
        System.out.println(ordenar(lista));
        transformar(lista);
        System.out.println(lista);
        System.out.println(contar(lista,"Luz"));

        Book libro1 = new Book(1,"manifiesto comunista","Karl Heinrich Marx​​","uno",500.5);
        Book libro2 = new Book(2,"El capital","Karl Heinrich Marx​​","uno",200.5);
        Book libro3 = new Book(3,"El castillo","Franz Kafka​​","dos",300.5);
        Book libro4 = new Book(4,"La condena","Franz Kafka​​","dos",50.5);
        Book libro5 = new Book(5,"libro inventado","Franz Kafka​​","tres",560.5);
        Book libro6 = new Book(6,"El principe","Nicolai Maquiavelo​​","cuatro",100.5);
        Book libro7 = new Book(7,"El arte de la guerra","Sun Tzu​","cuatro",800.5);
        
        List<Book> listaLibros = new ArrayList<>();
        listaLibros.add(libro1);
        listaLibros.add(libro2);
        listaLibros.add(libro3);
        listaLibros.add(libro4);
        listaLibros.add(libro5);
        listaLibros.add(libro6);
        listaLibros.add(libro7);

        //categoria dos precio>100

        System.out.println("-------------------------");
        List<Book> nuevaLista = listaLibros.stream()
                                .filter(libro->libro.getCategory().equals("dos"))
                                .filter(libro->libro.getPrice()>100)
                                .collect(Collectors.toList());

        for (Book book : nuevaLista) {
            System.out.println(book.getTittle());
            
        }
    }


    public static List<String> ordenar(List<String> list){
        List<String> nuevaLista = new ArrayList<>();
        list.stream().sorted().forEach(a->{
            nuevaLista.add(a.concat("X"));
        });
        return nuevaLista;
    }

    public static void transformar(List<String> list){
        list.stream().map((x)->x.concat("d")).forEach(System.out::println);
    }
    public static Long contar(List<String> list,String nombre){
       return list.stream().filter((x)->x.equals(nombre)).count();
    }

    public static List<String> colleccionar(List<String> list){
        return  list.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
    }

    public void imprimir(String a){
        System.out.println(a);
    }

   
    
}
