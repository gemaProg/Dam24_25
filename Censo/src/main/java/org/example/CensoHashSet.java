/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.*;

/**
 *
 * @author GEMA
 */
public class CensoHashSet implements Serializable {

    public static final String[] provincias = {"Ciudad Real", "Toledo", "Albacete", "Cuenca", "Guadalajara"};
    protected Set<Individuo> censo;

    public CensoHashSet(Set<Individuo> censo) {
        this.censo = censo;
    }

    public CensoHashSet() {
        //primera ejecución
        censo = new HashSet<>();
        /*for (int i = 0; i < 10; i++) {
            Individuo aux = new Individuo((int) (Math.random() * 100), "individuo" + (i + 1), "provincia" + (i % 3));
            censo.add(aux);
            censo.add(new Individuo((int) (Math.random() * 100), "individuo" + (i + 1), "provincia" + (i % 3)));
        }*/
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Jorge",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Nerea",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Älvaro",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Kevin",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Juancito",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Juan",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Roberto",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Ramón",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Luna",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Marcella",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Carlos",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Alexander",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Alexander",provincias[(int)(Math.random()*5)] ));
        censo.add(new Individuo((int) (Math.random() * 5)+18, "Andres",provincias[(int)(Math.random()*5)] ));
        //sucesivas, carga de fichero
        //censo = GestorFicheros.leerFicheroBinario(GestorFicheros.FICHERO_BINARIO).censo;
    }

    public Set<Individuo> getCenso() {
        return Set.copyOf(censo);
    }

    public void setCenso(Set<Individuo> censo) {
        this.censo = censo;
    }

    public void listar() {
        //1.foreach
        System.out.println("-------------------------1-------------------------");
        for (Individuo individuo:censo) {
            System.out.println(individuo);
        }
        //2.stream, foreach y expresión lambda
        System.out.println("-------------------------2-------------------------");
        //censo.stream().forEach(individuo -> System.out.println(individuo));
        censo.forEach(individuo -> System.out.println(individuo));


        //3. stream, foreach y referencia a método
        System.out.println("-------------------------3-------------------------");
        censo.stream().forEach(System.out::println);

        //4.foreach y referencia a método
        System.out.println("-------------------------3-------------------------");
        censo.forEach(System.out::println);

    }

    public boolean buscarIndividuo (Individuo individuo){
        return censo.stream().filter(i->i.equals(individuo)).findFirst().orElse(null) != null;

    }

    public void mostrar(String nombre) {

        //1. foreach
        System.out.println("---------------------1--------------------");
        for (Individuo aux: censo) {
            if (aux.nombre.equalsIgnoreCase(nombre)) {
                System.out.println(aux);
            }
        }
        //2. stream, lambda y filter (filtrar)
        System.out.println("---------------------2--------------------");
        censo.stream().filter(individuo -> individuo.nombre.equalsIgnoreCase(nombre)).forEach(in-> System.out.println(in));
        //3. stream, referencia a método y filter (filtrar)
        System.out.println("---------------------3--------------------");
        //censo.stream().filter(individuo -> individuo.nombre.equalsIgnoreCase(nombre)).forEach(Individuo::imprimir);
        censo.stream().filter(individuo -> individuo.nombre.equalsIgnoreCase(nombre)).forEach(System.out::println);

        List<Individuo> list = censo.stream().filter(individuo -> individuo.nombre.equalsIgnoreCase(nombre)).toList();
        List<String> listProvincias = list.stream().map(i->i.getPoblacion()).toList();
        System.out.println("---------------");
        System.out.println(listProvincias);
        List<String> listProvinciasRM = list.stream().map(Individuo::getPoblacion).toList();
        System.out.println("---------------");
        System.out.println(listProvinciasRM);
        Set<String> setProvinciasRMdistintas = list.stream().map(Individuo::getPoblacion).collect(toSet());
        List<String> listProvinciasRMdistintas2 = list.stream().map(Individuo::getPoblacion).distinct().toList();
        System.out.println("---------------");
        System.out.println(listProvinciasRMdistintas2);

    }

    public void mostrarPoblacion(String poblacion) {


        //1. foreach
        System.out.println("---------------------1--------------------");
        for (Individuo individuo: censo) {
            if (individuo.poblacion.equalsIgnoreCase(poblacion)) {
                System.out.println(individuo);
            }
        }
        //2. stream, lambda y filter (filtrar)
        System.out.println("---------------------2--------------------");
        censo.stream().filter(individuo -> individuo.poblacion.equalsIgnoreCase(poblacion)).forEach(individuo -> System.out.println(individuo));

        //2. stream, referencia a método y filter (filtrar)
        System.out.println("---------------------3--------------------");
        censo.stream().filter(individuo -> individuo.poblacion.equalsIgnoreCase(poblacion)).forEach(System.out::println);
    }

    public void mostrarMayores(int edad) {

        //1. foreach
        System.out.println("---------------------1--------------------");
        for (Individuo individuo: censo) {
            if (individuo.edad > edad) {
                System.out.print(individuo);
            }
        }
        //2. stream, lambda y filter (filtrar)
        System.out.println("---------------------2--------------------");
        censo.stream().filter(individuo -> individuo.edad > edad ).forEach(individuo -> System.out.print(individuo));
        //3. stream, y filter (filtrar)referencia a método
        System.out.println("---------------------3--------------------");
        censo.stream().filter(individuo -> individuo.edad > edad).forEach(System.out::print);
    }

    public long individuosConteoProvincia(String provincia){

        //return contador;
        return censo.stream().filter(individuo -> individuo.poblacion.equalsIgnoreCase(provincia)).count();
    }
    public void mostrarMayores(int edad, String provincia) {

        //1. foreach
        System.out.println("---------------------1--------------------");
        for (Individuo individuo: censo) {
            if (individuo.edad > edad && individuo.poblacion.equalsIgnoreCase(provincia)) {
                System.out.print(individuo);
            }
        }
        System.out.println();
        //2. stream, lambda y filter (filtrar)
        System.out.println("---------------------2--------------------");
        //censo.stream().filter(individuo -> individuo.edad>edad && individuo.poblacion.equalsIgnoreCase(provincia)).forEach(individuo -> System.out.print(individuo));
        censo.stream().filter(individuo -> individuo.edad>edad).filter(individuo->individuo.poblacion.equalsIgnoreCase(provincia)).forEach(individuo -> System.out.print(individuo));
    }
    public double maxEdadrovincia(String provincia){

        //1. for each
        /*int maximo = 0;
        for (Individuo individuo: censo) {
            if (individuo.poblacion.equalsIgnoreCase(provincia) && individuo.edad>maximo) {
                maximo = individuo.edad;
            }
        }
        return maximo;*/
        return censo.stream().filter(individuo -> individuo.poblacion.equalsIgnoreCase(provincia)).mapToInt(individuo->individuo.edad).average().orElse(0);
        //si no encuentra devuelve 0 como edad máxima.
        //lo mismo con min, average (hacerlo), sum
    }
    public void mapeoIndividuosCadenas(){
        censo.stream().map(individuo -> individuo.nombre).sorted().forEach(System.out::println);
        System.out.println("-------------sólo distintos---------");
        censo.stream().map(individuo -> individuo.nombre).sorted(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return Integer.compare(o1.length(),o2.length());
            }
        }).forEach(System.out::println);
        censo.stream().map(individuo -> individuo.nombre).distinct().sorted().forEach(System.out::println);
        System.out.println();
        censo.stream().map(individuo -> individuo.poblacion).sorted().forEach(System.out::println);
        System.out.println("-------------sólo distintas---------");
        censo.stream().map(individuo -> individuo.poblacion).distinct().sorted().forEach(System.out::println);
    //Pensad cómo hacerlo con programación tradicional iterativa
    }

    @Override
    public String toString() {
        return censo.toString();
    }
    //Estadística con el uso de Map.

    public List listaPorProvincia (String provincia){
        return censo.stream().filter(i->i.poblacion.equalsIgnoreCase(provincia)).toList();
    }
    private List<Individuo> listaIndividuosProvincia(String provincia) {
        List<Individuo> lista = new ArrayList<>();
        for(Individuo individuo:censo)
            if (individuo.getPoblacion().equalsIgnoreCase(provincia))
                lista.add(individuo);
        return lista;

    }
    public void estadisticaProvincia() {
        Map<String,List<Individuo>> mapaIndividuos = new HashMap<>();
        for (int i = 0; i < provincias.length ; i++) {
            //individuos.put(provincias[i],listaIndividuosProvincia(provincias[i]) );
            mapaIndividuos.put(provincias[i],listaPorProvincia(provincias[i]));
        }
        for (String provincia: provincias) {
            System.out.print(provincia+ ": ");
            for (Individuo individuo: mapaIndividuos.get(provincia))
                System.out.print(individuo.nombre +", ");
            System.out.println();
        }

        Map<String,List<Individuo>> porProvincia = censo.stream().collect(groupingBy(Individuo::getPoblacion));
        porProvincia.forEach((k,v)-> System.out.println("Provincia: "+ k+ " "+v.stream().map(Individuo::getNombre).toList()));


        System.out.println("NÚMERO INDIVIDUOS POR PROVINCIA");

        Map<String,Long> porProvinciaConteo = censo.stream().collect(groupingBy(Individuo::getPoblacion, counting()));
        porProvinciaConteo.forEach((k, v) -> System.out.printf("%-30s | %s %n", k, porProvinciaConteo.get(k)));

        System.out.println("EDAD MEDIA POR PROVINCIA");

        Map<String,Double> porProvinciaEdadMedia = censo.stream().collect(groupingBy(Individuo::getPoblacion, averagingInt(Individuo::getEdad)));
        porProvinciaEdadMedia.forEach((k,v)-> System.out.printf("%-30s | %s %n", k, porProvinciaEdadMedia.get(k)));

        System.out.println("LISTADO INDIVIDUOS AGRUPADOS POR PROVINCIA");
        porProvincia.forEach((k, v) -> {
            String strIndividuos = v.stream().map(Individuo::toNombreEdad).collect(joining(", ")); //joining unión en cadena
            System.out.printf("%-30s | %s %n", k, strIndividuos);
        });


        System.out.println("EDAD MEDIA MAXIMA Y MÍNIMA POR PROVINCIA");
        porProvincia.forEach((k, v) -> {
            double media = v.stream().mapToInt(individuo->individuo.edad).average().orElse(0);
            double maximo = v.stream().mapToInt(individuo->individuo.edad).max().orElse(0);
            double minimo = v.stream().mapToInt(individuo->individuo.edad).min().orElse(0);
            System.out.printf("Edad media en %s | %f maxima | %f minima | %f %n", k, media,maximo,minimo);
        });
    }


    public void actualizarPoblacion(String nombre, String poblacion) throws IOException {
        //1. foreach
        for (Individuo individuo : censo) {
            if (individuo.nombre.equalsIgnoreCase(nombre)) {
                individuo.poblacion = poblacion;
            }
        }
        //2. Stream
        Individuo encontrado = censo.stream().filter(individuo -> individuo.nombre.equalsIgnoreCase(nombre)).findFirst().orElse(null);
        if(encontrado!=null)
            encontrado.poblacion=poblacion;

        //2a. Stream y chequeo si null directamente
        censo.stream().filter(individuo -> individuo.nombre.equalsIgnoreCase(nombre)).findFirst().ifPresent(individuo -> individuo.poblacion = poblacion);

    }
    public void alta() throws IOException {
        Individuo aux = Alta();
        if (!censo.contains(aux))
            censo.add(Alta());
    }

    public static Individuo Alta() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Introduce edad, nombre,poblacion");
        return new Individuo(Integer.parseInt(br.readLine()), br.readLine(), br.readLine());
    }

    public void baja(String nombre, String poblacion) {

        censo.removeIf(i->i.nombre.equalsIgnoreCase(nombre) && i.poblacion.equalsIgnoreCase(poblacion));
    }


    public List eliminarIndividuosProvincia(String provincia){
        //censo.removeAll(censo.stream().filter(individuo -> individuo.poblacion.equalsIgnoreCase(provincia)).collect(Collectors.toList()));
        censo.removeAll(censo.stream().filter(individuo -> individuo.poblacion.equalsIgnoreCase(provincia)).toList());
        System.out.println("ELiminando");
        listar();
        return censo.stream().filter(individuo -> !individuo.poblacion.equalsIgnoreCase(provincia)).collect(Collectors.toList());
    }

    public void ordenar() {
        /*Collections.sort(censo);
        System.out.println("orden natural----");
        listar();
        censo.sort(new porEdad());
        System.out.println("orden edad----");
        listar();
        Collections.sort(censo, new porPoblacion());
        System.out.println("orden poblacion----");
        listar();
        */
        System.out.println("---------------------Con streams---------------------");
        System.out.println("orden natural----");
        censo.stream().sorted().forEach(System.out::println);
        System.out.println("por orden de edad----");
        censo.stream().sorted(new porEdad()).forEach(System.out::println);
        System.out.println("por orden de población----");
        censo.stream().sorted(new porPoblacion()).forEach(System.out::println);

        System.out.println("---------------------con streams y otra forma comparator---------------------");
        System.out.println("por orden de edad----");
        censo.stream().sorted(new Comparator<Individuo>() {
            @Override
            public int compare(Individuo o1, Individuo o2) {
                return Integer.compare(o1.edad,o2.edad);
            }
        }).forEach(System.out::println);
    }
    public List devolverListadoOrdenado (boolean ascendente){
        return censo.stream().sorted(ascendente ? new porPoblacion() : new porPoblacion().reversed()).collect(Collectors.toList());
    }

}
