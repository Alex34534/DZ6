public class Pers extends Wars implements Persi{

    String name;

    @Override
    public void  run (){
        System.out.println(getname()+" "+getspecialization()+" "+"бежит прикрываясь щитом");   // реализация абстракногого метода
    }

    @Override
    public void attack(){
        System.out.println(getname()+" "+getspecialization()+" "+"Наносит выстрел из лука");  // реализация абстракногого метода
    }

    @Override
    public void protection(){
        System.out.println(getname()+" "+getspecialization()+" "+"Ломает копьё магией");   //реализация абстракногого метода

    }

    public Pers (String name, String specialization) {     //Создал перегруженный конструктор 2 с вх. параметрами, для создания объекта
        super.setname(name);                                 //При помощи сетера устанавливеам значения в поля для нужного объекта
        super.setspecialization(specialization);             //При помощи сетера устанавливеам значения в поля для нужного объекта
    }
}
