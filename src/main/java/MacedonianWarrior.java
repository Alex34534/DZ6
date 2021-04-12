public class MacedonianWarrior  extends Wars implements Macen {


    @Override
    public void  run (){
        System.out.println(getname()+" "+getspecialization()+" "+"бежит прикрываясь щитом");   // реализация абстракногого метода
    }

    @Override
    public void attack(){
        System.out.println(getname()+" "+getspecialization()+" "+"Наносит удар копьем");  // реализация абстракногого метода
    }

    @Override
    public void protection(){
        System.out.println(getname()+" "+getspecialization()+" "+"Уворачивается от стрелы");   //реализация абстракногого метода

    }

    public MacedonianWarrior (String name, String specialization) {     //Создал перегруженный конструктор 2 с вх. параметрами, для создания объекта
        super.setname(name);                                            //При помощи сетера устанавливеам значения в поля для нужного объекта
        super.setspecialization(specialization);                         //При помощи сетера устанавливеам значения в поля для нужного объекта
    }


}
