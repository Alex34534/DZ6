public abstract class Wars {

    private String name;                           // Значения должны устанавливаться наследниками "Македонцы";
    private String specialization;                // Значения должны устанавливаться наследниками "Удар копьями";


    public abstract void run ();              // Абстрактный метод run

    public void kill (){
        System.out.println(name+" "+specialization+" "+"Храбро погиб");
    }


    public String getname() {                // гетер на name
        return name;
    }

    public String getspecialization() {      // гетер на specialization
        return specialization;
    }

    public void setname(String name) {       // сетер на name
        this.name = name;
    }

    public void setspecialization(String specialization) {      // сетер на specialization
        this.specialization=specialization;
    }

}

